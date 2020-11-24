package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StmtModifier extends js.Object
@JSImport("@angular/compiler/src/output/output_ast", "StmtModifier")
@js.native
object StmtModifier extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StmtModifier with Double] = js.native
  
  @js.native
  sealed trait Exported extends StmtModifier
  /* 2 */ @js.native
  object Exported extends TopLevel[Exported with Double]
  
  @js.native
  sealed trait Final extends StmtModifier
  /* 0 */ @js.native
  object Final extends TopLevel[Final with Double]
  
  @js.native
  sealed trait Private extends StmtModifier
  /* 1 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  @js.native
  sealed trait Static extends StmtModifier
  /* 3 */ @js.native
  object Static extends TopLevel[Static with Double]
}
