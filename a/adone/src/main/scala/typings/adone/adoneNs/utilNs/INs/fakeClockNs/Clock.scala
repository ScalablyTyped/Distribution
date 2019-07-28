package typings.adone.adoneNs.utilNs.INs.fakeClockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clock extends js.Object {
  def clearImmediate(timer: Timer): Unit = js.native
  def clearInterval(timer: Timer): Unit = js.native
  def clearTimeout(timer: Timer): Unit = js.native
  def hrtime(): js.Tuple2[Double, Double] = js.native
  def hrtime(prev: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  def next(): Double = js.native
  def nextTick(func: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit = js.native
  def runAll(): Double = js.native
  def runToLast(): Double = js.native
  def setImmediate(func: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Timer = js.native
  def setInterval(func: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Timer = js.native
  def setSystemTime(systemTime: Double): Unit = js.native
  def setTimeout(func: js.Function1[/* repeated */ js.Any, Unit], timeout: Double, args: js.Any*): Timer = js.native
  def tick(ms: Double): Double = js.native
  def updateHrTime(newNow: Double): Unit = js.native
}

