package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpPrintRangeType extends js.Object

@JSGlobal("PowerPoint.PpPrintRangeType")
@js.native
object PpPrintRangeType extends js.Object {
  @js.native
  sealed trait ppPrintAll
    extends activexDashPowerpointLib.PowerPointNs.PpPrintRangeType
  
  @js.native
  sealed trait ppPrintCurrent
    extends activexDashPowerpointLib.PowerPointNs.PpPrintRangeType
  
  @js.native
  sealed trait ppPrintNamedSlideShow
    extends activexDashPowerpointLib.PowerPointNs.PpPrintRangeType
  
  @js.native
  sealed trait ppPrintSection
    extends activexDashPowerpointLib.PowerPointNs.PpPrintRangeType
  
  @js.native
  sealed trait ppPrintSelection
    extends activexDashPowerpointLib.PowerPointNs.PpPrintRangeType
  
  @js.native
  sealed trait ppPrintSlideRange
    extends activexDashPowerpointLib.PowerPointNs.PpPrintRangeType
  
  /* 1 */ val ppPrintAll: ppPrintAll with scala.Double = js.native
  /* 3 */ val ppPrintCurrent: ppPrintCurrent with scala.Double = js.native
  /* 5 */ val ppPrintNamedSlideShow: ppPrintNamedSlideShow with scala.Double = js.native
  /* 6 */ val ppPrintSection: ppPrintSection with scala.Double = js.native
  /* 2 */ val ppPrintSelection: ppPrintSelection with scala.Double = js.native
  /* 4 */ val ppPrintSlideRange: ppPrintSlideRange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpPrintRangeType with scala.Double] = js.native
}

