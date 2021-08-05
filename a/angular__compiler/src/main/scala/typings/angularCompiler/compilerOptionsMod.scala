package typings.angularCompiler

import typings.angularCompiler.angularCompilerStrings.ngtsc
import typings.angularCompiler.coreMod.MissingTranslationStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerOptionsMod {
  
  trait AotCompilerOptions extends StObject {
    
    var allowEmptyCodegenFiles: js.UndefOr[Boolean] = js.undefined
    
    var createExternalSymbolFactoryReexports: js.UndefOr[Boolean] = js.undefined
    
    var enableIvy: js.UndefOr[Boolean | ngtsc] = js.undefined
    
    var enableSummariesForJit: js.UndefOr[Boolean] = js.undefined
    
    var fullTemplateTypeCheck: js.UndefOr[Boolean] = js.undefined
    
    var i18nFormat: js.UndefOr[String] = js.undefined
    
    var i18nUseExternalIds: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var missingTranslation: js.UndefOr[MissingTranslationStrategy] = js.undefined
    
    var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
    
    var strictInjectionParameters: js.UndefOr[Boolean] = js.undefined
    
    var translations: js.UndefOr[String] = js.undefined
  }
  object AotCompilerOptions {
    
    inline def apply(): AotCompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AotCompilerOptions]
    }
    
    extension [Self <: AotCompilerOptions](x: Self) {
      
      inline def setAllowEmptyCodegenFiles(value: Boolean): Self = StObject.set(x, "allowEmptyCodegenFiles", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyCodegenFilesUndefined: Self = StObject.set(x, "allowEmptyCodegenFiles", js.undefined)
      
      inline def setCreateExternalSymbolFactoryReexports(value: Boolean): Self = StObject.set(x, "createExternalSymbolFactoryReexports", value.asInstanceOf[js.Any])
      
      inline def setCreateExternalSymbolFactoryReexportsUndefined: Self = StObject.set(x, "createExternalSymbolFactoryReexports", js.undefined)
      
      inline def setEnableIvy(value: Boolean | ngtsc): Self = StObject.set(x, "enableIvy", value.asInstanceOf[js.Any])
      
      inline def setEnableIvyUndefined: Self = StObject.set(x, "enableIvy", js.undefined)
      
      inline def setEnableSummariesForJit(value: Boolean): Self = StObject.set(x, "enableSummariesForJit", value.asInstanceOf[js.Any])
      
      inline def setEnableSummariesForJitUndefined: Self = StObject.set(x, "enableSummariesForJit", js.undefined)
      
      inline def setFullTemplateTypeCheck(value: Boolean): Self = StObject.set(x, "fullTemplateTypeCheck", value.asInstanceOf[js.Any])
      
      inline def setFullTemplateTypeCheckUndefined: Self = StObject.set(x, "fullTemplateTypeCheck", js.undefined)
      
      inline def setI18nFormat(value: String): Self = StObject.set(x, "i18nFormat", value.asInstanceOf[js.Any])
      
      inline def setI18nFormatUndefined: Self = StObject.set(x, "i18nFormat", js.undefined)
      
      inline def setI18nUseExternalIds(value: Boolean): Self = StObject.set(x, "i18nUseExternalIds", value.asInstanceOf[js.Any])
      
      inline def setI18nUseExternalIdsUndefined: Self = StObject.set(x, "i18nUseExternalIds", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMissingTranslation(value: MissingTranslationStrategy): Self = StObject.set(x, "missingTranslation", value.asInstanceOf[js.Any])
      
      inline def setMissingTranslationUndefined: Self = StObject.set(x, "missingTranslation", js.undefined)
      
      inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
      
      inline def setStrictInjectionParameters(value: Boolean): Self = StObject.set(x, "strictInjectionParameters", value.asInstanceOf[js.Any])
      
      inline def setStrictInjectionParametersUndefined: Self = StObject.set(x, "strictInjectionParameters", js.undefined)
      
      inline def setTranslations(value: String): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
