package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier.Exported
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier.Final
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier.Private
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier.Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StmtModifier extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "StmtModifier")
@js.native
object StmtModifier extends js.Object {
  @js.native
  sealed trait Exported extends StmtModifier
  
  @js.native
  sealed trait Final extends StmtModifier
  
  @js.native
  sealed trait Private extends StmtModifier
  
  @js.native
  sealed trait Static extends StmtModifier
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StmtModifier with Double] = js.native
  /* 2 */ @js.native
  object Exported extends TopLevel[Exported with Double]
  
  /* 0 */ @js.native
  object Final extends TopLevel[Final with Double]
  
  /* 1 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  /* 3 */ @js.native
  object Static extends TopLevel[Static with Double]
  
}

