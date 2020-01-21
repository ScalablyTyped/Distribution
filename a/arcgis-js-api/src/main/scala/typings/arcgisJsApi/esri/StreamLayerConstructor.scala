package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLayerConstructor
  extends /**
  * The stream layer extends the feature layer to add the ability to connect to a stream of data using HTML5 WebSockets. It connects to a server that emits geographic features continuously. While the feature layer is used to map relatively static data, the stream layer is suitable when you would like to map dynamic streams of data that are unbounded and continuous. When a stream layer is added to a map, users are able to see real-time updates pushed out by the server.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html)
  */
Instantiable0[StreamLayer]
     with Instantiable1[/* properties */ StreamLayerProperties, StreamLayer] {
  def fromJSON(json: js.Any): StreamLayer = js.native
}

