package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkAclsResult extends StObject {
  
  /**
    * Information about one or more network ACLs.
    */
  var NetworkAcls: js.UndefOr[NetworkAclList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkAclsResult {
  
  inline def apply(): DescribeNetworkAclsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkAclsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNetworkAclsResult] (val x: Self) extends AnyVal {
    
    inline def setNetworkAcls(value: NetworkAclList): Self = StObject.set(x, "NetworkAcls", value.asInstanceOf[js.Any])
    
    inline def setNetworkAclsUndefined: Self = StObject.set(x, "NetworkAcls", js.undefined)
    
    inline def setNetworkAclsVarargs(value: NetworkAcl*): Self = StObject.set(x, "NetworkAcls", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
