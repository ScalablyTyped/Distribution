package typings.angularCompiler.compilerMod

import typings.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "BuiltinType")
@js.native
class BuiltinType protected ()
  extends typings.angularCompiler.publicApiMod.BuiltinType {
  def this(name: typings.angularCompiler.outputAstMod.BuiltinTypeName) = this()
  def this(name: typings.angularCompiler.outputAstMod.BuiltinTypeName, modifiers: js.Array[TypeModifier]) = this()
}

