package typings.actionsOnGoogle.mod

import typings.actionsOnGoogle.contextMod.Contexts
import typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google", "DialogflowConversation")
@js.native
/** @public */
class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
  extends typings.actionsOnGoogle.dialogflowMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
  def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
}
