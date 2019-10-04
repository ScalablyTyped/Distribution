package typings.adone

import typings.async.asyncMod.AsyncResultCallback
import typings.async.asyncMod.AsyncResultObjectCallback
import typings.async.asyncMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackIteratee extends js.Object {
  def apply[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = js.native
  def apply[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = js.native
}

