package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMapProperties extends MapProperties {
  /**
    * Object responsible for containing the viewing and editing properties of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#applicationProperties)
    */
  var applicationProperties: js.UndefOr[js.Any] = js.undefined
  /**
    * An array of saved geographic extents that allow end users to quickly navigate to a particular area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#bookmarks)
    */
  var bookmarks: js.UndefOr[CollectionProperties[BookmarkProperties]] = js.undefined
  /**
    * The initial view of the WebMap. This object contains properties such as [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint), [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#spatialReference), that should be applied to the view when the WebMap loads.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#initialViewProperties)
    */
  var initialViewProperties: js.UndefOr[InitialViewPropertiesProperties] = js.undefined
  /**
    * The portal item from which the WebMap is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  /**
    * Provides multiple slides. Each slide has a different "title", "extent", "basemap", "layers" etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#presentation)
    */
  var presentation: js.UndefOr[js.Any] = js.undefined
  /**
    * An array of table objects in the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#tables)
    */
  var tables: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The widgets object contains widgets that should be exposed to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#widgets)
    */
  var widgets: js.UndefOr[js.Any] = js.undefined
}

object WebMapProperties {
  @scala.inline
  def apply(
    applicationProperties: js.Any = null,
    basemap: BasemapProperties | java.lang.String = null,
    bookmarks: CollectionProperties[BookmarkProperties] = null,
    ground: GroundProperties | java.lang.String = null,
    initialViewProperties: InitialViewPropertiesProperties = null,
    layers: CollectionProperties[LayerProperties] | js.Array[LayerProperties] = null,
    portalItem: PortalItemProperties = null,
    presentation: js.Any = null,
    tables: js.Array[_] = null,
    widgets: js.Any = null
  ): WebMapProperties = {
    val __obj = js.Dynamic.literal()
    if (applicationProperties != null) __obj.updateDynamic("applicationProperties")(applicationProperties)
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (ground != null) __obj.updateDynamic("ground")(ground.asInstanceOf[js.Any])
    if (initialViewProperties != null) __obj.updateDynamic("initialViewProperties")(initialViewProperties)
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (presentation != null) __obj.updateDynamic("presentation")(presentation)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (widgets != null) __obj.updateDynamic("widgets")(widgets)
    __obj.asInstanceOf[WebMapProperties]
  }
}

