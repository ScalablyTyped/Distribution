package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinType")
@js.native
class BuiltinType protected () extends Type {
  def this(name: BuiltinTypeName) = this()
  def this(name: BuiltinTypeName, modifiers: js.Array[TypeModifier]) = this()
  var name: BuiltinTypeName = js.native
}

