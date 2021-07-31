package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewEncapsulation extends StObject
@JSImport("@angular/compiler/src/compiler_facade_interface", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation & Double] = js.native
  
  @js.native
  sealed trait Emulated
    extends StObject
       with ViewEncapsulation
  /* 0 */ val Emulated: typings.angularCompiler.compilerFacadeInterfaceMod.ViewEncapsulation.Emulated & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ViewEncapsulation
  /* 2 */ val None: typings.angularCompiler.compilerFacadeInterfaceMod.ViewEncapsulation.None & Double = js.native
  
  @js.native
  sealed trait ShadowDom
    extends StObject
       with ViewEncapsulation
  /* 3 */ val ShadowDom: typings.angularCompiler.compilerFacadeInterfaceMod.ViewEncapsulation.ShadowDom & Double = js.native
}
