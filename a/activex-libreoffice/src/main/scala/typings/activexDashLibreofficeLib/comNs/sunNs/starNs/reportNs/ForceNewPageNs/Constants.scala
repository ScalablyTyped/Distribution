package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ForceNewPageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.report.ForceNewPage.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AFTER_SECTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ForceNewPageNs.Constants
  
  @js.native
  sealed trait BEFORE_AFTER_SECTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ForceNewPageNs.Constants
  
  @js.native
  sealed trait BEFORE_SECTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ForceNewPageNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ForceNewPageNs.Constants
  
  /* 2 */ val AFTER_SECTION: AFTER_SECTION with scala.Double = js.native
  /* 3 */ val BEFORE_AFTER_SECTION: BEFORE_AFTER_SECTION with scala.Double = js.native
  /* 1 */ val BEFORE_SECTION: BEFORE_SECTION with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.ForceNewPageNs.Constants with scala.Double
  ] = js.native
}

