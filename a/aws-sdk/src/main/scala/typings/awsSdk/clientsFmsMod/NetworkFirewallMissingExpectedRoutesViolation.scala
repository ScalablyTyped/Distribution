package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallMissingExpectedRoutesViolation extends StObject {
  
  /**
    * The expected routes.
    */
  var ExpectedRoutes: js.UndefOr[typings.awsSdk.clientsFmsMod.ExpectedRoutes] = js.undefined
  
  /**
    * The target of the violation.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.clientsFmsMod.ViolationTarget] = js.undefined
  
  /**
    * Information about the VPC ID.
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object NetworkFirewallMissingExpectedRoutesViolation {
  
  inline def apply(): NetworkFirewallMissingExpectedRoutesViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallMissingExpectedRoutesViolation]
  }
  
  extension [Self <: NetworkFirewallMissingExpectedRoutesViolation](x: Self) {
    
    inline def setExpectedRoutes(value: ExpectedRoutes): Self = StObject.set(x, "ExpectedRoutes", value.asInstanceOf[js.Any])
    
    inline def setExpectedRoutesUndefined: Self = StObject.set(x, "ExpectedRoutes", js.undefined)
    
    inline def setExpectedRoutesVarargs(value: ExpectedRoute*): Self = StObject.set(x, "ExpectedRoutes", js.Array(value*))
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
