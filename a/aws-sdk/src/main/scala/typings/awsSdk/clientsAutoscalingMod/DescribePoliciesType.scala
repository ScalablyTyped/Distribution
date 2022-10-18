package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePoliciesType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The maximum number of items to be returned with each call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The names of one or more policies. If you omit this property, all policies are described. If a group name is provided, the results are limited to that group. If you specify an unknown policy name, it is ignored with no error. Array Members: Maximum number of 50 items.
    */
  var PolicyNames: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.PolicyNames] = js.undefined
  
  /**
    * One or more policy types. The valid values are SimpleScaling, StepScaling, TargetTrackingScaling, and PredictiveScaling.
    */
  var PolicyTypes: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.PolicyTypes] = js.undefined
}
object DescribePoliciesType {
  
  inline def apply(): DescribePoliciesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePoliciesType]
  }
  
  extension [Self <: DescribePoliciesType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPolicyNames(value: PolicyNames): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    inline def setPolicyNamesVarargs(value: ResourceName*): Self = StObject.set(x, "PolicyNames", js.Array(value*))
    
    inline def setPolicyTypes(value: PolicyTypes): Self = StObject.set(x, "PolicyTypes", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypesUndefined: Self = StObject.set(x, "PolicyTypes", js.undefined)
    
    inline def setPolicyTypesVarargs(value: XmlStringMaxLen64*): Self = StObject.set(x, "PolicyTypes", js.Array(value*))
  }
}
