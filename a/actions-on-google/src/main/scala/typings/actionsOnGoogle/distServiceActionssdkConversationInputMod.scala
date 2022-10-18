package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2RawInput
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2RawInputInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationInputMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/input", "Input")
  @js.native
  /** @hidden */
  open class Input () extends StObject {
    def this(input: GoogleActionsV2RawInput) = this()
    
    /**
      * Gets the user's raw input query.
      *
      * Will also be sent via intent handler 2nd argument which is the encouraged method to retrieve.
      *
      * @example
      * ```javascript
      *
      * // Encouraged method through intent handler
      * app.intent('actions.intent.TEXT', (conv, input) => {
      *  conv.close(`You said ${input}`)
      * })
      *
      * // Using conv.input.raw
      * app.intent('actions.intent.TEXT', conv => {
      *  conv.close(`You said ${conv.input.raw}`)
      * })
      * ```
      *
      * @public
      */
    var raw: String = js.native
    
    /**
      * Gets type of input used for this request.
      * @public
      */
    var `type`: GoogleActionsV2RawInputInputType = js.native
  }
}
