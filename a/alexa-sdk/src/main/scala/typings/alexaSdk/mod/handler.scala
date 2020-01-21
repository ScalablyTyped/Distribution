package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-sdk", "handler")
@js.native
object handler extends js.Object {
  def apply[T /* <: Request */](event: RequestBody[T], context: Context): AlexaObject[T] = js.native
  def apply[T /* <: Request */](
    event: RequestBody[T],
    context: Context,
    callback: js.Function2[/* err */ js.Any, /* response */ js.Any, Unit]
  ): AlexaObject[T] = js.native
}

