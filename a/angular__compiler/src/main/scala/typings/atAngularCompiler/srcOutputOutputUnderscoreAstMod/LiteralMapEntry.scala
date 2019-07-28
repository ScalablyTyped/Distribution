package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "LiteralMapEntry")
@js.native
class LiteralMapEntry protected () extends js.Object {
  def this(key: String, value: Expression, quoted: Boolean) = this()
  var key: String = js.native
  var quoted: Boolean = js.native
  var value: Expression = js.native
  def isEquivalent(e: LiteralMapEntry): Boolean = js.native
}

