package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`map-notes`
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

