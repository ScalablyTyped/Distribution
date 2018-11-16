package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingMessageIterator Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingMessageIterator")
@js.native
class FaxOutgoingMessageIterator protected () extends js.Object {
  /** End of archive marker */
  val AtEOF: scala.Boolean = js.native
  var `FAXCOMEXLib.FaxOutgoingMessageIterator_typekey`: FaxOutgoingMessageIterator = js.native
  /** Current message */
  val Message: IFaxOutgoingMessage = js.native
  /** Size of prefetch buffer */
  var PrefetchSize: scala.Double = js.native
  /** Move to the first message */
  def MoveFirst(): scala.Unit = js.native
  /** Move to the next message */
  def MoveNext(): scala.Unit = js.native
}

