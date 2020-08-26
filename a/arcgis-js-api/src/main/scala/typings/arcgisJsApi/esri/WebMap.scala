package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`not-loaded`
import typings.arcgisJsApi.arcgisJsApiStrings.failed
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMap
  extends Map
     with corePromise {
  /**
    * The applicationProperties contains the viewing properties of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#applicationProperties)
    */
  var applicationProperties: ApplicationProperties = js.native
  /**
    * The name of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringApp)
    */
  var authoringApp: String = js.native
  /**
    * The version of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringAppVersion)
    */
  var authoringAppVersion: String = js.native
  /**
    * An array of saved geographic extents that allow end users to quickly navigate to a particular area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#bookmarks)
    */
  var bookmarks: Collection[Bookmark] = js.native
  /**
    * The initial view of the WebMap. This object contains properties such as [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint), [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#spatialReference), that should be applied to the view when the WebMap loads.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#initialViewProperties)
    */
  var initialViewProperties: InitialViewProperties = js.native
  /**
    * The Error object returned if an error occurred while loading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadError)
    *
    * @default null
    */
  val loadError: Error = js.native
  /**
    * Represents the status of a [load](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#load) operation.
    *
    * Value | Description
    * ------|------------
    * not-loaded | The object's resources have not loaded.
    * loading | The object's resources are currently loading.
    * loaded | The object's resources have loaded without errors.
    * failed | The object's resources failed to load. See [loadError](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadError) for more details.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadStatus)
    *
    * @default not-loaded
    */
  val loadStatus: `not-loaded` | loading | failed | typings.arcgisJsApi.arcgisJsApiStrings.loaded = js.native
  /**
    * Indicates whether the instance has loaded. When `true`, the properties of the object can be accessed. A WebMap is considered loaded when its [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#layers) and [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#basemap) are created, but not yet loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loaded)
    *
    * @default false
    */
  val loaded: Boolean = js.native
  /**
    * The portal item from which the WebMap is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  /**
    * Provides multiple slides. Each slide has a different "title", "extent", "basemap", "layers" etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#presentation)
    */
  var presentation: js.Any = js.native
  /**
    * The version of the source document from which the WebMap was read. The WebMap must be version 2.x to load into an app.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
    */
  val sourceVersion: WebMapSourceVersion = js.native
  /**
    * An array of table objects in the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#tables)
    */
  var tables: js.Array[_] = js.native
  /**
    * The URL to the thumbnail used for the webmap. The `thumbnailUrl` will default to the thumbnail URL from the portal item associated to the webmap. The thumbnail of the webmap may be updated by changing the thumbnail URL and saving the webmap. Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom) to update the thumbnail automatically from a specified view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#thumbnailUrl)
    */
  var thumbnailUrl: String = js.native
  /**
    * The widgets object contains widgets that should be exposed to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#widgets)
    */
  var widgets: js.Any = js.native
  /**
    * Triggers the loading of the WebMap instance.  A WebMap is considered [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loaded) when its [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#layers) and [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#basemap) are fully created. When created with a [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#portalItem), `load()` will first fetch its data to create the content, otherwise it resolves immediately.  The [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) automatically calls the `load()` method when a WebMap instance is added to its [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#map) property so it can display in the view and load each individual layer. If the WebMap is used outside of a view, for example to preload it, you must call `load()` explicitly to interact with its resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#load)
    *
    *
    */
  def load(): js.Promise[_] = js.native
  /**
    * Loads all the externally loadable resources associated with the webmap. For the webmap this will load the ground, basemap and layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadAll)
    *
    *
    */
  def loadAll(): js.Promise[WebMap] = js.native
  /**
    * Saves the webmap to its associated portal item. The portal item must already exist and be valid. This is a convenience method that will use [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#update) to store the webmap in the item. The webmap is saved according to [web map specification](https://developers.arcgis.com/web-map-specification/) standards.  Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom) to store the current view properties in the webmap before saving it.  Note that this saves the webmap to its existing item. Depending on how the webmap is shared, users that do not own the webmap may be able to modify it. To save an existing webmap as a new item owned by the user signed into the portal instance, use [saveAs()](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs).  The webmap will be automatically loaded if it is not already before saving.
    * > **Known Limitations**
    *   * [FeaturesLayers](esri-layers-FeatureLayer.html) created from a [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) or [feature service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm) will be saved.
    *   * For [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) and [WMSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html) the following rules will apply:
    *   * Any new layers of these types added to the webmap will not be saved.
    *   * For existing layers only modifications to the following properties will saved: maxScale, minScale, opacity, title, visibility.
    *   * Save support is coming for multi-layer feature collection, [MapNotesLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html), and [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#save)
    *
    * @param options Additional options.
    * @param options.ignoreUnsupported When `true`, the webmap will save even if it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the webmap may appear different when reloaded from its portal item.
    *
    */
  def save(): js.Promise[PortalItem] = js.native
  def save(options: WebMapSaveOptions): js.Promise[PortalItem] = js.native
  /**
    * Saves the webmap to a new [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html). If saving has completed successfully, then the saved portal item will be set in the [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#portalItem) property of the WebMap. This is a convenience method that will create a new [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) and use [PortalUser.addItem()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem) to store the webmap in a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html).  Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom) to store the current view properties in the webmap before saving it.  Note that this always saves the webmap as a new portal item owned by the user signed into the portal instance that executes the `saveAs()` method. If you want to modify an existing item without changing its ownership, use [save()](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#save).  The webmap will be automatically loaded if it is not already before saving.
    * > **Known Limitations**
    *   * [FeaturesLayers](esri-layers-FeatureLayer.html) created from a [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) or [feature service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm) will be saved.
    *   * For [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) and [WMSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html) the following rules will apply:
    *   * Any new layers of these types added to the webmap will not be saved.
    *   * For existing layers only modifications to the following properties will saved: maxScale, minScale, opacity, title, visibility.
    *   * Save support is coming for multi-layer feature collection, [MapNotesLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html), and [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs)
    *
    * @param portalItem The new portal item to which the webmap will be saved.  Portal item properties such as the title or description need to be explicitly set on the item and will not be automatically copied from the current associated webmap portal item (if any).
    * @param options Additional save options.
    * @param options.folder The folder in which to save the item.
    * @param options.ignoreUnsupported Allow the webmap to be saved even in the case it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the webmap may appear different when reloaded from its portal item.
    *
    */
  def saveAs(portalItem: PortalItem): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties, options: WebMapSaveAsOptions): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItem, options: WebMapSaveAsOptions): js.Promise[PortalItem] = js.native
  /**
    * Update properties of the WebMap related to the view. This should usually be called just before saving a webmap. The following properties are updated from the view: 1. [InitialViewProperties.spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#spatialReference)  Depending on the provided options, the following properties are also updated:  2. The [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#rotation), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#scale), and [targetGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#targetGeometry) properties of [InitialViewProperties.viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint) 3. The `thumbnail` of the [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    *
    * @param view The view to update from.
    * @param options Update options.
    * @param options.backgroundExcluded When `true`, the view's background will not be updated for the webmap. The default is `false` meaning the background will be updated for the webmap if there is a background.
    * @param options.viewpointExcluded When `true`, the initial [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint) of the view will not be updated for the webmap. Defaults to `false`, meaning the viewpoint will be updated for the webmap. Must set `scalePreserved` to `true` if the view's scale should be updated for the webmap.
    * @param options.scalePreserved When `true`, the view's scale will be updated for the webmap. Defaults to `false` meaning view's scale will not be updated for the webmap. It is ignored when `viewpointExcluded` is `true`.
    * @param options.thumbnailExcluded When `true`, the thumbnail will not be updated for the webmap. Defaults to `false` meaning the thumbnail will be updated for the webmap.
    * @param options.thumbnailSize The size of the thumbnail. Defaults to 600x400 (ratio 1.5:1). Note that the thumbnail size may currently not be larger than the size of the view.
    *
    */
  def updateFrom(view: MapView): js.Promise[_] = js.native
  def updateFrom(view: MapView, options: WebMapUpdateFromOptions): js.Promise[_] = js.native
}

