package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Symbols, names, and attributes of a specific currency, returned in a sequence by {@link XLocaleData2.getAllCurrencies2()} .
  *
  * It is derived from {@link com.sun.star.i18n.Currency} and provides an additional flag for currency entries that are available only for legacy reasons
  * in context of loaded documents that use them, but otherwise should not be offered to the user to be selectable.
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait Currency2
  extends StObject
     with Currency {
  
  /**
    * If set, the currency and/or its symbol is only to be used in legacy context.
    * @since OOo 2.0.3
    */
  var LegacyOnly: Boolean
}
object Currency2 {
  
  @scala.inline
  def apply(
    BankSymbol: String,
    DecimalPlaces: Double,
    Default: Boolean,
    ID: String,
    LegacyOnly: Boolean,
    Name: String,
    Symbol: String,
    UsedInCompatibleFormatCodes: Boolean
  ): Currency2 = {
    val __obj = js.Dynamic.literal(BankSymbol = BankSymbol.asInstanceOf[js.Any], DecimalPlaces = DecimalPlaces.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], LegacyOnly = LegacyOnly.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Symbol = Symbol.asInstanceOf[js.Any], UsedInCompatibleFormatCodes = UsedInCompatibleFormatCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency2]
  }
  
  @scala.inline
  implicit class Currency2MutableBuilder[Self <: Currency2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegacyOnly(value: Boolean): Self = StObject.set(x, "LegacyOnly", value.asInstanceOf[js.Any])
  }
}
