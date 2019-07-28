package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeModifier extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "TypeModifier")
@js.native
object TypeModifier extends js.Object {
  @js.native
  sealed trait Const extends TypeModifier
  
  /* 0 */ val Const: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.TypeModifier.Const with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeModifier with Double] = js.native
}

