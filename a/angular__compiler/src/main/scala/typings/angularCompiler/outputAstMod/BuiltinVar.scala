package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuiltinVar extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "BuiltinVar")
@js.native
object BuiltinVar extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinVar & Double] = js.native
  
  @js.native
  sealed trait CatchError
    extends StObject
       with BuiltinVar
  /* 2 */ val CatchError: typings.angularCompiler.outputAstMod.BuiltinVar.CatchError & Double = js.native
  
  @js.native
  sealed trait CatchStack
    extends StObject
       with BuiltinVar
  /* 3 */ val CatchStack: typings.angularCompiler.outputAstMod.BuiltinVar.CatchStack & Double = js.native
  
  @js.native
  sealed trait Super
    extends StObject
       with BuiltinVar
  /* 1 */ val Super: typings.angularCompiler.outputAstMod.BuiltinVar.Super & Double = js.native
  
  @js.native
  sealed trait This
    extends StObject
       with BuiltinVar
  /* 0 */ val This: typings.angularCompiler.outputAstMod.BuiltinVar.This & Double = js.native
}
