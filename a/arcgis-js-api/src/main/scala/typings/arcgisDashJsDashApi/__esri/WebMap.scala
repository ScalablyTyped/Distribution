package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMap
  extends Map
     with corePromise {
  /**
    * Object responsible for containing the viewing and editing properties of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#applicationProperties)
    */
  var applicationProperties: js.Any = js.native
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
  val loadStatus: String = js.native
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
  def load(): IPromise[_] = js.native
  /**
    * Loads all the externally loadable resources associated with the webmap. For the webmap this will load the ground, basemap and layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadAll)
    *
    *
    */
  def loadAll(): IPromise[WebMap] = js.native
}

@JSGlobal("__esri.WebMap")
@js.native
object WebMap extends TopLevel[WebMapConstructor]

