package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServiceActionssdkActionssdkMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
  import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
  import typings.actionsDashOnDashGoogle.distServiceActionssdkConvMod.ActionsSdkConversation
  import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod.Argument

  type ActionSdkIntentHandlers = StringDictionary[
    js.UndefOr[
      (ActionsSdkIntentHandler[js.Object, js.Object, ActionsSdkConversation[js.Object, js.Object], Argument]) | String
    ]
  ]
  type ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation /* <: ActionsSdkConversation[TConvData, TUserStorage] */, TArgument /* <: Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* input */ String, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  type ActionsSdkMiddleware[TConversationPlugin /* <: ActionsSdkConversation[js.Object, js.Object] */] = js.Function2[
    /* conv */ ActionsSdkConversation[js.Object, js.Object], 
    /* framework */ BuiltinFrameworkMetadata, 
    ((ActionsSdkConversation[js.Object, js.Object]) with TConversationPlugin) | Unit | (js.Promise[((ActionsSdkConversation[js.Object, js.Object]) with TConversationPlugin) | Unit])
  ]
}
