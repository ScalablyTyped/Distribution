package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJournalKinesisStreamResponse extends StObject {
  
  /**
    * The UUID (Base62-encoded text) of the canceled QLDB journal stream.
    */
  var StreamId: js.UndefOr[UniqueId] = js.undefined
}
object CancelJournalKinesisStreamResponse {
  
  inline def apply(): CancelJournalKinesisStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelJournalKinesisStreamResponse]
  }
  
  extension [Self <: CancelJournalKinesisStreamResponse](x: Self) {
    
    inline def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
