package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRequest extends StObject {
  
  /**
    * The identifier of the job that you want to cancel. To get a list of the jobs (including their jobId) that have a status of Submitted, use the ListJobsByStatus API action.
    */
  var Id: typings.awsSdk.clientsElastictranscoderMod.Id
}
object CancelJobRequest {
  
  inline def apply(Id: Id): CancelJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  extension [Self <: CancelJobRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
