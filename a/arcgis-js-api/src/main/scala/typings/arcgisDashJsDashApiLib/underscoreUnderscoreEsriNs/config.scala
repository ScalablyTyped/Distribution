package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configure global properties of the library.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html)
  */
trait config extends js.Object {
  /**
    * The URL for font resources used by the [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family) class in [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) and [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) labels. To use your own hosted fonts, the font files need to be in `.pbf` format, and you must follow the kebab-case naming convention (e.g. "arial-unicode-ms-bold").
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#fontsUrl)
    *
    * @default "https://static.arcgis.com/fonts"
    */
  var fontsUrl: java.lang.String
  /**
    * The URL for the utility service used by [GeoRSSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html) to convert GeoRSS documents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geoRSSServiceUrl)
    *
    * @default "https://utility.arcgis.com/sharing/rss"
    */
  var geoRSSServiceUrl: java.lang.String
  /**
    * The default [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html) used by widgets and other operations, such as on-the-fly projections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geometryServiceUrl)
    *
    * @default "https://utility.arcgisonline.com/arcgis/rest/services/Geometry/GeometryServer"
    */
  var geometryServiceUrl: java.lang.String
  /**
    * The URL for the utility service used by [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) to convert KML documents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#kmlServiceUrl)
    *
    * @default "https://utility.arcgis.com/sharing/kml"
    */
  var kmlServiceUrl: java.lang.String
  /**
    * The URL of the portal instance. If using an on-premise portal, this value should be set to the portal instance, for example: `https://www.example.com/arcgis`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl)
    *
    * @default "https://www.arcgis.com"
    */
  var portalUrl: java.lang.String
  /**
    * An object with properties that control various aspects of communication between the library and web servers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var request: configRequest
  /**
    * The AMD loader's configuration object, which is loaded with each worker. Modify the configuration to specify locations of packages to be loaded with [the workers framework](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html) or to define a feature detection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var workers: configWorkers
}

object config {
  @scala.inline
  def apply(
    fontsUrl: java.lang.String,
    geoRSSServiceUrl: java.lang.String,
    geometryServiceUrl: java.lang.String,
    kmlServiceUrl: java.lang.String,
    portalUrl: java.lang.String,
    request: configRequest,
    workers: configWorkers
  ): config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fontsUrl")(fontsUrl)
    __obj.updateDynamic("geoRSSServiceUrl")(geoRSSServiceUrl)
    __obj.updateDynamic("geometryServiceUrl")(geometryServiceUrl)
    __obj.updateDynamic("kmlServiceUrl")(kmlServiceUrl)
    __obj.updateDynamic("portalUrl")(portalUrl)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("workers")(workers)
    __obj.asInstanceOf[config]
  }
}

