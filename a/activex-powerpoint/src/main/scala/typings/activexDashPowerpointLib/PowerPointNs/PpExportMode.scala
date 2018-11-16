package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpExportMode extends js.Object

@JSGlobal("PowerPoint.PpExportMode")
@js.native
object PpExportMode extends js.Object {
  @js.native
  sealed trait ppClipRelativeToSlide
    extends activexDashPowerpointLib.PowerPointNs.PpExportMode
  
  @js.native
  sealed trait ppRelativeToSlide
    extends activexDashPowerpointLib.PowerPointNs.PpExportMode
  
  @js.native
  sealed trait ppScaleToFit
    extends activexDashPowerpointLib.PowerPointNs.PpExportMode
  
  @js.native
  sealed trait ppScaleXY
    extends activexDashPowerpointLib.PowerPointNs.PpExportMode
  
  /* 2 */ val ppClipRelativeToSlide: ppClipRelativeToSlide with scala.Double = js.native
  /* 1 */ val ppRelativeToSlide: ppRelativeToSlide with scala.Double = js.native
  /* 3 */ val ppScaleToFit: ppScaleToFit with scala.Double = js.native
  /* 4 */ val ppScaleXY: ppScaleXY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpExportMode with scala.Double] = js.native
}

