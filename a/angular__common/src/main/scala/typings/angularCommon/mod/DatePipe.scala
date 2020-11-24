package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "DatePipe")
@js.native
class DatePipe protected () extends PipeTransform {
  def this(locale: String) = this()
  
  var locale: js.Any = js.native
  
  def transform(): Null = js.native
  def transform(
    value: js.UndefOr[scala.Nothing],
    format: js.UndefOr[scala.Nothing],
    timezone: js.UndefOr[scala.Nothing],
    locale: String
  ): Null = js.native
  def transform(value: js.UndefOr[scala.Nothing], format: js.UndefOr[scala.Nothing], timezone: String): Null = js.native
  def transform(
    value: js.UndefOr[scala.Nothing],
    format: js.UndefOr[scala.Nothing],
    timezone: String,
    locale: String
  ): Null = js.native
  def transform(value: js.UndefOr[scala.Nothing], format: String): Null = js.native
  def transform(
    value: js.UndefOr[scala.Nothing],
    format: String,
    timezone: js.UndefOr[scala.Nothing],
    locale: String
  ): Null = js.native
  def transform(value: js.UndefOr[scala.Nothing], format: String, timezone: String): Null = js.native
  def transform(value: js.UndefOr[scala.Nothing], format: String, timezone: String, locale: String): Null = js.native
  def transform(value: String): String | Null = js.native
  def transform(
    value: String,
    format: js.UndefOr[scala.Nothing],
    timezone: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  def transform(value: String, format: js.UndefOr[scala.Nothing], timezone: String): String | Null = js.native
  def transform(value: String, format: js.UndefOr[scala.Nothing], timezone: String, locale: String): String | Null = js.native
  def transform(value: String, format: String): String | Null = js.native
  def transform(value: String, format: String, timezone: js.UndefOr[scala.Nothing], locale: String): String | Null = js.native
  def transform(value: String, format: String, timezone: String): String | Null = js.native
  def transform(value: String, format: String, timezone: String, locale: String): String | Null = js.native
  def transform(value: Double): String | Null = js.native
  def transform(
    value: Double,
    format: js.UndefOr[scala.Nothing],
    timezone: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  def transform(value: Double, format: js.UndefOr[scala.Nothing], timezone: String): String | Null = js.native
  def transform(value: Double, format: js.UndefOr[scala.Nothing], timezone: String, locale: String): String | Null = js.native
  def transform(value: Double, format: String): String | Null = js.native
  def transform(value: Double, format: String, timezone: js.UndefOr[scala.Nothing], locale: String): String | Null = js.native
  def transform(value: Double, format: String, timezone: String): String | Null = js.native
  def transform(value: Double, format: String, timezone: String, locale: String): String | Null = js.native
  def transform(
    value: Null,
    format: js.UndefOr[scala.Nothing],
    timezone: js.UndefOr[scala.Nothing],
    locale: String
  ): Null = js.native
  def transform(value: Null, format: js.UndefOr[scala.Nothing], timezone: String): Null = js.native
  def transform(value: Null, format: js.UndefOr[scala.Nothing], timezone: String, locale: String): Null = js.native
  def transform(value: Null, format: String): Null = js.native
  def transform(value: Null, format: String, timezone: js.UndefOr[scala.Nothing], locale: String): Null = js.native
  def transform(value: Null, format: String, timezone: String): Null = js.native
  def transform(value: Null, format: String, timezone: String, locale: String): Null = js.native
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
  def transform(value: Date): String | Null = js.native
  def transform(
    value: Date,
    format: js.UndefOr[scala.Nothing],
    timezone: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  def transform(value: Date, format: js.UndefOr[scala.Nothing], timezone: String): String | Null = js.native
  def transform(value: Date, format: js.UndefOr[scala.Nothing], timezone: String, locale: String): String | Null = js.native
  def transform(value: Date, format: String): String | Null = js.native
  def transform(value: Date, format: String, timezone: js.UndefOr[scala.Nothing], locale: String): String | Null = js.native
  def transform(value: Date, format: String, timezone: String): String | Null = js.native
  def transform(value: Date, format: String, timezone: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(): String | Null = js.native
  @JSName("transform")
  def transform_Union(
    value: js.UndefOr[scala.Nothing],
    format: js.UndefOr[scala.Nothing],
    timezone: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: js.UndefOr[scala.Nothing], format: js.UndefOr[scala.Nothing], timezone: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(
    value: js.UndefOr[scala.Nothing],
    format: js.UndefOr[scala.Nothing],
    timezone: String,
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: js.UndefOr[scala.Nothing], format: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(
    value: js.UndefOr[scala.Nothing],
    format: String,
    timezone: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: js.UndefOr[scala.Nothing], format: String, timezone: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: js.UndefOr[scala.Nothing], format: String, timezone: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(
    value: Null,
    format: js.UndefOr[scala.Nothing],
    timezone: js.UndefOr[scala.Nothing],
    locale: String
  ): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: js.UndefOr[scala.Nothing], timezone: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: js.UndefOr[scala.Nothing], timezone: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: String, timezone: js.UndefOr[scala.Nothing], locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: String, timezone: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: String, timezone: String, locale: String): String | Null = js.native
}
