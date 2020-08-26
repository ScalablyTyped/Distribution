package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMapProperties extends MapProperties {
  /**
    * The applicationProperties contains the viewing properties of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#applicationProperties)
    */
  var applicationProperties: js.UndefOr[ApplicationPropertiesProperties] = js.native
  /**
    * The name of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringApp)
    */
  var authoringApp: js.UndefOr[String] = js.native
  /**
    * The version of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringAppVersion)
    */
  var authoringAppVersion: js.UndefOr[String] = js.native
  /**
    * An array of saved geographic extents that allow end users to quickly navigate to a particular area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#bookmarks)
    */
  var bookmarks: js.UndefOr[CollectionProperties[BookmarkProperties]] = js.native
  /**
    * The initial view of the WebMap. This object contains properties such as [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint), [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#spatialReference), that should be applied to the view when the WebMap loads.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#initialViewProperties)
    */
  var initialViewProperties: js.UndefOr[InitialViewPropertiesProperties] = js.native
  /**
    * The portal item from which the WebMap is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
  /**
    * Provides multiple slides. Each slide has a different "title", "extent", "basemap", "layers" etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#presentation)
    */
  var presentation: js.UndefOr[js.Any] = js.native
  /**
    * An array of table objects in the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#tables)
    */
  var tables: js.UndefOr[js.Array[_]] = js.native
  /**
    * The URL to the thumbnail used for the webmap. The `thumbnailUrl` will default to the thumbnail URL from the portal item associated to the webmap. The thumbnail of the webmap may be updated by changing the thumbnail URL and saving the webmap. Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom) to update the thumbnail automatically from a specified view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /**
    * The widgets object contains widgets that should be exposed to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#widgets)
    */
  var widgets: js.UndefOr[js.Any] = js.native
}

object WebMapProperties {
  @scala.inline
  def apply(): WebMapProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebMapProperties]
  }
  @scala.inline
  implicit class WebMapPropertiesOps[Self <: WebMapProperties] (val x: Self) extends AnyVal {
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
    def setApplicationProperties(value: ApplicationPropertiesProperties): Self = this.set("applicationProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationProperties: Self = this.set("applicationProperties", js.undefined)
    @scala.inline
    def setAuthoringApp(value: String): Self = this.set("authoringApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthoringApp: Self = this.set("authoringApp", js.undefined)
    @scala.inline
    def setAuthoringAppVersion(value: String): Self = this.set("authoringAppVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthoringAppVersion: Self = this.set("authoringAppVersion", js.undefined)
    @scala.inline
    def setBookmarksVarargs(value: BookmarkProperties*): Self = this.set("bookmarks", js.Array(value :_*))
    @scala.inline
    def setBookmarks(value: CollectionProperties[BookmarkProperties]): Self = this.set("bookmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmarks: Self = this.set("bookmarks", js.undefined)
    @scala.inline
    def setInitialViewProperties(value: InitialViewPropertiesProperties): Self = this.set("initialViewProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialViewProperties: Self = this.set("initialViewProperties", js.undefined)
    @scala.inline
    def setPortalItem(value: PortalItemProperties): Self = this.set("portalItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalItem: Self = this.set("portalItem", js.undefined)
    @scala.inline
    def setPresentation(value: js.Any): Self = this.set("presentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentation: Self = this.set("presentation", js.undefined)
    @scala.inline
    def setTablesVarargs(value: js.Any*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[_]): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    @scala.inline
    def setThumbnailUrl(value: String): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailUrl: Self = this.set("thumbnailUrl", js.undefined)
    @scala.inline
    def setWidgets(value: js.Any): Self = this.set("widgets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidgets: Self = this.set("widgets", js.undefined)
  }
  
}

