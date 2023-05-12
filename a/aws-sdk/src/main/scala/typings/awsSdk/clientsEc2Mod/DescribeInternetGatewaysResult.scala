package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInternetGatewaysResult extends StObject {
  
  /**
    * Information about one or more internet gateways.
    */
  var InternetGateways: js.UndefOr[InternetGatewayList] = js.undefined
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeInternetGatewaysResult {
  
  inline def apply(): DescribeInternetGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInternetGatewaysResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInternetGatewaysResult] (val x: Self) extends AnyVal {
    
    inline def setInternetGateways(value: InternetGatewayList): Self = StObject.set(x, "InternetGateways", value.asInstanceOf[js.Any])
    
    inline def setInternetGatewaysUndefined: Self = StObject.set(x, "InternetGateways", js.undefined)
    
    inline def setInternetGatewaysVarargs(value: InternetGateway*): Self = StObject.set(x, "InternetGateways", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
