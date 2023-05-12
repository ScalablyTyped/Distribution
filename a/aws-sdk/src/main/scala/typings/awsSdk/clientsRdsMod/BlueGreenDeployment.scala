package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreenDeployment extends StObject {
  
  /**
    * The system-generated identifier of the blue/green deployment.
    */
  var BlueGreenDeploymentIdentifier: js.UndefOr[typings.awsSdk.clientsRdsMod.BlueGreenDeploymentIdentifier] = js.undefined
  
  /**
    * The user-supplied name of the blue/green deployment.
    */
  var BlueGreenDeploymentName: js.UndefOr[typings.awsSdk.clientsRdsMod.BlueGreenDeploymentName] = js.undefined
  
  /**
    * Specifies the time when the blue/green deployment was created, in Universal Coordinated Time (UTC).
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the time when the blue/green deployment was deleted, in Universal Coordinated Time (UTC).
    */
  var DeleteTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The source database for the blue/green deployment. Before switchover, the source database is the production database in the blue environment.
    */
  var Source: js.UndefOr[DatabaseArn] = js.undefined
  
  /**
    * The status of the blue/green deployment. Values:    PROVISIONING - Resources are being created in the green environment.    AVAILABLE - Resources are available in the green environment.    SWITCHOVER_IN_PROGRESS - The deployment is being switched from the blue environment to the green environment.    SWITCHOVER_COMPLETED - Switchover from the blue environment to the green environment is complete.    INVALID_CONFIGURATION - Resources in the green environment are invalid, so switchover isn't possible.    SWITCHOVER_FAILED - Switchover was attempted but failed.    DELETING - The blue/green deployment is being deleted.  
    */
  var Status: js.UndefOr[BlueGreenDeploymentStatus] = js.undefined
  
  /**
    * Additional information about the status of the blue/green deployment.
    */
  var StatusDetails: js.UndefOr[BlueGreenDeploymentStatusDetails] = js.undefined
  
  /**
    * The details about each source and target resource in the blue/green deployment.
    */
  var SwitchoverDetails: js.UndefOr[SwitchoverDetailList] = js.undefined
  
  var TagList: js.UndefOr[typings.awsSdk.clientsRdsMod.TagList] = js.undefined
  
  /**
    * The target database for the blue/green deployment. Before switchover, the target database is the clone database in the green environment.
    */
  var Target: js.UndefOr[DatabaseArn] = js.undefined
  
  /**
    * Either tasks to be performed or tasks that have been completed on the target database before switchover.
    */
  var Tasks: js.UndefOr[BlueGreenDeploymentTaskList] = js.undefined
}
object BlueGreenDeployment {
  
  inline def apply(): BlueGreenDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueGreenDeployment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlueGreenDeployment] (val x: Self) extends AnyVal {
    
    inline def setBlueGreenDeploymentIdentifier(value: BlueGreenDeploymentIdentifier): Self = StObject.set(x, "BlueGreenDeploymentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenDeploymentIdentifierUndefined: Self = StObject.set(x, "BlueGreenDeploymentIdentifier", js.undefined)
    
    inline def setBlueGreenDeploymentName(value: BlueGreenDeploymentName): Self = StObject.set(x, "BlueGreenDeploymentName", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenDeploymentNameUndefined: Self = StObject.set(x, "BlueGreenDeploymentName", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setDeleteTime(value: js.Date): Self = StObject.set(x, "DeleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "DeleteTime", js.undefined)
    
    inline def setSource(value: DatabaseArn): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatus(value: BlueGreenDeploymentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: BlueGreenDeploymentStatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSwitchoverDetails(value: SwitchoverDetailList): Self = StObject.set(x, "SwitchoverDetails", value.asInstanceOf[js.Any])
    
    inline def setSwitchoverDetailsUndefined: Self = StObject.set(x, "SwitchoverDetails", js.undefined)
    
    inline def setSwitchoverDetailsVarargs(value: SwitchoverDetail*): Self = StObject.set(x, "SwitchoverDetails", js.Array(value*))
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
    
    inline def setTarget(value: DatabaseArn): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    
    inline def setTasks(value: BlueGreenDeploymentTaskList): Self = StObject.set(x, "Tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "Tasks", js.undefined)
    
    inline def setTasksVarargs(value: BlueGreenDeploymentTask*): Self = StObject.set(x, "Tasks", js.Array(value*))
  }
}
