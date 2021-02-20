package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RendererStyleFlags2 extends StObject
@JSImport("@angular/core", "RendererStyleFlags2")
@js.native
object RendererStyleFlags2 extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RendererStyleFlags2 with Double] = js.native
  
  /**
    * Marks a style as using dash case naming (this-is-dash-case).
    */
  @js.native
  sealed trait DashCase extends RendererStyleFlags2
  /* 2 */ val DashCase: typings.angularCore.mod.RendererStyleFlags2.DashCase with Double = js.native
  
  /**
    * Marks a style as important.
    */
  @js.native
  sealed trait Important extends RendererStyleFlags2
  /* 1 */ val Important: typings.angularCore.mod.RendererStyleFlags2.Important with Double = js.native
}
