package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "CurrencyPipe")
@js.native
class CurrencyPipe protected ()
  extends atAngularCoreLib.atAngularCoreMod.PipeTransform {
  def this(_locale: java.lang.String) = this()
  var _locale: js.Any = js.native
  /**
    *
    * @param value The number to be formatted as currency.
    * @param currencyCode The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code,
    * such as `USD` for the US dollar and `EUR` for the euro.
    * @param display The format for the currency indicator. One of the following:
    *   - `code`: Show the code (such as `USD`).
    *   - `symbol`(default): Show the symbol (such as `$`).
    *   - `symbol-narrow`: Use the narrow symbol for locales that have two symbols for their
    * currency.
    * For example, the Canadian dollar CAD has the symbol `CA$` and the symbol-narrow `$`. If the
    * locale has no narrow symbol, uses the standard symbol for the locale.
    *   - String: Use the given string value instead of a code or a symbol.
    * For example, an empty string will suppress the currency & symbol.
    *   - Boolean (marked deprecated in v5): `true` for symbol and false for `code`.
    *
    * @param digitsInfo Decimal representation options, specified by a string
    * in the following format:<br>
    * <code>{minIntegerDigits}.{minFractionDigits}-{maxFractionDigits}</code>.
    *   - `minIntegerDigits`: The minimum number of integer digits before the decimal point.
    * Default is `1`.
    *   - `minFractionDigits`: The minimum number of digits after the decimal point.
    * Default is `2`.
    *   - `maxFractionDigits`: The maximum number of digits after the decimal point.
    * Default is `2`.
    * If not provided, the number will be formatted with the proper amount of digits,
    * depending on what the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) specifies.
    * For example, the Canadian dollar has 2 digits, whereas the Chilean peso has none.
    * @param locale A locale code for the locale format rules to use.
    * When not supplied, uses the value of `LOCALE_ID`, which is `en-US` by default.
    * See [Setting your app locale](guide/i18n#setting-up-the-locale-of-your-app).
    */
  def transform(value: js.Any): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform(value: js.Any, currencyCode: java.lang.String): java.lang.String | scala.Null = js.native
  def transform(value: js.Any, currencyCode: java.lang.String, display: java.lang.String): java.lang.String | scala.Null = js.native
  def transform(
    value: js.Any,
    currencyCode: java.lang.String,
    display: java.lang.String,
    digitsInfo: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def transform(
    value: js.Any,
    currencyCode: java.lang.String,
    display: java.lang.String,
    digitsInfo: java.lang.String,
    locale: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def transform(value: js.Any, currencyCode: java.lang.String, display: scala.Boolean): java.lang.String | scala.Null = js.native
  def transform(
    value: js.Any,
    currencyCode: java.lang.String,
    display: scala.Boolean,
    digitsInfo: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def transform(
    value: js.Any,
    currencyCode: java.lang.String,
    display: scala.Boolean,
    digitsInfo: java.lang.String,
    locale: java.lang.String
  ): java.lang.String | scala.Null = js.native
  @JSName("transform")
  def transform_code(
    value: js.Any,
    currencyCode: java.lang.String,
    display: atAngularCommonLib.atAngularCommonLibStrings.code
  ): java.lang.String | scala.Null = js.native
  @JSName("transform")
  def transform_code(
    value: js.Any,
    currencyCode: java.lang.String,
    display: atAngularCommonLib.atAngularCommonLibStrings.code,
    digitsInfo: java.lang.String
  ): java.lang.String | scala.Null = js.native
  @JSName("transform")
  def transform_code(
    value: js.Any,
    currencyCode: java.lang.String,
    display: atAngularCommonLib.atAngularCommonLibStrings.code,
    digitsInfo: java.lang.String,
    locale: java.lang.String
  ): java.lang.String | scala.Null = js.native
  @JSName("transform")
  def transform_symbol(
    value: js.Any,
    currencyCode: java.lang.String,
    display: atAngularCommonLib.atAngularCommonLibStrings.symbol
  ): java.lang.String | scala.Null = js.native
  @JSName("transform")
  def transform_symbol(
    value: js.Any,
    currencyCode: java.lang.String,
    display: atAngularCommonLib.atAngularCommonLibStrings.symbol,
    digitsInfo: java.lang.String
  ): java.lang.String | scala.Null = js.native
  @JSName("transform")
  def transform_symbol(
    value: js.Any,
    currencyCode: java.lang.String,
    display: atAngularCommonLib.atAngularCommonLibStrings.symbol,
    digitsInfo: java.lang.String,
    locale: java.lang.String
  ): java.lang.String | scala.Null = js.native
  @JSName("transform")
  def `transform_symbol-narrow`(
    value: js.Any,
    currencyCode: java.lang.String,
    display: atAngularCommonLib.atAngularCommonLibStrings.`symbol-narrow`
  ): java.lang.String | scala.Null = js.native
  @JSName("transform")
  def `transform_symbol-narrow`(
    value: js.Any,
    currencyCode: java.lang.String,
    display: atAngularCommonLib.atAngularCommonLibStrings.`symbol-narrow`,
    digitsInfo: java.lang.String
  ): java.lang.String | scala.Null = js.native
  @JSName("transform")
  def `transform_symbol-narrow`(
    value: js.Any,
    currencyCode: java.lang.String,
    display: atAngularCommonLib.atAngularCommonLibStrings.`symbol-narrow`,
    digitsInfo: java.lang.String,
    locale: java.lang.String
  ): java.lang.String | scala.Null = js.native
}

