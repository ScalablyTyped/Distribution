package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamDiscoveredAccountsResult extends StObject {
  
  /**
    * Discovered accounts.
    */
  var IpamDiscoveredAccounts: js.UndefOr[IpamDiscoveredAccountSet] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object GetIpamDiscoveredAccountsResult {
  
  inline def apply(): GetIpamDiscoveredAccountsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIpamDiscoveredAccountsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIpamDiscoveredAccountsResult] (val x: Self) extends AnyVal {
    
    inline def setIpamDiscoveredAccounts(value: IpamDiscoveredAccountSet): Self = StObject.set(x, "IpamDiscoveredAccounts", value.asInstanceOf[js.Any])
    
    inline def setIpamDiscoveredAccountsUndefined: Self = StObject.set(x, "IpamDiscoveredAccounts", js.undefined)
    
    inline def setIpamDiscoveredAccountsVarargs(value: IpamDiscoveredAccount*): Self = StObject.set(x, "IpamDiscoveredAccounts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
