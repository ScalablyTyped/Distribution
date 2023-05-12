package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReferenceImportJobRequest extends StObject {
  
  /**
    * To ensure that jobs don't run multiple times, specify a unique token for each job.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The job's reference store ID.
    */
  var referenceStoreId: ReferenceStoreId
  
  /**
    * A service role for the job.
    */
  var roleArn: RoleArn
  
  /**
    * The job's source files.
    */
  var sources: StartReferenceImportJobRequestSourcesList
}
object StartReferenceImportJobRequest {
  
  inline def apply(
    referenceStoreId: ReferenceStoreId,
    roleArn: RoleArn,
    sources: StartReferenceImportJobRequestSourcesList
  ): StartReferenceImportJobRequest = {
    val __obj = js.Dynamic.literal(referenceStoreId = referenceStoreId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReferenceImportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReferenceImportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setReferenceStoreId(value: ReferenceStoreId): Self = StObject.set(x, "referenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSources(value: StartReferenceImportJobRequestSourcesList): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: StartReferenceImportJobSourceItem*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
