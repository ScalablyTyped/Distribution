package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellOrientation extends js.Object

/** specifies the orientation of a cell. */
@JSGlobal("com.sun.star.table.CellOrientation")
@js.native
object CellOrientation extends js.Object {
  /** contents are printed from bottom to top. */
  @js.native
  sealed trait BOTTOMTOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation
  
  /** contents are printed from top to bottom with individual characters in normal (horizontal) orientation. */
  @js.native
  sealed trait STACKED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation
  
  /**
    * default alignment is used (left for numbers, right for text).
    *
    * contents are printed from left to right.
    *
    * default alignment is used.
    */
  @js.native
  sealed trait STANDARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation
  
  /** contents are printed from top to bottom. */
  @js.native
  sealed trait TOPBOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation
  
  /* 2 */ val BOTTOMTOP: BOTTOMTOP with scala.Double = js.native
  /* 3 */ val STACKED: STACKED with scala.Double = js.native
  /* 0 */ val STANDARD: STANDARD with scala.Double = js.native
  /* 1 */ val TOPBOTTOM: TOPBOTTOM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation with scala.Double
  ] = js.native
}

