package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountFolders Class */
@js.native
trait FaxAccountFolders extends StObject {
  
  @JSName("FAXCOMEXLib.FaxAccountFolders_typekey")
  var FAXCOMEXLibDotFaxAccountFolders_typekey: FaxAccountFolders = js.native
  
  /** Incoming archive */
  val IncomingArchive: FaxAccountIncomingArchive = js.native
  
  /** Incoming queue */
  val IncomingQueue: FaxAccountIncomingQueue = js.native
  
  /** Outgoing archive */
  val OutgoingArchive: FaxAccountOutgoingArchive = js.native
  
  /** Outgoing queue */
  val OutgoingQueue: FaxAccountOutgoingQueue = js.native
}
object FaxAccountFolders {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FaxAccountFoldersMutableBuilder[Self <: FaxAccountFolders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAXCOMEXLibDotFaxAccountFolders_typekey(value: FaxAccountFolders): Self = StObject.set(x, "FAXCOMEXLib.FaxAccountFolders_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingArchive(value: FaxAccountIncomingArchive): Self = StObject.set(x, "IncomingArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingQueue(value: FaxAccountIncomingQueue): Self = StObject.set(x, "IncomingQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingArchive(value: FaxAccountOutgoingArchive): Self = StObject.set(x, "OutgoingArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingQueue(value: FaxAccountOutgoingQueue): Self = StObject.set(x, "OutgoingQueue", value.asInstanceOf[js.Any])
  }
}
