package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewaysOutput extends StObject {
  
  /**
    * A list of your gateways.
    */
  var Gateways: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Gateways] = js.undefined
  
  /**
    * The next item following a partial list of returned resources. For example, if a request is made to return maxResults number of resources, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.NextToken] = js.undefined
}
object ListGatewaysOutput {
  
  inline def apply(): ListGatewaysOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewaysOutput]
  }
  
  extension [Self <: ListGatewaysOutput](x: Self) {
    
    inline def setGateways(value: Gateways): Self = StObject.set(x, "Gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "Gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: Gateway*): Self = StObject.set(x, "Gateways", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
