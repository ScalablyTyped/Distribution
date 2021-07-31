package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompileTemplateMetadata
import typings.angularCompiler.configMod.CompilerConfig
import typings.angularCompiler.coreMod.ViewEncapsulation
import typings.angularCompiler.htmlParserMod.HtmlParser
import typings.angularCompiler.resourceLoaderMod.ResourceLoader
import typings.angularCompiler.srcUtilMod.SyncAsync
import typings.angularCompiler.urlResolverMod.UrlResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directiveNormalizerMod {
  
  @JSImport("@angular/compiler/src/directive_normalizer", "DirectiveNormalizer")
  @js.native
  class DirectiveNormalizer protected () extends StObject {
    def this(
      _resourceLoader: ResourceLoader,
      _urlResolver: UrlResolver,
      _htmlParser: HtmlParser,
      _config: CompilerConfig
    ) = this()
    
    var _config: js.Any = js.native
    
    var _fetch: js.Any = js.native
    
    var _htmlParser: js.Any = js.native
    
    var _inlineStyles: js.Any = js.native
    
    var _loadMissingExternalStylesheets: js.Any = js.native
    
    var _normalizeLoadedTemplateMetadata: js.Any = js.native
    
    var _normalizeStylesheet: js.Any = js.native
    
    var _normalizeTemplateMetadata: js.Any = js.native
    
    var _preParseTemplate: js.Any = js.native
    
    var _preparseLoadedTemplate: js.Any = js.native
    
    var _resourceLoader: js.Any = js.native
    
    var _resourceLoaderCache: js.Any = js.native
    
    var _urlResolver: js.Any = js.native
    
    def clearCache(): Unit = js.native
    
    def clearCacheFor(normalizedDirective: CompileDirectiveMetadata): Unit = js.native
    
    def normalizeTemplate(prenormData: PrenormalizedTemplateMetadata): SyncAsync[CompileTemplateMetadata] = js.native
  }
  
  trait PrenormalizedTemplateMetadata extends StObject {
    
    var animations: js.Array[js.Any]
    
    var componentType: js.Any
    
    var encapsulation: ViewEncapsulation | Null
    
    var interpolation: (js.Tuple2[String, String]) | Null
    
    var moduleUrl: String
    
    var ngModuleType: js.Any
    
    var preserveWhitespaces: Boolean | Null
    
    var styleUrls: js.Array[String]
    
    var styles: js.Array[String]
    
    var template: String | Null
    
    var templateUrl: String | Null
  }
  object PrenormalizedTemplateMetadata {
    
    @scala.inline
    def apply(
      animations: js.Array[js.Any],
      componentType: js.Any,
      moduleUrl: String,
      ngModuleType: js.Any,
      styleUrls: js.Array[String],
      styles: js.Array[String]
    ): PrenormalizedTemplateMetadata = {
      val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], moduleUrl = moduleUrl.asInstanceOf[js.Any], ngModuleType = ngModuleType.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], encapsulation = null, interpolation = null, preserveWhitespaces = null, template = null, templateUrl = null)
      __obj.asInstanceOf[PrenormalizedTemplateMetadata]
    }
    
    @scala.inline
    implicit class PrenormalizedTemplateMetadataMutableBuilder[Self <: PrenormalizedTemplateMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimations(value: js.Array[js.Any]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationsVarargs(value: js.Any*): Self = StObject.set(x, "animations", js.Array(value :_*))
      
      @scala.inline
      def setComponentType(value: js.Any): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncapsulationNull: Self = StObject.set(x, "encapsulation", null)
      
      @scala.inline
      def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolationNull: Self = StObject.set(x, "interpolation", null)
      
      @scala.inline
      def setModuleUrl(value: String): Self = StObject.set(x, "moduleUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgModuleType(value: js.Any): Self = StObject.set(x, "ngModuleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespacesNull: Self = StObject.set(x, "preserveWhitespaces", null)
      
      @scala.inline
      def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateNull: Self = StObject.set(x, "template", null)
      
      @scala.inline
      def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrlNull: Self = StObject.set(x, "templateUrl", null)
    }
  }
}
