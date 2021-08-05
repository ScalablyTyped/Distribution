package typings.angularCompiler

import typings.angularCompiler.bindingParserMod.BindingParser
import typings.angularCompiler.mlParserAstMod.Node
import typings.angularCompiler.srcParseUtilMod.ParseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object r3TemplateTransformMod {
  
  @JSImport("@angular/compiler/src/render3/r3_template_transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def htmlAstToRender3Ast(htmlNodes: js.Array[Node], bindingParser: BindingParser): Render3ParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlAstToRender3Ast")(htmlNodes.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[Render3ParseResult]
  
  trait Render3ParseResult extends StObject {
    
    var errors: js.Array[ParseError]
    
    var ngContentSelectors: js.Array[String]
    
    var nodes: js.Array[typings.angularCompiler.r3AstMod.Node]
    
    var styleUrls: js.Array[String]
    
    var styles: js.Array[String]
  }
  object Render3ParseResult {
    
    inline def apply(
      errors: js.Array[ParseError],
      ngContentSelectors: js.Array[String],
      nodes: js.Array[typings.angularCompiler.r3AstMod.Node],
      styleUrls: js.Array[String],
      styles: js.Array[String]
    ): Render3ParseResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Render3ParseResult]
    }
    
    extension [Self <: Render3ParseResult](x: Self) {
      
      inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
      
      inline def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value :_*))
      
      inline def setNodes(value: js.Array[typings.angularCompiler.r3AstMod.Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: typings.angularCompiler.r3AstMod.Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      inline def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
      
      inline def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value :_*))
      
      inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
}
