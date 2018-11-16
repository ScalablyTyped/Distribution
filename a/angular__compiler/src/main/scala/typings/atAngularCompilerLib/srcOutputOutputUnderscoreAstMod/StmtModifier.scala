package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StmtModifier extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "StmtModifier")
@js.native
object StmtModifier extends js.Object {
  @js.native
  sealed trait Exported
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.StmtModifier
  
  @js.native
  sealed trait Final
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.StmtModifier
  
  @js.native
  sealed trait Private
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.StmtModifier
  
  @js.native
  sealed trait Static
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.StmtModifier
  
  /* 2 */ val Exported: Exported with scala.Double = js.native
  /* 0 */ val Final: Final with scala.Double = js.native
  /* 1 */ val Private: Private with scala.Double = js.native
  /* 3 */ val Static: Static with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.StmtModifier with scala.Double
  ] = js.native
}

