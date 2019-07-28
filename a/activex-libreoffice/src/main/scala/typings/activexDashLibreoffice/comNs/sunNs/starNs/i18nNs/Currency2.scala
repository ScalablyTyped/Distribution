package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Symbols, names, and attributes of a specific currency, returned in a sequence by {@link XLocaleData2.getAllCurrencies2()} .
  *
  * It is derived from {@link com.sun.star.i18n.Currency} and provides an additional flag for currency entries that are available only for legacy reasons
  * in context of loaded documents that use them, but otherwise should not be offered to the user to be selectable.
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait Currency2 extends Currency {
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
    val __obj = js.Dynamic.literal(BankSymbol = BankSymbol, DecimalPlaces = DecimalPlaces, Default = Default, ID = ID, LegacyOnly = LegacyOnly, Name = Name, Symbol = Symbol, UsedInCompatibleFormatCodes = UsedInCompatibleFormatCodes)
  
    __obj.asInstanceOf[Currency2]
  }
}

