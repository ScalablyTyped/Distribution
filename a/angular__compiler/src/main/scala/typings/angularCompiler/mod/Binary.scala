package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Binary")
@js.native
open class Binary protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, operation: String, left: AST, right: AST) = this()
  
  var left: AST = js.native
  
  var operation: String = js.native
  
  var right: AST = js.native
}
