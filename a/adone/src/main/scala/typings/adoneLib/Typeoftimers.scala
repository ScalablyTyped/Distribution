package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftimers extends js.Object {
  val setImmediateNs: TypeofsetImmediate = js.native
  val setTimeoutNs: TypeofsetTimeout = js.native
  def clearImmediate(immediateId: nodeLib.NodeJSNs.Immediate): scala.Unit = js.native
  def clearInterval(intervalId: nodeLib.NodeJSNs.Timeout): scala.Unit = js.native
  def clearTimeout(timeoutId: nodeLib.NodeJSNs.Timeout): scala.Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): nodeLib.NodeJSNs.Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): nodeLib.NodeJSNs.Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): nodeLib.NodeJSNs.Timeout = js.native
}

