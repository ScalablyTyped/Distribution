package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalBasemapsSourceProperties extends LocalBasemapsSourceProperties {
  /**
    * Function used to filter basemaps after being fetched from the Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#filterFunction)
    */
  var filterFunction: js.UndefOr[js.Function] = js.undefined
  /**
    * The Portal from which to fetch basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  /**
    * An object with key-value pairs used to create a custom basemap gallery group query. Note that all parameters will be joined using the `AND` operator. A query string can also be provided for more advanced use cases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#query)
    */
  var query: js.UndefOr[js.Any | String] = js.undefined
  /**
    * Callback for updating basemaps after being fetched and filtered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#updateBasemapsCallback)
    */
  var updateBasemapsCallback: js.UndefOr[js.Function] = js.undefined
}

object PortalBasemapsSourceProperties {
  @scala.inline
  def apply(
    basemaps: CollectionProperties[BasemapProperties] = null,
    filterFunction: js.Function = null,
    portal: PortalProperties = null,
    query: js.Any | String = null,
    updateBasemapsCallback: js.Function = null
  ): PortalBasemapsSourceProperties = {
    val __obj = js.Dynamic.literal()
    if (basemaps != null) __obj.updateDynamic("basemaps")(basemaps.asInstanceOf[js.Any])
    if (filterFunction != null) __obj.updateDynamic("filterFunction")(filterFunction)
    if (portal != null) __obj.updateDynamic("portal")(portal)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (updateBasemapsCallback != null) __obj.updateDynamic("updateBasemapsCallback")(updateBasemapsCallback)
    __obj.asInstanceOf[PortalBasemapsSourceProperties]
  }
}

