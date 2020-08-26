package typings.actionsOnGoogle

import typings.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2Context
import typings.actionsOnGoogle.contextMod.Contexts
import typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversationOptions
import typings.actionsOnGoogle.dialogflowDialogflowMod.Dialogflow_
import typings.actionsOnGoogle.v1Mod.DialogflowV1Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/dialogflow", JSImport.Namespace)
@js.native
object dialogflowMod extends js.Object {
  @js.native
  /** @hidden */
  class ContextValues[TContexts /* <: Contexts */] ()
    extends typings.actionsOnGoogle.contextMod.ContextValues[TContexts] {
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context]) = this()
    def this(outputContexts: js.UndefOr[scala.Nothing], _session: String) = this()
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context], _session: String) = this()
  }
  
  @js.native
  /** @public */
  class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  val dialogflow: Dialogflow_ = js.native
}

