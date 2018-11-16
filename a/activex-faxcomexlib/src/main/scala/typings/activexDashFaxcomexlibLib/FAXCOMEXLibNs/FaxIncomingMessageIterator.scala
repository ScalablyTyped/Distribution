package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessageIterator Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingMessageIterator")
@js.native
class FaxIncomingMessageIterator protected () extends js.Object {
  /** End of archive marker */
  val AtEOF: scala.Boolean = js.native
  var `FAXCOMEXLib.FaxIncomingMessageIterator_typekey`: FaxIncomingMessageIterator = js.native
  /** The current message */
  val Message: IFaxIncomingMessage = js.native
  /** Size of the prefetch buffer */
  var PrefetchSize: scala.Double = js.native
  /** Move to the first message in the archive */
  def MoveFirst(): scala.Unit = js.native
  /** Move to the next message in the archive */
  def MoveNext(): scala.Unit = js.native
}

