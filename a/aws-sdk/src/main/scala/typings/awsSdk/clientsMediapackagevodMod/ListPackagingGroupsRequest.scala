package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagingGroupsRequest extends StObject {
  
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.MaxResults] = js.undefined
  
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListPackagingGroupsRequest {
  
  inline def apply(): ListPackagingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPackagingGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
