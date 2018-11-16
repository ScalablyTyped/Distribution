package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "AbstractClassPart")
@js.native
class AbstractClassPart () extends js.Object {
  def this(`type`: Type) = this()
  def this(`type`: Type, modifiers: js.Array[StmtModifier]) = this()
  def this(`type`: js.UndefOr[scala.Nothing], modifiers: js.Array[StmtModifier]) = this()
  def this(`type`: scala.Null, modifiers: js.Array[StmtModifier]) = this()
  var modifiers: js.Array[StmtModifier] | scala.Null = js.native
  var `type`: Type | scala.Null = js.native
  def hasModifier(modifier: StmtModifier): scala.Boolean = js.native
}

