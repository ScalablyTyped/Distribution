package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSceneProperties extends MapProperties {
  
  /**
    * Configuration of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#applicationProperties)
    */
  var applicationProperties: js.UndefOr[websceneApplicationPropertiesProperties] = js.native
  
  /**
    * The name of the application that authored the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#authoringApp)
    */
  var authoringApp: js.UndefOr[String] = js.native
  
  /**
    * The version of the application that authored the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#authoringAppVersion)
    */
  var authoringAppVersion: js.UndefOr[String] = js.native
  
  /**
    * *This property only applies to local scenes.* Represents an optional clipping area used to define the bounds or [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea)
    */
  var clippingArea: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * *This property only applies to local scenes.* Determines whether clipping using the [clippingArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea) is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled)
    */
  var clippingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The height model info of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#heightModelInfo)
    */
  var heightModelInfo: js.UndefOr[HeightModelInfoProperties] = js.native
  
  /**
    * The initial view of the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#initialViewProperties)
    */
  var initialViewProperties: js.UndefOr[websceneInitialViewPropertiesProperties] = js.native
  
  /**
    * The portal item from which the WebScene is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
  
  /**
    * Provides a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of slides that act as bookmarks for saving predefined [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) and visible layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#presentation)
    */
  var presentation: js.UndefOr[PresentationProperties] = js.native
  
  /**
    * The URL to the thumbnail used for the web scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
}
object WebSceneProperties {
  
  @scala.inline
  def apply(): WebSceneProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSceneProperties]
  }
  
  @scala.inline
  implicit class WebScenePropertiesOps[Self <: WebSceneProperties] (val x: Self) extends AnyVal {
    
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
    def setApplicationProperties(value: websceneApplicationPropertiesProperties): Self = this.set("applicationProperties", value.asInstanceOf[js.Any])
    
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
    def setClippingArea(value: ExtentProperties): Self = this.set("clippingArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClippingArea: Self = this.set("clippingArea", js.undefined)
    
    @scala.inline
    def setClippingEnabled(value: Boolean): Self = this.set("clippingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClippingEnabled: Self = this.set("clippingEnabled", js.undefined)
    
    @scala.inline
    def setHeightModelInfo(value: HeightModelInfoProperties): Self = this.set("heightModelInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightModelInfo: Self = this.set("heightModelInfo", js.undefined)
    
    @scala.inline
    def setInitialViewProperties(value: websceneInitialViewPropertiesProperties): Self = this.set("initialViewProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialViewProperties: Self = this.set("initialViewProperties", js.undefined)
    
    @scala.inline
    def setPortalItem(value: PortalItemProperties): Self = this.set("portalItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalItem: Self = this.set("portalItem", js.undefined)
    
    @scala.inline
    def setPresentation(value: PresentationProperties): Self = this.set("presentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentation: Self = this.set("presentation", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailUrl: Self = this.set("thumbnailUrl", js.undefined)
  }
}
