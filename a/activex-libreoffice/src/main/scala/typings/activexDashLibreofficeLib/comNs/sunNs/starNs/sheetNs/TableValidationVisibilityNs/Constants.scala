package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableValidationVisibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.TableValidationVisibility.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait INVISIBLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableValidationVisibilityNs.Constants
  
  @js.native
  sealed trait SORTEDASCENDING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableValidationVisibilityNs.Constants
  
  @js.native
  sealed trait UNSORTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableValidationVisibilityNs.Constants
  
  /* 0 */ val INVISIBLE: INVISIBLE with scala.Double = js.native
  /* 2 */ val SORTEDASCENDING: SORTEDASCENDING with scala.Double = js.native
  /* 1 */ val UNSORTED: UNSORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableValidationVisibilityNs.Constants with scala.Double
  ] = js.native
}

