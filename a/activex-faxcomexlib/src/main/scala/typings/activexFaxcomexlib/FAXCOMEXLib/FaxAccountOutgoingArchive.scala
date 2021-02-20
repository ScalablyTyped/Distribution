package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountOutgoingArchive Class */
@js.native
trait FaxAccountOutgoingArchive extends StObject {
  
  @JSName("FAXCOMEXLib.FaxAccountOutgoingArchive_typekey")
  var FAXCOMEXLibDotFaxAccountOutgoingArchive_typekey: FaxAccountOutgoingArchive = js.native
  
  /** Get an archived message by its ID */
  def GetMessage(bstrMessageId: String): IFaxOutgoingMessage = js.native
  
  /**
    * Iterator on the archived messages
    * @param number [lPrefetchSize=100]
    */
  def GetMessages(): FaxOutgoingMessageIterator = js.native
  def GetMessages(lPrefetchSize: Double): FaxOutgoingMessageIterator = js.native
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** The high 32-bit value of the archive size */
  val SizeHigh: Double = js.native
  
  /** The low 32-bit value of the archive size */
  val SizeLow: Double = js.native
}
