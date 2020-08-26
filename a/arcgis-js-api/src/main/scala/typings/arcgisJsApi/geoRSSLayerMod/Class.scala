package typings.arcgisJsApi.geoRSSLayerMod

import typings.arcgisJsApi.esri.GeoRSSLayer
import typings.arcgisJsApi.esri.GeoRSSLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/GeoRSSLayer", JSImport.Namespace)
@js.native
/**
  * The GeoRSSLayer class is used to create a layer based on [GeoRSS](http://www.georss.org/). GeoRSS is a way to add geographic information to an RSS feed. The GeoRSSLayer supports both `GeoRSS-Simple` and `GeoRSS GML` encodings, and multiple geometry types.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html)
  */
class Class () extends GeoRSSLayer {
  def this(properties: GeoRSSLayerProperties) = this()
}

