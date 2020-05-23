package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`map-notes`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapNotesLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer {
  @JSName("type")
  val type_MapNotesLayer: `map-notes` = js.native
}

