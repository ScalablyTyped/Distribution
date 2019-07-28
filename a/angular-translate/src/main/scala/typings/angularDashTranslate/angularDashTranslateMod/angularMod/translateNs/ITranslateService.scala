package typings.angularDashTranslate.angularDashTranslateMod.angularMod.translateNs

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITranslateService extends js.Object {
  def apply(translationId: String): IPromise[String] = js.native
  def apply(translationId: String, interpolateParams: js.Any): IPromise[String] = js.native
  def apply(translationId: String, interpolateParams: js.Any, interpolationId: String): IPromise[String] = js.native
  def apply(
    translationId: String,
    interpolateParams: js.Any,
    interpolationId: String,
    defaultTranslationText: String
  ): IPromise[String] = js.native
  def apply(
    translationId: String,
    interpolateParams: js.Any,
    interpolationId: String,
    defaultTranslationText: String,
    forceLanguage: String
  ): IPromise[String] = js.native
  def apply(
    translationId: String,
    interpolateParams: js.Any,
    interpolationId: String,
    defaultTranslationText: String,
    forceLanguage: String,
    sanitizeStrategy: String
  ): IPromise[String] = js.native
  def apply(translationId: js.Array[String]): IPromise[StringDictionary[String]] = js.native
  def apply(translationId: js.Array[String], interpolateParams: js.Any): IPromise[StringDictionary[String]] = js.native
  def apply(translationId: js.Array[String], interpolateParams: js.Any, interpolationId: String): IPromise[StringDictionary[String]] = js.native
  def apply(
    translationId: js.Array[String],
    interpolateParams: js.Any,
    interpolationId: String,
    defaultTranslationText: String
  ): IPromise[StringDictionary[String]] = js.native
  def apply(
    translationId: js.Array[String],
    interpolateParams: js.Any,
    interpolationId: String,
    defaultTranslationText: String,
    forceLanguage: String
  ): IPromise[StringDictionary[String]] = js.native
  def apply(
    translationId: js.Array[String],
    interpolateParams: js.Any,
    interpolationId: String,
    defaultTranslationText: String,
    forceLanguage: String,
    sanitizeStrategy: String
  ): IPromise[StringDictionary[String]] = js.native
  def cloakClassName(): String = js.native
  def cloakClassName(name: String): ITranslateProvider = js.native
  def fallbackLanguage(): String = js.native
  def fallbackLanguage(langKey: String): String = js.native
  def fallbackLanguage(langKey: js.Array[String]): String = js.native
  def getAvailableLanguageKeys(): js.Array[String] = js.native
  def instant(translationId: String): String = js.native
  def instant(translationId: String, interpolateParams: js.Any): String = js.native
  def instant(translationId: String, interpolateParams: js.Any, interpolationId: String): String = js.native
  def instant(translationId: String, interpolateParams: js.Any, interpolationId: String, forceLanguage: String): String = js.native
  def instant(
    translationId: String,
    interpolateParams: js.Any,
    interpolationId: String,
    forceLanguage: String,
    sanitizeStrategy: String
  ): String = js.native
  def instant(translationId: js.Array[String]): StringDictionary[String] = js.native
  def instant(translationId: js.Array[String], interpolateParams: js.Any): StringDictionary[String] = js.native
  def instant(translationId: js.Array[String], interpolateParams: js.Any, interpolationId: String): StringDictionary[String] = js.native
  def instant(
    translationId: js.Array[String],
    interpolateParams: js.Any,
    interpolationId: String,
    forceLanguage: String
  ): StringDictionary[String] = js.native
  def instant(
    translationId: js.Array[String],
    interpolateParams: js.Any,
    interpolationId: String,
    forceLanguage: String,
    sanitizeStrategy: String
  ): StringDictionary[String] = js.native
  def isPostCompilingEnabled(): Boolean = js.native
  def isReady(): Boolean = js.native
  def loaderCache(): js.Any = js.native
  def onReady(): IPromise[Unit] = js.native
  def onReady(fn: js.Function0[Unit]): IPromise[Unit] = js.native
  def preferredLanguage(): String = js.native
  def preferredLanguage(langKey: String): String = js.native
  def proposedLanguage(): String = js.native
  def refresh(): IPromise[Unit] = js.native
  def refresh(langKey: String): IPromise[Unit] = js.native
  def resolveClientLocale(): String = js.native
  def storage(): IStorage = js.native
  def storageKey(): String = js.native
  def use(): String = js.native
  def use(key: String): IPromise[String] = js.native
  def useFallbackLanguage(): Unit = js.native
  def useFallbackLanguage(langKey: String): Unit = js.native
  def versionInfo(): String = js.native
}

