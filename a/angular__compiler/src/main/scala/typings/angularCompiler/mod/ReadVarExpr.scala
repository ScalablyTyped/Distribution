package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ReadVarExpr")
@js.native
open class ReadVarExpr protected () extends Expression {
  def this(name: String) = this()
  def this(name: String, `type`: Type) = this()
  def this(name: String, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var name: String = js.native
  
  def set(value: Expression): WriteVarExpr = js.native
}
