package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectTaperedPolygon
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The width at the start of the line to be used to generate a polygon.
    */
  var fromWidth: js.UndefOr[Double] = js.native
  
  /**
    * The distance along the line to be used to generate the polygon.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The width at the end of the line to be used to generate the polygon.
    */
  var toWidth: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectTaperedPolygon: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectTaperedPolygon = js.native
}
object CIMGeometricEffectTaperedPolygon {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectTaperedPolygon): CIMGeometricEffectTaperedPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectTaperedPolygon]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectTaperedPolygonOps[Self <: CIMGeometricEffectTaperedPolygon] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectTaperedPolygon): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromWidth(value: Double): Self = this.set("fromWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromWidth: Self = this.set("fromWidth", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setToWidth(value: Double): Self = this.set("toWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToWidth: Self = this.set("toWidth", js.undefined)
  }
}
