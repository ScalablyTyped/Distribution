package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuiltinVar extends js.Object
@JSImport("@angular/compiler/src/output/output_ast", "BuiltinVar")
@js.native
object BuiltinVar extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinVar with Double] = js.native
  
  @js.native
  sealed trait CatchError extends BuiltinVar
  /* 2 */ @js.native
  object CatchError extends TopLevel[CatchError with Double]
  
  @js.native
  sealed trait CatchStack extends BuiltinVar
  /* 3 */ @js.native
  object CatchStack extends TopLevel[CatchStack with Double]
  
  @js.native
  sealed trait Super extends BuiltinVar
  /* 1 */ @js.native
  object Super extends TopLevel[Super with Double]
  
  @js.native
  sealed trait This extends BuiltinVar
  /* 0 */ @js.native
  object This extends TopLevel[This with Double]
}
