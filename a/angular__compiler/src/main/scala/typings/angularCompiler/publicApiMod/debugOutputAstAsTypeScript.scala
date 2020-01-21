package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "debugOutputAstAsTypeScript")
@js.native
object debugOutputAstAsTypeScript extends js.Object {
  def apply(ast: js.Array[_]): String = js.native
  def apply(ast: typings.angularCompiler.outputAstMod.Expression): String = js.native
  def apply(ast: typings.angularCompiler.outputAstMod.Statement): String = js.native
  def apply(ast: typings.angularCompiler.outputAstMod.Type): String = js.native
}

