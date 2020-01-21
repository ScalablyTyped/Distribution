package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ArrayType")
@js.native
class ArrayType protected () extends Type {
  def this(of: Type) = this()
  def this(of: Type, modifiers: js.Array[TypeModifier]) = this()
  var of: Type = js.native
}

