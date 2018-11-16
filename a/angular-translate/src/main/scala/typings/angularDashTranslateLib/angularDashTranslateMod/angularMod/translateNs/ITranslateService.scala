package typings
package angularDashTranslateLib.angularDashTranslateMod.angularMod.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITranslateService extends js.Object {
  def apply(translationId: java.lang.String): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
  def apply(translationId: java.lang.String, interpolateParams: js.Any): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
  def apply(translationId: java.lang.String, interpolateParams: js.Any, interpolationId: java.lang.String): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
  def apply(
    translationId: java.lang.String,
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    defaultTranslationText: java.lang.String
  ): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
  def apply(
    translationId: java.lang.String,
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    defaultTranslationText: java.lang.String,
    forceLanguage: java.lang.String
  ): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
  def apply(
    translationId: java.lang.String,
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    defaultTranslationText: java.lang.String,
    forceLanguage: java.lang.String,
    sanitizeStrategy: java.lang.String
  ): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
  def apply(translationId: js.Array[java.lang.String]): angularLib.angularMod.angularNs.IPromise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def apply(translationId: js.Array[java.lang.String], interpolateParams: js.Any): angularLib.angularMod.angularNs.IPromise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def apply(
    translationId: js.Array[java.lang.String],
    interpolateParams: js.Any,
    interpolationId: java.lang.String
  ): angularLib.angularMod.angularNs.IPromise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def apply(
    translationId: js.Array[java.lang.String],
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    defaultTranslationText: java.lang.String
  ): angularLib.angularMod.angularNs.IPromise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def apply(
    translationId: js.Array[java.lang.String],
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    defaultTranslationText: java.lang.String,
    forceLanguage: java.lang.String
  ): angularLib.angularMod.angularNs.IPromise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def apply(
    translationId: js.Array[java.lang.String],
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    defaultTranslationText: java.lang.String,
    forceLanguage: java.lang.String,
    sanitizeStrategy: java.lang.String
  ): angularLib.angularMod.angularNs.IPromise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def cloakClassName(): java.lang.String = js.native
  def cloakClassName(name: java.lang.String): ITranslateProvider = js.native
  def fallbackLanguage(): java.lang.String = js.native
  def fallbackLanguage(langKey: java.lang.String): java.lang.String = js.native
  def fallbackLanguage(langKey: js.Array[java.lang.String]): java.lang.String = js.native
  def getAvailableLanguageKeys(): js.Array[java.lang.String] = js.native
  def instant(translationId: java.lang.String): java.lang.String = js.native
  def instant(translationId: java.lang.String, interpolateParams: js.Any): java.lang.String = js.native
  def instant(translationId: java.lang.String, interpolateParams: js.Any, interpolationId: java.lang.String): java.lang.String = js.native
  def instant(
    translationId: java.lang.String,
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    forceLanguage: java.lang.String
  ): java.lang.String = js.native
  def instant(
    translationId: java.lang.String,
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    forceLanguage: java.lang.String,
    sanitizeStrategy: java.lang.String
  ): java.lang.String = js.native
  def instant(translationId: js.Array[java.lang.String]): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def instant(translationId: js.Array[java.lang.String], interpolateParams: js.Any): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def instant(
    translationId: js.Array[java.lang.String],
    interpolateParams: js.Any,
    interpolationId: java.lang.String
  ): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def instant(
    translationId: js.Array[java.lang.String],
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    forceLanguage: java.lang.String
  ): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def instant(
    translationId: js.Array[java.lang.String],
    interpolateParams: js.Any,
    interpolationId: java.lang.String,
    forceLanguage: java.lang.String,
    sanitizeStrategy: java.lang.String
  ): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def isPostCompilingEnabled(): scala.Boolean = js.native
  def isReady(): scala.Boolean = js.native
  def loaderCache(): js.Any = js.native
  def onReady(): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def onReady(fn: js.Function0[scala.Unit]): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def preferredLanguage(): java.lang.String = js.native
  def preferredLanguage(langKey: java.lang.String): java.lang.String = js.native
  def proposedLanguage(): java.lang.String = js.native
  def refresh(): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def refresh(langKey: java.lang.String): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def resolveClientLocale(): java.lang.String = js.native
  def storage(): IStorage = js.native
  def storageKey(): java.lang.String = js.native
  def use(): java.lang.String = js.native
  def use(key: java.lang.String): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
  def useFallbackLanguage(): scala.Unit = js.native
  def useFallbackLanguage(langKey: java.lang.String): scala.Unit = js.native
  def versionInfo(): java.lang.String = js.native
}

