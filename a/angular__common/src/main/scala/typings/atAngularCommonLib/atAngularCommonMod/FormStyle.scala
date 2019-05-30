package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormStyle extends js.Object

@JSImport("@angular/common", "FormStyle")
@js.native
object FormStyle extends js.Object {
  @js.native
  sealed trait Format
    extends atAngularCommonLib.atAngularCommonMod.FormStyle
  
  @js.native
  sealed trait Standalone
    extends atAngularCommonLib.atAngularCommonMod.FormStyle
  
  /* 0 */ val Format: Format with scala.Double = js.native
  /* 1 */ val Standalone: Standalone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCommonLib.atAngularCommonMod.FormStyle with scala.Double] = js.native
}

