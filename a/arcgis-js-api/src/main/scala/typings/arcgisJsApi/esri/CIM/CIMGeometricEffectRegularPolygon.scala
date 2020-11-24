package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectRegularPolygon
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The amount of rotation for the polygon.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The number of sides for the polygon. Specifying a value less than 3 produces a circle.
    */
  var edges: js.UndefOr[Double] = js.native
  
  /**
    * The distance from the center of the polygon.
    */
  var radius: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectRegularPolygon: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRegularPolygon = js.native
}
object CIMGeometricEffectRegularPolygon {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRegularPolygon): CIMGeometricEffectRegularPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectRegularPolygon]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectRegularPolygonOps[Self <: CIMGeometricEffectRegularPolygon] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRegularPolygon): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setEdges(value: Double): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
}
