package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`map-notes`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapNotesLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer
     with BlendLayer {
  
  @JSName("type")
  val type_MapNotesLayer: `map-notes` = js.native
}
