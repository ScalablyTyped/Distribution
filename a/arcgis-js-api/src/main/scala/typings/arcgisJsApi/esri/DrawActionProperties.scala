package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawActionProperties extends js.Object {
  
  /**
    * Controls whether the created geometry will have z coordinates or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#hasZ)
    */
  var hasZ: js.UndefOr[Double] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}
object DrawActionProperties {
  
  @scala.inline
  def apply(): DrawActionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawActionProperties]
  }
  
  @scala.inline
  implicit class DrawActionPropertiesOps[Self <: DrawActionProperties] (val x: Self) extends AnyVal {
    
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
    def setHasZ(value: Double): Self = this.set("hasZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasZ: Self = this.set("hasZ", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
