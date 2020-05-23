package typings.angularCompiler.outputAstMod

import typings.angularCompiler.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "literalMap")
@js.native
object literalMap extends js.Object {
  def apply(values: js.Array[Key]): LiteralMapExpr = js.native
  def apply(values: js.Array[Key], `type`: MapType): LiteralMapExpr = js.native
}

