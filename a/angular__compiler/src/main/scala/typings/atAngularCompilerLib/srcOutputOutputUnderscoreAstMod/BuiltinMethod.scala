package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinMethod extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinMethod")
@js.native
object BuiltinMethod extends js.Object {
  @js.native
  sealed trait Bind
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinMethod
  
  @js.native
  sealed trait ConcatArray
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinMethod
  
  @js.native
  sealed trait SubscribeObservable
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinMethod
  
  /* 2 */ val Bind: Bind with scala.Double = js.native
  /* 0 */ val ConcatArray: ConcatArray with scala.Double = js.native
  /* 1 */ val SubscribeObservable: SubscribeObservable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinMethod with scala.Double
  ] = js.native
}

