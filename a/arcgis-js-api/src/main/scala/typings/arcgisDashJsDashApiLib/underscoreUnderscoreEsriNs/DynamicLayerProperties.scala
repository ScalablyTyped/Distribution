package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLayerProperties extends js.Object {
  /**
    * The portal item from which the layer is loaded. This will load the layer along with any overridden properties (e.g. renderers, definition expressions, etc.) saved to the portal item, not the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  /**
    * The URL to the REST endpoint of the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object DynamicLayerProperties {
  @scala.inline
  def apply(portalItem: PortalItemProperties = null, url: java.lang.String = null): DynamicLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DynamicLayerProperties]
  }
}

