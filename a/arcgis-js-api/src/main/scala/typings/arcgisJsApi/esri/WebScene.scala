package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`not-loaded`
import typings.arcgisJsApi.arcgisJsApiStrings.failed
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebScene
  extends Map
     with corePromise {
  
  /**
    * Configuration of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#applicationProperties)
    */
  var applicationProperties: websceneApplicationProperties = js.native
  
  /**
    * The name of the application that authored the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#authoringApp)
    */
  var authoringApp: String = js.native
  
  /**
    * The version of the application that authored the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#authoringAppVersion)
    */
  var authoringAppVersion: String = js.native
  
  /**
    * *This property only applies to local scenes.* Represents an optional clipping area used to define the bounds or [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea)
    */
  var clippingArea: Extent = js.native
  
  /**
    * *This property only applies to local scenes.* Determines whether clipping using the [clippingArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea) is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled)
    */
  var clippingEnabled: Boolean = js.native
  
  /**
    * The height model info of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#heightModelInfo)
    */
  var heightModelInfo: HeightModelInfo = js.native
  
  /**
    * The initial view of the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#initialViewProperties)
    */
  var initialViewProperties: websceneInitialViewProperties = js.native
  
  /**
    * Triggers the loading of the WebScene instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#load)
    */
  def load(): js.Promise[_] = js.native
  
  /**
    * Loads all the externally loadable resources associated with the webscene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loadAll)
    */
  def loadAll(): js.Promise[WebScene] = js.native
  
  /**
    * The Error object returned if an error occurred while loading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loadError)
    */
  val loadError: Error = js.native
  
  /**
    * Represents the status of a [load](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#load) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loadStatus)
    */
  val loadStatus: `not-loaded` | loading | failed | typings.arcgisJsApi.arcgisJsApiStrings.loaded = js.native
  
  /**
    * Indicates whether the instance has loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loaded)
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
    * Saves the webscene to its associated portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#save)
    */
  def save(): js.Promise[PortalItem] = js.native
  def save(options: WebSceneSaveOptions): js.Promise[PortalItem] = js.native
  
  /**
    * Saves the webscene to a new portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#saveAs)
    */
  def saveAs(portalItem: PortalItem): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties, options: WebSceneSaveAsOptions): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItem, options: WebSceneSaveAsOptions): js.Promise[PortalItem] = js.native
  
  /**
    * The version of the source document from which the WebScene was read.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#sourceVersion)
    */
  val sourceVersion: WebSceneSourceVersion = js.native
  
  /**
    * The URL to the thumbnail used for the web scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#thumbnailUrl)
    */
  var thumbnailUrl: String = js.native
  
  /**
    * Converts an instance of [this class]() to its ArcGIS portal JSON representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#toJSON)
    */
  def toJSON(): js.Any = js.native
  
  /**
    * Update properties of the WebScene related to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  def updateFrom(view: SceneView): js.Promise[_] = js.native
  def updateFrom(view: SceneView, options: WebSceneUpdateFromOptions): js.Promise[_] = js.native
}
