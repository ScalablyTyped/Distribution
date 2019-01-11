package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var StateString: java.lang.String = js.native
  def CreateStateHandler(state: java.lang.String, obj: js.Any): js.Any = js.native
  def handler[T /* <: alexaDashSdkLib.alexaDashSdkMod.Request */](
    event: alexaDashSdkLib.alexaDashSdkMod.RequestBody[T],
    context: alexaDashSdkLib.alexaDashSdkMod.Context
  ): alexaDashSdkLib.alexaDashSdkMod.AlexaObject[T] = js.native
  def handler[T /* <: alexaDashSdkLib.alexaDashSdkMod.Request */](
    event: alexaDashSdkLib.alexaDashSdkMod.RequestBody[T],
    context: alexaDashSdkLib.alexaDashSdkMod.Context,
    callback: js.Function2[/* err */ js.Any, /* response */ js.Any, scala.Unit]
  ): alexaDashSdkLib.alexaDashSdkMod.AlexaObject[T] = js.native
}

