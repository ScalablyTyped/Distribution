package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityResolutionJobRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The unique identifier of the Identity Resolution Job.
    */
  var JobId: uuid
}
object GetIdentityResolutionJobRequest {
  
  inline def apply(DomainName: name, JobId: uuid): GetIdentityResolutionJobRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityResolutionJobRequest]
  }
  
  extension [Self <: GetIdentityResolutionJobRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: uuid): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
