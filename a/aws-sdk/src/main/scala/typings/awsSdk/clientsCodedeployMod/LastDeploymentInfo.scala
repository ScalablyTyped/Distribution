package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastDeploymentInfo extends StObject {
  
  /**
    * A timestamp that indicates when the most recent deployment to the deployment group started.
    */
  var createTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    * A timestamp that indicates when the most recent deployment to the deployment group was complete.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the most recent deployment.
    */
  var status: js.UndefOr[DeploymentStatus] = js.undefined
}
object LastDeploymentInfo {
  
  inline def apply(): LastDeploymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastDeploymentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastDeploymentInfo] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
