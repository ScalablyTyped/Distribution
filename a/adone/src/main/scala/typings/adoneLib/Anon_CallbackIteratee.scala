package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackIteratee extends js.Object {
  def apply[T, R, E](
    obj: asyncLib.asyncMod.Dictionary[T],
    iteratee: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* callback */ asyncLib.asyncMod.AsyncResultCallback[R, E], 
      scala.Unit
    ],
    callback: asyncLib.asyncMod.AsyncResultObjectCallback[R, E]
  ): scala.Unit = js.native
}

