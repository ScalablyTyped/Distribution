package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointPolicyStatusResult extends StObject {
  
  /**
    * Indicates the current policy status of the specified access point.
    */
  var PolicyStatus: js.UndefOr[typings.awsSdk.clientsS3controlMod.PolicyStatus] = js.undefined
}
object GetAccessPointPolicyStatusResult {
  
  inline def apply(): GetAccessPointPolicyStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointPolicyStatusResult]
  }
  
  extension [Self <: GetAccessPointPolicyStatusResult](x: Self) {
    
    inline def setPolicyStatus(value: PolicyStatus): Self = StObject.set(x, "PolicyStatus", value.asInstanceOf[js.Any])
    
    inline def setPolicyStatusUndefined: Self = StObject.set(x, "PolicyStatus", js.undefined)
  }
}
