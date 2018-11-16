package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingArchive Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingArchive")
@js.native
class FaxOutgoingArchive protected () extends js.Object {
  /** Indicates how long the fax message is kept on the server */
  var AgeLimit: scala.Double = js.native
  /** Location of the outgoing archive on the server */
  var ArchiveFolder: java.lang.String = js.native
  var `FAXCOMEXLib.FaxOutgoingArchive_typekey`: FaxOutgoingArchive = js.native
  /** High quota water mark */
  var HighQuotaWaterMark: scala.Double = js.native
  /** Low quota water mark */
  var LowQuotaWaterMark: scala.Double = js.native
  /** The high 32-bit value of the archive size */
  val SizeHigh: scala.Double = js.native
  /** The low 32-bit value of the archive size */
  val SizeLow: scala.Double = js.native
  /** Is the size quota warning on or off */
  var SizeQuotaWarning: scala.Boolean = js.native
  /** Whether sent faxes should be archived */
  var UseArchive: scala.Boolean = js.native
  /** Get an archived message by its ID */
  def GetMessage(bstrMessageId: java.lang.String): IFaxOutgoingMessage = js.native
  /**
           * Iterator on the archived messages
           * @param number [lPrefetchSize=100]
           */
  def GetMessages(): FaxOutgoingMessageIterator = js.native
  /**
           * Iterator on the archived messages
           * @param number [lPrefetchSize=100]
           */
  def GetMessages(lPrefetchSize: scala.Double): FaxOutgoingMessageIterator = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

