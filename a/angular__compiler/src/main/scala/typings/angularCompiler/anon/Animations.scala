package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
import typings.angularCompiler.coreMod.ViewEncapsulation
import typings.angularCompiler.mlParserParserMod.ParseTreeResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animations extends StObject {
  
  var animations: js.Array[js.Any]
  
  var encapsulation: ViewEncapsulation | Null
  
  var externalStylesheets: js.Array[CompileStylesheetMetadata]
  
  var htmlAst: ParseTreeResult | Null
  
  var interpolation: (js.Tuple2[String, String]) | Null
  
  var isInline: Boolean
  
  var ngContentSelectors: js.Array[String]
  
  var preserveWhitespaces: Boolean
  
  var styleUrls: js.Array[String]
  
  var styles: js.Array[String]
  
  var template: String | Null
  
  var templateUrl: String | Null
}
object Animations {
  
  inline def apply(
    animations: js.Array[js.Any],
    externalStylesheets: js.Array[CompileStylesheetMetadata],
    isInline: Boolean,
    ngContentSelectors: js.Array[String],
    preserveWhitespaces: Boolean,
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): Animations = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], externalStylesheets = externalStylesheets.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], encapsulation = null, htmlAst = null, interpolation = null, template = null, templateUrl = null)
    __obj.asInstanceOf[Animations]
  }
  
  extension [Self <: Animations](x: Self) {
    
    inline def setAnimations(value: js.Array[js.Any]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsVarargs(value: js.Any*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationNull: Self = StObject.set(x, "encapsulation", null)
    
    inline def setExternalStylesheets(value: js.Array[CompileStylesheetMetadata]): Self = StObject.set(x, "externalStylesheets", value.asInstanceOf[js.Any])
    
    inline def setExternalStylesheetsVarargs(value: CompileStylesheetMetadata*): Self = StObject.set(x, "externalStylesheets", js.Array(value :_*))
    
    inline def setHtmlAst(value: ParseTreeResult): Self = StObject.set(x, "htmlAst", value.asInstanceOf[js.Any])
    
    inline def setHtmlAstNull: Self = StObject.set(x, "htmlAst", null)
    
    inline def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationNull: Self = StObject.set(x, "interpolation", null)
    
    inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    inline def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
    
    inline def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value :_*))
    
    inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value :_*))
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlNull: Self = StObject.set(x, "templateUrl", null)
  }
}
