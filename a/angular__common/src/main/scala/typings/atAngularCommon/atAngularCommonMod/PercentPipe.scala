package typings.atAngularCommon.atAngularCommonMod

import typings.atAngularCore.atAngularCoreMod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "PercentPipe")
@js.native
class PercentPipe protected () extends PipeTransform {
  def this(_locale: String) = this()
  var _locale: js.Any = js.native
  /**
    *
    * @param value The number to be formatted as a percentage.
    * @param digitsInfo Decimal representation options, specified by a string
    * in the following format:<br>
    * <code>{minIntegerDigits}.{minFractionDigits}-{maxFractionDigits}</code>.
    *   - `minIntegerDigits`: The minimum number of integer digits before the decimal point.
    * Default is `1`.
    *   - `minFractionDigits`: The minimum number of digits after the decimal point.
    * Default is `0`.
    *   - `maxFractionDigits`: The maximum number of digits after the decimal point.
    * Default is `0`.
    * @param locale A locale code for the locale format rules to use.
    * When not supplied, uses the value of `LOCALE_ID`, which is `en-US` by default.
    * See [Setting your app locale](guide/i18n#setting-up-the-locale-of-your-app).
    */
  def transform(value: js.Any): String | Null = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform(value: js.Any, digitsInfo: String): String | Null = js.native
  def transform(value: js.Any, digitsInfo: String, locale: String): String | Null = js.native
}

