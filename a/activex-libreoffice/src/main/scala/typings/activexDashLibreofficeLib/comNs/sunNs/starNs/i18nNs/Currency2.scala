package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

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
  var LegacyOnly: scala.Boolean
}

object Currency2 {
  @scala.inline
  def apply(
    BankSymbol: java.lang.String,
    DecimalPlaces: scala.Double,
    Default: scala.Boolean,
    ID: java.lang.String,
    LegacyOnly: scala.Boolean,
    Name: java.lang.String,
    Symbol: java.lang.String,
    UsedInCompatibleFormatCodes: scala.Boolean
  ): Currency2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BankSymbol")(BankSymbol)
    __obj.updateDynamic("DecimalPlaces")(DecimalPlaces)
    __obj.updateDynamic("Default")(Default)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("LegacyOnly")(LegacyOnly)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Symbol")(Symbol)
    __obj.updateDynamic("UsedInCompatibleFormatCodes")(UsedInCompatibleFormatCodes)
    __obj.asInstanceOf[Currency2]
  }
}

