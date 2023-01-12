package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOptOutListsRequest extends StObject {
  
  /**
    * The maximum number of results to return per each request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. You don't need to supply a value for this field in the initial request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName or OptOutListArn.
    */
  var OptOutListNames: js.UndefOr[OptOutListNameList] = js.undefined
}
object DescribeOptOutListsRequest {
  
  inline def apply(): DescribeOptOutListsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOptOutListsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOptOutListsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOptOutListNames(value: OptOutListNameList): Self = StObject.set(x, "OptOutListNames", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNamesUndefined: Self = StObject.set(x, "OptOutListNames", js.undefined)
    
    inline def setOptOutListNamesVarargs(value: OptOutListNameOrArn*): Self = StObject.set(x, "OptOutListNames", js.Array(value*))
  }
}
