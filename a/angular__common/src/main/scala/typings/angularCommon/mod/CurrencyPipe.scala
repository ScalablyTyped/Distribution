package typings.angularCommon.mod

import typings.angularCommon.angularCommonStrings.`symbol-narrow`
import typings.angularCommon.angularCommonStrings.code
import typings.angularCommon.angularCommonStrings.symbol
import typings.angularCore.mod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "CurrencyPipe")
@js.native
class CurrencyPipe protected () extends PipeTransform {
  def this(_locale: String) = this()
  def this(_locale: String, _defaultCurrencyCode: String) = this()
  var _defaultCurrencyCode: js.Any = js.native
  var _locale: js.Any = js.native
  /**
    *
    * @param value The number to be formatted as currency.
    * @param currencyCode The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code,
    * such as `USD` for the US dollar and `EUR` for the euro. The default currency code can be
    * configured using the `DEFAULT_CURRENCY_CODE` injection token.
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
  def transform(value: js.Any): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: js.UndefOr[scala.Nothing],
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: js.UndefOr[scala.Nothing],
    digitsInfo: String
  ): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: js.UndefOr[scala.Nothing],
    digitsInfo: String,
    locale: String
  ): String | Null = js.native
  def transform(value: js.Any, currencyCode: js.UndefOr[scala.Nothing], display: String): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: String,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  def transform(value: js.Any, currencyCode: js.UndefOr[scala.Nothing], display: String, digitsInfo: String): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: String,
    digitsInfo: String,
    locale: String
  ): String | Null = js.native
  def transform(value: js.Any, currencyCode: js.UndefOr[scala.Nothing], display: Boolean): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: Boolean,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  def transform(value: js.Any, currencyCode: js.UndefOr[scala.Nothing], display: Boolean, digitsInfo: String): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: Boolean,
    digitsInfo: String,
    locale: String
  ): String | Null = js.native
  def transform(value: js.Any, currencyCode: String): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: String,
    display: js.UndefOr[scala.Nothing],
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  def transform(value: js.Any, currencyCode: String, display: js.UndefOr[scala.Nothing], digitsInfo: String): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: String,
    display: js.UndefOr[scala.Nothing],
    digitsInfo: String,
    locale: String
  ): String | Null = js.native
  def transform(value: js.Any, currencyCode: String, display: String): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: String,
    display: String,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  def transform(value: js.Any, currencyCode: String, display: String, digitsInfo: String): String | Null = js.native
  def transform(value: js.Any, currencyCode: String, display: String, digitsInfo: String, locale: String): String | Null = js.native
  def transform(value: js.Any, currencyCode: String, display: Boolean): String | Null = js.native
  def transform(
    value: js.Any,
    currencyCode: String,
    display: Boolean,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  def transform(value: js.Any, currencyCode: String, display: Boolean, digitsInfo: String): String | Null = js.native
  def transform(value: js.Any, currencyCode: String, display: Boolean, digitsInfo: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_code(value: js.Any, currencyCode: js.UndefOr[scala.Nothing], display: code): String | Null = js.native
  @JSName("transform")
  def transform_code(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: code,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_code(value: js.Any, currencyCode: js.UndefOr[scala.Nothing], display: code, digitsInfo: String): String | Null = js.native
  @JSName("transform")
  def transform_code(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: code,
    digitsInfo: String,
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_code(value: js.Any, currencyCode: String, display: code): String | Null = js.native
  @JSName("transform")
  def transform_code(
    value: js.Any,
    currencyCode: String,
    display: code,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_code(value: js.Any, currencyCode: String, display: code, digitsInfo: String): String | Null = js.native
  @JSName("transform")
  def transform_code(value: js.Any, currencyCode: String, display: code, digitsInfo: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_symbol(value: js.Any, currencyCode: js.UndefOr[scala.Nothing], display: symbol): String | Null = js.native
  @JSName("transform")
  def transform_symbol(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: symbol,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_symbol(value: js.Any, currencyCode: js.UndefOr[scala.Nothing], display: symbol, digitsInfo: String): String | Null = js.native
  @JSName("transform")
  def transform_symbol(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: symbol,
    digitsInfo: String,
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_symbol(value: js.Any, currencyCode: String, display: symbol): String | Null = js.native
  @JSName("transform")
  def transform_symbol(
    value: js.Any,
    currencyCode: String,
    display: symbol,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_symbol(value: js.Any, currencyCode: String, display: symbol, digitsInfo: String): String | Null = js.native
  @JSName("transform")
  def transform_symbol(value: js.Any, currencyCode: String, display: symbol, digitsInfo: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_symbolnarrow(value: js.Any, currencyCode: js.UndefOr[scala.Nothing], display: `symbol-narrow`): String | Null = js.native
  @JSName("transform")
  def transform_symbolnarrow(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: `symbol-narrow`,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_symbolnarrow(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: `symbol-narrow`,
    digitsInfo: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_symbolnarrow(
    value: js.Any,
    currencyCode: js.UndefOr[scala.Nothing],
    display: `symbol-narrow`,
    digitsInfo: String,
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_symbolnarrow(value: js.Any, currencyCode: String, display: `symbol-narrow`): String | Null = js.native
  @JSName("transform")
  def transform_symbolnarrow(
    value: js.Any,
    currencyCode: String,
    display: `symbol-narrow`,
    digitsInfo: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_symbolnarrow(value: js.Any, currencyCode: String, display: `symbol-narrow`, digitsInfo: String): String | Null = js.native
  @JSName("transform")
  def transform_symbolnarrow(value: js.Any, currencyCode: String, display: `symbol-narrow`, digitsInfo: String, locale: String): String | Null = js.native
}

