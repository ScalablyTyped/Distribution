package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopMigrationWorkflowRequest extends StObject {
  
  /**
    * The ID of the migration workflow.
    */
  var id: MigrationWorkflowId
}
object StopMigrationWorkflowRequest {
  
  inline def apply(id: MigrationWorkflowId): StopMigrationWorkflowRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMigrationWorkflowRequest]
  }
  
  extension [Self <: StopMigrationWorkflowRequest](x: Self) {
    
    inline def setId(value: MigrationWorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
