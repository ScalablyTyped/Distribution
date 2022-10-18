package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMigrationWorkflowRequest extends StObject {
  
  /**
    * The ID of the migration workflow.
    */
  var id: MigrationWorkflowId
}
object GetMigrationWorkflowRequest {
  
  inline def apply(id: MigrationWorkflowId): GetMigrationWorkflowRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMigrationWorkflowRequest]
  }
  
  extension [Self <: GetMigrationWorkflowRequest](x: Self) {
    
    inline def setId(value: MigrationWorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
