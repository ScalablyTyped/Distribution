package typings.angularCommon.mod

import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.date
import typings.angularCommon.anon.Optional
import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "DatePipe")
@js.native
open class DatePipe protected ()
  extends StObject
     with PipeTransform {
  def this(locale: String) = this()
  def this(locale: String, defaultTimezone: String) = this()
  
  /* private */ var defaultTimezone: Any = js.native
  
  /* private */ var locale: Any = js.native
  
  def transform(): Null = js.native
  def transform(value: String): String | Null = js.native
  def transform(value: String, format: String): String | Null = js.native
  def transform(value: String, format: String, timezone: String): String | Null = js.native
  def transform(value: String, format: String, timezone: String, locale: String): String | Null = js.native
  def transform(value: String, format: String, timezone: Unit, locale: String): String | Null = js.native
  def transform(value: String, format: Unit, timezone: String): String | Null = js.native
  def transform(value: String, format: Unit, timezone: String, locale: String): String | Null = js.native
  def transform(value: String, format: Unit, timezone: Unit, locale: String): String | Null = js.native
  /**
    * @param value The date expression: a `Date` object,  a number
    * (milliseconds since UTC epoch), or an ISO string (https://www.w3.org/TR/NOTE-datetime).
    * @param format The date/time components to include, using predefined options or a
    * custom format string.
    * @param timezone A timezone offset (such as `'+0430'`), or a standard UTC/GMT, or continental US
    * timezone abbreviation. When not supplied, either the value of the `DATE_PIPE_DEFAULT_TIMEZONE`
    * injection token is used or the end-user's local system timezone.
    * @param locale A locale code for the locale format rules to use.
    * When not supplied, uses the value of `LOCALE_ID`, which is `en-US` by default.
    * See [Setting your app locale](guide/i18n-common-locale-id).
    * @returns A date string in the desired format.
    */
  def transform(value: js.Date): String | Null = js.native
  def transform(value: js.Date, format: String): String | Null = js.native
  def transform(value: js.Date, format: String, timezone: String): String | Null = js.native
  def transform(value: js.Date, format: String, timezone: String, locale: String): String | Null = js.native
  def transform(value: js.Date, format: String, timezone: Unit, locale: String): String | Null = js.native
  def transform(value: js.Date, format: Unit, timezone: String): String | Null = js.native
  def transform(value: js.Date, format: Unit, timezone: String, locale: String): String | Null = js.native
  def transform(value: js.Date, format: Unit, timezone: Unit, locale: String): String | Null = js.native
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
  def transform(value: Double): String | Null = js.native
  def transform(value: Double, format: String): String | Null = js.native
  def transform(value: Double, format: String, timezone: String): String | Null = js.native
  def transform(value: Double, format: String, timezone: String, locale: String): String | Null = js.native
  def transform(value: Double, format: String, timezone: Unit, locale: String): String | Null = js.native
  def transform(value: Double, format: Unit, timezone: String): String | Null = js.native
  def transform(value: Double, format: Unit, timezone: String, locale: String): String | Null = js.native
  def transform(value: Double, format: Unit, timezone: Unit, locale: String): String | Null = js.native
  def transform(value: Null, format: String): Null = js.native
  def transform(value: Null, format: String, timezone: String): Null = js.native
  def transform(value: Null, format: String, timezone: String, locale: String): Null = js.native
  def transform(value: Null, format: String, timezone: Unit, locale: String): Null = js.native
  def transform(value: Null, format: Unit, timezone: String): Null = js.native
  def transform(value: Null, format: Unit, timezone: String, locale: String): Null = js.native
  def transform(value: Null, format: Unit, timezone: Unit, locale: String): Null = js.native
  def transform(value: Unit, format: String): Null = js.native
  def transform(value: Unit, format: String, timezone: String): Null = js.native
  def transform(value: Unit, format: String, timezone: String, locale: String): Null = js.native
  def transform(value: Unit, format: String, timezone: Unit, locale: String): Null = js.native
  def transform(value: Unit, format: Unit, timezone: String): Null = js.native
  def transform(value: Unit, format: Unit, timezone: String, locale: String): Null = js.native
  def transform(value: Unit, format: Unit, timezone: Unit, locale: String): Null = js.native
  @JSName("transform")
  def transform_Union(): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: String, timezone: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: String, timezone: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: String, timezone: Unit, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: Unit, timezone: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: Unit, timezone: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, format: Unit, timezone: Unit, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, format: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, format: String, timezone: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, format: String, timezone: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, format: String, timezone: Unit, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, format: Unit, timezone: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, format: Unit, timezone: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, format: Unit, timezone: Unit, locale: String): String | Null = js.native
}
/* static members */
object DatePipe {
  
  @JSImport("@angular/common", "DatePipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "DatePipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[DatePipe, js.Tuple2[Null, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[DatePipe, js.Tuple2[Null, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "DatePipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[DatePipe, date, `true`] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[DatePipe, date, `true`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
