package typings
package adoneLib.adoneNs.utilNs.INs.fakeClockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clock extends js.Object {
  def clearImmediate(timer: Timer): scala.Unit = js.native
  def clearInterval(timer: Timer): scala.Unit = js.native
  def clearTimeout(timer: Timer): scala.Unit = js.native
  def hrtime(): js.Tuple2[scala.Double, scala.Double] = js.native
  def hrtime(prev: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  def next(): scala.Double = js.native
  def nextTick(func: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): scala.Unit = js.native
  def runAll(): scala.Double = js.native
  def runToLast(): scala.Double = js.native
  def setImmediate(func: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): Timer = js.native
  def setInterval(func: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): Timer = js.native
  def setSystemTime(systemTime: scala.Double): scala.Unit = js.native
  def setTimeout(func: js.Function1[/* repeated */ js.Any, scala.Unit], timeout: scala.Double, args: js.Any*): Timer = js.native
  def tick(ms: scala.Double): scala.Double = js.native
  def updateHrTime(newNow: scala.Double): scala.Unit = js.native
}

