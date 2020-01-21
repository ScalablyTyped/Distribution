package typings.async.mod

import typings.async.AnonErrorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "reflect")
@js.native
object reflect extends js.Object {
  def apply[T, E](fn: AsyncFunction[T, E]): js.Function1[
    /* callback */ js.Function2[/* err */ Null, /* result */ AnonErrorValue[E, T], Unit], 
    Unit
  ] = js.native
}

