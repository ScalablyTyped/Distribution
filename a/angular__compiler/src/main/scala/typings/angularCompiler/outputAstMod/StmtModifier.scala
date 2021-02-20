package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StmtModifier extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "StmtModifier")
@js.native
object StmtModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StmtModifier with Double] = js.native
  
  @js.native
  sealed trait Exported extends StmtModifier
  /* 2 */ val Exported: typings.angularCompiler.outputAstMod.StmtModifier.Exported with Double = js.native
  
  @js.native
  sealed trait Final extends StmtModifier
  /* 0 */ val Final: typings.angularCompiler.outputAstMod.StmtModifier.Final with Double = js.native
  
  @js.native
  sealed trait Private extends StmtModifier
  /* 1 */ val Private: typings.angularCompiler.outputAstMod.StmtModifier.Private with Double = js.native
  
  @js.native
  sealed trait Static extends StmtModifier
  /* 3 */ val Static: typings.angularCompiler.outputAstMod.StmtModifier.Static with Double = js.native
}
