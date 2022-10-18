package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJournalKinesisStreamRequest extends StObject {
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.clientsQldbMod.LedgerName
  
  /**
    * The UUID (represented in Base62-encoded text) of the QLDB journal stream to be canceled.
    */
  var StreamId: UniqueId
}
object CancelJournalKinesisStreamRequest {
  
  inline def apply(LedgerName: LedgerName, StreamId: UniqueId): CancelJournalKinesisStreamRequest = {
    val __obj = js.Dynamic.literal(LedgerName = LedgerName.asInstanceOf[js.Any], StreamId = StreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJournalKinesisStreamRequest]
  }
  
  extension [Self <: CancelJournalKinesisStreamRequest](x: Self) {
    
    inline def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
  }
}
