package typings
package adoneLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/async", "mapValuesSeries")
@js.native
object mapValuesSeries extends js.Object {
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

