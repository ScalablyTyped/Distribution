package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxFolders Class */
@js.native
trait FaxFolders extends StObject {
  
  @JSName("FAXCOMEXLib.FaxFolders_typekey")
  var FAXCOMEXLibDotFaxFolders_typekey: FaxFolders = js.native
  
  /** Incoming archive */
  val IncomingArchive: FaxIncomingArchive = js.native
  
  /** Incoming queue */
  val IncomingQueue: FaxIncomingQueue = js.native
  
  /** Outgoing archive */
  val OutgoingArchive: FaxOutgoingArchive = js.native
  
  /** Outgoing queue */
  val OutgoingQueue: FaxOutgoingQueue = js.native
}
object FaxFolders {
  
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxFolders_typekey: FaxFolders,
    IncomingArchive: FaxIncomingArchive,
    IncomingQueue: FaxIncomingQueue,
    OutgoingArchive: FaxOutgoingArchive,
    OutgoingQueue: FaxOutgoingQueue
  ): FaxFolders = {
    val __obj = js.Dynamic.literal(IncomingArchive = IncomingArchive.asInstanceOf[js.Any], IncomingQueue = IncomingQueue.asInstanceOf[js.Any], OutgoingArchive = OutgoingArchive.asInstanceOf[js.Any], OutgoingQueue = OutgoingQueue.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxFolders_typekey")(FAXCOMEXLibDotFaxFolders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxFolders]
  }
  
  @scala.inline
  implicit class FaxFoldersMutableBuilder[Self <: FaxFolders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAXCOMEXLibDotFaxFolders_typekey(value: FaxFolders): Self = StObject.set(x, "FAXCOMEXLib.FaxFolders_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingArchive(value: FaxIncomingArchive): Self = StObject.set(x, "IncomingArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingQueue(value: FaxIncomingQueue): Self = StObject.set(x, "IncomingQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingArchive(value: FaxOutgoingArchive): Self = StObject.set(x, "OutgoingArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingQueue(value: FaxOutgoingQueue): Self = StObject.set(x, "OutgoingQueue", value.asInstanceOf[js.Any])
  }
}
