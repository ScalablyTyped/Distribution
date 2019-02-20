package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableSortFieldType extends js.Object

/**
  * enumeration used to specify the type of contents in a sort field (row/column) of a table.
  * @since OOo 1.1.2
  */
@JSGlobal("com.sun.star.table.TableSortFieldType")
@js.native
object TableSortFieldType extends js.Object {
  /** sort field contains text data. */
  @js.native
  sealed trait ALPHANUMERIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortFieldType
  
  /** type is determined automatically. */
  @js.native
  sealed trait AUTOMATIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortFieldType
  
  /** sort field contains numerical data. */
  @js.native
  sealed trait NUMERIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortFieldType
  
  /* 2 */ val ALPHANUMERIC: ALPHANUMERIC with scala.Double = js.native
  /* 0 */ val AUTOMATIC: AUTOMATIC with scala.Double = js.native
  /* 1 */ val NUMERIC: NUMERIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortFieldType with scala.Double
  ] = js.native
}

