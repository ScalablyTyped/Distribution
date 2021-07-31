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
    * The URL for font resources used by the [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family) class in [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) and [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#fontsUrl)
    */
  var fontsUrl: String
  
  /**
    * The URL for the utility service used by [GeoRSSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html) to convert GeoRSS documents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geoRSSServiceUrl)
    */
  var geoRSSServiceUrl: String
  
  /**
    * The default [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html) used by widgets and other operations, such as on-the-fly projections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geometryServiceUrl)
    */
  var geometryServiceUrl: String
  
  /**
    * The URL for the utility service used by [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) to convert KML documents.
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
    * The AMD loader's configuration object, which is loaded with each worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var workers: configWorkers
}
object config {
  
  @scala.inline
  def apply(
    fontsUrl: String,
    geoRSSServiceUrl: String,
    geometryServiceUrl: String,
    kmlServiceUrl: String,
    log: configLog,
    portalUrl: String,
    request: configRequest,
    workers: configWorkers
  ): config = {
    val __obj = js.Dynamic.literal(fontsUrl = fontsUrl.asInstanceOf[js.Any], geoRSSServiceUrl = geoRSSServiceUrl.asInstanceOf[js.Any], geometryServiceUrl = geometryServiceUrl.asInstanceOf[js.Any], kmlServiceUrl = kmlServiceUrl.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], portalUrl = portalUrl.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
  
  @scala.inline
  implicit class configMutableBuilder[Self <: config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontsUrl(value: String): Self = StObject.set(x, "fontsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoRSSServiceUrl(value: String): Self = StObject.set(x, "geoRSSServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryServiceUrl(value: String): Self = StObject.set(x, "geometryServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmlServiceUrl(value: String): Self = StObject.set(x, "kmlServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: configLog): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUrl(value: String): Self = StObject.set(x, "portalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: configRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkers(value: configWorkers): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
  }
}
