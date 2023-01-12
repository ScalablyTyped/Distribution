package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetAdvisorDatabasesResponse extends StObject {
  
  /**
    * The IDs of the databases that the operation deleted.
    */
  var DatabaseIds: js.UndefOr[StringList] = js.undefined
}
object DeleteFleetAdvisorDatabasesResponse {
  
  inline def apply(): DeleteFleetAdvisorDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetAdvisorDatabasesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFleetAdvisorDatabasesResponse] (val x: Self) extends AnyVal {
    
    inline def setDatabaseIds(value: StringList): Self = StObject.set(x, "DatabaseIds", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdsUndefined: Self = StObject.set(x, "DatabaseIds", js.undefined)
    
    inline def setDatabaseIdsVarargs(value: String*): Self = StObject.set(x, "DatabaseIds", js.Array(value*))
  }
}
