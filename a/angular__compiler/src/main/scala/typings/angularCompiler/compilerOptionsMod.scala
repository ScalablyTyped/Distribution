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
    
    @scala.inline
    def apply(): AotCompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AotCompilerOptions]
    }
    
    @scala.inline
    implicit class AotCompilerOptionsMutableBuilder[Self <: AotCompilerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmptyCodegenFiles(value: Boolean): Self = StObject.set(x, "allowEmptyCodegenFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyCodegenFilesUndefined: Self = StObject.set(x, "allowEmptyCodegenFiles", js.undefined)
      
      @scala.inline
      def setCreateExternalSymbolFactoryReexports(value: Boolean): Self = StObject.set(x, "createExternalSymbolFactoryReexports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateExternalSymbolFactoryReexportsUndefined: Self = StObject.set(x, "createExternalSymbolFactoryReexports", js.undefined)
      
      @scala.inline
      def setEnableIvy(value: Boolean | ngtsc): Self = StObject.set(x, "enableIvy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableIvyUndefined: Self = StObject.set(x, "enableIvy", js.undefined)
      
      @scala.inline
      def setEnableSummariesForJit(value: Boolean): Self = StObject.set(x, "enableSummariesForJit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSummariesForJitUndefined: Self = StObject.set(x, "enableSummariesForJit", js.undefined)
      
      @scala.inline
      def setFullTemplateTypeCheck(value: Boolean): Self = StObject.set(x, "fullTemplateTypeCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullTemplateTypeCheckUndefined: Self = StObject.set(x, "fullTemplateTypeCheck", js.undefined)
      
      @scala.inline
      def setI18nFormat(value: String): Self = StObject.set(x, "i18nFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nFormatUndefined: Self = StObject.set(x, "i18nFormat", js.undefined)
      
      @scala.inline
      def setI18nUseExternalIds(value: Boolean): Self = StObject.set(x, "i18nUseExternalIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nUseExternalIdsUndefined: Self = StObject.set(x, "i18nUseExternalIds", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMissingTranslation(value: MissingTranslationStrategy): Self = StObject.set(x, "missingTranslation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingTranslationUndefined: Self = StObject.set(x, "missingTranslation", js.undefined)
      
      @scala.inline
      def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
      
      @scala.inline
      def setStrictInjectionParameters(value: Boolean): Self = StObject.set(x, "strictInjectionParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictInjectionParametersUndefined: Self = StObject.set(x, "strictInjectionParameters", js.undefined)
      
      @scala.inline
      def setTranslations(value: String): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
