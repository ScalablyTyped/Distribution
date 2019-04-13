package typings
package angularDashTranslateLib.angularDashTranslateMod.angularMod.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITranslateProvider
  extends angularLib.angularMod.IServiceProvider {
  def addInterpolation(factory: js.Any): ITranslateProvider = js.native
  def cloakClassName(): java.lang.String = js.native
  def cloakClassName(name: java.lang.String): ITranslateProvider = js.native
  def determinePreferredLanguage(): ITranslateProvider = js.native
  def determinePreferredLanguage(fn: js.Function0[scala.Unit]): ITranslateProvider = js.native
  def directivePriority(): scala.Double = js.native
  def directivePriority(priority: scala.Double): ITranslateProvider = js.native
  def fallbackLanguage(): ITranslateProvider = js.native
  def fallbackLanguage(language: java.lang.String): ITranslateProvider = js.native
  def fallbackLanguage(languages: js.Array[java.lang.String]): ITranslateProvider = js.native
  def forceAsyncReload(value: scala.Boolean): ITranslateProvider = js.native
  def preferredLanguage(): ITranslateProvider = js.native
  def preferredLanguage(language: java.lang.String): ITranslateProvider = js.native
  def registerAvailableLanguageKeys(): js.Array[java.lang.String] = js.native
  def registerAvailableLanguageKeys(languageKeys: js.Array[java.lang.String]): ITranslateProvider = js.native
  def registerAvailableLanguageKeys(languageKeys: js.Array[java.lang.String], aliases: ILanguageKeyAlias): ITranslateProvider = js.native
  def resolveClientLocale(): java.lang.String = js.native
  def storageKey(): java.lang.String = js.native
  def storageKey(key: java.lang.String): scala.Unit = js.native
  def storagePrefix(): java.lang.String = js.native
  def storagePrefix(prefix: java.lang.String): ITranslateProvider = js.native
  def translationNotFoundIndicator(indicator: java.lang.String): ITranslateProvider = js.native
  def translationNotFoundIndicatorLeft(): java.lang.String = js.native
  def translationNotFoundIndicatorLeft(indicator: java.lang.String): ITranslateProvider = js.native
  def translationNotFoundIndicatorRight(): java.lang.String = js.native
  def translationNotFoundIndicatorRight(indicator: java.lang.String): ITranslateProvider = js.native
  def translations(): ITranslationTable = js.native
  def translations(key: java.lang.String): ITranslationTable = js.native
  def translations(key: java.lang.String, translationTable: ITranslationTable): ITranslateProvider = js.native
   // JeroMiya - the library should probably return ITranslateProvider but it doesn't here
  def uniformLanguageTag(options: java.lang.String): ITranslateProvider = js.native
  def uniformLanguageTag(options: js.Object): ITranslateProvider = js.native
  def use(): java.lang.String = js.native
  def use(key: java.lang.String): ITranslateProvider = js.native
  def useCookieStorage(): ITranslateProvider = js.native
  def useInterpolation(factory: java.lang.String): ITranslateProvider = js.native
  def useLoader(loaderFactory: java.lang.String): ITranslateProvider = js.native
  def useLoader(loaderFactory: java.lang.String, options: js.Any): ITranslateProvider = js.native
  def useLoaderCache(): ITranslateProvider = js.native
  def useLoaderCache(cache: js.Any): ITranslateProvider = js.native
  def useLocalStorage(): ITranslateProvider = js.native
  def useMessageFormatInterpolation(): ITranslateProvider = js.native
  def useMissingTranslationHandler(factory: java.lang.String): ITranslateProvider = js.native
  def useMissingTranslationHandlerLog(): ITranslateProvider = js.native
  def usePostCompiling(value: scala.Boolean): ITranslateProvider = js.native
  def useSanitizeValueStrategy(value: java.lang.String): ITranslateProvider = js.native
  def useStaticFilesLoader(options: angularDashTranslateLib.Anon_Files): ITranslateProvider = js.native
  def useStaticFilesLoader(options: IStaticFilesLoaderOptions): ITranslateProvider = js.native
  def useStorage(storageFactory: js.Any): ITranslateProvider = js.native
  def useUrlLoader(url: java.lang.String): ITranslateProvider = js.native
}

