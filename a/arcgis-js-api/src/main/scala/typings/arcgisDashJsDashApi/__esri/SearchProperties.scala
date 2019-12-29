package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProperties extends js.Object {
  /**
    * Indicates whether the place finder is enabled in the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#addressSearchEnabled)
    */
  var addressSearchEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether search functionality is enabled in the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#enabled)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The hint provided with the search dialog.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#hintText)
    */
  var hintText: js.UndefOr[String] = js.undefined
  /**
    * A collection of layers to be included in search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#layers)
    */
  var layers: js.UndefOr[CollectionProperties[SearchLayerProperties]] = js.undefined
}

object SearchProperties {
  @scala.inline
  def apply(
    addressSearchEnabled: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    hintText: String = null,
    layers: CollectionProperties[SearchLayerProperties] = null
  ): SearchProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addressSearchEnabled)) __obj.updateDynamic("addressSearchEnabled")(addressSearchEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProperties]
  }
}

