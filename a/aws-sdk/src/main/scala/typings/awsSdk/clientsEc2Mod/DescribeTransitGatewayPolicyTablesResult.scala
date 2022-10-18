package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayPolicyTablesResult extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the transit gateway policy tables.
    */
  var TransitGatewayPolicyTables: js.UndefOr[TransitGatewayPolicyTableList] = js.undefined
}
object DescribeTransitGatewayPolicyTablesResult {
  
  inline def apply(): DescribeTransitGatewayPolicyTablesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayPolicyTablesResult]
  }
  
  extension [Self <: DescribeTransitGatewayPolicyTablesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayPolicyTables(value: TransitGatewayPolicyTableList): Self = StObject.set(x, "TransitGatewayPolicyTables", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPolicyTablesUndefined: Self = StObject.set(x, "TransitGatewayPolicyTables", js.undefined)
    
    inline def setTransitGatewayPolicyTablesVarargs(value: TransitGatewayPolicyTable*): Self = StObject.set(x, "TransitGatewayPolicyTables", js.Array(value*))
  }
}
