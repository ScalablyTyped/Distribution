package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellContentType extends js.Object

/** is used to determine the type of contents in a cell. */
@JSGlobal("com.sun.star.table.CellContentType")
@js.native
object CellContentType extends js.Object {
  /** cell is empty. */
  @js.native
  sealed trait EMPTY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellContentType
  
  /** cell contains a formula. */
  @js.native
  sealed trait FORMULA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellContentType
  
  /** cell contains text. */
  @js.native
  sealed trait TEXT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellContentType
  
  /** cell contains a constant value. */
  @js.native
  sealed trait VALUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellContentType
  
  /* 0 */ val EMPTY: EMPTY with scala.Double = js.native
  /* 3 */ val FORMULA: FORMULA with scala.Double = js.native
  /* 2 */ val TEXT: TEXT with scala.Double = js.native
  /* 1 */ val VALUE: VALUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellContentType with scala.Double
  ] = js.native
}

