package typings.arcgisJsApi.geoJSONLayerMod

import typings.arcgisJsApi.esri.GeoJSONLayer
import typings.arcgisJsApi.esri.GeoJSONLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/GeoJSONLayer", JSImport.Namespace)
@js.native
/**
  * The GeoJSONLayer class is used to create a layer based on [GeoJSON](http://geojson.org/). GeoJSON is a format for encoding a variety of geographic data structures. The GeoJSON data must comply with the [RFC 7946 specification](https://tools.ietf.org/html/rfc7946) which states that the coordinates are in SpatialReference.WGS84.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html)
  */
class Class () extends GeoJSONLayer {
  def this(properties: GeoJSONLayerProperties) = this()
}

