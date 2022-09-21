package typings.actionsOnGoogle

import typings.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2Context
import typings.actionsOnGoogle.contextMod.Contexts
import typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversationOptions
import typings.actionsOnGoogle.dialogflowDialogflowMod.Dialogflow_
import typings.actionsOnGoogle.v1Mod.DialogflowV1Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogflowMod {
  
  @JSImport("actions-on-google/dist/service/dialogflow", "ContextValues")
  @js.native
  /** @hidden */
  open class ContextValues[TContexts /* <: Contexts */] ()
    extends typings.actionsOnGoogle.contextMod.ContextValues[TContexts] {
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context]) = this()
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context], _session: String) = this()
    def this(outputContexts: Unit, _session: String) = this()
  }
  
  @JSImport("actions-on-google/dist/service/dialogflow", "DialogflowConversation")
  @js.native
  /** @public */
  open class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/dialogflow", "dialogflow")
  @js.native
  val dialogflow: Dialogflow_ = js.native
}
