package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * The GuardDuty finding activity type.
    */
  var ActionType: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the AWS_API_CALL action described in this finding.
    */
  var AwsApiCallAction: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.AwsApiCallAction] = js.undefined
  
  /**
    * Information about the DNS_REQUEST action described in this finding.
    */
  var DnsRequestAction: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.DnsRequestAction] = js.undefined
  
  /**
    * Information about the Kubernetes API call action described in this finding.
    */
  var KubernetesApiCallAction: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.KubernetesApiCallAction] = js.undefined
  
  /**
    * Information about the NETWORK_CONNECTION action described in this finding.
    */
  var NetworkConnectionAction: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.NetworkConnectionAction] = js.undefined
  
  /**
    * Information about the PORT_PROBE action described in this finding.
    */
  var PortProbeAction: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.PortProbeAction] = js.undefined
  
  /**
    * Information about RDS_LOGIN_ATTEMPT action described in this finding.
    */
  var RdsLoginAttemptAction: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.RdsLoginAttemptAction] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setActionType(value: String): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    inline def setAwsApiCallAction(value: AwsApiCallAction): Self = StObject.set(x, "AwsApiCallAction", value.asInstanceOf[js.Any])
    
    inline def setAwsApiCallActionUndefined: Self = StObject.set(x, "AwsApiCallAction", js.undefined)
    
    inline def setDnsRequestAction(value: DnsRequestAction): Self = StObject.set(x, "DnsRequestAction", value.asInstanceOf[js.Any])
    
    inline def setDnsRequestActionUndefined: Self = StObject.set(x, "DnsRequestAction", js.undefined)
    
    inline def setKubernetesApiCallAction(value: KubernetesApiCallAction): Self = StObject.set(x, "KubernetesApiCallAction", value.asInstanceOf[js.Any])
    
    inline def setKubernetesApiCallActionUndefined: Self = StObject.set(x, "KubernetesApiCallAction", js.undefined)
    
    inline def setNetworkConnectionAction(value: NetworkConnectionAction): Self = StObject.set(x, "NetworkConnectionAction", value.asInstanceOf[js.Any])
    
    inline def setNetworkConnectionActionUndefined: Self = StObject.set(x, "NetworkConnectionAction", js.undefined)
    
    inline def setPortProbeAction(value: PortProbeAction): Self = StObject.set(x, "PortProbeAction", value.asInstanceOf[js.Any])
    
    inline def setPortProbeActionUndefined: Self = StObject.set(x, "PortProbeAction", js.undefined)
    
    inline def setRdsLoginAttemptAction(value: RdsLoginAttemptAction): Self = StObject.set(x, "RdsLoginAttemptAction", value.asInstanceOf[js.Any])
    
    inline def setRdsLoginAttemptActionUndefined: Self = StObject.set(x, "RdsLoginAttemptAction", js.undefined)
  }
}
