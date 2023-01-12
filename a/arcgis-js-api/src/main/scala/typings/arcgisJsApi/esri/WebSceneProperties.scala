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
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled)
    */
  var clippingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When a web scene is configured as floor-aware, it has a floorInfo property defined.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#floorInfo)
    */
  var floorInfo: js.UndefOr[MapFloorInfoProperties] = js.undefined
  
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
  
  inline def apply(): WebSceneProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSceneProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSceneProperties] (val x: Self) extends AnyVal {
    
    inline def setApplicationProperties(value: websceneApplicationPropertiesProperties): Self = StObject.set(x, "applicationProperties", value.asInstanceOf[js.Any])
    
    inline def setApplicationPropertiesUndefined: Self = StObject.set(x, "applicationProperties", js.undefined)
    
    inline def setAuthoringApp(value: String): Self = StObject.set(x, "authoringApp", value.asInstanceOf[js.Any])
    
    inline def setAuthoringAppUndefined: Self = StObject.set(x, "authoringApp", js.undefined)
    
    inline def setAuthoringAppVersion(value: String): Self = StObject.set(x, "authoringAppVersion", value.asInstanceOf[js.Any])
    
    inline def setAuthoringAppVersionUndefined: Self = StObject.set(x, "authoringAppVersion", js.undefined)
    
    inline def setClippingArea(value: ExtentProperties): Self = StObject.set(x, "clippingArea", value.asInstanceOf[js.Any])
    
    inline def setClippingAreaUndefined: Self = StObject.set(x, "clippingArea", js.undefined)
    
    inline def setClippingEnabled(value: Boolean): Self = StObject.set(x, "clippingEnabled", value.asInstanceOf[js.Any])
    
    inline def setClippingEnabledUndefined: Self = StObject.set(x, "clippingEnabled", js.undefined)
    
    inline def setFloorInfo(value: MapFloorInfoProperties): Self = StObject.set(x, "floorInfo", value.asInstanceOf[js.Any])
    
    inline def setFloorInfoUndefined: Self = StObject.set(x, "floorInfo", js.undefined)
    
    inline def setHeightModelInfo(value: HeightModelInfoProperties): Self = StObject.set(x, "heightModelInfo", value.asInstanceOf[js.Any])
    
    inline def setHeightModelInfoUndefined: Self = StObject.set(x, "heightModelInfo", js.undefined)
    
    inline def setInitialViewProperties(value: websceneInitialViewPropertiesProperties): Self = StObject.set(x, "initialViewProperties", value.asInstanceOf[js.Any])
    
    inline def setInitialViewPropertiesUndefined: Self = StObject.set(x, "initialViewProperties", js.undefined)
    
    inline def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    inline def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
    
    inline def setPresentation(value: PresentationProperties): Self = StObject.set(x, "presentation", value.asInstanceOf[js.Any])
    
    inline def setPresentationUndefined: Self = StObject.set(x, "presentation", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
  }
}
