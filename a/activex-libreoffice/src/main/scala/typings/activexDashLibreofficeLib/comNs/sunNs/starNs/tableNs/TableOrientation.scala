package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableOrientation extends js.Object

/** used to select whether operations are carried out on columns or rows. */
@JSGlobal("com.sun.star.table.TableOrientation")
@js.native
object TableOrientation extends js.Object {
  /** operations are carried out on columns. */
  @js.native
  sealed trait COLUMNS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation
  
  /** operations are carried out on rows. */
  @js.native
  sealed trait ROWS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation
  
  /* 0 */ val COLUMNS: COLUMNS with scala.Double = js.native
  /* 1 */ val ROWS: ROWS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation with scala.Double
  ] = js.native
}

