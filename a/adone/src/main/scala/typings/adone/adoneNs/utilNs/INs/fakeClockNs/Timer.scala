package typings.adone.adoneNs.utilNs.INs.fakeClockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  var id: Double
  def ref(): Unit
  def unref(): Unit
}

object Timer {
  @scala.inline
  def apply(id: Double, ref: () => Unit, unref: () => Unit): Timer = {
    val __obj = js.Dynamic.literal(id = id, ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[Timer]
  }
}

