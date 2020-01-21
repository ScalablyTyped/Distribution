package typings.arcgisJsApi.sublayerMod

import typings.arcgisJsApi.esri.Sublayer
import typings.arcgisJsApi.esri.SublayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/Sublayer", JSImport.Namespace)
@js.native
/**
  * Represents a sublayer in a [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) or a [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html). MapImageLayer allows you to display, query, and analyze layers from data defined in a [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm). Map services contain sublayers with properties such as [renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#renderer), [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelingInfo), and [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression), and others that are defined on the server. The properties of each MapImageLayer sublayer on the map service may be dynamically changed by the user or developer. The properties of each TileLayer sublayer are read-only, and cannot be modified.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html)
  */
class Class () extends Sublayer {
  def this(properties: SublayerProperties) = this()
}

