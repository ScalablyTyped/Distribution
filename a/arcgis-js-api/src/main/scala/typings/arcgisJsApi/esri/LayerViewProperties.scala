package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerViewProperties extends js.Object {
  /**
    * When `true`, the layer is visible in the view. Set this property to `false` to hide the layer from the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object LayerViewProperties {
  @scala.inline
  def apply(): LayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerViewProperties]
  }
  @scala.inline
  implicit class LayerViewPropertiesOps[Self <: LayerViewProperties] (val x: Self) extends AnyVal {
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

