package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectLocalizerFeather
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The angle of the localizer feather.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The length of the localizer feather.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The localizer feather style.
    */
  var style: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectLocalizerFeatherStyle * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectLocalizerFeather: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectLocalizerFeather = js.native
  
  /**
    * The width of the localizer feather.
    */
  var width: js.UndefOr[Double] = js.native
}
object CIMGeometricEffectLocalizerFeather {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectLocalizerFeather): CIMGeometricEffectLocalizerFeather = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectLocalizerFeather]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectLocalizerFeatherMutableBuilder[Self <: CIMGeometricEffectLocalizerFeather] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectLocalizerFeatherStyle * / any */ String
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectLocalizerFeather): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
