package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshableLayer extends js.Object {
  /**
    * Refresh interval of the layer in minutes. Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  var refreshInterval: Double
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    *
    *
    */
  def refresh(): Unit
}

object RefreshableLayer {
  @scala.inline
  def apply(refresh: () => Unit, refreshInterval: Double): RefreshableLayer = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh), refreshInterval = refreshInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshableLayer]
  }
}

