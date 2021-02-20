package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
import typings.angularCompiler.coreMod.ViewEncapsulation
import typings.angularCompiler.mlParserParserMod.ParseTreeResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animations extends StObject {
  
  var animations: js.Array[_] = js.native
  
  var encapsulation: ViewEncapsulation | Null = js.native
  
  var externalStylesheets: js.Array[CompileStylesheetMetadata] = js.native
  
  var htmlAst: ParseTreeResult | Null = js.native
  
  var interpolation: (js.Tuple2[String, String]) | Null = js.native
  
  var isInline: Boolean = js.native
  
  var ngContentSelectors: js.Array[String] = js.native
  
  var preserveWhitespaces: Boolean = js.native
  
  var styleUrls: js.Array[String] = js.native
  
  var styles: js.Array[String] = js.native
  
  var template: String | Null = js.native
  
  var templateUrl: String | Null = js.native
}
object Animations {
  
  @scala.inline
  def apply(
    animations: js.Array[_],
    externalStylesheets: js.Array[CompileStylesheetMetadata],
    isInline: Boolean,
    ngContentSelectors: js.Array[String],
    preserveWhitespaces: Boolean,
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): Animations = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], externalStylesheets = externalStylesheets.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animations]
  }
  
  @scala.inline
  implicit class AnimationsMutableBuilder[Self <: Animations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: js.Array[_]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsVarargs(value: js.Any*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncapsulationNull: Self = StObject.set(x, "encapsulation", null)
    
    @scala.inline
    def setExternalStylesheets(value: js.Array[CompileStylesheetMetadata]): Self = StObject.set(x, "externalStylesheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalStylesheetsVarargs(value: CompileStylesheetMetadata*): Self = StObject.set(x, "externalStylesheets", js.Array(value :_*))
    
    @scala.inline
    def setHtmlAst(value: ParseTreeResult): Self = StObject.set(x, "htmlAst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlAstNull: Self = StObject.set(x, "htmlAst", null)
    
    @scala.inline
    def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationNull: Self = StObject.set(x, "interpolation", null)
    
    @scala.inline
    def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value :_*))
    
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
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
