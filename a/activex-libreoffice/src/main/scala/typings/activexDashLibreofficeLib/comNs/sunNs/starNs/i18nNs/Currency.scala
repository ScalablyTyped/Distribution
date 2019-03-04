package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Symbols, names, and attributes of a specific currency, returned in a sequence by {@link XLocaleData.getAllCurrencies()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait Currency extends js.Object {
  /**
    * {@link Currency} abbreviation used by banks and in money exchange, for example, **EUR** or **USD** . This usually should be identical to the ISO 4217
    * currency code also used in the {@link ID} , but doesn't necessarily have to be.
    */
  var BankSymbol: java.lang.String
  /** The number of decimal places, for example, **2** for US Dollar or **0** for Italian Lira. */
  var DecimalPlaces: scala.Double
  /** If this currency is the default currency for a given locale. */
  var Default: scala.Boolean
  /** ISO 4217 currency code identifier, for example, **EUR** or **USD** . */
  var ID: java.lang.String
  /** Name of the currency, for example, **Euro** or **US Dollar** . Should be the localized name. */
  var Name: java.lang.String
  /** {@link Currency} symbol, for example, **$** . */
  var Symbol: java.lang.String
  /**
    * If this currency is the one used in compatible number format codes with {@link FormatElement.formatIndex()} values in the range 12..17. Those format
    * codes are used to generate some old style currency format codes for compatibility with StarOffice5 and StarOffice4.
    * @see com.sun.star.i18n.NumberFormatIndex
    */
  var UsedInCompatibleFormatCodes: scala.Boolean
}

object Currency {
  @scala.inline
  def apply(
    BankSymbol: java.lang.String,
    DecimalPlaces: scala.Double,
    Default: scala.Boolean,
    ID: java.lang.String,
    Name: java.lang.String,
    Symbol: java.lang.String,
    UsedInCompatibleFormatCodes: scala.Boolean
  ): Currency = {
    val __obj = js.Dynamic.literal(BankSymbol = BankSymbol, DecimalPlaces = DecimalPlaces, Default = Default, ID = ID, Name = Name, Symbol = Symbol, UsedInCompatibleFormatCodes = UsedInCompatibleFormatCodes)
  
    __obj.asInstanceOf[Currency]
  }
}

