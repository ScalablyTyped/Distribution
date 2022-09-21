package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeModifier extends StObject
@JSImport("@angular/compiler", "TypeModifier")
@js.native
object TypeModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeModifier & Double] = js.native
  
  @js.native
  sealed trait Const
    extends StObject
       with TypeModifier
  /* 1 */ val Const: typings.angularCompiler.mod.TypeModifier.Const & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TypeModifier
  /* 0 */ val None: typings.angularCompiler.mod.TypeModifier.None & Double = js.native
}
