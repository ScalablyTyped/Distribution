package typings.angularTranslate

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angular.mod.IServiceProvider
import typings.angularTranslate.angularTranslateStrings.translate
import typings.angularTranslate.anon.Files
import typings.angularTranslate.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-translate", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    type IFilterService = js.Function1[translate, FnCall]
    
    object translate {
      
      type ILanguageKeyAlias = StringDictionary[String]
      
      @js.native
      trait IPartialLoader[T] extends StObject {
        
        def addPart(name: String): T = js.native
        def addPart(name: String, priority: Double): T = js.native
        
        def deletePart(name: String): T = js.native
        
        def isPartAvailable(name: String): Boolean = js.native
      }
      
      @js.native
      trait IStaticFilesLoaderOptions extends StObject {
        
        var key: js.UndefOr[String] = js.native
        
        var prefix: String = js.native
        
        var suffix: String = js.native
      }
      object IStaticFilesLoaderOptions {
        
        @scala.inline
        def apply(prefix: String, suffix: String): IStaticFilesLoaderOptions = {
          val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
          __obj.asInstanceOf[IStaticFilesLoaderOptions]
        }
        
        @scala.inline
        implicit class IStaticFilesLoaderOptionsMutableBuilder[Self <: IStaticFilesLoaderOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
          
          @scala.inline
          def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IStorage extends StObject {
        
        def get(name: String): String = js.native
        
        def put(name: String, value: String): Unit = js.native
      }
      object IStorage {
        
        @scala.inline
        def apply(get: String => String, put: (String, String) => Unit): IStorage = {
          val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put))
          __obj.asInstanceOf[IStorage]
        }
        
        @scala.inline
        implicit class IStorageMutableBuilder[Self <: IStorage] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
          
          @scala.inline
          def setPut(value: (String, String) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
        }
      }
      
      @js.native
      trait ITranslatePartialLoaderProvider
        extends IServiceProvider
           with IPartialLoader[ITranslatePartialLoaderProvider] {
        
        def setPart(lang: String, part: String, table: ITranslationTable): ITranslatePartialLoaderProvider = js.native
      }
      
      @js.native
      trait ITranslatePartialLoaderService extends IPartialLoader[ITranslatePartialLoaderService] {
        
        def getRegisteredParts(): js.Array[String] = js.native
        
        def isPartLoaded(name: String, lang: String): Boolean = js.native
      }
      
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
        
        def useStaticFilesLoader(options: Files): ITranslateProvider = js.native
        def useStaticFilesLoader(options: IStaticFilesLoaderOptions): ITranslateProvider = js.native
        
        def useStorage(storageFactory: js.Any): ITranslateProvider = js.native
        
        def useUrlLoader(url: String): ITranslateProvider = js.native
      }
      
      @js.native
      trait ITranslateService extends StObject {
        
        def apply(translationId: String): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(translationId: String, interpolateParams: js.UndefOr[scala.Nothing], interpolationId: String): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: String,
          forceLanguage: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: String,
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(translationId: String, interpolateParams: js.Any): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(translationId: String, interpolateParams: js.Any, interpolationId: String): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): IPromise[String] = js.native
        def apply(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[String] = js.native
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
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
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
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: String,
          forceLanguage: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          defaultTranslationText: String,
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(translationId: js.Array[String], interpolateParams: js.Any): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          defaultTranslationText: String,
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(translationId: js.Array[String], interpolateParams: js.Any, interpolationId: String): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): IPromise[StringDictionary[String]] = js.native
        def apply(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: String,
          defaultTranslationText: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): IPromise[StringDictionary[String]] = js.native
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
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
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
        def instant(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): String = js.native
        def instant(translationId: String, interpolateParams: js.UndefOr[scala.Nothing], interpolationId: String): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          forceLanguage: String
        ): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          forceLanguage: String,
          sanitizeStrategy: String
        ): String = js.native
        def instant(translationId: String, interpolateParams: js.Any): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): String = js.native
        def instant(translationId: String, interpolateParams: js.Any, interpolationId: String): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): String = js.native
        def instant(translationId: String, interpolateParams: js.Any, interpolationId: String, forceLanguage: String): String = js.native
        def instant(
          translationId: String,
          interpolateParams: js.Any,
          interpolationId: String,
          forceLanguage: String,
          sanitizeStrategy: String
        ): String = js.native
        def instant(translationId: js.Array[String]): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String
        ): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          forceLanguage: String
        ): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.UndefOr[scala.Nothing],
          interpolationId: String,
          forceLanguage: String,
          sanitizeStrategy: String
        ): StringDictionary[String] = js.native
        def instant(translationId: js.Array[String], interpolateParams: js.Any): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: String
        ): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: js.UndefOr[scala.Nothing],
          forceLanguage: String,
          sanitizeStrategy: String
        ): StringDictionary[String] = js.native
        def instant(translationId: js.Array[String], interpolateParams: js.Any, interpolationId: String): StringDictionary[String] = js.native
        def instant(
          translationId: js.Array[String],
          interpolateParams: js.Any,
          interpolationId: String,
          forceLanguage: js.UndefOr[scala.Nothing],
          sanitizeStrategy: String
        ): StringDictionary[String] = js.native
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
        
        /**
          * @ngdoc function
          * @name pascalprecht.translate.$translate#negotiateLocale
          * @methodOf pascalprecht.translate.$translate
          *
          * @description
          * Returns a language key based on available languages and language aliases. If a
          * language key cannot be resolved, returns undefined.
          *
          * If no or a falsy key is given, returns undefined.
          *
          * @param key Language key
          * @return Language key or undefined if no language key is found.
          */
        def negotiateLocale(): js.UndefOr[String] = js.native
        def negotiateLocale(key: String): js.UndefOr[String] = js.native
        
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
      
      @js.native
      trait ITranslationTable extends /* key */ StringDictionary[String | ITranslationTable]
      object ITranslationTable {
        
        @scala.inline
        def apply(): ITranslationTable = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ITranslationTable]
        }
      }
    }
  }
}
