package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.SectionPageBreakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.report.SectionPageBreak.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.SectionPageBreakNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.SectionPageBreakNs.Constants
  
  @js.native
  sealed trait SECTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.SectionPageBreakNs.Constants
  
  /* 2 */ val AUTO: AUTO with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val SECTION: SECTION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.SectionPageBreakNs.Constants with scala.Double
  ] = js.native
}

