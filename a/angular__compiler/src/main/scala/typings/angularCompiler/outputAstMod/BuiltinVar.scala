package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinVar extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinVar")
@js.native
object BuiltinVar extends js.Object {
  @js.native
  sealed trait CatchError extends BuiltinVar
  
  @js.native
  sealed trait CatchStack extends BuiltinVar
  
  @js.native
  sealed trait Super extends BuiltinVar
  
  @js.native
  sealed trait This extends BuiltinVar
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinVar with Double] = js.native
  /* 2 */ @js.native
  object CatchError extends TopLevel[CatchError with Double]
  
  /* 3 */ @js.native
  object CatchStack extends TopLevel[CatchStack with Double]
  
  /* 1 */ @js.native
  object Super extends TopLevel[Super with Double]
  
  /* 0 */ @js.native
  object This extends TopLevel[This with Double]
  
}

