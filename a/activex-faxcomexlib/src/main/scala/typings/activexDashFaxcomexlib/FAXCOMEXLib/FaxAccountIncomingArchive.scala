package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountIncomingArchive Class */
@JSGlobal("FAXCOMEXLib.FaxAccountIncomingArchive")
@js.native
class FaxAccountIncomingArchive protected () extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountIncomingArchive_typekey")
  var FAXCOMEXLibDotFaxAccountIncomingArchive_typekey: FaxAccountIncomingArchive = js.native
  /** The high 32-bit value of the archive size */
  val SizeHigh: Double = js.native
  /** The low 32-bit value of the archive size */
  val SizeLow: Double = js.native
  /** Get an archived message by its ID */
  def GetMessage(bstrMessageId: String): IFaxIncomingMessage = js.native
  /**
    * Iterator on the archived messages
    * @param number [lPrefetchSize=100]
    */
  def GetMessages(): FaxIncomingMessageIterator = js.native
  def GetMessages(lPrefetchSize: Double): FaxIncomingMessageIterator = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
}

