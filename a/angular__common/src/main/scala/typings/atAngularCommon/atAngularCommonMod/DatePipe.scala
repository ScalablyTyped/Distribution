package typings.atAngularCommon.atAngularCommonMod

import typings.atAngularCore.atAngularCoreMod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "DatePipe")
@js.native
class DatePipe protected () extends PipeTransform {
  def this(locale: String) = this()
  var locale: js.Any = js.native
  /**
    * @param value The date expression: a `Date` object,  a number
    * (milliseconds since UTC epoch), or an ISO string (https://www.w3.org/TR/NOTE-datetime).
    * @param format The date/time components to include, using predefined options or a
    * custom format string.
    * @param timezone A timezone offset (such as `'+0430'`), or a standard
    * UTC/GMT or continental US timezone abbreviation.
    * When not supplied, uses the end-user's local system timezone.
    * @param locale A locale code for the locale format rules to use.
    * When not supplied, uses the value of `LOCALE_ID`, which is `en-US` by default.
    * See [Setting your app locale](guide/i18n#setting-up-the-locale-of-your-app).
    * @returns A date string in the desired format.
    */
  def transform(value: js.Any): String | Null = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform(value: js.Any, format: String): String | Null = js.native
  def transform(value: js.Any, format: String, timezone: String): String | Null = js.native
  def transform(value: js.Any, format: String, timezone: String, locale: String): String | Null = js.native
}

