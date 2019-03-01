package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayerConstructor
  extends /**
  * The TileLayer allows you work with a cached [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) exposed by the ArcGIS Server REST API and add it to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) as a tile layer. A cached service accesses tiles from a cache instead of dynamically rendering images. Because they are cached, tiled layers render faster than [MapImageLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html). To create an instance of TileLayer, you must reference the URL of the cached map service.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html)
  */
org.scalablytyped.runtime.Instantiable0[TileLayer]
     with org.scalablytyped.runtime.Instantiable1[/* properties */ TileLayerProperties, TileLayer] {
  def fromJSON(json: js.Any): TileLayer = js.native
}

