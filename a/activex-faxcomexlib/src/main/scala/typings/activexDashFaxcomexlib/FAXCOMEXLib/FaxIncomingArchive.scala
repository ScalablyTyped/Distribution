package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingArchive Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingArchive")
@js.native
class FaxIncomingArchive protected () extends js.Object {
  /** How long the fax message is kept on the Server */
  var AgeLimit: Double = js.native
  /** Location of the archive folder on the server */
  var ArchiveFolder: String = js.native
  @JSName("FAXCOMEXLib.FaxIncomingArchive_typekey")
  var FAXCOMEXLibDotFaxIncomingArchive_typekey: FaxIncomingArchive = js.native
  /** High quota water mark */
  var HighQuotaWaterMark: Double = js.native
  /** Low quota water mark */
  var LowQuotaWaterMark: Double = js.native
  /** The high 32-bit value of the archive size */
  val SizeHigh: Double = js.native
  /** The low 32-bit value of the archive size */
  val SizeLow: Double = js.native
  /** Is size quota warning on */
  var SizeQuotaWarning: Boolean = js.native
  /** Whether received faxes should be archived */
  var UseArchive: Boolean = js.native
  /** Get archived message by its ID */
  def GetMessage(bstrMessageId: String): IFaxIncomingMessage = js.native
  /**
    * Iterator on the archived messages
    * @param number [lPrefetchSize=100]
    */
  def GetMessages(): FaxIncomingMessageIterator = js.native
  def GetMessages(lPrefetchSize: Double): FaxIncomingMessageIterator = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

