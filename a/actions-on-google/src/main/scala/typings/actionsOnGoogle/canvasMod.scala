package typings.actionsOnGoogle

import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/canvas", JSImport.Namespace)
@js.native
object canvasMod extends js.Object {
  
  @js.native
  class Canvas protected () extends js.Object {
    /** @hidden */
    def this(user: GoogleActionsV2Input) = this()
    
    /**
      * Gets the canvas state
      *
      * Accessible using `conv.canvas.state`
      * @public
      */
    var state: js.UndefOr[JsonObject] = js.native
  }
}
