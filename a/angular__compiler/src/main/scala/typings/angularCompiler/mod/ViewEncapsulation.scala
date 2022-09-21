package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewEncapsulation extends StObject
@JSImport("@angular/compiler", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation & Double] = js.native
  
  @js.native
  sealed trait Emulated
    extends StObject
       with ViewEncapsulation
  /* 0 */ val Emulated: typings.angularCompiler.mod.ViewEncapsulation.Emulated & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ViewEncapsulation
  /* 2 */ val None: typings.angularCompiler.mod.ViewEncapsulation.None & Double = js.native
  
  @js.native
  sealed trait ShadowDom
    extends StObject
       with ViewEncapsulation
  /* 3 */ val ShadowDom: typings.angularCompiler.mod.ViewEncapsulation.ShadowDom & Double = js.native
}
