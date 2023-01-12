package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayConnectsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the Connect attachments.
    */
  var TransitGatewayConnects: js.UndefOr[TransitGatewayConnectList] = js.undefined
}
object DescribeTransitGatewayConnectsResult {
  
  inline def apply(): DescribeTransitGatewayConnectsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayConnectsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTransitGatewayConnectsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayConnects(value: TransitGatewayConnectList): Self = StObject.set(x, "TransitGatewayConnects", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectsUndefined: Self = StObject.set(x, "TransitGatewayConnects", js.undefined)
    
    inline def setTransitGatewayConnectsVarargs(value: TransitGatewayConnect*): Self = StObject.set(x, "TransitGatewayConnects", js.Array(value*))
  }
}
