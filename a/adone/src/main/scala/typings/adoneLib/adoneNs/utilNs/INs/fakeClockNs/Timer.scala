package typings
package adoneLib.adoneNs.utilNs.INs.fakeClockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  var id: scala.Double
  def ref(): scala.Unit
  def unref(): scala.Unit
}

object Timer {
  @scala.inline
  def apply(id: scala.Double, ref: js.Function0[scala.Unit], unref: js.Function0[scala.Unit]): Timer = {
    val __obj = js.Dynamic.literal(id = id, ref = ref, unref = unref)
  
    __obj.asInstanceOf[Timer]
  }
}

