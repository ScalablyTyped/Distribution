package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeACLsResponse extends StObject {
  
  /**
    * The list of ACLs
    */
  var ACLs: js.UndefOr[ACLList] = js.undefined
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeACLsResponse {
  
  inline def apply(): DescribeACLsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeACLsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeACLsResponse] (val x: Self) extends AnyVal {
    
    inline def setACLs(value: ACLList): Self = StObject.set(x, "ACLs", value.asInstanceOf[js.Any])
    
    inline def setACLsUndefined: Self = StObject.set(x, "ACLs", js.undefined)
    
    inline def setACLsVarargs(value: ACL*): Self = StObject.set(x, "ACLs", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
