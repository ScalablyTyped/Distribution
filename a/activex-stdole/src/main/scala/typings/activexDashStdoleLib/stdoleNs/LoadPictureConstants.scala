package typings
package activexDashStdoleLib.stdoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoadPictureConstants extends js.Object

@JSGlobal("stdole.LoadPictureConstants")
@js.native
object LoadPictureConstants extends js.Object {
  @js.native
  sealed trait Color
    extends activexDashStdoleLib.stdoleNs.LoadPictureConstants
  
  @js.native
  sealed trait Default
    extends activexDashStdoleLib.stdoleNs.LoadPictureConstants
  
  @js.native
  sealed trait Monochrome
    extends activexDashStdoleLib.stdoleNs.LoadPictureConstants
  
  @js.native
  sealed trait VgaColor
    extends activexDashStdoleLib.stdoleNs.LoadPictureConstants
  
  /* 4 */ val Color: Color with scala.Double = js.native
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val Monochrome: Monochrome with scala.Double = js.native
  /* 2 */ val VgaColor: VgaColor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashStdoleLib.stdoleNs.LoadPictureConstants with scala.Double] = js.native
}

