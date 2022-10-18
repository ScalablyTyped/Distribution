package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RobotDeployment extends StObject {
  
  /**
    * The robot deployment Amazon Resource Name (ARN).
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the deployment finished.
    */
  var deploymentFinishTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the deployment was started.
    */
  var deploymentStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The robot deployment failure code.
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
  
  /**
    * A short description of the reason why the robot deployment failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Information about how the deployment is progressing.
    */
  var progressDetail: js.UndefOr[ProgressDetail] = js.undefined
  
  /**
    * The status of the robot deployment.
    */
  var status: js.UndefOr[RobotStatus] = js.undefined
}
object RobotDeployment {
  
  inline def apply(): RobotDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RobotDeployment]
  }
  
  extension [Self <: RobotDeployment](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDeploymentFinishTime(value: js.Date): Self = StObject.set(x, "deploymentFinishTime", value.asInstanceOf[js.Any])
    
    inline def setDeploymentFinishTimeUndefined: Self = StObject.set(x, "deploymentFinishTime", js.undefined)
    
    inline def setDeploymentStartTime(value: js.Date): Self = StObject.set(x, "deploymentStartTime", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStartTimeUndefined: Self = StObject.set(x, "deploymentStartTime", js.undefined)
    
    inline def setFailureCode(value: DeploymentJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureReason(value: GenericString): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setProgressDetail(value: ProgressDetail): Self = StObject.set(x, "progressDetail", value.asInstanceOf[js.Any])
    
    inline def setProgressDetailUndefined: Self = StObject.set(x, "progressDetail", js.undefined)
    
    inline def setStatus(value: RobotStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
