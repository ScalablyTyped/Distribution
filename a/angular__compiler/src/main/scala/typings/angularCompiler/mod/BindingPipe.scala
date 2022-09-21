package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "BindingPipe")
@js.native
open class BindingPipe protected () extends ASTWithName {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    exp: AST,
    name: String,
    args: js.Array[Any],
    nameSpan: AbsoluteSourceSpan
  ) = this()
  
  var args: js.Array[Any] = js.native
  
  var exp: AST = js.native
  
  var name: String = js.native
}
