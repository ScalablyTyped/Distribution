package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingArchive Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingArchive")
@js.native
class FaxIncomingArchive protected () extends js.Object {
  /** How long the fax message is kept on the Server */
  var AgeLimit: scala.Double = js.native
  /** Location of the archive folder on the server */
  var ArchiveFolder: java.lang.String = js.native
  var `FAXCOMEXLib.FaxIncomingArchive_typekey`: FaxIncomingArchive = js.native
  /** High quota water mark */
  var HighQuotaWaterMark: scala.Double = js.native
  /** Low quota water mark */
  var LowQuotaWaterMark: scala.Double = js.native
  /** The high 32-bit value of the archive size */
  val SizeHigh: scala.Double = js.native
  /** The low 32-bit value of the archive size */
  val SizeLow: scala.Double = js.native
  /** Is size quota warning on */
  var SizeQuotaWarning: scala.Boolean = js.native
  /** Whether received faxes should be archived */
  var UseArchive: scala.Boolean = js.native
  /** Get archived message by its ID */
  def GetMessage(bstrMessageId: java.lang.String): IFaxIncomingMessage = js.native
  /**
    * Iterator on the archived messages
    * @param number [lPrefetchSize=100]
    */
  def GetMessages(): FaxIncomingMessageIterator = js.native
  def GetMessages(lPrefetchSize: scala.Double): FaxIncomingMessageIterator = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

