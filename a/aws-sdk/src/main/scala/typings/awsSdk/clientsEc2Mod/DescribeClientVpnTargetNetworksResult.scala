package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientVpnTargetNetworksResult extends StObject {
  
  /**
    * Information about the associated target networks.
    */
  var ClientVpnTargetNetworks: js.UndefOr[TargetNetworkSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeClientVpnTargetNetworksResult {
  
  inline def apply(): DescribeClientVpnTargetNetworksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnTargetNetworksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClientVpnTargetNetworksResult] (val x: Self) extends AnyVal {
    
    inline def setClientVpnTargetNetworks(value: TargetNetworkSet): Self = StObject.set(x, "ClientVpnTargetNetworks", value.asInstanceOf[js.Any])
    
    inline def setClientVpnTargetNetworksUndefined: Self = StObject.set(x, "ClientVpnTargetNetworks", js.undefined)
    
    inline def setClientVpnTargetNetworksVarargs(value: TargetNetwork*): Self = StObject.set(x, "ClientVpnTargetNetworks", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
