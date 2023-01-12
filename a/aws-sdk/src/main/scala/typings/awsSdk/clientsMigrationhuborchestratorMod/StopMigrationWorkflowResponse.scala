package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopMigrationWorkflowResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the migration workflow.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var id: js.UndefOr[MigrationWorkflowId] = js.undefined
  
  /**
    * The time at which the migration workflow was stopped.
    */
  var lastStopTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the migration workflow.
    */
  var status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined
  
  /**
    * The status message of the migration workflow.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
}
object StopMigrationWorkflowResponse {
  
  inline def apply(): StopMigrationWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopMigrationWorkflowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopMigrationWorkflowResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: MigrationWorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastStopTime(value: js.Date): Self = StObject.set(x, "lastStopTime", value.asInstanceOf[js.Any])
    
    inline def setLastStopTimeUndefined: Self = StObject.set(x, "lastStopTime", js.undefined)
    
    inline def setStatus(value: MigrationWorkflowStatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
