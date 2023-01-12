package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMigrationWorkflowRequest extends StObject {
  
  /**
    * The ID of the migration workflow you want to delete.
    */
  var id: MigrationWorkflowId
}
object DeleteMigrationWorkflowRequest {
  
  inline def apply(id: MigrationWorkflowId): DeleteMigrationWorkflowRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMigrationWorkflowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMigrationWorkflowRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: MigrationWorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
