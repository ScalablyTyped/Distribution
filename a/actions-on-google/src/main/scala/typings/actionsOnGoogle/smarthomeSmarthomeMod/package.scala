package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object smarthomeSmarthomeMod {
  
  type SmartHomeHandler[TRequest /* <: typings.actionsOnGoogle.apiV1Mod.SmartHomeV1Request */, TResponse /* <: typings.actionsOnGoogle.apiV1Mod.SmartHomeV1Response */] = js.Function3[
    /* body */ TRequest, 
    /* headers */ typings.actionsOnGoogle.frameworkFrameworkMod.Headers, 
    /* framework */ typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata, 
    TResponse | js.Promise[TResponse]
  ]
  
  type SmartHomeHandlers = org.scalablytyped.runtime.StringDictionary[
    typings.actionsOnGoogle.smarthomeSmarthomeMod.SmartHomeHandler[
      typings.actionsOnGoogle.apiV1Mod.SmartHomeV1Request, 
      typings.actionsOnGoogle.apiV1Mod.SmartHomeV1Response
    ]
  ]
  
  type SmartHome_ = js.Function1[
    /* options */ js.UndefOr[typings.actionsOnGoogle.smarthomeSmarthomeMod.SmartHomeOptions], 
    typings.actionsOnGoogle.assistantMod.AppHandler with typings.actionsOnGoogle.smarthomeSmarthomeMod.SmartHomeApp
  ]
}
