package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consent extends StObject {
  
  /**
    *  Currency for the MaxPrice. 
    */
  var Currency: typings.awsSdk.clientsRoute53domainsMod.Currency
  
  /**
    *  Maximum amount the customer agreed to accept. 
    */
  var MaxPrice: Price
}
object Consent {
  
  inline def apply(Currency: Currency, MaxPrice: Price): Consent = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], MaxPrice = MaxPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Consent] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setMaxPrice(value: Price): Self = StObject.set(x, "MaxPrice", value.asInstanceOf[js.Any])
  }
}
