package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectDashes
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The line dash ending position.
    */
  var controlPointEnding: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineDashEnding * / any */ String
  ] = js.native
  
  /**
    * Where the pattern should end relative to the ending point of the geometry. Negative numbers indicate a shift to the left and positive numbers a shift to the right. This property is only applied if the LineDashEnding is set to Custom.
    */
  var customEndingOffset: js.UndefOr[Double] = js.native
  
  /**
    * The distance for each dash and gap. There can be multiple dash and gap values to form a complex pattern.
    */
  var dashTemplate: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The setting which determines how the strokes with dash patterns and other patterns (pictures, placement effects) are handled at the end points of the line geometry's segments.
    */
  var lineDashEnding: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineDashEnding * / any */ String
  ] = js.native
  
  /**
    * The position where the pattern should begin relative to the starting point of the geometry. It shifts the entire pattern along the line the specified distance. Negative values indicate a shift to the left and positive numbers a shift to the right. This property is only applied if LineDashEnding is set to NoConstraint or Custom.
    */
  var offsetAlongLine: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectDashes: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDashes = js.native
}
object CIMGeometricEffectDashes {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDashes): CIMGeometricEffectDashes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectDashes]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectDashesOps[Self <: CIMGeometricEffectDashes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDashes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointEnding(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineDashEnding * / any */ String
    ): Self = this.set("controlPointEnding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlPointEnding: Self = this.set("controlPointEnding", js.undefined)
    
    @scala.inline
    def setCustomEndingOffset(value: Double): Self = this.set("customEndingOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEndingOffset: Self = this.set("customEndingOffset", js.undefined)
    
    @scala.inline
    def setDashTemplateVarargs(value: Double*): Self = this.set("dashTemplate", js.Array(value :_*))
    
    @scala.inline
    def setDashTemplate(value: js.Array[Double]): Self = this.set("dashTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashTemplate: Self = this.set("dashTemplate", js.undefined)
    
    @scala.inline
    def setLineDashEnding(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineDashEnding * / any */ String
    ): Self = this.set("lineDashEnding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDashEnding: Self = this.set("lineDashEnding", js.undefined)
    
    @scala.inline
    def setOffsetAlongLine(value: Double): Self = this.set("offsetAlongLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetAlongLine: Self = this.set("offsetAlongLine", js.undefined)
  }
}
