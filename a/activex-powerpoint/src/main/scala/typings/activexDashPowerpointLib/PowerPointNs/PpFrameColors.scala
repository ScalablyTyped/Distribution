package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpFrameColors extends js.Object

@JSGlobal("PowerPoint.PpFrameColors")
@js.native
object PpFrameColors extends js.Object {
  @js.native
  sealed trait ppFrameColorsBlackTextOnWhite
    extends activexDashPowerpointLib.PowerPointNs.PpFrameColors
  
  @js.native
  sealed trait ppFrameColorsBrowserColors
    extends activexDashPowerpointLib.PowerPointNs.PpFrameColors
  
  @js.native
  sealed trait ppFrameColorsPresentationSchemeAccentColor
    extends activexDashPowerpointLib.PowerPointNs.PpFrameColors
  
  @js.native
  sealed trait ppFrameColorsPresentationSchemeTextColor
    extends activexDashPowerpointLib.PowerPointNs.PpFrameColors
  
  @js.native
  sealed trait ppFrameColorsWhiteTextOnBlack
    extends activexDashPowerpointLib.PowerPointNs.PpFrameColors
  
  /* 5 */ val ppFrameColorsBlackTextOnWhite: ppFrameColorsBlackTextOnWhite with scala.Double = js.native
  /* 1 */ val ppFrameColorsBrowserColors: ppFrameColorsBrowserColors with scala.Double = js.native
  /* 3 */ val ppFrameColorsPresentationSchemeAccentColor: ppFrameColorsPresentationSchemeAccentColor with scala.Double = js.native
  /* 2 */ val ppFrameColorsPresentationSchemeTextColor: ppFrameColorsPresentationSchemeTextColor with scala.Double = js.native
  /* 4 */ val ppFrameColorsWhiteTextOnBlack: ppFrameColorsWhiteTextOnBlack with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpFrameColors with scala.Double] = js.native
}

