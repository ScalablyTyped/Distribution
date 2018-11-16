package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcReportSection extends js.Object

@JSGlobal("Access.AcReportSection")
@js.native
object AcReportSection extends js.Object {
  @js.native
  sealed trait acDetail
    extends activexDashAccessLib.AccessNs.AcReportSection
  
  @js.native
  sealed trait acFooter
    extends activexDashAccessLib.AccessNs.AcReportSection
  
  @js.native
  sealed trait acGroupLevel1Footer
    extends activexDashAccessLib.AccessNs.AcReportSection
  
  @js.native
  sealed trait acGroupLevel1Header
    extends activexDashAccessLib.AccessNs.AcReportSection
  
  @js.native
  sealed trait acGroupLevel2Footer
    extends activexDashAccessLib.AccessNs.AcReportSection
  
  @js.native
  sealed trait acGroupLevel2Header
    extends activexDashAccessLib.AccessNs.AcReportSection
  
  @js.native
  sealed trait acHeader
    extends activexDashAccessLib.AccessNs.AcReportSection
  
  @js.native
  sealed trait acPageFooter
    extends activexDashAccessLib.AccessNs.AcReportSection
  
  @js.native
  sealed trait acPageHeader
    extends activexDashAccessLib.AccessNs.AcReportSection
  
  /* 0 */ val acDetail: acDetail with scala.Double = js.native
  /* 2 */ val acFooter: acFooter with scala.Double = js.native
  /* 6 */ val acGroupLevel1Footer: acGroupLevel1Footer with scala.Double = js.native
  /* 5 */ val acGroupLevel1Header: acGroupLevel1Header with scala.Double = js.native
  /* 8 */ val acGroupLevel2Footer: acGroupLevel2Footer with scala.Double = js.native
  /* 7 */ val acGroupLevel2Header: acGroupLevel2Header with scala.Double = js.native
  /* 1 */ val acHeader: acHeader with scala.Double = js.native
  /* 4 */ val acPageFooter: acPageFooter with scala.Double = js.native
  /* 3 */ val acPageHeader: acPageHeader with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcReportSection with scala.Double] = js.native
}

