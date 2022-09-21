package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "KeyedWrite")
@js.native
open class KeyedWrite protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, receiver: AST, key: AST, value: AST) = this()
  
  var key: AST = js.native
  
  var receiver: AST = js.native
  
  var value: AST = js.native
}
