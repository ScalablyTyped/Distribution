package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingArchive Class */
@js.native
trait FaxOutgoingArchive extends StObject {
  
  /** Indicates how long the fax message is kept on the server */
  var AgeLimit: Double = js.native
  
  /** Location of the outgoing archive on the server */
  var ArchiveFolder: String = js.native
  
  @JSName("FAXCOMEXLib.FaxOutgoingArchive_typekey")
  var FAXCOMEXLibDotFaxOutgoingArchive_typekey: FaxOutgoingArchive = js.native
  
  /** Get an archived message by its ID */
  def GetMessage(bstrMessageId: String): IFaxOutgoingMessage = js.native
  
  /**
    * Iterator on the archived messages
    * @param number [lPrefetchSize=100]
    */
  def GetMessages(): FaxOutgoingMessageIterator = js.native
  def GetMessages(lPrefetchSize: Double): FaxOutgoingMessageIterator = js.native
  
  /** High quota water mark */
  var HighQuotaWaterMark: Double = js.native
  
  /** Low quota water mark */
  var LowQuotaWaterMark: Double = js.native
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Save the object */
  def Save(): Unit = js.native
  
  /** The high 32-bit value of the archive size */
  val SizeHigh: Double = js.native
  
  /** The low 32-bit value of the archive size */
  val SizeLow: Double = js.native
  
  /** Is the size quota warning on or off */
  var SizeQuotaWarning: Boolean = js.native
  
  /** Whether sent faxes should be archived */
  var UseArchive: Boolean = js.native
}
