package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "WrappedNodeExpr")
@js.native
open class WrappedNodeExpr[T] protected () extends Expression {
  def this(node: T) = this()
  def this(node: T, `type`: Type) = this()
  def this(node: T, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(node: T, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(node: T, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var node: T = js.native
}
