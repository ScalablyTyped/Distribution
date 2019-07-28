package typings.adone.adoneNs.utilNs.INs.fakeClockNs

import typings.node.NodeJSNs.Immediate
import typings.node.NodeJSNs.Process
import typings.node.NodeJSNs.Timeout
import typings.std.DateConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timers extends js.Object {
  @JSName("Date")
  var Date_Original: js.Function0[String] with DateConstructor = js.native
  @JSName("clearImmediate")
  var clearImmediate_Original: js.Function1[/* immediateId */ Immediate, Unit] = js.native
  @JSName("clearInterval")
  var clearInterval_Original: js.Function1[/* intervalId */ Timeout, Unit] = js.native
  @JSName("clearTimeout")
  var clearTimeout_Original: js.Function1[/* timeoutId */ Timeout, Unit] = js.native
  var hrtime: Process = js.native
  var nextTick: Process = js.native
  @JSName("setImmediate")
  var setImmediate_Original: js.Function2[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* repeated */ js.Any, 
    Immediate
  ] = js.native
  @JSName("setInterval")
  var setInterval_Original: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* ms */ Double, 
    /* repeated */ js.Any, 
    Timeout
  ] = js.native
  @JSName("setTimeout")
  var setTimeout_Original: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* ms */ Double, 
    /* repeated */ js.Any, 
    Timeout
  ] = js.native
  def Date(): String = js.native
  def clearImmediate(immediateId: Immediate): Unit = js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
}

