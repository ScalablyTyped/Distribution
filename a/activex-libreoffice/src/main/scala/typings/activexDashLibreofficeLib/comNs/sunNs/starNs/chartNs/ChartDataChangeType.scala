package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartDataChangeType extends js.Object

/** specifies the type of change that was applied to the data. */
@JSGlobal("com.sun.star.chart.ChartDataChangeType")
@js.native
object ChartDataChangeType extends js.Object {
  /** Major changes were applied to the data. */
  @js.native
  sealed trait ALL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataChangeType
  
  /** The column given in the {@link ChartDataChangeEvent} , was deleted. */
  @js.native
  sealed trait COLUMN_DELETED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataChangeType
  
  /** The column given in the {@link ChartDataChangeEvent} , was inserted. */
  @js.native
  sealed trait COLUMN_INSERTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataChangeType
  
  /** The range of columns and rows, given in the {@link ChartDataChangeEvent} , has changed. */
  @js.native
  sealed trait DATA_RANGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataChangeType
  
  /** The row given in the {@link ChartDataChangeEvent} , was deleted. */
  @js.native
  sealed trait ROW_DELETED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataChangeType
  
  /** The row given in the {@link ChartDataChangeEvent} , was inserted. */
  @js.native
  sealed trait ROW_INSERTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataChangeType
  
  /* 0 */ val ALL: ALL with scala.Double = js.native
  /* 4 */ val COLUMN_DELETED: COLUMN_DELETED with scala.Double = js.native
  /* 2 */ val COLUMN_INSERTED: COLUMN_INSERTED with scala.Double = js.native
  /* 1 */ val DATA_RANGE: DATA_RANGE with scala.Double = js.native
  /* 5 */ val ROW_DELETED: ROW_DELETED with scala.Double = js.native
  /* 3 */ val ROW_INSERTED: ROW_INSERTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataChangeType with scala.Double
  ] = js.native
}

