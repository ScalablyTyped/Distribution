package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectDonut
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The method which specifies the way the strokes are displayed at convex corners of the polygon.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectDonutMethod * / any */ String
  ] = js.native
  
  /**
    * The option for the way the symbol handles complex geometries.
    */
  var option: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectDonut: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDonut = js.native
  
  /**
    * The distance from the edge of the polygon that the fill symbol is to be displayed.
    */
  var width: js.UndefOr[Double] = js.native
}
object CIMGeometricEffectDonut {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDonut): CIMGeometricEffectDonut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectDonut]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectDonutMutableBuilder[Self <: CIMGeometricEffectDonut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectDonutMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOption(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
    ): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDonut): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
