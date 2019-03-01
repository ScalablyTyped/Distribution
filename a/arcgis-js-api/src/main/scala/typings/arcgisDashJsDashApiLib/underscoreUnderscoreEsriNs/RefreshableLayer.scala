package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshableLayer extends js.Object {
  /**
    * Refresh interval of the layer in minutes. Minimum refresh interval is 0.1 minute (6 seconds). Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  var refreshInterval: scala.Double
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    *
    *
    */
  def refresh(): scala.Unit
}

object RefreshableLayer {
  @scala.inline
  def apply(refresh: js.Function0[scala.Unit], refreshInterval: scala.Double): RefreshableLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("refreshInterval")(refreshInterval)
    __obj.asInstanceOf[RefreshableLayer]
  }
}

