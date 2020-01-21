package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("__esri.MapNotesLayer")
@js.native
object MapNotesLayer extends TopLevel[MapNotesLayerConstructor]

