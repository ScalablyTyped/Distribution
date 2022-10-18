package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTasksResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListTasks request. When the results of a ListTasks request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of task ARN entries for the ListTasks request.
    */
  var taskArns: js.UndefOr[StringList] = js.undefined
}
object ListTasksResponse {
  
  inline def apply(): ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksResponse]
  }
  
  extension [Self <: ListTasksResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTaskArns(value: StringList): Self = StObject.set(x, "taskArns", value.asInstanceOf[js.Any])
    
    inline def setTaskArnsUndefined: Self = StObject.set(x, "taskArns", js.undefined)
    
    inline def setTaskArnsVarargs(value: String*): Self = StObject.set(x, "taskArns", js.Array(value*))
  }
}
