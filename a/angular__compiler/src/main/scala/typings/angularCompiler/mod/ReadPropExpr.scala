package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ReadPropExpr")
@js.native
open class ReadPropExpr protected () extends Expression {
  def this(receiver: Expression, name: String) = this()
  def this(receiver: Expression, name: String, `type`: Type) = this()
  def this(receiver: Expression, name: String, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(receiver: Expression, name: String, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(receiver: Expression, name: String, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var name: String = js.native
  
  var receiver: Expression = js.native
  
  def set(value: Expression): WritePropExpr = js.native
}
