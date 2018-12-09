package typings
package atAngularCommonLib.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", JSImport.Namespace)
@js.native
object commonModMembers extends js.Object {
  val APP_BASE_HREF: atAngularCoreLib.coreMod.InjectionToken[java.lang.String] = js.native
  val DOCUMENT: atAngularCoreLib.coreMod.InjectionToken[stdLib.Document] = js.native
  val LOCATION_INITIALIZED: atAngularCoreLib.coreMod.InjectionToken[js.Promise[js.Any]] = js.native
  val VERSION: atAngularCoreLib.coreMod.Version = js.native
  val ɵPLATFORM_BROWSER_ID: /* browser */ java.lang.String = js.native
  val ɵPLATFORM_SERVER_ID: /* server */ java.lang.String = js.native
  val ɵPLATFORM_WORKER_APP_ID: /* browserWorkerApp */ java.lang.String = js.native
  val ɵPLATFORM_WORKER_UI_ID: /* browserWorkerUi */ java.lang.String = js.native
  val ɵangular_packages_common_common_a: atAngularCoreLib.coreMod.InjectionToken[scala.Boolean] = js.native
  val ɵangular_packages_common_common_e: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = js.native
  val ɵangular_packages_common_common_f: js.Array[
    (ScalablyTyped.runtime.Instantiable1[
      /* _ref */ atAngularCoreLib.coreMod.ChangeDetectorRef, 
      atAngularCommonLib.srcPipesAsyncUnderscorePipeMod.AsyncPipe
    ]) | ScalablyTyped.runtime.Instantiable0[atAngularCommonLib.srcPipesSliceUnderscorePipeMod.SlicePipe] | (ScalablyTyped.runtime.Instantiable1[
      /* _locale */ java.lang.String, 
      atAngularCommonLib.srcPipesNumberUnderscorePipeMod.DecimalPipe
    ]) | (ScalablyTyped.runtime.Instantiable1[
      /* _locale */ java.lang.String, 
      atAngularCommonLib.srcPipesNumberUnderscorePipeMod.PercentPipe
    ]) | (ScalablyTyped.runtime.Instantiable1[
      /* _locale */ java.lang.String, 
      atAngularCommonLib.srcPipesNumberUnderscorePipeMod.CurrencyPipe
    ]) | (ScalablyTyped.runtime.Instantiable1[
      /* locale */ java.lang.String, 
      atAngularCommonLib.srcPipesDateUnderscorePipeMod.DatePipe
    ]) | (ScalablyTyped.runtime.Instantiable1[
      /* _localization */ atAngularCommonLib.srcI18nLocalizationMod.NgLocalization, 
      atAngularCommonLib.srcPipesI18nUnderscorePluralUnderscorePipeMod.I18nPluralPipe
    ]) | ScalablyTyped.runtime.Instantiable0[atAngularCommonLib.srcPipesI18nUnderscoreSelectUnderscorePipeMod.I18nSelectPipe] | (ScalablyTyped.runtime.Instantiable1[
      /* differs */ atAngularCoreLib.coreMod.KeyValueDiffers, 
      atAngularCommonLib.srcPipesKeyvalueUnderscorePipeMod.KeyValuePipe
    ])
  ] = js.native
  val ɵangular_packages_common_common_g: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = js.native
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
  def getLocaleDateFormat(
    locale: java.lang.String,
    width: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  ): java.lang.String = js.native
  def getLocaleDateTimeFormat(
    locale: java.lang.String,
    width: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  ): java.lang.String = js.native
  def getLocaleDayNames(
    locale: java.lang.String,
    formStyle: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormStyle,
    width: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth
  ): js.Array[java.lang.String] = js.native
  def getLocaleDayPeriods(
    locale: java.lang.String,
    formStyle: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormStyle,
    width: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth
  ): js.Tuple2[java.lang.String, java.lang.String] = js.native
  def getLocaleEraNames(
    locale: java.lang.String,
    width: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth
  ): js.Tuple2[java.lang.String, java.lang.String] = js.native
  def getLocaleExtraDayPeriodRules(locale: java.lang.String): js.Array[
    atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.Time | (js.Tuple2[
      atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.Time, 
      atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.Time
    ])
  ] = js.native
  def getLocaleExtraDayPeriods(
    locale: java.lang.String,
    formStyle: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormStyle,
    width: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth
  ): js.Array[java.lang.String] = js.native
  def getLocaleFirstDayOfWeek(locale: java.lang.String): atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.WeekDay = js.native
  def getLocaleId(locale: java.lang.String): java.lang.String = js.native
  def getLocaleMonthNames(
    locale: java.lang.String,
    formStyle: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormStyle,
    width: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth
  ): js.Array[java.lang.String] = js.native
  def getLocaleNumberFormat(
    locale: java.lang.String,
    `type`: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.NumberFormatStyle
  ): java.lang.String = js.native
  def getLocaleNumberSymbol(
    locale: java.lang.String,
    symbol: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.NumberSymbol
  ): java.lang.String = js.native
  def getLocalePluralCase(locale: java.lang.String): js.Function1[
    /* value */ scala.Double, 
    atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.Plural
  ] = js.native
  def getLocaleTimeFormat(
    locale: java.lang.String,
    width: atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  ): java.lang.String = js.native
  def getLocaleWeekEndRange(locale: java.lang.String): js.Tuple2[
    atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.WeekDay, 
    atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.WeekDay
  ] = js.native
  def getNumberOfCurrencyDigits(code: java.lang.String): scala.Double = js.native
  def isPlatformBrowser(platformId: js.Object): scala.Boolean = js.native
  def isPlatformServer(platformId: js.Object): scala.Boolean = js.native
  def isPlatformWorkerApp(platformId: js.Object): scala.Boolean = js.native
  def isPlatformWorkerUi(platformId: js.Object): scala.Boolean = js.native
  def registerLocaleData(data: js.Any): scala.Unit = js.native
  def registerLocaleData(data: js.Any, localeId: java.lang.String): scala.Unit = js.native
  def registerLocaleData(data: js.Any, localeId: java.lang.String, extraData: js.Any): scala.Unit = js.native
  def registerLocaleData(data: js.Any, localeId: js.Any): scala.Unit = js.native
  def registerLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): scala.Unit = js.native
  def ɵangular_packages_common_common_b(locale: java.lang.String, nLike: java.lang.String): atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.Plural = js.native
  def ɵangular_packages_common_common_b(locale: java.lang.String, nLike: scala.Double): atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.Plural = js.native
  def ɵangular_packages_common_common_d(locale: java.lang.String): js.Any = js.native
  def ɵparseCookieValue(cookieStr: java.lang.String, name: java.lang.String): java.lang.String | scala.Null = js.native
  def ɵregisterLocaleData(data: js.Any): scala.Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: java.lang.String): scala.Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: java.lang.String, extraData: js.Any): scala.Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any): scala.Unit = js.native
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): scala.Unit = js.native
}

