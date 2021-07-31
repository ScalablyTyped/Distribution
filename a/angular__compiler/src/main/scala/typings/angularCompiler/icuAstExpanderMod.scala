package typings.angularCompiler

import typings.angularCompiler.mlParserAstMod.Node
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icuAstExpanderMod {
  
  @JSImport("@angular/compiler/src/ml_parser/icu_ast_expander", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/icu_ast_expander", "ExpansionError")
  @js.native
  class ExpansionError protected () extends ParseError {
    def this(span: ParseSourceSpan, errorMsg: String) = this()
  }
  
  @JSImport("@angular/compiler/src/ml_parser/icu_ast_expander", "ExpansionResult")
  @js.native
  class ExpansionResult protected () extends StObject {
    def this(nodes: js.Array[Node], expanded: Boolean, errors: js.Array[ParseError]) = this()
    
    var errors: js.Array[ParseError] = js.native
    
    var expanded: Boolean = js.native
    
    var nodes: js.Array[Node] = js.native
  }
  
  @scala.inline
  def expandNodes(nodes: js.Array[Node]): ExpansionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("expandNodes")(nodes.asInstanceOf[js.Any]).asInstanceOf[ExpansionResult]
}
