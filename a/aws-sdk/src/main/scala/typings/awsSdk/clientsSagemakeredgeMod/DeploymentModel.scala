package typings.awsSdk.clientsSagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentModel extends StObject {
  
  /**
    * The desired state of the model.
    */
  var DesiredState: js.UndefOr[ModelState] = js.undefined
  
  /**
    * The unique handle of the model.
    */
  var ModelHandle: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The name of the model.
    */
  var ModelName: js.UndefOr[typings.awsSdk.clientsSagemakeredgeMod.ModelName] = js.undefined
  
  /**
    * The version of the model.
    */
  var ModelVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * Returns the error message if there is a rollback.
    */
  var RollbackFailureReason: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the current state of the model.
    */
  var State: js.UndefOr[ModelState] = js.undefined
  
  /**
    * Returns the deployment status of the model.
    */
  var Status: js.UndefOr[DeploymentStatus] = js.undefined
  
  /**
    * Returns the error message for the deployment status result.
    */
  var StatusReason: js.UndefOr[String] = js.undefined
}
object DeploymentModel {
  
  inline def apply(): DeploymentModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentModel]
  }
  
  extension [Self <: DeploymentModel](x: Self) {
    
    inline def setDesiredState(value: ModelState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setModelHandle(value: EntityName): Self = StObject.set(x, "ModelHandle", value.asInstanceOf[js.Any])
    
    inline def setModelHandleUndefined: Self = StObject.set(x, "ModelHandle", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setModelVersion(value: Version): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setRollbackFailureReason(value: String): Self = StObject.set(x, "RollbackFailureReason", value.asInstanceOf[js.Any])
    
    inline def setRollbackFailureReasonUndefined: Self = StObject.set(x, "RollbackFailureReason", js.undefined)
    
    inline def setState(value: ModelState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatus(value: DeploymentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
