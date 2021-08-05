package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "PercentPipe")
@js.native
class PercentPipe protected ()
  extends StObject
     with PipeTransform {
  def this(_locale: String) = this()
  
  /* private */ var _locale: js.Any = js.native
  
  def transform(): Null = js.native
  def transform(value: String): String | Null = js.native
  def transform(value: String, digitsInfo: String): String | Null = js.native
  def transform(value: String, digitsInfo: String, locale: String): String | Null = js.native
  def transform(value: String, digitsInfo: Unit, locale: String): String | Null = js.native
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
  def transform(value: Double): String | Null = js.native
  def transform(value: Double, digitsInfo: String): String | Null = js.native
  def transform(value: Double, digitsInfo: String, locale: String): String | Null = js.native
  def transform(value: Double, digitsInfo: Unit, locale: String): String | Null = js.native
  def transform(value: Null, digitsInfo: String): Null = js.native
  def transform(value: Null, digitsInfo: String, locale: String): Null = js.native
  def transform(value: Null, digitsInfo: Unit, locale: String): Null = js.native
  def transform(value: Unit, digitsInfo: String): Null = js.native
  def transform(value: Unit, digitsInfo: String, locale: String): Null = js.native
  def transform(value: Unit, digitsInfo: Unit, locale: String): Null = js.native
  @JSName("transform")
  def transform_Union(): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, digitsInfo: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, digitsInfo: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, digitsInfo: Unit, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, digitsInfo: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, digitsInfo: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, digitsInfo: Unit, locale: String): String | Null = js.native
}
