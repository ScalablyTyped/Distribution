package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMigrationRequest extends StObject {
  
  /**
    * The unique identifier of the migration to view. The migrationID is returned by the operation.
    */
  var migrationId: MigrationId
}
object GetMigrationRequest {
  
  inline def apply(migrationId: MigrationId): GetMigrationRequest = {
    val __obj = js.Dynamic.literal(migrationId = migrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMigrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMigrationRequest] (val x: Self) extends AnyVal {
    
    inline def setMigrationId(value: MigrationId): Self = StObject.set(x, "migrationId", value.asInstanceOf[js.Any])
  }
}
