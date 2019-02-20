package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableOperationMode extends js.Object

/** used to specify if a table operation is applied to columns, rows, or both columns and rows. */
@JSGlobal("com.sun.star.sheet.TableOperationMode")
@js.native
object TableOperationMode extends js.Object {
  /**
    * is applied to rows and columns. <p>In this mode, the row and the column contain values. A formula
    *
    * using both row and column values is specified separately.</p>
    */
  @js.native
  sealed trait BOTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableOperationMode
  
  /**
    * the field is used as a column field.
    *
    * is applied to the columns. <p>In this mode, the column contains values and the row
    *
    * contains formulas.</p>
    */
  @js.native
  sealed trait COLUMN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableOperationMode
  
  /**
    * the field is used as a row field.
    *
    * is applied to the rows. <p>In this mode, the row contains values and the column
    *
    * contains formulas.</p>
    */
  @js.native
  sealed trait ROW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableOperationMode
  
  /* 2 */ val BOTH: BOTH with scala.Double = js.native
  /* 0 */ val COLUMN: COLUMN with scala.Double = js.native
  /* 1 */ val ROW: ROW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.TableOperationMode with scala.Double
  ] = js.native
}

