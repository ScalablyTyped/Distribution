package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuiltinMethod extends js.Object
@JSImport("@angular/compiler/src/output/output_ast", "BuiltinMethod")
@js.native
object BuiltinMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinMethod with Double] = js.native
  
  @js.native
  sealed trait Bind extends BuiltinMethod
  /* 2 */ @js.native
  object Bind extends TopLevel[Bind with Double]
  
  @js.native
  sealed trait ConcatArray extends BuiltinMethod
  /* 0 */ @js.native
  object ConcatArray extends TopLevel[ConcatArray with Double]
  
  @js.native
  sealed trait SubscribeObservable extends BuiltinMethod
  /* 1 */ @js.native
  object SubscribeObservable extends TopLevel[SubscribeObservable with Double]
}
