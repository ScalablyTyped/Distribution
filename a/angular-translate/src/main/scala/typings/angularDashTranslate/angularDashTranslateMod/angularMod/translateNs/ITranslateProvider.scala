package typings.angularDashTranslate.angularDashTranslateMod.angularMod.translateNs

import typings.angular.angularMod.IServiceProvider
import typings.angularDashTranslate.Anon_Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITranslateProvider extends IServiceProvider {
  def addInterpolation(factory: js.Any): ITranslateProvider = js.native
  def cloakClassName(): String = js.native
  def cloakClassName(name: String): ITranslateProvider = js.native
  def determinePreferredLanguage(): ITranslateProvider = js.native
  def determinePreferredLanguage(fn: js.Function0[Unit]): ITranslateProvider = js.native
  def directivePriority(): Double = js.native
  def directivePriority(priority: Double): ITranslateProvider = js.native
  def fallbackLanguage(): ITranslateProvider = js.native
  def fallbackLanguage(language: String): ITranslateProvider = js.native
  def fallbackLanguage(languages: js.Array[String]): ITranslateProvider = js.native
  def forceAsyncReload(value: Boolean): ITranslateProvider = js.native
  def preferredLanguage(): ITranslateProvider = js.native
  def preferredLanguage(language: String): ITranslateProvider = js.native
  def registerAvailableLanguageKeys(): js.Array[String] = js.native
  def registerAvailableLanguageKeys(languageKeys: js.Array[String]): ITranslateProvider = js.native
  def registerAvailableLanguageKeys(languageKeys: js.Array[String], aliases: ILanguageKeyAlias): ITranslateProvider = js.native
  def resolveClientLocale(): String = js.native
  def storageKey(): String = js.native
  def storageKey(key: String): Unit = js.native
  def storagePrefix(): String = js.native
  def storagePrefix(prefix: String): ITranslateProvider = js.native
  def translationNotFoundIndicator(indicator: String): ITranslateProvider = js.native
  def translationNotFoundIndicatorLeft(): String = js.native
  def translationNotFoundIndicatorLeft(indicator: String): ITranslateProvider = js.native
  def translationNotFoundIndicatorRight(): String = js.native
  def translationNotFoundIndicatorRight(indicator: String): ITranslateProvider = js.native
  def translations(): ITranslationTable = js.native
  def translations(key: String): ITranslationTable = js.native
  def translations(key: String, translationTable: ITranslationTable): ITranslateProvider = js.native
   // JeroMiya - the library should probably return ITranslateProvider but it doesn't here
  def uniformLanguageTag(options: String): ITranslateProvider = js.native
  def uniformLanguageTag(options: js.Object): ITranslateProvider = js.native
  def use(): String = js.native
  def use(key: String): ITranslateProvider = js.native
  def useCookieStorage(): ITranslateProvider = js.native
  def useInterpolation(factory: String): ITranslateProvider = js.native
  def useLoader(loaderFactory: String): ITranslateProvider = js.native
  def useLoader(loaderFactory: String, options: js.Any): ITranslateProvider = js.native
  def useLoaderCache(): ITranslateProvider = js.native
  def useLoaderCache(cache: js.Any): ITranslateProvider = js.native
  def useLocalStorage(): ITranslateProvider = js.native
  def useMessageFormatInterpolation(): ITranslateProvider = js.native
  def useMissingTranslationHandler(factory: String): ITranslateProvider = js.native
  def useMissingTranslationHandlerLog(): ITranslateProvider = js.native
  def usePostCompiling(value: Boolean): ITranslateProvider = js.native
  def useSanitizeValueStrategy(value: String): ITranslateProvider = js.native
  def useStaticFilesLoader(options: Anon_Files): ITranslateProvider = js.native
  def useStaticFilesLoader(options: IStaticFilesLoaderOptions): ITranslateProvider = js.native
  def useStorage(storageFactory: js.Any): ITranslateProvider = js.native
  def useUrlLoader(url: String): ITranslateProvider = js.native
}

