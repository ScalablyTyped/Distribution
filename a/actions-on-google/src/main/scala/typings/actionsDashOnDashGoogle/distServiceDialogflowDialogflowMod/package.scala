package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServiceDialogflowDialogflowMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
  import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
  import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
  import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod.Argument
  import typings.actionsDashOnDashGoogle.distServiceDialogflowContextMod.Contexts
  import typings.actionsDashOnDashGoogle.distServiceDialogflowContextMod.Parameters
  import typings.actionsDashOnDashGoogle.distServiceDialogflowConvMod.DialogflowConversation

  type DialogflowIntentHandler[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */, TParameters /* <: Parameters */, TArgument /* <: Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* params */ TParameters, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  type DialogflowIntentHandlers = StringDictionary[js.UndefOr[js.Function | String]]
  type DialogflowMiddleware[TConversationPlugin /* <: DialogflowConversation[JsonObject, JsonObject, Contexts] */] = js.Function2[
    /* conv */ DialogflowConversation[JsonObject, JsonObject, Contexts], 
    /* framework */ BuiltinFrameworkMetadata, 
    ((DialogflowConversation[JsonObject, JsonObject, Contexts]) with TConversationPlugin) | Unit | (js.Promise[
      ((DialogflowConversation[JsonObject, JsonObject, Contexts]) with TConversationPlugin) | Unit
    ])
  ]
  type DialogflowVerificationHeaders = /**
    * A header key value pair to check against.
    * @public
    */
  StringDictionary[String]
}
