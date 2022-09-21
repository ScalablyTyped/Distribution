package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ExpressionType")
@js.native
open class ExpressionType protected () extends Type {
  def this(value: Expression) = this()
  def this(value: Expression, modifiers: TypeModifier) = this()
  def this(value: Expression, modifiers: Unit, typeParams: js.Array[Type]) = this()
  def this(value: Expression, modifiers: TypeModifier, typeParams: js.Array[Type]) = this()
  
  var typeParams: js.Array[Type] | Null = js.native
  
  var value: Expression = js.native
}
