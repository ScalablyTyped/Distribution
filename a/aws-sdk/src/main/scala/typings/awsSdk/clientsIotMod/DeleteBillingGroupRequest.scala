package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBillingGroupRequest extends StObject {
  
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName
  
  /**
    * The expected version of the billing group. If the version of the billing group does not match the expected version specified in the request, the DeleteBillingGroup request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
}
object DeleteBillingGroupRequest {
  
  inline def apply(billingGroupName: BillingGroupName): DeleteBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBillingGroupRequest]
  }
  
  extension [Self <: DeleteBillingGroupRequest](x: Self) {
    
    inline def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    inline def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    inline def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
  }
}
