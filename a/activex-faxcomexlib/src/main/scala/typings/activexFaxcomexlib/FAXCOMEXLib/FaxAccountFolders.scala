package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountFolders Class */
trait FaxAccountFolders extends StObject {
  
  /* private */ @JSName("FAXCOMEXLib.FaxAccountFolders_typekey")
  var FAXCOMEXLibDotFaxAccountFolders_typekey: FaxAccountFolders
  
  /** Incoming archive */
  val IncomingArchive: FaxAccountIncomingArchive
  
  /** Incoming queue */
  val IncomingQueue: FaxAccountIncomingQueue
  
  /** Outgoing archive */
  val OutgoingArchive: FaxAccountOutgoingArchive
  
  /** Outgoing queue */
  val OutgoingQueue: FaxAccountOutgoingQueue
}
object FaxAccountFolders {
  
  inline def apply(
    FAXCOMEXLibDotFaxAccountFolders_typekey: FaxAccountFolders,
    IncomingArchive: FaxAccountIncomingArchive,
    IncomingQueue: FaxAccountIncomingQueue,
    OutgoingArchive: FaxAccountOutgoingArchive,
    OutgoingQueue: FaxAccountOutgoingQueue
  ): FaxAccountFolders = {
    val __obj = js.Dynamic.literal(IncomingArchive = IncomingArchive.asInstanceOf[js.Any], IncomingQueue = IncomingQueue.asInstanceOf[js.Any], OutgoingArchive = OutgoingArchive.asInstanceOf[js.Any], OutgoingQueue = OutgoingQueue.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountFolders_typekey")(FAXCOMEXLibDotFaxAccountFolders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountFolders]
  }
  
  extension [Self <: FaxAccountFolders](x: Self) {
    
    inline def setFAXCOMEXLibDotFaxAccountFolders_typekey(value: FaxAccountFolders): Self = StObject.set(x, "FAXCOMEXLib.FaxAccountFolders_typekey", value.asInstanceOf[js.Any])
    
    inline def setIncomingArchive(value: FaxAccountIncomingArchive): Self = StObject.set(x, "IncomingArchive", value.asInstanceOf[js.Any])
    
    inline def setIncomingQueue(value: FaxAccountIncomingQueue): Self = StObject.set(x, "IncomingQueue", value.asInstanceOf[js.Any])
    
    inline def setOutgoingArchive(value: FaxAccountOutgoingArchive): Self = StObject.set(x, "OutgoingArchive", value.asInstanceOf[js.Any])
    
    inline def setOutgoingQueue(value: FaxAccountOutgoingQueue): Self = StObject.set(x, "OutgoingQueue", value.asInstanceOf[js.Any])
  }
}
