package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxFolders Class */
trait FaxFolders extends StObject {
  
  /* private */ @JSName("FAXCOMEXLib.FaxFolders_typekey")
  var FAXCOMEXLibDotFaxFolders_typekey: FaxFolders
  
  /** Incoming archive */
  val IncomingArchive: FaxIncomingArchive
  
  /** Incoming queue */
  val IncomingQueue: FaxIncomingQueue
  
  /** Outgoing archive */
  val OutgoingArchive: FaxOutgoingArchive
  
  /** Outgoing queue */
  val OutgoingQueue: FaxOutgoingQueue
}
object FaxFolders {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: FaxFolders] (val x: Self) extends AnyVal {
    
    inline def setFAXCOMEXLibDotFaxFolders_typekey(value: FaxFolders): Self = StObject.set(x, "FAXCOMEXLib.FaxFolders_typekey", value.asInstanceOf[js.Any])
    
    inline def setIncomingArchive(value: FaxIncomingArchive): Self = StObject.set(x, "IncomingArchive", value.asInstanceOf[js.Any])
    
    inline def setIncomingQueue(value: FaxIncomingQueue): Self = StObject.set(x, "IncomingQueue", value.asInstanceOf[js.Any])
    
    inline def setOutgoingArchive(value: FaxOutgoingArchive): Self = StObject.set(x, "OutgoingArchive", value.asInstanceOf[js.Any])
    
    inline def setOutgoingQueue(value: FaxOutgoingQueue): Self = StObject.set(x, "OutgoingQueue", value.asInstanceOf[js.Any])
  }
}
