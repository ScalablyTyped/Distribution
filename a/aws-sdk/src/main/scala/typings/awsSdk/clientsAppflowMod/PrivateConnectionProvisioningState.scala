package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateConnectionProvisioningState extends StObject {
  
  /**
    *  Specifies the private connection provisioning failure cause. 
    */
  var failureCause: js.UndefOr[PrivateConnectionProvisioningFailureCause] = js.undefined
  
  /**
    *  Specifies the private connection provisioning failure reason. 
    */
  var failureMessage: js.UndefOr[PrivateConnectionProvisioningFailureMessage] = js.undefined
  
  /**
    *  Specifies the private connection provisioning status. 
    */
  var status: js.UndefOr[PrivateConnectionProvisioningStatus] = js.undefined
}
object PrivateConnectionProvisioningState {
  
  inline def apply(): PrivateConnectionProvisioningState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateConnectionProvisioningState]
  }
  
  extension [Self <: PrivateConnectionProvisioningState](x: Self) {
    
    inline def setFailureCause(value: PrivateConnectionProvisioningFailureCause): Self = StObject.set(x, "failureCause", value.asInstanceOf[js.Any])
    
    inline def setFailureCauseUndefined: Self = StObject.set(x, "failureCause", js.undefined)
    
    inline def setFailureMessage(value: PrivateConnectionProvisioningFailureMessage): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    inline def setStatus(value: PrivateConnectionProvisioningStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
