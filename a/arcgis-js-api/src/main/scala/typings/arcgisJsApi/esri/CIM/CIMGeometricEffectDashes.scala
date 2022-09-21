package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectDashes
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The line dash ending position.
    */
  var controlPointEnding: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineDashEnding * / any */ String
  ] = js.undefined
  
  /**
    * Where the pattern should end relative to the ending point of the geometry. Negative numbers indicate a shift to the left and positive numbers a shift to the right. This property is only applied if the LineDashEnding is set to Custom.
    */
  var customEndingOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance for each dash and gap. There can be multiple dash and gap values to form a complex pattern.
    */
  var dashTemplate: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The setting which determines how the strokes with dash patterns and other patterns (pictures, placement effects) are handled at the end points of the line geometry's segments.
    */
  var lineDashEnding: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineDashEnding * / any */ String
  ] = js.undefined
  
  /**
    * The position where the pattern should begin relative to the starting point of the geometry. It shifts the entire pattern along the line the specified distance. Negative values indicate a shift to the left and positive numbers a shift to the right. This property is only applied if LineDashEnding is set to NoConstraint or Custom.
    */
  var offsetAlongLine: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectDashes: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDashes
}
object CIMGeometricEffectDashes {
  
  inline def apply(): CIMGeometricEffectDashes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectDashes")
    __obj.asInstanceOf[CIMGeometricEffectDashes]
  }
  
  extension [Self <: CIMGeometricEffectDashes](x: Self) {
    
    inline def setControlPointEnding(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineDashEnding * / any */ String
    ): Self = StObject.set(x, "controlPointEnding", value.asInstanceOf[js.Any])
    
    inline def setControlPointEndingUndefined: Self = StObject.set(x, "controlPointEnding", js.undefined)
    
    inline def setCustomEndingOffset(value: Double): Self = StObject.set(x, "customEndingOffset", value.asInstanceOf[js.Any])
    
    inline def setCustomEndingOffsetUndefined: Self = StObject.set(x, "customEndingOffset", js.undefined)
    
    inline def setDashTemplate(value: js.Array[Double]): Self = StObject.set(x, "dashTemplate", value.asInstanceOf[js.Any])
    
    inline def setDashTemplateUndefined: Self = StObject.set(x, "dashTemplate", js.undefined)
    
    inline def setDashTemplateVarargs(value: Double*): Self = StObject.set(x, "dashTemplate", js.Array(value*))
    
    inline def setLineDashEnding(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineDashEnding * / any */ String
    ): Self = StObject.set(x, "lineDashEnding", value.asInstanceOf[js.Any])
    
    inline def setLineDashEndingUndefined: Self = StObject.set(x, "lineDashEnding", js.undefined)
    
    inline def setOffsetAlongLine(value: Double): Self = StObject.set(x, "offsetAlongLine", value.asInstanceOf[js.Any])
    
    inline def setOffsetAlongLineUndefined: Self = StObject.set(x, "offsetAlongLine", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDashes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
