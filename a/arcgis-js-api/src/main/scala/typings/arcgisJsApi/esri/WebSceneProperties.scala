package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSceneProperties
  extends StObject
     with MapProperties {
  
  /**
    * Configuration of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#applicationProperties)
    */
  var applicationProperties: js.UndefOr[websceneApplicationPropertiesProperties] = js.undefined
  
  /**
    * The name of the application that authored the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#authoringApp)
    */
  var authoringApp: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the application that authored the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#authoringAppVersion)
    */
  var authoringAppVersion: js.UndefOr[String] = js.undefined
  
  /**
    * *This property only applies to local scenes.* Represents an optional clipping area used to define the bounds or [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea)
    */
  var clippingArea: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * *This property only applies to local scenes.* Determines whether clipping using the [clippingArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea) is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled)
    */
  var clippingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The height model info of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#heightModelInfo)
    */
  var heightModelInfo: js.UndefOr[HeightModelInfoProperties] = js.undefined
  
  /**
    * The initial view of the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#initialViewProperties)
    */
  var initialViewProperties: js.UndefOr[websceneInitialViewPropertiesProperties] = js.undefined
  
  /**
    * The portal item from which the WebScene is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  
  /**
    * Provides a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of slides that act as bookmarks for saving predefined [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) and visible layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#presentation)
    */
  var presentation: js.UndefOr[PresentationProperties] = js.undefined
  
  /**
    * The URL to the thumbnail used for the web scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
}
object WebSceneProperties {
  
  @scala.inline
  def apply(): WebSceneProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSceneProperties]
  }
  
  @scala.inline
  implicit class WebScenePropertiesMutableBuilder[Self <: WebSceneProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationProperties(value: websceneApplicationPropertiesProperties): Self = StObject.set(x, "applicationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationPropertiesUndefined: Self = StObject.set(x, "applicationProperties", js.undefined)
    
    @scala.inline
    def setAuthoringApp(value: String): Self = StObject.set(x, "authoringApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoringAppUndefined: Self = StObject.set(x, "authoringApp", js.undefined)
    
    @scala.inline
    def setAuthoringAppVersion(value: String): Self = StObject.set(x, "authoringAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoringAppVersionUndefined: Self = StObject.set(x, "authoringAppVersion", js.undefined)
    
    @scala.inline
    def setClippingArea(value: ExtentProperties): Self = StObject.set(x, "clippingArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingAreaUndefined: Self = StObject.set(x, "clippingArea", js.undefined)
    
    @scala.inline
    def setClippingEnabled(value: Boolean): Self = StObject.set(x, "clippingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingEnabledUndefined: Self = StObject.set(x, "clippingEnabled", js.undefined)
    
    @scala.inline
    def setHeightModelInfo(value: HeightModelInfoProperties): Self = StObject.set(x, "heightModelInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightModelInfoUndefined: Self = StObject.set(x, "heightModelInfo", js.undefined)
    
    @scala.inline
    def setInitialViewProperties(value: websceneInitialViewPropertiesProperties): Self = StObject.set(x, "initialViewProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialViewPropertiesUndefined: Self = StObject.set(x, "initialViewProperties", js.undefined)
    
    @scala.inline
    def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
    
    @scala.inline
    def setPresentation(value: PresentationProperties): Self = StObject.set(x, "presentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationUndefined: Self = StObject.set(x, "presentation", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
  }
}
