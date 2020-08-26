package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshableLayerProperties extends js.Object {
  /**
    * Refresh interval of the layer in minutes. Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  var refreshInterval: js.UndefOr[Double] = js.native
}

object RefreshableLayerProperties {
  @scala.inline
  def apply(): RefreshableLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshableLayerProperties]
  }
  @scala.inline
  implicit class RefreshableLayerPropertiesOps[Self <: RefreshableLayerProperties] (val x: Self) extends AnyVal {
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
    def setRefreshInterval(value: Double): Self = this.set("refreshInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshInterval: Self = this.set("refreshInterval", js.undefined)
  }
  
}

