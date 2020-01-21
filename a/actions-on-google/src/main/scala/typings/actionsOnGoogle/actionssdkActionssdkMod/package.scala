package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object actionssdkActionssdkMod {
  type ActionSdkIntentHandlers = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      (typings.actionsOnGoogle.actionssdkActionssdkMod.ActionsSdkIntentHandler[
        js.Object, 
        js.Object, 
        typings.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object], 
        typings.actionsOnGoogle.argumentArgumentMod.Argument
      ]) | java.lang.String
    ]
  ]
  type ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation /* <: typings.actionsOnGoogle.convMod.ActionsSdkConversation[TConvData, TUserStorage] */, TArgument /* <: typings.actionsOnGoogle.argumentArgumentMod.Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* input */ java.lang.String, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[typings.actionsOnGoogle.v2Mod.GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  type ActionsSdkMiddleware[TConversationPlugin /* <: typings.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object] */] = js.Function2[
    /* conv */ typings.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object], 
    /* framework */ typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata, 
    ((typings.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object]) with TConversationPlugin) | scala.Unit | (js.Promise[
      ((typings.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object]) with TConversationPlugin) | scala.Unit
    ])
  ]
}
