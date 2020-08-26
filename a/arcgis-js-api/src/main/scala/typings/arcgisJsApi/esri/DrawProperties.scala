package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawProperties extends js.Object {
  /**
    * A reference to the active [draw action](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html). An instance of the draw action is created when [create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#activeAction)
    */
  var activeAction: js.UndefOr[DrawActionProperties] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the draw to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}

object DrawProperties {
  @scala.inline
  def apply(): DrawProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawProperties]
  }
  @scala.inline
  implicit class DrawPropertiesOps[Self <: DrawProperties] (val x: Self) extends AnyVal {
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
    def setActiveAction(value: DrawActionProperties): Self = this.set("activeAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveAction: Self = this.set("activeAction", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

