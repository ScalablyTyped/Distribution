package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJournalKinesisStreamRequest extends StObject {
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.clientsQldbMod.LedgerName
  
  /**
    * The UUID (represented in Base62-encoded text) of the QLDB journal stream to describe.
    */
  var StreamId: UniqueId
}
object DescribeJournalKinesisStreamRequest {
  
  inline def apply(LedgerName: LedgerName, StreamId: UniqueId): DescribeJournalKinesisStreamRequest = {
    val __obj = js.Dynamic.literal(LedgerName = LedgerName.asInstanceOf[js.Any], StreamId = StreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJournalKinesisStreamRequest]
  }
  
  extension [Self <: DescribeJournalKinesisStreamRequest](x: Self) {
    
    inline def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
  }
}
