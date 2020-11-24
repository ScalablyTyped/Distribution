package typings.arcgisJsApi.esri.CIM

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
  implicit class CIMGeometricEffectLocalizerFeatherOps[Self <: CIMGeometricEffectLocalizerFeather] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectLocalizerFeather): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectLocalizerFeatherStyle * / any */ String
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
