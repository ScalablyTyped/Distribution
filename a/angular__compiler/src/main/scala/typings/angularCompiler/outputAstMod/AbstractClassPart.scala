package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "AbstractClassPart")
@js.native
class AbstractClassPart () extends js.Object {
  def this(`type`: Type) = this()
  def this(`type`: js.UndefOr[scala.Nothing], modifiers: js.Array[StmtModifier]) = this()
  def this(`type`: Null, modifiers: js.Array[StmtModifier]) = this()
  def this(`type`: Type, modifiers: js.Array[StmtModifier]) = this()
  
  def hasModifier(modifier: StmtModifier): Boolean = js.native
  
  var modifiers: js.Array[StmtModifier] = js.native
  
  var `type`: Type | Null = js.native
}
