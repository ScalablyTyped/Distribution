package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMapProperties extends MapProperties {
  /**
    * The applicationProperties contains the viewing properties of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#applicationProperties)
    */
  var applicationProperties: js.UndefOr[ApplicationPropertiesProperties] = js.undefined
  /**
    * The name of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringApp)
    */
  var authoringApp: js.UndefOr[String] = js.undefined
  /**
    * The version of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringAppVersion)
    */
  var authoringAppVersion: js.UndefOr[String] = js.undefined
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
    * The URL to the thumbnail used for the webmap. The `thumbnailUrl` will default to the thumbnail URL from the portal item associated to the webmap. The thumbnail of the webmap may be updated by changing the thumbnail URL and saving the webmap. Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom) to update the thumbnail automatically from a specified view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
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
    applicationProperties: ApplicationPropertiesProperties = null,
    authoringApp: String = null,
    authoringAppVersion: String = null,
    basemap: BasemapProperties | String = null,
    bookmarks: CollectionProperties[BookmarkProperties] = null,
    ground: GroundProperties | String = null,
    initialViewProperties: InitialViewPropertiesProperties = null,
    layers: CollectionProperties[LayerProperties] | js.Array[LayerProperties] = null,
    portalItem: PortalItemProperties = null,
    presentation: js.Any = null,
    tables: js.Array[_] = null,
    thumbnailUrl: String = null,
    widgets: js.Any = null
  ): WebMapProperties = {
    val __obj = js.Dynamic.literal()
    if (applicationProperties != null) __obj.updateDynamic("applicationProperties")(applicationProperties.asInstanceOf[js.Any])
    if (authoringApp != null) __obj.updateDynamic("authoringApp")(authoringApp.asInstanceOf[js.Any])
    if (authoringAppVersion != null) __obj.updateDynamic("authoringAppVersion")(authoringAppVersion.asInstanceOf[js.Any])
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (ground != null) __obj.updateDynamic("ground")(ground.asInstanceOf[js.Any])
    if (initialViewProperties != null) __obj.updateDynamic("initialViewProperties")(initialViewProperties.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem.asInstanceOf[js.Any])
    if (presentation != null) __obj.updateDynamic("presentation")(presentation.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    if (widgets != null) __obj.updateDynamic("widgets")(widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMapProperties]
  }
}

