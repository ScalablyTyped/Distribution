package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "KeyedRead")
@js.native
class KeyedRead protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, obj: AST, key: AST) = this()
  
  var key: AST = js.native
  
  var obj: AST = js.native
}
