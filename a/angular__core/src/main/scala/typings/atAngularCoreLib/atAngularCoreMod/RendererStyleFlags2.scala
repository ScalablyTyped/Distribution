package typings
package atAngularCoreLib.atAngularCoreMod

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
  sealed trait DashCase
    extends atAngularCoreLib.atAngularCoreMod.RendererStyleFlags2
  
  /**
    * Marks a style as important.
    */
  @js.native
  sealed trait Important
    extends atAngularCoreLib.atAngularCoreMod.RendererStyleFlags2
  
  /* 2 */ val DashCase: DashCase with scala.Double = js.native
  /* 1 */ val Important: Important with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.atAngularCoreMod.RendererStyleFlags2 with scala.Double] = js.native
}

