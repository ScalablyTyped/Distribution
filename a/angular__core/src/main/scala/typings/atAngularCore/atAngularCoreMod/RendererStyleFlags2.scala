package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RendererStyleFlags2 extends js.Object

@JSImport("@angular/core", "RendererStyleFlags2")
@js.native
object RendererStyleFlags2 extends js.Object {
  /**
    * Marks a style as using dash case naming (this-is-dash-case).
    */
  @js.native
  sealed trait DashCase extends RendererStyleFlags2
  
  /**
    * Marks a style as important.
    */
  @js.native
  sealed trait Important extends RendererStyleFlags2
  
  /* 2 */ val DashCase: typings.atAngularCore.atAngularCoreMod.RendererStyleFlags2.DashCase with Double = js.native
  /* 1 */ val Important: typings.atAngularCore.atAngularCoreMod.RendererStyleFlags2.Important with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RendererStyleFlags2 with Double] = js.native
}

