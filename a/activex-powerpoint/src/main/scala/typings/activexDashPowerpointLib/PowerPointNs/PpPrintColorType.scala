package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpPrintColorType extends js.Object

@JSGlobal("PowerPoint.PpPrintColorType")
@js.native
object PpPrintColorType extends js.Object {
  @js.native
  sealed trait ppPrintBlackAndWhite
    extends activexDashPowerpointLib.PowerPointNs.PpPrintColorType
  
  @js.native
  sealed trait ppPrintColor
    extends activexDashPowerpointLib.PowerPointNs.PpPrintColorType
  
  @js.native
  sealed trait ppPrintPureBlackAndWhite
    extends activexDashPowerpointLib.PowerPointNs.PpPrintColorType
  
  /* 2 */ val ppPrintBlackAndWhite: ppPrintBlackAndWhite with scala.Double = js.native
  /* 1 */ val ppPrintColor: ppPrintColor with scala.Double = js.native
  /* 3 */ val ppPrintPureBlackAndWhite: ppPrintPureBlackAndWhite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpPrintColorType with scala.Double] = js.native
}

