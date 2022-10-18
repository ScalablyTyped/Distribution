package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptReservedInstancesExchangeQuoteResult extends StObject {
  
  /**
    * The ID of the successful exchange.
    */
  var ExchangeId: js.UndefOr[String] = js.undefined
}
object AcceptReservedInstancesExchangeQuoteResult {
  
  inline def apply(): AcceptReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptReservedInstancesExchangeQuoteResult]
  }
  
  extension [Self <: AcceptReservedInstancesExchangeQuoteResult](x: Self) {
    
    inline def setExchangeId(value: String): Self = StObject.set(x, "ExchangeId", value.asInstanceOf[js.Any])
    
    inline def setExchangeIdUndefined: Self = StObject.set(x, "ExchangeId", js.undefined)
  }
}
