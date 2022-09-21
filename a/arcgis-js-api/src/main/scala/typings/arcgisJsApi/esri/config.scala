package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configure global properties of the library.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html)
  */
trait config extends StObject {
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#apiKey)
    */
  var apiKey: String
  
  /**
    * Overrides the URL for loading the API assets when using local builds of the `@arcgis/core` and `arcgis-js-api` NPM packages.
    *
    * @default "https://js.arcgis.com/[4.x]/@arcgis/core/assets"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#assetsPath)
    */
  var assetsPath: String
  
  /**
    * The URL for font resources used by the [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family) class in [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) and [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) labels.
    *
    * @default "https://static.arcgis.com/fonts"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#fontsUrl)
    */
  var fontsUrl: String
  
  /**
    * The URL for the utility service used by [GeoRSSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html) to convert GeoRSS documents.
    *
    * @default "https://utility.arcgis.com/sharing/rss"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geoRSSServiceUrl)
    */
  var geoRSSServiceUrl: String
  
  /**
    * The default [geometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html) used by widgets and other operations, such as on-the-fly projections.
    *
    * @default "https://utility.arcgisonline.com/arcgis/rest/services/Geometry/GeometryServer"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geometryServiceUrl)
    */
  var geometryServiceUrl: String
  
  /**
    * The URL for the utility service used by [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) to convert KML documents.
    *
    * @default "https://utility.arcgis.com/sharing/kml"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#kmlServiceUrl)
    */
  var kmlServiceUrl: String
  
  /**
    * An object with properties that control various aspects of log messages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#log)
    */
  var log: configLog
  
  /**
    * The default URL of new portal instances.
    *
    * @default "https://www.arcgis.com"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl)
    */
  var portalUrl: String
  
  /**
    * An object with properties that control various aspects of communication between the library and web servers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var request: configRequest
  
  /**
    * The default routing service used by the [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) and the [Directions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html) widget.
    *
    * @default "https://route-api.arcgis.com/arcgis/rest/services/World/Route/NAServer/Route_World"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#routeServiceUrl)
    */
  var routeServiceUrl: String
  
  /**
    * An object with properties that control various aspects of [the workers framework](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var workers: configWorkers
}
object config {
  
  inline def apply(
    apiKey: String,
    assetsPath: String,
    fontsUrl: String,
    geoRSSServiceUrl: String,
    geometryServiceUrl: String,
    kmlServiceUrl: String,
    log: configLog,
    portalUrl: String,
    request: configRequest,
    routeServiceUrl: String,
    workers: configWorkers
  ): config = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], assetsPath = assetsPath.asInstanceOf[js.Any], fontsUrl = fontsUrl.asInstanceOf[js.Any], geoRSSServiceUrl = geoRSSServiceUrl.asInstanceOf[js.Any], geometryServiceUrl = geometryServiceUrl.asInstanceOf[js.Any], kmlServiceUrl = kmlServiceUrl.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], portalUrl = portalUrl.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], routeServiceUrl = routeServiceUrl.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
  
  extension [Self <: config](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
    
    inline def setFontsUrl(value: String): Self = StObject.set(x, "fontsUrl", value.asInstanceOf[js.Any])
    
    inline def setGeoRSSServiceUrl(value: String): Self = StObject.set(x, "geoRSSServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setGeometryServiceUrl(value: String): Self = StObject.set(x, "geometryServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setKmlServiceUrl(value: String): Self = StObject.set(x, "kmlServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setLog(value: configLog): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setPortalUrl(value: String): Self = StObject.set(x, "portalUrl", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: configRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRouteServiceUrl(value: String): Self = StObject.set(x, "routeServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setWorkers(value: configWorkers): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
  }
}
