package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServiceSmarthomeSmarthomeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.actionsDashOnDashGoogle.distAssistantMod.AppHandler
  import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
  import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.Headers
  import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1Request
  import typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1Response

  type SmartHome = js.Function1[/* options */ js.UndefOr[SmartHomeOptions], AppHandler with SmartHomeApp]
  type SmartHomeHandler[TRequest /* <: SmartHomeV1Request */, TResponse /* <: SmartHomeV1Response */] = js.Function3[
    /* body */ TRequest, 
    /* headers */ Headers, 
    /* framework */ BuiltinFrameworkMetadata, 
    TResponse | js.Promise[TResponse]
  ]
  type SmartHomeHandlers = StringDictionary[SmartHomeHandler[SmartHomeV1Request, SmartHomeV1Response]]
}
