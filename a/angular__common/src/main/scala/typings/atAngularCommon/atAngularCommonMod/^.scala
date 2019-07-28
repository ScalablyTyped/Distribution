package typings.atAngularCommon.atAngularCommonMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.atAngularCommon.atAngularCommonStrings.browser
import typings.atAngularCommon.atAngularCommonStrings.browserWorkerApp
import typings.atAngularCommon.atAngularCommonStrings.browserWorkerUi
import typings.atAngularCommon.atAngularCommonStrings.narrow
import typings.atAngularCommon.atAngularCommonStrings.server
import typings.atAngularCommon.atAngularCommonStrings.wide
import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.InjectionToken
import typings.atAngularCore.atAngularCoreMod.KeyValueDiffers
import typings.atAngularCore.atAngularCoreMod.Provider
import typings.atAngularCore.atAngularCoreMod.Version
import typings.std.Date
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val APP_BASE_HREF: InjectionToken[String] = js.native
  val DOCUMENT: InjectionToken[Document] = js.native
  val LOCATION_INITIALIZED: InjectionToken[js.Promise[js.Any]] = js.native
  val VERSION: Version = js.native
  val ɵPLATFORM_BROWSER_ID: browser = js.native
  val ɵPLATFORM_SERVER_ID: server = js.native
  val ɵPLATFORM_WORKER_APP_ID: browserWorkerApp = js.native
  val ɵPLATFORM_WORKER_UI_ID: browserWorkerUi = js.native
  val ɵangular_packages_common_common_a: InjectionToken[Boolean] = js.native
  val ɵangular_packages_common_common_c: js.Array[Provider] = js.native
  val ɵangular_packages_common_common_d: js.Array[
    (Instantiable1[
      (/* _ref */ ChangeDetectorRef) | (/* differs */ KeyValueDiffers) | (/* _localization */ NgLocalization) | (/* _locale */ String), 
      AsyncPipe | CurrencyPipe | DatePipe | DecimalPipe | I18nPluralPipe | KeyValuePipe | PercentPipe
    ]) | (Instantiable0[I18nSelectPipe | SlicePipe])
  ] = js.native
  val ɵangular_packages_common_common_e: js.Array[Provider] = js.native
  val ɵngClassDirectiveDef__POST_R3__ : scala.Nothing = js.native
  val ɵngStyleDirectiveDef__POST_R3__ : scala.Nothing = js.native
  def formatCurrency(value: Double, locale: String, currency: String): String = js.native
  def formatCurrency(value: Double, locale: String, currency: String, currencyCode: String): String = js.native
  def formatCurrency(value: Double, locale: String, currency: String, currencyCode: String, digitsInfo: String): String = js.native
  def formatDate(value: String, format: String, locale: String): String = js.native
  def formatDate(value: String, format: String, locale: String, timezone: String): String = js.native
  def formatDate(value: Double, format: String, locale: String): String = js.native
  def formatDate(value: Double, format: String, locale: String, timezone: String): String = js.native
  def formatDate(value: Date, format: String, locale: String): String = js.native
  def formatDate(value: Date, format: String, locale: String, timezone: String): String = js.native
  def formatNumber(value: Double, locale: String): String = js.native
  def formatNumber(value: Double, locale: String, digitsInfo: String): String = js.native
  def formatPercent(value: Double, locale: String): String = js.native
  def formatPercent(value: Double, locale: String, digitsInfo: String): String = js.native
  @JSName("getCurrencySymbol")
  def getCurrencySymbol_narrow(code: String, format: narrow): String = js.native
  @JSName("getCurrencySymbol")
  def getCurrencySymbol_narrow(code: String, format: narrow, locale: String): String = js.native
  @JSName("getCurrencySymbol")
  def getCurrencySymbol_wide(code: String, format: wide): String = js.native
  @JSName("getCurrencySymbol")
  def getCurrencySymbol_wide(code: String, format: wide, locale: String): String = js.native
  def getLocaleCurrencyName(locale: String): String | Null = js.native
  def getLocaleCurrencySymbol(locale: String): String | Null = js.native
  def getLocaleDateFormat(locale: String, width: FormatWidth): String = js.native
  def getLocaleDateTimeFormat(locale: String, width: FormatWidth): String = js.native
  def getLocaleDayNames(locale: String, formStyle: FormStyle, width: TranslationWidth): js.Array[String] = js.native
  def getLocaleDayPeriods(locale: String, formStyle: FormStyle, width: TranslationWidth): js.Tuple2[String, String] = js.native
  def getLocaleEraNames(locale: String, width: TranslationWidth): js.Tuple2[String, String] = js.native
  def getLocaleExtraDayPeriodRules(locale: String): js.Array[Time | (js.Tuple2[Time, Time])] = js.native
  def getLocaleExtraDayPeriods(locale: String, formStyle: FormStyle, width: TranslationWidth): js.Array[String] = js.native
  def getLocaleFirstDayOfWeek(locale: String): WeekDay = js.native
  def getLocaleId(locale: String): String = js.native
  def getLocaleMonthNames(locale: String, formStyle: FormStyle, width: TranslationWidth): js.Array[String] = js.native
  def getLocaleNumberFormat(locale: String, `type`: NumberFormatStyle): String = js.native
  def getLocaleNumberSymbol(locale: String, symbol: NumberSymbol): String = js.native
  def getLocalePluralCase(locale: String): js.Function1[/* value */ Double, Plural] = js.native
  def getLocaleTimeFormat(locale: String, width: FormatWidth): String = js.native
  def getLocaleWeekEndRange(locale: String): js.Tuple2[WeekDay, WeekDay] = js.native
  def getNumberOfCurrencyDigits(code: String): Double = js.native
  def isPlatformBrowser(platformId: js.Object): Boolean = js.native
  def isPlatformServer(platformId: js.Object): Boolean = js.native
  def isPlatformWorkerApp(platformId: js.Object): Boolean = js.native
  def isPlatformWorkerUi(platformId: js.Object): Boolean = js.native
  /**
    * Register global data to be used internally by Angular. See the
    * ["I18n guide"](guide/i18n#i18n-pipes) to know how to import additional locale data.
    *
    * @publicApi
    */
  def registerLocaleData(data: js.Any): Unit = js.native
  def registerLocaleData(data: js.Any, localeId: String): Unit = js.native
  def registerLocaleData(data: js.Any, localeId: String, extraData: js.Any): Unit = js.native
  def registerLocaleData(data: js.Any, localeId: js.Any): Unit = js.native
  def registerLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): Unit = js.native
  def ɵangular_packages_common_common_b(locale: String, nLike: String): Plural = js.native
  def ɵangular_packages_common_common_b(locale: String, nLike: Double): Plural = js.native
  def ɵparseCookieValue(cookieStr: String, name: String): String | Null = js.native
  /**
    * Register global data to be used internally by Angular. See the
    * ["I18n guide"](guide/i18n#i18n-pipes) to know how to import additional locale data.
    *
    * @publicApi
    */
  def ɵregisterLocaleData(data: js.Any): Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: String): Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: String, extraData: js.Any): Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any): Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): Unit = js.native
}

