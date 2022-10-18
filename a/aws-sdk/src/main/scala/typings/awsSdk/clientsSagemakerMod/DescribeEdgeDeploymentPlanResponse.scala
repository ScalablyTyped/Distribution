package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEdgeDeploymentPlanResponse extends StObject {
  
  /**
    * The time when the edge deployment plan was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The device fleet used for this edge deployment plan.
    */
  var DeviceFleetName: EntityName
  
  /**
    * The number of edge devices that failed the deployment.
    */
  var EdgeDeploymentFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of edge devices yet to pick up deployment, or in progress.
    */
  var EdgeDeploymentPending: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ARN of edge deployment plan.
    */
  var EdgeDeploymentPlanArn: typings.awsSdk.clientsSagemakerMod.EdgeDeploymentPlanArn
  
  /**
    * The name of the edge deployment plan.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * The number of edge devices with the successful deployment.
    */
  var EdgeDeploymentSuccess: js.UndefOr[Integer] = js.undefined
  
  /**
    * The time when the edge deployment plan was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * List of models associated with the edge deployment plan.
    */
  var ModelConfigs: EdgeDeploymentModelConfigs
  
  /**
    * Token to use when calling the next set of stages in the edge deployment plan.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * List of stages in the edge deployment plan.
    */
  var Stages: DeploymentStageStatusSummaries
}
object DescribeEdgeDeploymentPlanResponse {
  
  inline def apply(
    DeviceFleetName: EntityName,
    EdgeDeploymentPlanArn: EdgeDeploymentPlanArn,
    EdgeDeploymentPlanName: EntityName,
    ModelConfigs: EdgeDeploymentModelConfigs,
    Stages: DeploymentStageStatusSummaries
  ): DescribeEdgeDeploymentPlanResponse = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], EdgeDeploymentPlanArn = EdgeDeploymentPlanArn.asInstanceOf[js.Any], EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any], ModelConfigs = ModelConfigs.asInstanceOf[js.Any], Stages = Stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEdgeDeploymentPlanResponse]
  }
  
  extension [Self <: DescribeEdgeDeploymentPlanResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentFailed(value: Integer): Self = StObject.set(x, "EdgeDeploymentFailed", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentFailedUndefined: Self = StObject.set(x, "EdgeDeploymentFailed", js.undefined)
    
    inline def setEdgeDeploymentPending(value: Integer): Self = StObject.set(x, "EdgeDeploymentPending", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPendingUndefined: Self = StObject.set(x, "EdgeDeploymentPending", js.undefined)
    
    inline def setEdgeDeploymentPlanArn(value: EdgeDeploymentPlanArn): Self = StObject.set(x, "EdgeDeploymentPlanArn", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentSuccess(value: Integer): Self = StObject.set(x, "EdgeDeploymentSuccess", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentSuccessUndefined: Self = StObject.set(x, "EdgeDeploymentSuccess", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelConfigs(value: EdgeDeploymentModelConfigs): Self = StObject.set(x, "ModelConfigs", value.asInstanceOf[js.Any])
    
    inline def setModelConfigsVarargs(value: EdgeDeploymentModelConfig*): Self = StObject.set(x, "ModelConfigs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStages(value: DeploymentStageStatusSummaries): Self = StObject.set(x, "Stages", value.asInstanceOf[js.Any])
    
    inline def setStagesVarargs(value: DeploymentStageStatusSummary*): Self = StObject.set(x, "Stages", js.Array(value*))
  }
}
