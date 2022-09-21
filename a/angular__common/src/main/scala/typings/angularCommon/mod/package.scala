package typings.angularCommon.mod

import typings.angularCommon.angularCommonStrings.ltr
import typings.angularCommon.angularCommonStrings.narrow
import typings.angularCommon.angularCommonStrings.rtl
import typings.angularCommon.angularCommonStrings.wide
import typings.angularCommon.anon.EnsurePreconnect
import typings.angularCommon.mod.^
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Provider
import typings.angularCore.mod.Version
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def APP_BASE_HREF: InjectionToken[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("APP_BASE_HREF").asInstanceOf[InjectionToken[String]]

inline def DATE_PIPE_DEFAULT_TIMEZONE: InjectionToken[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("DATE_PIPE_DEFAULT_TIMEZONE").asInstanceOf[InjectionToken[String]]

inline def DOCUMENT: InjectionToken[Document] = ^.asInstanceOf[js.Dynamic].selectDynamic("DOCUMENT").asInstanceOf[InjectionToken[Document]]

inline def IMAGE_LOADER: InjectionToken[ImageLoader] = ^.asInstanceOf[js.Dynamic].selectDynamic("IMAGE_LOADER").asInstanceOf[InjectionToken[ImageLoader]]

inline def LOCATION_INITIALIZED: InjectionToken[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("LOCATION_INITIALIZED").asInstanceOf[InjectionToken[js.Promise[Any]]]

inline def PRECONNECT_CHECK_BLOCKLIST: InjectionToken[js.Array[String | js.Array[String]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("PRECONNECT_CHECK_BLOCKLIST").asInstanceOf[InjectionToken[js.Array[String | js.Array[String]]]]

inline def VERSION: Version = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[Version]

inline def formatCurrency(value: Double, locale: String, currency: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatCurrency(value: Double, locale: String, currency: String, currencyCode: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatCurrency(value: Double, locale: String, currency: String, currencyCode: String, digitsInfo: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatCurrency(value: Double, locale: String, currency: String, currencyCode: Unit, digitsInfo: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[String]

inline def formatDate(value: String, format: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatDate(value: String, format: String, locale: String, timezone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatDate(value: js.Date, format: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatDate(value: js.Date, format: String, locale: String, timezone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatDate(value: Double, format: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatDate(value: Double, format: String, locale: String, timezone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]

inline def formatNumber(value: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatNumber(value: Double, locale: String, digitsInfo: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[String]

inline def formatPercent(value: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPercent")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatPercent(value: Double, locale: String, digitsInfo: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPercent")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getCurrencySymbol(code: String, format: wide | narrow): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
inline def getCurrencySymbol(code: String, format: wide | narrow, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getLocaleCurrencyCode(locale: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCurrencyCode")(locale.asInstanceOf[js.Any]).asInstanceOf[String | Null]

inline def getLocaleCurrencyName(locale: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCurrencyName")(locale.asInstanceOf[js.Any]).asInstanceOf[String | Null]

inline def getLocaleCurrencySymbol(locale: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCurrencySymbol")(locale.asInstanceOf[js.Any]).asInstanceOf[String | Null]

inline def getLocaleDateFormat(locale: String, width: FormatWidth): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDateFormat")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getLocaleDateTimeFormat(locale: String, width: FormatWidth): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDateTimeFormat")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getLocaleDayNames(locale: String, formStyle: FormStyle, width: TranslationWidth): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDayNames")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def getLocaleDayPeriods(locale: String, formStyle: FormStyle, width: TranslationWidth): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDayPeriods")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]

inline def getLocaleDirection(locale: String): ltr | rtl = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDirection")(locale.asInstanceOf[js.Any]).asInstanceOf[ltr | rtl]

inline def getLocaleEraNames(locale: String, width: TranslationWidth): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleEraNames")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]

inline def getLocaleExtraDayPeriodRules(locale: String): js.Array[Time | (js.Tuple2[Time, Time])] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleExtraDayPeriodRules")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Time | (js.Tuple2[Time, Time])]]

inline def getLocaleExtraDayPeriods(locale: String, formStyle: FormStyle, width: TranslationWidth): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleExtraDayPeriods")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def getLocaleFirstDayOfWeek(locale: String): WeekDay = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleFirstDayOfWeek")(locale.asInstanceOf[js.Any]).asInstanceOf[WeekDay]

inline def getLocaleId(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleId")(locale.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getLocaleMonthNames(locale: String, formStyle: FormStyle, width: TranslationWidth): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleMonthNames")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def getLocaleNumberFormat(locale: String, `type`: NumberFormatStyle): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleNumberFormat")(locale.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getLocaleNumberSymbol(locale: String, symbol: NumberSymbol): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleNumberSymbol")(locale.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getLocalePluralCase(locale: String): js.Function1[/* value */ Double, Plural] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalePluralCase")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Double, Plural]]

inline def getLocaleTimeFormat(locale: String, width: FormatWidth): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleTimeFormat")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getLocaleWeekEndRange(locale: String): js.Tuple2[WeekDay, WeekDay] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleWeekEndRange")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[WeekDay, WeekDay]]

inline def getNumberOfCurrencyDigits(code: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOfCurrencyDigits")(code.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def isPlatformBrowser(platformId: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformBrowser")(platformId.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isPlatformServer(platformId: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformServer")(platformId.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isPlatformWorkerApp(platformId: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformWorkerApp")(platformId.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isPlatformWorkerUi(platformId: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformWorkerUi")(platformId.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def provideCloudflareLoader(path: String): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideCloudflareLoader")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Provider]]
inline def provideCloudflareLoader(path: String, options: EnsurePreconnect): js.Array[Provider] = (^.asInstanceOf[js.Dynamic].applyDynamic("provideCloudflareLoader")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Provider]]

inline def provideCloudinaryLoader(path: String): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideCloudinaryLoader")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Provider]]
inline def provideCloudinaryLoader(path: String, options: EnsurePreconnect): js.Array[Provider] = (^.asInstanceOf[js.Dynamic].applyDynamic("provideCloudinaryLoader")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Provider]]

inline def provideImageKitLoader(path: String): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideImageKitLoader")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Provider]]
inline def provideImageKitLoader(path: String, options: EnsurePreconnect): js.Array[Provider] = (^.asInstanceOf[js.Dynamic].applyDynamic("provideImageKitLoader")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Provider]]

inline def provideImgixLoader(path: String): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideImgixLoader")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Provider]]
inline def provideImgixLoader(path: String, options: EnsurePreconnect): js.Array[Provider] = (^.asInstanceOf[js.Dynamic].applyDynamic("provideImgixLoader")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Provider]]

inline def registerLocaleData(data: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def registerLocaleData(data: Any, localeId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerLocaleData(data: Any, localeId: String, extraData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerLocaleData(data: Any, localeId: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerLocaleData(data: Any, localeId: Any, extraData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerLocaleData(data: Any, localeId: Unit, extraData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵPLATFORMBROWSERID: /* "browser" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_BROWSER_ID").asInstanceOf[/* "browser" */ String]

inline def ɵPLATFORMSERVERID: /* "server" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_SERVER_ID").asInstanceOf[/* "server" */ String]

inline def ɵPLATFORMWORKERAPPID: /* "browserWorkerApp" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_WORKER_APP_ID").asInstanceOf[/* "browserWorkerApp" */ String]

inline def ɵPLATFORMWORKERUIID: /* "browserWorkerUi" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_WORKER_UI_ID").asInstanceOf[/* "browserWorkerUi" */ String]

inline def ɵgetDOM(): ɵDomAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDOM")().asInstanceOf[ɵDomAdapter]

inline def ɵparseCookieValue(cookieStr: String, name: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseCookieValue")(cookieStr.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String | Null]

inline def ɵsetRootDomAdapter(adapter: ɵDomAdapter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setRootDomAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[Unit]

type ImageLoader = js.Function1[/* config */ ImageLoaderConfig, String]

type LocationChangeListener = js.Function1[/* event */ LocationChangeEvent, Any]
