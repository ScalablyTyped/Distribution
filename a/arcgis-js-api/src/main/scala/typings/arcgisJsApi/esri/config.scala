package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configure global properties of the library.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html)
  */
@js.native
trait config extends js.Object {
  
  /**
    * The URL for font resources used by the [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family) class in [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) and [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#fontsUrl)
    */
  var fontsUrl: String = js.native
  
  /**
    * The URL for the utility service used by [GeoRSSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html) to convert GeoRSS documents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geoRSSServiceUrl)
    */
  var geoRSSServiceUrl: String = js.native
  
  /**
    * The default [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html) used by widgets and other operations, such as on-the-fly projections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geometryServiceUrl)
    */
  var geometryServiceUrl: String = js.native
  
  /**
    * The URL for the utility service used by [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) to convert KML documents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#kmlServiceUrl)
    */
  var kmlServiceUrl: String = js.native
  
  /**
    * An object with properties that control various aspects of log messages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#log)
    */
  var log: configLog = js.native
  
  /**
    * The default URL of new portal instances.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl)
    */
  var portalUrl: String = js.native
  
  /**
    * An object with properties that control various aspects of communication between the library and web servers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var request: configRequest = js.native
  
  /**
    * The AMD loader's configuration object, which is loaded with each worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var workers: configWorkers = js.native
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
  implicit class configOps[Self <: config] (val x: Self) extends AnyVal {
    
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
    def setFontsUrl(value: String): Self = this.set("fontsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoRSSServiceUrl(value: String): Self = this.set("geoRSSServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryServiceUrl(value: String): Self = this.set("geometryServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmlServiceUrl(value: String): Self = this.set("kmlServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: configLog): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUrl(value: String): Self = this.set("portalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: configRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkers(value: configWorkers): Self = this.set("workers", value.asInstanceOf[js.Any])
  }
}
