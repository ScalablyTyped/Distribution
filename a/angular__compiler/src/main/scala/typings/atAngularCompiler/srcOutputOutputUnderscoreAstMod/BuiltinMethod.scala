package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinMethod extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinMethod")
@js.native
object BuiltinMethod extends js.Object {
  @js.native
  sealed trait Bind extends BuiltinMethod
  
  @js.native
  sealed trait ConcatArray extends BuiltinMethod
  
  @js.native
  sealed trait SubscribeObservable extends BuiltinMethod
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinMethod with Double] = js.native
  /* 2 */ @js.native
  object Bind extends TopLevel[Bind with Double]
  
  /* 0 */ @js.native
  object ConcatArray extends TopLevel[ConcatArray with Double]
  
  /* 1 */ @js.native
  object SubscribeObservable extends TopLevel[SubscribeObservable with Double]
  
}

