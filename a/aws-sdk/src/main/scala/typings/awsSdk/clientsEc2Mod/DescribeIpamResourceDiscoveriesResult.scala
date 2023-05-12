package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpamResourceDiscoveriesResult extends StObject {
  
  /**
    * The resource discoveries.
    */
  var IpamResourceDiscoveries: js.UndefOr[IpamResourceDiscoverySet] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIpamResourceDiscoveriesResult {
  
  inline def apply(): DescribeIpamResourceDiscoveriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpamResourceDiscoveriesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIpamResourceDiscoveriesResult] (val x: Self) extends AnyVal {
    
    inline def setIpamResourceDiscoveries(value: IpamResourceDiscoverySet): Self = StObject.set(x, "IpamResourceDiscoveries", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveriesUndefined: Self = StObject.set(x, "IpamResourceDiscoveries", js.undefined)
    
    inline def setIpamResourceDiscoveriesVarargs(value: IpamResourceDiscovery*): Self = StObject.set(x, "IpamResourceDiscoveries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
