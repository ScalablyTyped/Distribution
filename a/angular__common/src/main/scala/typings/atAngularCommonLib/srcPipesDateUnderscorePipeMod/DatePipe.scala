package typings
package atAngularCommonLib.srcPipesDateUnderscorePipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/pipes/date_pipe", "DatePipe")
@js.native
class DatePipe protected ()
  extends atAngularCoreLib.srcChangeUnderscoreDetectionPipeUnderscoreTransformMod.PipeTransform {
  def this(locale: java.lang.String) = this()
  var locale: js.Any = js.native
  /**
       * @param value The date expression: a `Date` object,  a number
       * (milliseconds since UTC epoch), or an ISO string (https://www.w3.org/TR/NOTE-datetime).
       * @param format The date/time components to include, using predefined options or a
       * custom format string.
       * @param timezone A timezone offset (such as `'+0430'`), or a standard
       * UTC/GMT or continental US timezone abbreviation. Default is
       * the local system timezone of the end-user's machine.
       * @param locale A locale code for the locale format rules to use.
       * When not supplied, uses the value of `LOCALE_ID`, which is `en-US` by default.
       * See [Setting your app locale](guide/i18n#setting-up-the-locale-of-your-app).
       * @returns A date string in the desired format.
       */
  def transform(value: js.Any): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  /**
       * @param value The date expression: a `Date` object,  a number
       * (milliseconds since UTC epoch), or an ISO string (https://www.w3.org/TR/NOTE-datetime).
       * @param format The date/time components to include, using predefined options or a
       * custom format string.
       * @param timezone A timezone offset (such as `'+0430'`), or a standard
       * UTC/GMT or continental US timezone abbreviation. Default is
       * the local system timezone of the end-user's machine.
       * @param locale A locale code for the locale format rules to use.
       * When not supplied, uses the value of `LOCALE_ID`, which is `en-US` by default.
       * See [Setting your app locale](guide/i18n#setting-up-the-locale-of-your-app).
       * @returns A date string in the desired format.
       */
  def transform(value: js.Any, format: java.lang.String): java.lang.String | scala.Null = js.native
  /**
       * @param value The date expression: a `Date` object,  a number
       * (milliseconds since UTC epoch), or an ISO string (https://www.w3.org/TR/NOTE-datetime).
       * @param format The date/time components to include, using predefined options or a
       * custom format string.
       * @param timezone A timezone offset (such as `'+0430'`), or a standard
       * UTC/GMT or continental US timezone abbreviation. Default is
       * the local system timezone of the end-user's machine.
       * @param locale A locale code for the locale format rules to use.
       * When not supplied, uses the value of `LOCALE_ID`, which is `en-US` by default.
       * See [Setting your app locale](guide/i18n#setting-up-the-locale-of-your-app).
       * @returns A date string in the desired format.
       */
  def transform(value: js.Any, format: java.lang.String, timezone: java.lang.String): java.lang.String | scala.Null = js.native
  /**
       * @param value The date expression: a `Date` object,  a number
       * (milliseconds since UTC epoch), or an ISO string (https://www.w3.org/TR/NOTE-datetime).
       * @param format The date/time components to include, using predefined options or a
       * custom format string.
       * @param timezone A timezone offset (such as `'+0430'`), or a standard
       * UTC/GMT or continental US timezone abbreviation. Default is
       * the local system timezone of the end-user's machine.
       * @param locale A locale code for the locale format rules to use.
       * When not supplied, uses the value of `LOCALE_ID`, which is `en-US` by default.
       * See [Setting your app locale](guide/i18n#setting-up-the-locale-of-your-app).
       * @returns A date string in the desired format.
       */
  def transform(value: js.Any, format: java.lang.String, timezone: java.lang.String, locale: java.lang.String): java.lang.String | scala.Null = js.native
}

