package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ReadKeyExpr")
@js.native
open class ReadKeyExpr protected () extends Expression {
  def this(receiver: Expression, index: Expression) = this()
  def this(receiver: Expression, index: Expression, `type`: Type) = this()
  def this(receiver: Expression, index: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(receiver: Expression, index: Expression, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(receiver: Expression, index: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var index: Expression = js.native
  
  var receiver: Expression = js.native
  
  def set(value: Expression): WriteKeyExpr = js.native
}
