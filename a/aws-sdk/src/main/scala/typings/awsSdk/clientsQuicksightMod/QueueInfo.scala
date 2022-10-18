package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueInfo extends StObject {
  
  /**
    * The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
    */
  var QueuedIngestion: String
  
  /**
    * The ID of the queued ingestion.
    */
  var WaitingOnIngestion: String
}
object QueueInfo {
  
  inline def apply(QueuedIngestion: String, WaitingOnIngestion: String): QueueInfo = {
    val __obj = js.Dynamic.literal(QueuedIngestion = QueuedIngestion.asInstanceOf[js.Any], WaitingOnIngestion = WaitingOnIngestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueInfo]
  }
  
  extension [Self <: QueueInfo](x: Self) {
    
    inline def setQueuedIngestion(value: String): Self = StObject.set(x, "QueuedIngestion", value.asInstanceOf[js.Any])
    
    inline def setWaitingOnIngestion(value: String): Self = StObject.set(x, "WaitingOnIngestion", value.asInstanceOf[js.Any])
  }
}
