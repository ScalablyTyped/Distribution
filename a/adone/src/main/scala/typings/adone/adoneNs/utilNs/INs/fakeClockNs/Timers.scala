package typings.adone.adoneNs.utilNs.INs.fakeClockNs

import typings.adone.Fn_ArgsCallback
import typings.adone.Fn_ArgsCallbackAny
import typings.adone.Fn_ImmediateId
import typings.adone.Fn_IntervalId
import typings.adone.Fn_String
import typings.adone.Fn_TimeoutId
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
  var Date_Original: Fn_String with DateConstructor = js.native
  @JSName("clearImmediate")
  var clearImmediate_Original: Fn_ImmediateId = js.native
  @JSName("clearInterval")
  var clearInterval_Original: Fn_IntervalId = js.native
  @JSName("clearTimeout")
  var clearTimeout_Original: Fn_TimeoutId = js.native
  var hrtime: Process = js.native
  var nextTick: Process = js.native
  @JSName("setImmediate")
  var setImmediate_Original: Fn_ArgsCallbackAny = js.native
  @JSName("setInterval")
  var setInterval_Original: Fn_ArgsCallback = js.native
  @JSName("setTimeout")
  var setTimeout_Original: Fn_ArgsCallback = js.native
  def Date(): String = js.native
  def clearImmediate(immediateId: Immediate): Unit = js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
}

