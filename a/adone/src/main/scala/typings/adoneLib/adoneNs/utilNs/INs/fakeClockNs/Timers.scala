package typings
package adoneLib.adoneNs.utilNs.INs.fakeClockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timers extends js.Object {
  @JSName("Date")
  var Date_Original: js.Function0[java.lang.String] with stdLib.DateConstructor = js.native
  @JSName("clearImmediate")
  var clearImmediate_Original: js.Function1[/* immediateId */ nodeLib.NodeJSNs.Immediate, scala.Unit] = js.native
  @JSName("clearInterval")
  var clearInterval_Original: js.Function1[/* intervalId */ nodeLib.NodeJSNs.Timeout, scala.Unit] = js.native
  @JSName("clearTimeout")
  var clearTimeout_Original: js.Function1[/* timeoutId */ nodeLib.NodeJSNs.Timeout, scala.Unit] = js.native
  var hrtime: nodeLib.NodeJSNs.Process = js.native
  var nextTick: nodeLib.NodeJSNs.Process = js.native
  @JSName("setImmediate")
  var setImmediate_Original: js.Function2[
    /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    /* repeated */ js.Any, 
    nodeLib.NodeJSNs.Immediate
  ] = js.native
  @JSName("setInterval")
  var setInterval_Original: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    /* ms */ scala.Double, 
    /* repeated */ js.Any, 
    nodeLib.NodeJSNs.Timeout
  ] = js.native
  @JSName("setTimeout")
  var setTimeout_Original: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    /* ms */ scala.Double, 
    /* repeated */ js.Any, 
    nodeLib.NodeJSNs.Timeout
  ] = js.native
  def Date(): java.lang.String = js.native
  def clearImmediate(immediateId: nodeLib.NodeJSNs.Immediate): scala.Unit = js.native
  def clearInterval(intervalId: nodeLib.NodeJSNs.Timeout): scala.Unit = js.native
  def clearTimeout(timeoutId: nodeLib.NodeJSNs.Timeout): scala.Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): nodeLib.NodeJSNs.Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): nodeLib.NodeJSNs.Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): nodeLib.NodeJSNs.Timeout = js.native
}

