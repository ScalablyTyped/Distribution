package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeModifier extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "TypeModifier")
@js.native
object TypeModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeModifier & Double] = js.native
  
  @js.native
  sealed trait Const
    extends StObject
       with TypeModifier
  /* 0 */ val Const: typings.angularCompiler.outputAstMod.TypeModifier.Const & Double = js.native
}
