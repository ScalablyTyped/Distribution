package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeModifier extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "TypeModifier")
@js.native
object TypeModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeModifier with Double] = js.native
  
  @js.native
  sealed trait Const extends TypeModifier
  /* 0 */ val Const: typings.angularCompiler.outputAstMod.TypeModifier.Const with Double = js.native
}
