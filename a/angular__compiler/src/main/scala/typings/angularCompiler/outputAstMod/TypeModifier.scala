package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeModifier extends js.Object
@JSImport("@angular/compiler/src/output/output_ast", "TypeModifier")
@js.native
object TypeModifier extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeModifier with Double] = js.native
  
  @js.native
  sealed trait Const extends TypeModifier
  /* 0 */ @js.native
  object Const extends TopLevel[Const with Double]
}
