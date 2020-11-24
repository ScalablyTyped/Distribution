package typings.angularCompiler

import typings.angularCompiler.mlParserAstMod.Node
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/icu_ast_expander", JSImport.Namespace)
@js.native
object icuAstExpanderMod extends js.Object {
  
  def expandNodes(nodes: js.Array[Node]): ExpansionResult = js.native
  
  @js.native
  class ExpansionError protected () extends ParseError {
    def this(span: ParseSourceSpan, errorMsg: String) = this()
  }
  
  @js.native
  class ExpansionResult protected () extends js.Object {
    def this(nodes: js.Array[Node], expanded: Boolean, errors: js.Array[ParseError]) = this()
    
    var errors: js.Array[ParseError] = js.native
    
    var expanded: Boolean = js.native
    
    var nodes: js.Array[Node] = js.native
  }
}
