package typings.angularCommon.mod

import typings.angularCommon.angularCommonStrings.`symbol-narrow`
import typings.angularCommon.angularCommonStrings.code
import typings.angularCommon.angularCommonStrings.symbol
import typings.angularCore.mod.PipeTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "CurrencyPipe")
@js.native
class CurrencyPipe protected ()
  extends StObject
     with PipeTransform {
  def this(_locale: String) = this()
  def this(_locale: String, _defaultCurrencyCode: String) = this()
  
  /* private */ var _defaultCurrencyCode: js.Any = js.native
  
  /* private */ var _locale: js.Any = js.native
  
  def transform(
    value: js.UndefOr[Null],
    currencyCode: js.UndefOr[String],
    display: js.UndefOr[code | symbol | `symbol-narrow` | String | Boolean],
    digitsInfo: js.UndefOr[String],
    locale: js.UndefOr[String]
  ): Null = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
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
  @JSName("transform")
  def transform_Union(
    value: js.UndefOr[Double | Null | String],
    currencyCode: js.UndefOr[String],
    display: js.UndefOr[Boolean | String | code | symbol | `symbol-narrow`],
    digitsInfo: js.UndefOr[String],
    locale: js.UndefOr[String]
  ): String | Null = js.native
}
