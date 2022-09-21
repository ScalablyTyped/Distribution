package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "LiteralArray")
@js.native
open class LiteralArray protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expressions: js.Array[Any]) = this()
  
  var expressions: js.Array[Any] = js.native
}
