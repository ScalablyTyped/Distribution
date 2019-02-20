package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataBarAxisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.DataBarAxis.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AXIS_AUTOMATIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataBarAxisNs.Constants
  
  @js.native
  sealed trait AXIS_MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataBarAxisNs.Constants
  
  @js.native
  sealed trait AXIS_NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataBarAxisNs.Constants
  
  /* 2 */ val AXIS_AUTOMATIC: AXIS_AUTOMATIC with scala.Double = js.native
  /* 1 */ val AXIS_MIDDLE: AXIS_MIDDLE with scala.Double = js.native
  /* 0 */ val AXIS_NONE: AXIS_NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataBarAxisNs.Constants with scala.Double
  ] = js.native
}

