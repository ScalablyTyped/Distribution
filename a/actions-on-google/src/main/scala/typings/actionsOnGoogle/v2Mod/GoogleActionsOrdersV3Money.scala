package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3Money extends StObject {
  
  /**
    * Amount in micros.
    * For example, this field should be set as 1990000 for $1.99.
    */
  var amountInMicros: js.UndefOr[String] = js.undefined
  
  /**
    * The 3-letter currency code defined in ISO 4217.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3Money {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3Money = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Money]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3MoneyMutableBuilder[Self <: GoogleActionsOrdersV3Money] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountInMicros(value: String): Self = StObject.set(x, "amountInMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountInMicrosUndefined: Self = StObject.set(x, "amountInMicros", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
  }
}
