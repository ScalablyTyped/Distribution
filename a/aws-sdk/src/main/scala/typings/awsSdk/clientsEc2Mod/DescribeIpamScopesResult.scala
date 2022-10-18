package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpamScopesResult extends StObject {
  
  /**
    * The scopes you want information on.
    */
  var IpamScopes: js.UndefOr[IpamScopeSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIpamScopesResult {
  
  inline def apply(): DescribeIpamScopesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpamScopesResult]
  }
  
  extension [Self <: DescribeIpamScopesResult](x: Self) {
    
    inline def setIpamScopes(value: IpamScopeSet): Self = StObject.set(x, "IpamScopes", value.asInstanceOf[js.Any])
    
    inline def setIpamScopesUndefined: Self = StObject.set(x, "IpamScopes", js.undefined)
    
    inline def setIpamScopesVarargs(value: IpamScope*): Self = StObject.set(x, "IpamScopes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
