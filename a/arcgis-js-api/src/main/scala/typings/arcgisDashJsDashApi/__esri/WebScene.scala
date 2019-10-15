package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`not-loaded`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.failed
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebScene
  extends Map
     with corePromise {
  /**
    * Configuration of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#applicationProperties)
    */
  var applicationProperties: ApplicationProperties = js.native
  /**
    * *This property only applies to local scenes.* Represents an optional clipping area used to define the bounds or [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene. If defined, only data (including the basemap) within the area will be displayed.  Set the [clippingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled) property to `true` to apply the specified clippingArea to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea)
    */
  var clippingArea: Extent = js.native
  /**
    * *This property only applies to local scenes.* Determines whether clipping using the [clippingArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea) is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled)
    *
    * @default false
    */
  var clippingEnabled: Boolean = js.native
  /**
    * The height model info of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html). This object defines the characteristics of the vertical coordinate system used by the scene. In a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), the height model info is used to avoid combining layers that have incompatible vertical coordinate systems.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#heightModelInfo)
    */
  var heightModelInfo: HeightModelInfo = js.native
  /**
    * The initial view of the WebScene. This object contains properties such as [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewpoint), [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#spatialReference), [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewingMode), and [environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#environment) that should be applied to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) when the scene loads.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#initialViewProperties)
    */
  var initialViewProperties: websceneInitialViewProperties = js.native
  /**
    * The Error object returned if an error occurred while loading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loadError)
    *
    * @default null
    */
  val loadError: Error = js.native
  /**
    * Represents the status of a [load](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#load) operation.
    *
    * Value | Description
    * ------|------------
    * not-loaded | The object's resources have not loaded.
    * loading | The object's resources are currently loading.
    * loaded | The object's resources have loaded without errors.
    * failed | The object's resources failed to load. See [loadError](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loadError) for more details.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loadStatus)
    *
    * @default not-loaded
    */
  val loadStatus: `not-loaded` | loading | failed | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.loaded = js.native
  /**
    * Indicates whether the instance has loaded. When `true`, the properties of the object can be accessed. A WebScene is considered loaded when its [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#layers) and [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#basemap) are fully created, but not yet loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loaded)
    *
    * @default false
    */
  val loaded: Boolean = js.native
  /**
    * The portal item from which the WebScene is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  /**
    * Provides a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of slides that act as bookmarks for saving predefined [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) and visible layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#presentation)
    */
  var presentation: Presentation = js.native
  /**
    * The version of the source document from which the WebScene was read. The WebScene must be version 1.x to load into an app.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#sourceVersion)
    */
  val sourceVersion: WebSceneSourceVersion = js.native
  /**
    * The URL to the thumbnail used for the web scene. The thumbnail will by default be the thumbnail URL from the portal item associated to the web scene. The thumbnail of the web scene may be updated by changing the thumbnail URL and saving the web scene. Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom) to update the thumbnail automatically from a specified view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#thumbnailUrl)
    */
  var thumbnailUrl: String = js.native
  /**
    * Triggers the loading of the WebScene instance.  A WebScene is considered [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loaded) when its [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#layers), [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#basemap) and [ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#ground) are fully created. When created with a [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#portalItem), `load()` will first fetch its data to create the content, otherwise it resolves immediately.  The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) automatically calls the `load()` method when a WebScene instance is added to its [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#map) property so it can display in the view and load each individual layer. If the WebScene is used outside of a view, for example to preload it, you must call `load()` explicitly to interact with its resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#load)
    *
    *
    */
  def load(): IPromise[_] = js.native
  /**
    * Loads all the externally loadable resources associated with the webscene. For the webscene this will load the ground, basemap, layers and slide basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loadAll)
    *
    *
    */
  def loadAll(): IPromise[WebScene] = js.native
  /**
    * Saves the webscene to its associated portal item. The portal item to save to must already exist and be valid. This is a convenience method that will use [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#update) to store the webscene in the item. The web scene is saved according to [web scene specification](https://developers.arcgis.com/web-scene-specification/) standards.  Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom) to store the current view properties in the webscene before saving it.  Note that this saves the webscene to its existing item. Depending on how the scene is shared, users that do not own the scene may modify it. To save an existing scene as a new item owned by the user signed into the portal instance, use [saveAs()](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#saveAs).  The webscene will be automatically loaded if it is not already before saving.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#save)
    *
    * @param options Additional options.
    * @param options.ignoreUnsupported When `true`, the scene will save even if it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the scene may appear different when reloaded from its portal item.
    *
    */
  def save(): IPromise[PortalItem] = js.native
  def save(options: WebSceneSaveOptions): IPromise[PortalItem] = js.native
  /**
    * Saves the webscene to a new portal item. If saving has completed successfully, then the saved portal item will be set in the portalItem property of the WebScene. This is a convenience method that will create a new [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) and use [PortalUser.addItem()](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#addItem) to store the webscene in a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html).  Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom) to store the current view properties in the webscene before saving it.  Note that this always saves the webscene as a new portal item owned by the user performing the edits and executing the `saveAs()` method. If you want to modify the existing item without changing its ownership use [save()](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#save).  The webscene will be automatically loaded if it is not already before saving.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#saveAs)
    *
    * @param portalItem The new portal item to which the scene will be saved.  Portal item properties such as the title or description need to be explicitly set on the item and will not be automatically copied from the current associated scene portal item (if any).
    * @param options additional save options.
    * @param options.folder the folder in which to save the item.
    * @param options.ignoreUnsupported allow the scene to be saved even in the case it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the scene may appear different when reloaded from its portal item.
    *
    */
  def saveAs(portalItem: PortalItem): IPromise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties): IPromise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties, options: WebSceneSaveAsOptions): IPromise[PortalItem] = js.native
  def saveAs(portalItem: PortalItem, options: WebSceneSaveAsOptions): IPromise[PortalItem] = js.native
  /**
    * Converts an instance of [this class]() to its ArcGIS portal JSON representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide and the [web scene specification](https://developers.arcgis.com/web-scene-specification/) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
  /**
    * Update properties of the WebScene related to the view. This should usually be called just before saving a scene. The following properties are updated from the view:  1. `initialViewProperties.spatialReference` 2. `initialViewProperties.viewingMode` 3. `clippingArea` 4. `heightModelInfo`  Depending on the provided options, the following properties are also updated:  1. `initialViewProperties.environment` 2. `initialViewProperties.viewpoint` 3. `thumbnail`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    *
    * @param view The view to update from.
    * @param options Options for updating.
    * @param options.environmentExcluded Do not update the initial environment from the view, defaults to false.
    * @param options.viewpointExcluded Do not update the initial viewpoint from the view, defaults to false.
    * @param options.thumbnailExcluded Do not update the thumbnail from the view. Defaults to true, unless viewpointExcluded is set to true.
    * @param options.thumbnailSize The size of the thumbnail. Defaults to 600x400 (ratio 1.5:1). Note that the thumbnail size may currently not be larger than the size of the view.
    *
    */
  def updateFrom(view: SceneView): IPromise[_] = js.native
  def updateFrom(view: SceneView, options: WebSceneUpdateFromOptions): IPromise[_] = js.native
}

@JSGlobal("__esri.WebScene")
@js.native
object WebScene extends TopLevel[WebSceneConstructor]

