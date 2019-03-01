package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProperties extends js.Object {
  /**
    * Whether search functionality is enabled in the web scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-Search.html#enabled)
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The hint provided with the search dialog.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-Search.html#hintText)
    */
  var hintText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A collection of layers to be included in search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-Search.html#layers)
    */
  var layers: js.UndefOr[CollectionProperties[SearchLayerProperties]] = js.undefined
}

object SearchProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    hintText: java.lang.String = null,
    layers: CollectionProperties[SearchLayerProperties] = null
  ): SearchProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText)
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProperties]
  }
}

