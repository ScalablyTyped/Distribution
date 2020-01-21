package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dialogflowDialogflowMod {
  type DialogflowIntentHandler[TConvData, TUserStorage, TContexts /* <: typings.actionsOnGoogle.contextMod.Contexts */, TConversation /* <: typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] */, TParameters /* <: typings.actionsOnGoogle.contextMod.Parameters */, TArgument /* <: typings.actionsOnGoogle.argumentArgumentMod.Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* params */ TParameters, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[typings.actionsOnGoogle.v2Mod.GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  type DialogflowIntentHandlers = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Function | java.lang.String]]
  type DialogflowMiddleware[TConversationPlugin /* <: typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
    typings.actionsOnGoogle.commonMod.JsonObject, 
    typings.actionsOnGoogle.commonMod.JsonObject, 
    typings.actionsOnGoogle.contextMod.Contexts
  ] */] = js.Function2[
    /* conv */ typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
      typings.actionsOnGoogle.commonMod.JsonObject, 
      typings.actionsOnGoogle.commonMod.JsonObject, 
      typings.actionsOnGoogle.contextMod.Contexts
    ], 
    /* framework */ typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata, 
    ((typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
      typings.actionsOnGoogle.commonMod.JsonObject, 
      typings.actionsOnGoogle.commonMod.JsonObject, 
      typings.actionsOnGoogle.contextMod.Contexts
    ]) with TConversationPlugin) | scala.Unit | (js.Promise[
      ((typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
        typings.actionsOnGoogle.commonMod.JsonObject, 
        typings.actionsOnGoogle.commonMod.JsonObject, 
        typings.actionsOnGoogle.contextMod.Contexts
      ]) with TConversationPlugin) | scala.Unit
    ])
  ]
  type DialogflowVerificationHeaders = /**
    * A header key value pair to check against.
    * @public
    */
  org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
