package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinVar extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinVar")
@js.native
object BuiltinVar extends js.Object {
  @js.native
  sealed trait CatchError
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinVar
  
  @js.native
  sealed trait CatchStack
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinVar
  
  @js.native
  sealed trait Super
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinVar
  
  @js.native
  sealed trait This
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinVar
  
  /* 2 */ val CatchError: CatchError with scala.Double = js.native
  /* 3 */ val CatchStack: CatchStack with scala.Double = js.native
  /* 1 */ val Super: Super with scala.Double = js.native
  /* 0 */ val This: This with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinVar with scala.Double
  ] = js.native
}

