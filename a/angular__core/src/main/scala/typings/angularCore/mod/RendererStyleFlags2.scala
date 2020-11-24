package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RendererStyleFlags2 extends js.Object
@JSImport("@angular/core", "RendererStyleFlags2")
@js.native
object RendererStyleFlags2 extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RendererStyleFlags2 with Double] = js.native
  
  /**
    * Marks a style as using dash case naming (this-is-dash-case).
    */
  @js.native
  sealed trait DashCase extends RendererStyleFlags2
  /* 2 */ @js.native
  object DashCase extends TopLevel[DashCase with Double]
  
  /**
    * Marks a style as important.
    */
  @js.native
  sealed trait Important extends RendererStyleFlags2
  /* 1 */ @js.native
  object Important extends TopLevel[Important with Double]
}
