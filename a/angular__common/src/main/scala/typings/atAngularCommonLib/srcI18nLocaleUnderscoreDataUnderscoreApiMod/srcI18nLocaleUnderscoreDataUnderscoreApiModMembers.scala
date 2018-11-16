package typings
package atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/i18n/locale_data_api", JSImport.Namespace)
@js.native
object srcI18nLocaleUnderscoreDataUnderscoreApiModMembers extends js.Object {
  def findLocaleData(locale: java.lang.String): js.Any = js.native
  @JSName("getCurrencySymbol")
  def getCurrencySymbol_narrow(code: java.lang.String, format: atAngularCommonLib.atAngularCommonLibStrings.narrow): java.lang.String = js.native
  @JSName("getCurrencySymbol")
  def getCurrencySymbol_narrow(
    code: java.lang.String,
    format: atAngularCommonLib.atAngularCommonLibStrings.narrow,
    locale: java.lang.String
  ): java.lang.String = js.native
  @JSName("getCurrencySymbol")
  def getCurrencySymbol_wide(code: java.lang.String, format: atAngularCommonLib.atAngularCommonLibStrings.wide): java.lang.String = js.native
  @JSName("getCurrencySymbol")
  def getCurrencySymbol_wide(
    code: java.lang.String,
    format: atAngularCommonLib.atAngularCommonLibStrings.wide,
    locale: java.lang.String
  ): java.lang.String = js.native
  def getLocaleCurrencyName(locale: java.lang.String): java.lang.String | scala.Null = js.native
  def getLocaleCurrencySymbol(locale: java.lang.String): java.lang.String | scala.Null = js.native
  def getLocaleDateFormat(locale: java.lang.String, width: FormatWidth): java.lang.String = js.native
  def getLocaleDateTimeFormat(locale: java.lang.String, width: FormatWidth): java.lang.String = js.native
  def getLocaleDayNames(locale: java.lang.String, formStyle: FormStyle, width: TranslationWidth): js.Array[java.lang.String] = js.native
  def getLocaleDayPeriods(locale: java.lang.String, formStyle: FormStyle, width: TranslationWidth): js.Tuple2[java.lang.String, java.lang.String] = js.native
  def getLocaleEraNames(locale: java.lang.String, width: TranslationWidth): js.Tuple2[java.lang.String, java.lang.String] = js.native
  def getLocaleExtraDayPeriodRules(locale: java.lang.String): js.Array[Time | (js.Tuple2[Time, Time])] = js.native
  def getLocaleExtraDayPeriods(locale: java.lang.String, formStyle: FormStyle, width: TranslationWidth): js.Array[java.lang.String] = js.native
  def getLocaleFirstDayOfWeek(locale: java.lang.String): WeekDay = js.native
  def getLocaleId(locale: java.lang.String): java.lang.String = js.native
  def getLocaleMonthNames(locale: java.lang.String, formStyle: FormStyle, width: TranslationWidth): js.Array[java.lang.String] = js.native
  def getLocaleNumberFormat(locale: java.lang.String, `type`: NumberFormatStyle): java.lang.String = js.native
  def getLocaleNumberSymbol(locale: java.lang.String, symbol: NumberSymbol): java.lang.String = js.native
  def getLocalePluralCase(locale: java.lang.String): js.Function1[/* value */ scala.Double, Plural] = js.native
  def getLocaleTimeFormat(locale: java.lang.String, width: FormatWidth): java.lang.String = js.native
  def getLocaleWeekEndRange(locale: java.lang.String): js.Tuple2[WeekDay, WeekDay] = js.native
  def getNumberOfCurrencyDigits(code: java.lang.String): scala.Double = js.native
}

