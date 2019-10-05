package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapImageLayerConstructor
  extends /**
  * MapImageLayer allows you to display and analyze data from [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sublayers) defined in a [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm), exporting images instead of features. Map service images are dynamically generated on the server based on a request, which includes an LOD (level of detail), a bounding box, dpi, spatial reference and other options. The exported image is of the entire map extent specified.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html)
  */
Instantiable0[MapImageLayer]
     with Instantiable1[/* properties */ MapImageLayerProperties, MapImageLayer] {
  def fromJSON(json: js.Any): MapImageLayer = js.native
}

