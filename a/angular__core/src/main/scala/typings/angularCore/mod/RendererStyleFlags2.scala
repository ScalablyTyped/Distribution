package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RendererStyleFlags2 extends StObject
@JSImport("@angular/core", "RendererStyleFlags2")
@js.native
object RendererStyleFlags2 extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RendererStyleFlags2 & Double] = js.native
  
  /**
    * Marks a style as using dash case naming (this-is-dash-case).
    */
  @js.native
  sealed trait DashCase
    extends StObject
       with RendererStyleFlags2
  /* 2 */ val DashCase: typings.angularCore.mod.RendererStyleFlags2.DashCase & Double = js.native
  
  /**
    * Marks a style as important.
    */
  @js.native
  sealed trait Important
    extends StObject
       with RendererStyleFlags2
  /* 1 */ val Important: typings.angularCore.mod.RendererStyleFlags2.Important & Double = js.native
}
