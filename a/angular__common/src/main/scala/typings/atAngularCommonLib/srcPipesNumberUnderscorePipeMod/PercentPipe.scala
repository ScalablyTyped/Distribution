package typings
package atAngularCommonLib.srcPipesNumberUnderscorePipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/pipes/number_pipe", "PercentPipe")
@js.native
class PercentPipe protected ()
  extends atAngularCoreLib.srcChangeUnderscoreDetectionPipeUnderscoreTransformMod.PipeTransform {
  def this(_locale: java.lang.String) = this()
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
  def transform(value: js.Any): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
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
  def transform(value: js.Any, digitsInfo: java.lang.String): java.lang.String | scala.Null = js.native
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
  def transform(value: js.Any, digitsInfo: java.lang.String, locale: java.lang.String): java.lang.String | scala.Null = js.native
}

