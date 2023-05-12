package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReadSetActivationJobRequest extends StObject {
  
  /**
    * To ensure that jobs don't run multiple times, specify a unique token for each job.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The read set's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    * The job's source files.
    */
  var sources: StartReadSetActivationJobRequestSourcesList
}
object StartReadSetActivationJobRequest {
  
  inline def apply(sequenceStoreId: SequenceStoreId, sources: StartReadSetActivationJobRequestSourcesList): StartReadSetActivationJobRequest = {
    val __obj = js.Dynamic.literal(sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReadSetActivationJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReadSetActivationJobRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setSources(value: StartReadSetActivationJobRequestSourcesList): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: StartReadSetActivationJobSourceItem*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
