package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`open-street-map`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenStreetMapLayer extends WebTileLayer {
  @JSName("type")
  val type_OpenStreetMapLayer: `open-street-map` = js.native
}

@JSGlobal("__esri.OpenStreetMapLayer")
@js.native
object OpenStreetMapLayer extends TopLevel[OpenStreetMapLayerConstructor]

