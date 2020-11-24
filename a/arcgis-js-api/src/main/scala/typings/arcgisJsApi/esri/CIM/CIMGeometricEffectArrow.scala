package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectArrow
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The type of arrow to be displayed.
    */
  var geometricEffectArrowType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectArrowType * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectArrow: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow = js.native
  
  /**
    * The distance between the lines that construct the body of the arrow.
    */
  var width: js.UndefOr[Double] = js.native
}
object CIMGeometricEffectArrow {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow): CIMGeometricEffectArrow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectArrow]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectArrowOps[Self <: CIMGeometricEffectArrow] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometricEffectArrowType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectArrowType * / any */ String
    ): Self = this.set("geometricEffectArrowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometricEffectArrowType: Self = this.set("geometricEffectArrowType", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
