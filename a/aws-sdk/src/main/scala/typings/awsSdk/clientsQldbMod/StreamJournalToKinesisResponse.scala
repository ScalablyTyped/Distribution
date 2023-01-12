package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamJournalToKinesisResponse extends StObject {
  
  /**
    * The UUID (represented in Base62-encoded text) that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: js.UndefOr[UniqueId] = js.undefined
}
object StreamJournalToKinesisResponse {
  
  inline def apply(): StreamJournalToKinesisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamJournalToKinesisResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamJournalToKinesisResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
