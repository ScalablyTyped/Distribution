package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebMapProperties
  extends StObject
     with MapProperties {
  
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
    * When a web map is configured as floor-aware, it has a floorInfo property defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#floorInfo)
    */
  var floorInfo: js.UndefOr[MapFloorInfoProperties] = js.undefined
  
  /**
    * Information relating to a list of Geotriggers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#geotriggersInfo)
    */
  var geotriggersInfo: js.UndefOr[GeotriggersInfoProperties] = js.undefined
  
  /**
    * The initial view of the WebMap.
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
    * Provides multiple slides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#presentation)
    */
  var presentation: js.UndefOr[Any] = js.undefined
  
  /**
    * The URL to the thumbnail used for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The utilityNetworks object contains a collection of [UtilityNetworks](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html) saved on the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#utilityNetworks)
    */
  var utilityNetworks: js.UndefOr[CollectionProperties[UtilityNetworkProperties]] = js.undefined
  
  /**
    * The widgets object contains widgets that are exposed to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#widgets)
    */
  var widgets: js.UndefOr[Widgets] = js.undefined
}
object WebMapProperties {
  
  inline def apply(): WebMapProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebMapProperties]
  }
  
  extension [Self <: WebMapProperties](x: Self) {
    
    inline def setApplicationProperties(value: ApplicationPropertiesProperties): Self = StObject.set(x, "applicationProperties", value.asInstanceOf[js.Any])
    
    inline def setApplicationPropertiesUndefined: Self = StObject.set(x, "applicationProperties", js.undefined)
    
    inline def setAuthoringApp(value: String): Self = StObject.set(x, "authoringApp", value.asInstanceOf[js.Any])
    
    inline def setAuthoringAppUndefined: Self = StObject.set(x, "authoringApp", js.undefined)
    
    inline def setAuthoringAppVersion(value: String): Self = StObject.set(x, "authoringAppVersion", value.asInstanceOf[js.Any])
    
    inline def setAuthoringAppVersionUndefined: Self = StObject.set(x, "authoringAppVersion", js.undefined)
    
    inline def setBookmarks(value: CollectionProperties[BookmarkProperties]): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    inline def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    inline def setBookmarksVarargs(value: BookmarkProperties*): Self = StObject.set(x, "bookmarks", js.Array(value*))
    
    inline def setFloorInfo(value: MapFloorInfoProperties): Self = StObject.set(x, "floorInfo", value.asInstanceOf[js.Any])
    
    inline def setFloorInfoUndefined: Self = StObject.set(x, "floorInfo", js.undefined)
    
    inline def setGeotriggersInfo(value: GeotriggersInfoProperties): Self = StObject.set(x, "geotriggersInfo", value.asInstanceOf[js.Any])
    
    inline def setGeotriggersInfoUndefined: Self = StObject.set(x, "geotriggersInfo", js.undefined)
    
    inline def setInitialViewProperties(value: InitialViewPropertiesProperties): Self = StObject.set(x, "initialViewProperties", value.asInstanceOf[js.Any])
    
    inline def setInitialViewPropertiesUndefined: Self = StObject.set(x, "initialViewProperties", js.undefined)
    
    inline def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    inline def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
    
    inline def setPresentation(value: Any): Self = StObject.set(x, "presentation", value.asInstanceOf[js.Any])
    
    inline def setPresentationUndefined: Self = StObject.set(x, "presentation", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setUtilityNetworks(value: CollectionProperties[UtilityNetworkProperties]): Self = StObject.set(x, "utilityNetworks", value.asInstanceOf[js.Any])
    
    inline def setUtilityNetworksUndefined: Self = StObject.set(x, "utilityNetworks", js.undefined)
    
    inline def setUtilityNetworksVarargs(value: UtilityNetworkProperties*): Self = StObject.set(x, "utilityNetworks", js.Array(value*))
    
    inline def setWidgets(value: Widgets): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
  }
}
