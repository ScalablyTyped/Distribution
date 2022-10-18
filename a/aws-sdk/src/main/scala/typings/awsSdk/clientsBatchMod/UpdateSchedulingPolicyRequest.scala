package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSchedulingPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the scheduling policy to update.
    */
  var arn: String
  
  /**
    * The fair share policy.
    */
  var fairsharePolicy: js.UndefOr[FairsharePolicy] = js.undefined
}
object UpdateSchedulingPolicyRequest {
  
  inline def apply(arn: String): UpdateSchedulingPolicyRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchedulingPolicyRequest]
  }
  
  extension [Self <: UpdateSchedulingPolicyRequest](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setFairsharePolicy(value: FairsharePolicy): Self = StObject.set(x, "fairsharePolicy", value.asInstanceOf[js.Any])
    
    inline def setFairsharePolicyUndefined: Self = StObject.set(x, "fairsharePolicy", js.undefined)
  }
}
