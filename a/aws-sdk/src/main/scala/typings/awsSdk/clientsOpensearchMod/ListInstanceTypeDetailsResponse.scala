package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceTypeDetailsResponse extends StObject {
  
  /**
    * Lists all supported instance types and features for the given OpenSearch or Elasticsearch version.
    */
  var InstanceTypeDetails: js.UndefOr[InstanceTypeDetailsList] = js.undefined
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object ListInstanceTypeDetailsResponse {
  
  inline def apply(): ListInstanceTypeDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceTypeDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInstanceTypeDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setInstanceTypeDetails(value: InstanceTypeDetailsList): Self = StObject.set(x, "InstanceTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeDetailsUndefined: Self = StObject.set(x, "InstanceTypeDetails", js.undefined)
    
    inline def setInstanceTypeDetailsVarargs(value: InstanceTypeDetails*): Self = StObject.set(x, "InstanceTypeDetails", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
