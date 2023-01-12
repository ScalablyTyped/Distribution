package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceWithCurrency extends StObject {
  
  /**
    * The currency specifier.
    */
  var Currency: typings.awsSdk.clientsRoute53domainsMod.Currency
  
  /**
    * The price of a domain, in a specific currency.
    */
  var Price: typings.awsSdk.clientsRoute53domainsMod.Price
}
object PriceWithCurrency {
  
  inline def apply(Currency: Currency, Price: Price): PriceWithCurrency = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceWithCurrency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PriceWithCurrency] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Price): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
  }
}
