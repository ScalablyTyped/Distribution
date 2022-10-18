package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalingPoliciesInput extends StObject {
  
  /**
    * A unique identifier for the fleet for which to retrieve scaling policies. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    *  The fleet location. If you don't specify this value, the response contains the scaling policies of every location in the fleet. 
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
  
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Scaling policy status to filter results on. A scaling policy is only in force when in an ACTIVE status.    ACTIVE -- The scaling policy is currently in force.    UPDATEREQUESTED -- A request to update the scaling policy has been received.    UPDATING -- A change is being made to the scaling policy.    DELETEREQUESTED -- A request to delete the scaling policy has been received.    DELETING -- The scaling policy is being deleted.    DELETED -- The scaling policy has been deleted.    ERROR -- An error occurred in creating the policy. It should be removed and recreated.  
    */
  var StatusFilter: js.UndefOr[ScalingStatusType] = js.undefined
}
object DescribeScalingPoliciesInput {
  
  inline def apply(FleetId: FleetIdOrArn): DescribeScalingPoliciesInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPoliciesInput]
  }
  
  extension [Self <: DescribeScalingPoliciesInput](x: Self) {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatusFilter(value: ScalingStatusType): Self = StObject.set(x, "StatusFilter", value.asInstanceOf[js.Any])
    
    inline def setStatusFilterUndefined: Self = StObject.set(x, "StatusFilter", js.undefined)
  }
}
