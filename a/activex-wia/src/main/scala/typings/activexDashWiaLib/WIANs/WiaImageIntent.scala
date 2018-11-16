package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiaImageIntent extends js.Object

/** The WiaImageIntent enumeration helps specify what type of data the image is intended to represent. */
@JSGlobal("WIA.WiaImageIntent")
@js.native
object WiaImageIntent extends js.Object {
  @js.native
  sealed trait ColorIntent
    extends activexDashWiaLib.WIANs.WiaImageIntent
  
  @js.native
  sealed trait GrayscaleIntent
    extends activexDashWiaLib.WIANs.WiaImageIntent
  
  @js.native
  sealed trait TextIntent
    extends activexDashWiaLib.WIANs.WiaImageIntent
  
  @js.native
  sealed trait UnspecifiedIntent
    extends activexDashWiaLib.WIANs.WiaImageIntent
  
  /* 1 */ val ColorIntent: ColorIntent with scala.Double = js.native
  /* 2 */ val GrayscaleIntent: GrayscaleIntent with scala.Double = js.native
  /* 4 */ val TextIntent: TextIntent with scala.Double = js.native
  /* 0 */ val UnspecifiedIntent: UnspecifiedIntent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWiaLib.WIANs.WiaImageIntent with scala.Double] = js.native
}

