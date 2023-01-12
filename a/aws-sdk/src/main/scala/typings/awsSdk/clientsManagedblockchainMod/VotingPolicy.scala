package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VotingPolicy extends StObject {
  
  /**
    * Defines the rules for the network for voting on proposals, such as the percentage of YES votes required for the proposal to be approved and the duration of the proposal. The policy applies to all proposals and is specified when the network is created.
    */
  var ApprovalThresholdPolicy: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.ApprovalThresholdPolicy] = js.undefined
}
object VotingPolicy {
  
  inline def apply(): VotingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VotingPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VotingPolicy] (val x: Self) extends AnyVal {
    
    inline def setApprovalThresholdPolicy(value: ApprovalThresholdPolicy): Self = StObject.set(x, "ApprovalThresholdPolicy", value.asInstanceOf[js.Any])
    
    inline def setApprovalThresholdPolicyUndefined: Self = StObject.set(x, "ApprovalThresholdPolicy", js.undefined)
  }
}
