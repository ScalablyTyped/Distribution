package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuiltinVar extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "BuiltinVar")
@js.native
object BuiltinVar extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinVar with Double] = js.native
  
  @js.native
  sealed trait CatchError extends BuiltinVar
  /* 2 */ val CatchError: typings.angularCompiler.outputAstMod.BuiltinVar.CatchError with Double = js.native
  
  @js.native
  sealed trait CatchStack extends BuiltinVar
  /* 3 */ val CatchStack: typings.angularCompiler.outputAstMod.BuiltinVar.CatchStack with Double = js.native
  
  @js.native
  sealed trait Super extends BuiltinVar
  /* 1 */ val Super: typings.angularCompiler.outputAstMod.BuiltinVar.Super with Double = js.native
  
  @js.native
  sealed trait This extends BuiltinVar
  /* 0 */ val This: typings.angularCompiler.outputAstMod.BuiltinVar.This with Double = js.native
}
