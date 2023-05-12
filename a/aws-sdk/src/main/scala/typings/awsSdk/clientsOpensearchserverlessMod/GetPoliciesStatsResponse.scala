package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPoliciesStatsResponse extends StObject {
  
  /**
    * Information about the data access policies in your account.
    */
  var AccessPolicyStats: js.UndefOr[typings.awsSdk.clientsOpensearchserverlessMod.AccessPolicyStats] = js.undefined
  
  /**
    * Information about the security configurations in your account.
    */
  var SecurityConfigStats: js.UndefOr[typings.awsSdk.clientsOpensearchserverlessMod.SecurityConfigStats] = js.undefined
  
  /**
    * Information about the security policies in your account.
    */
  var SecurityPolicyStats: js.UndefOr[typings.awsSdk.clientsOpensearchserverlessMod.SecurityPolicyStats] = js.undefined
  
  /**
    * The total number of OpenSearch Serverless security policies and configurations in your account.
    */
  var TotalPolicyCount: js.UndefOr[Long] = js.undefined
}
object GetPoliciesStatsResponse {
  
  inline def apply(): GetPoliciesStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPoliciesStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPoliciesStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessPolicyStats(value: AccessPolicyStats): Self = StObject.set(x, "AccessPolicyStats", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicyStatsUndefined: Self = StObject.set(x, "AccessPolicyStats", js.undefined)
    
    inline def setSecurityConfigStats(value: SecurityConfigStats): Self = StObject.set(x, "SecurityConfigStats", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigStatsUndefined: Self = StObject.set(x, "SecurityConfigStats", js.undefined)
    
    inline def setSecurityPolicyStats(value: SecurityPolicyStats): Self = StObject.set(x, "SecurityPolicyStats", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyStatsUndefined: Self = StObject.set(x, "SecurityPolicyStats", js.undefined)
    
    inline def setTotalPolicyCount(value: Long): Self = StObject.set(x, "TotalPolicyCount", value.asInstanceOf[js.Any])
    
    inline def setTotalPolicyCountUndefined: Self = StObject.set(x, "TotalPolicyCount", js.undefined)
  }
}
