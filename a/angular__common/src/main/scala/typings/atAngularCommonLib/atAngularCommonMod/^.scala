package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val APP_BASE_HREF: atAngularCoreLib.atAngularCoreMod.InjectionToken[java.lang.String] = js.native
  val DOCUMENT: atAngularCoreLib.atAngularCoreMod.InjectionToken[stdLib.Document] = js.native
  val LOCATION_INITIALIZED: atAngularCoreLib.atAngularCoreMod.InjectionToken[js.Promise[js.Any]] = js.native
  val VERSION: atAngularCoreLib.atAngularCoreMod.Version = js.native
  val ɵPLATFORM_BROWSER_ID: atAngularCommonLib.atAngularCommonLibStrings.browser = js.native
  val ɵPLATFORM_SERVER_ID: atAngularCommonLib.atAngularCommonLibStrings.server = js.native
  val ɵPLATFORM_WORKER_APP_ID: atAngularCommonLib.atAngularCommonLibStrings.browserWorkerApp = js.native
  val ɵPLATFORM_WORKER_UI_ID: atAngularCommonLib.atAngularCommonLibStrings.browserWorkerUi = js.native
  val ɵangular_packages_common_common_a: atAngularCoreLib.atAngularCoreMod.InjectionToken[scala.Boolean] = js.native
  val ɵangular_packages_common_common_e: js.Array[atAngularCoreLib.atAngularCoreMod.Provider] = js.native
  val ɵangular_packages_common_common_f: js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      (/* _ref */ atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef) | (/* differs */ atAngularCoreLib.atAngularCoreMod.KeyValueDiffers) | (/* _localization */ NgLocalization) | (/* _locale */ java.lang.String), 
      AsyncPipe | CurrencyPipe | DatePipe | DecimalPipe | I18nPluralPipe | KeyValuePipe | PercentPipe
    ]) | (org.scalablytyped.runtime.Instantiable0[I18nSelectPipe | SlicePipe])
  ] = js.native
  val ɵangular_packages_common_common_g: js.Array[atAngularCoreLib.atAngularCoreMod.Provider] = js.native
  val ɵngClassDirectiveDef__POST_R3__ : scala.Nothing = js.native
  val ɵngStyleDirectiveDef__POST_R3__ : scala.Nothing = js.native
  def formatCurrency(value: scala.Double, locale: java.lang.String, currency: java.lang.String): java.lang.String = js.native
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: java.lang.String
  ): java.lang.String = js.native
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: java.lang.String,
    digitsInfo: java.lang.String
  ): java.lang.String = js.native
  def formatDate(value: java.lang.String, format: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def formatDate(
    value: java.lang.String,
    format: java.lang.String,
    locale: java.lang.String,
    timezone: java.lang.String
  ): java.lang.String = js.native
  def formatDate(value: scala.Double, format: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def formatDate(
    value: scala.Double,
    format: java.lang.String,
    locale: java.lang.String,
    timezone: java.lang.String
  ): java.lang.String = js.native
  def formatDate(value: stdLib.Date, format: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def formatDate(value: stdLib.Date, format: java.lang.String, locale: java.lang.String, timezone: java.lang.String): java.lang.String = js.native
  def formatNumber(value: scala.Double, locale: java.lang.String): java.lang.String = js.native
  def formatNumber(value: scala.Double, locale: java.lang.String, digitsInfo: java.lang.String): java.lang.String = js.native
  def formatPercent(value: scala.Double, locale: java.lang.String): java.lang.String = js.native
  def formatPercent(value: scala.Double, locale: java.lang.String, digitsInfo: java.lang.String): java.lang.String = js.native
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
  def isPlatformBrowser(platformId: js.Object): scala.Boolean = js.native
  def isPlatformServer(platformId: js.Object): scala.Boolean = js.native
  def isPlatformWorkerApp(platformId: js.Object): scala.Boolean = js.native
  def isPlatformWorkerUi(platformId: js.Object): scala.Boolean = js.native
  /**
    * Register global data to be used internally by Angular. See the
    * ["I18n guide"](guide/i18n#i18n-pipes) to know how to import additional locale data.
    *
    * @publicApi
    */
  def registerLocaleData(data: js.Any): scala.Unit = js.native
  def registerLocaleData(data: js.Any, localeId: java.lang.String): scala.Unit = js.native
  def registerLocaleData(data: js.Any, localeId: java.lang.String, extraData: js.Any): scala.Unit = js.native
  def registerLocaleData(data: js.Any, localeId: js.Any): scala.Unit = js.native
  def registerLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): scala.Unit = js.native
  def ɵangular_packages_common_common_b(locale: java.lang.String, nLike: java.lang.String): Plural = js.native
  def ɵangular_packages_common_common_b(locale: java.lang.String, nLike: scala.Double): Plural = js.native
  def ɵangular_packages_common_common_d(locale: java.lang.String): js.Any = js.native
  def ɵparseCookieValue(cookieStr: java.lang.String, name: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Register global data to be used internally by Angular. See the
    * ["I18n guide"](guide/i18n#i18n-pipes) to know how to import additional locale data.
    *
    * @publicApi
    */
  def ɵregisterLocaleData(data: js.Any): scala.Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: java.lang.String): scala.Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: java.lang.String, extraData: js.Any): scala.Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any): scala.Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): scala.Unit = js.native
}

