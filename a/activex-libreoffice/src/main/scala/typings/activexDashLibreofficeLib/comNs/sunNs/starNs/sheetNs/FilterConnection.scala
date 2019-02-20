package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterConnection extends js.Object

/** used to specify how two conditions in a filter descriptor are connected. */
@JSGlobal("com.sun.star.sheet.FilterConnection")
@js.native
object FilterConnection extends js.Object {
  /** both conditions have to be fulfilled. */
  @js.native
  sealed trait AND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterConnection
  
  /** at least one of the conditions has to be fulfilled. */
  @js.native
  sealed trait OR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterConnection
  
  /* 0 */ val AND: AND with scala.Double = js.native
  /* 1 */ val OR: OR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterConnection with scala.Double
  ] = js.native
}

