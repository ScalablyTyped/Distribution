package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Symbols, names, and attributes of a specific currency, returned in a sequence by {@link XLocaleData.getAllCurrencies()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait Currency extends StObject {
  
  /**
    * {@link Currency} abbreviation used by banks and in money exchange, for example, **EUR** or **USD** . This usually should be identical to the ISO 4217
    * currency code also used in the {@link ID} , but doesn't necessarily have to be.
    */
  var BankSymbol: String = js.native
  
  /** The number of decimal places, for example, **2** for US Dollar or **0** for Italian Lira. */
  var DecimalPlaces: Double = js.native
  
  /** If this currency is the default currency for a given locale. */
  var Default: Boolean = js.native
  
  /** ISO 4217 currency code identifier, for example, **EUR** or **USD** . */
  var ID: String = js.native
  
  /** Name of the currency, for example, **Euro** or **US Dollar** . Should be the localized name. */
  var Name: String = js.native
  
  /** {@link Currency} symbol, for example, **$** . */
  var Symbol: String = js.native
  
  /**
    * If this currency is the one used in compatible number format codes with {@link FormatElement.formatIndex()} values in the range 12..17. Those format
    * codes are used to generate some old style currency format codes for compatibility with StarOffice5 and StarOffice4.
    * @see com.sun.star.i18n.NumberFormatIndex
    */
  var UsedInCompatibleFormatCodes: Boolean = js.native
}
object Currency {
  
  @scala.inline
  def apply(
    BankSymbol: String,
    DecimalPlaces: Double,
    Default: Boolean,
    ID: String,
    Name: String,
    Symbol: String,
    UsedInCompatibleFormatCodes: Boolean
  ): Currency = {
    val __obj = js.Dynamic.literal(BankSymbol = BankSymbol.asInstanceOf[js.Any], DecimalPlaces = DecimalPlaces.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Symbol = Symbol.asInstanceOf[js.Any], UsedInCompatibleFormatCodes = UsedInCompatibleFormatCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  
  @scala.inline
  implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBankSymbol(value: String): Self = StObject.set(x, "BankSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalPlaces(value: Double): Self = StObject.set(x, "DecimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "Symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedInCompatibleFormatCodes(value: Boolean): Self = StObject.set(x, "UsedInCompatibleFormatCodes", value.asInstanceOf[js.Any])
  }
}
