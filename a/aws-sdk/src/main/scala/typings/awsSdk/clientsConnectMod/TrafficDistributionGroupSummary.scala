package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficDistributionGroupSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the traffic distribution group.
    */
  var Arn: js.UndefOr[TrafficDistributionGroupArn] = js.undefined
  
  /**
    * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the Region where the traffic distribution group was created. The ARN must be provided if the call is from the replicated Region.
    */
  var Id: js.UndefOr[TrafficDistributionGroupId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the traffic distribution group.
    */
  var InstanceArn: js.UndefOr[typings.awsSdk.clientsConnectMod.InstanceArn] = js.undefined
  
  /**
    * The name of the traffic distribution group.
    */
  var Name: js.UndefOr[Name128] = js.undefined
  
  /**
    * The status of the traffic distribution group.     CREATION_IN_PROGRESS means the previous CreateTrafficDistributionGroup operation is still in progress and has not yet completed.    ACTIVE means the previous CreateTrafficDistributionGroup operation has succeeded.    CREATION_FAILED indicates that the previous CreateTrafficDistributionGroup operation has failed.    PENDING_DELETION means the previous DeleteTrafficDistributionGroup operation is still in progress and has not yet completed.    DELETION_FAILED means the previous DeleteTrafficDistributionGroup operation has failed.    UPDATE_IN_PROGRESS means the previous UpdateTrafficDistributionGroup operation is still in progress and has not yet completed.  
    */
  var Status: js.UndefOr[TrafficDistributionGroupStatus] = js.undefined
}
object TrafficDistributionGroupSummary {
  
  inline def apply(): TrafficDistributionGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficDistributionGroupSummary]
  }
  
  extension [Self <: TrafficDistributionGroupSummary](x: Self) {
    
    inline def setArn(value: TrafficDistributionGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: TrafficDistributionGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceArnUndefined: Self = StObject.set(x, "InstanceArn", js.undefined)
    
    inline def setName(value: Name128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: TrafficDistributionGroupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
