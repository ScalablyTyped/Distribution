package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonetaryAmount extends StObject {
  
  /**
    * The numerical amount of an offering or transaction.
    */
  var amount: js.UndefOr[Double] = js.undefined
  
  /**
    * The currency code of a monetary amount. For example, USD means U.S. dollars.
    */
  var currencyCode: js.UndefOr[CurrencyCode] = js.undefined
}
object MonetaryAmount {
  
  inline def apply(): MonetaryAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonetaryAmount]
  }
  
  extension [Self <: MonetaryAmount](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
  }
}
