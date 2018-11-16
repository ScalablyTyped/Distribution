package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiaImageBias extends js.Object

/** The WiaImageBias enumeration helps specify what type of data the image is intended to represent. */
@JSGlobal("WIA.WiaImageBias")
@js.native
object WiaImageBias extends js.Object {
  @js.native
  sealed trait MaximizeQuality
    extends activexDashWiaLib.WIANs.WiaImageBias
  
  @js.native
  sealed trait MinimizeSize
    extends activexDashWiaLib.WIANs.WiaImageBias
  
  /* 131072 */ val MaximizeQuality: MaximizeQuality with scala.Double = js.native
  /* 65536 */ val MinimizeSize: MinimizeSize with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWiaLib.WIANs.WiaImageBias with scala.Double] = js.native
}

