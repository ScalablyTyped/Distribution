package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetAdvisorDatabasesRequest extends StObject {
  
  /**
    * The IDs of the Fleet Advisor collector databases to delete.
    */
  var DatabaseIds: StringList
}
object DeleteFleetAdvisorDatabasesRequest {
  
  inline def apply(DatabaseIds: StringList): DeleteFleetAdvisorDatabasesRequest = {
    val __obj = js.Dynamic.literal(DatabaseIds = DatabaseIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetAdvisorDatabasesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFleetAdvisorDatabasesRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabaseIds(value: StringList): Self = StObject.set(x, "DatabaseIds", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdsVarargs(value: String*): Self = StObject.set(x, "DatabaseIds", js.Array(value*))
  }
}
