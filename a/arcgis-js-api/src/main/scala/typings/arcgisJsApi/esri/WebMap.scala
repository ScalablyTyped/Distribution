package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`not-loaded`
import typings.arcgisJsApi.arcgisJsApiStrings.failed
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The initial view of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#initialViewProperties)
    */
  var initialViewProperties: InitialViewProperties = js.native
  
  /**
    * Triggers the loading of the WebMap instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#load)
    */
  def load(): js.Promise[_] = js.native
  
  /**
    * Loads all the externally loadable resources associated with the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadAll)
    */
  def loadAll(): js.Promise[WebMap] = js.native
  
  /**
    * The Error object returned if an error occurred while loading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadError)
    */
  val loadError: Error = js.native
  
  /**
    * Represents the status of a [load](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#load) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadStatus)
    */
  val loadStatus: `not-loaded` | loading | failed | typings.arcgisJsApi.arcgisJsApiStrings.loaded = js.native
  
  /**
    * Indicates whether the instance has loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loaded)
    */
  val loaded: Boolean = js.native
  
  /**
    * The portal item from which the WebMap is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  
  /**
    * Provides multiple slides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#presentation)
    */
  var presentation: js.Any = js.native
  
  /**
    * Saves the webmap to its associated portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#save)
    */
  def save(): js.Promise[PortalItem] = js.native
  def save(options: WebMapSaveOptions): js.Promise[PortalItem] = js.native
  
  /**
    * Saves the webmap to a new [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs)
    */
  def saveAs(portalItem: PortalItem): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties, options: WebMapSaveAsOptions): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItem, options: WebMapSaveAsOptions): js.Promise[PortalItem] = js.native
  
  /**
    * The version of the source document from which the WebMap was read.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
    */
  val sourceVersion: WebMapSourceVersion = js.native
  
  /**
    * The URL to the thumbnail used for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#thumbnailUrl)
    */
  var thumbnailUrl: String = js.native
  
  /**
    * Update properties of the WebMap related to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  def updateFrom(view: MapView): js.Promise[_] = js.native
  def updateFrom(view: MapView, options: WebMapUpdateFromOptions): js.Promise[_] = js.native
  
  /**
    * The widgets object contains widgets that are exposed to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#widgets)
    */
  var widgets: Widgets = js.native
}
