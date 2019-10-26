package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2RawInput
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2RawInputInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/input", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationInputMod extends js.Object {
  @js.native
  /** @hidden */
  class Input () extends js.Object {
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

