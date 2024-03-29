package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNamedQueriesInput extends StObject {
  
  /**
    * The maximum number of queries to return in this request.
    */
  var MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined
  
  /**
    * A token generated by the Athena service that specifies where to continue pagination if a previous request was truncated. To obtain the next set of pages, pass in the NextToken from the response object of the previous page call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The name of the workgroup from which the named queries are being returned. If a workgroup is not specified, the saved queries for the primary workgroup are returned.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
}
object ListNamedQueriesInput {
  
  inline def apply(): ListNamedQueriesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamedQueriesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNamedQueriesInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxNamedQueriesCount): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
