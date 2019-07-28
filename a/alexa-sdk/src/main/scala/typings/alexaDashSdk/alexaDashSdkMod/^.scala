package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var StateString: String = js.native
  def CreateStateHandler(state: String, obj: js.Any): js.Any = js.native
  def handler[T /* <: Request */](event: RequestBody[T], context: Context): AlexaObject[T] = js.native
  def handler[T /* <: Request */](
    event: RequestBody[T],
    context: Context,
    callback: js.Function2[/* err */ js.Any, /* response */ js.Any, Unit]
  ): AlexaObject[T] = js.native
}

