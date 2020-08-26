package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshableLayer extends js.Object {
  /**
    * Refresh interval of the layer in minutes. Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  var refreshInterval: Double = js.native
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    *
    *
    */
  def refresh(): Unit = js.native
}

object RefreshableLayer {
  @scala.inline
  def apply(refresh: () => Unit, refreshInterval: Double): RefreshableLayer = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh), refreshInterval = refreshInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshableLayer]
  }
  @scala.inline
  implicit class RefreshableLayerOps[Self <: RefreshableLayer] (val x: Self) extends AnyVal {
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
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    @scala.inline
    def setRefreshInterval(value: Double): Self = this.set("refreshInterval", value.asInstanceOf[js.Any])
  }
  
}

