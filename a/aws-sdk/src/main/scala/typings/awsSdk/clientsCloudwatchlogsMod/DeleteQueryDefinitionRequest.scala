package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueryDefinitionRequest extends StObject {
  
  /**
    * The ID of the query definition that you want to delete. You can use DescribeQueryDefinitions to retrieve the IDs of your saved query definitions.
    */
  var queryDefinitionId: QueryId
}
object DeleteQueryDefinitionRequest {
  
  inline def apply(queryDefinitionId: QueryId): DeleteQueryDefinitionRequest = {
    val __obj = js.Dynamic.literal(queryDefinitionId = queryDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueryDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteQueryDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setQueryDefinitionId(value: QueryId): Self = StObject.set(x, "queryDefinitionId", value.asInstanceOf[js.Any])
  }
}
