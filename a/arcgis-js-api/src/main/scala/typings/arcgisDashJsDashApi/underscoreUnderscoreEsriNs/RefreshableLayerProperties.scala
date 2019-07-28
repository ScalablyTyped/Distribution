package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshableLayerProperties extends js.Object {
  /**
    * Refresh interval of the layer in minutes. Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  var refreshInterval: js.UndefOr[Double] = js.undefined
}

object RefreshableLayerProperties {
  @scala.inline
  def apply(refreshInterval: Int | Double = null): RefreshableLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshableLayerProperties]
  }
}

