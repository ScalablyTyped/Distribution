package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelOrigin extends js.Object

/**
  * is used to specify how the labels have to be created.
  * @see XDataSequence.generateLabel().
  */
@JSGlobal("com.sun.star.chart2.data.LabelOrigin")
@js.native
object LabelOrigin extends js.Object {
  /**
    * Uses the column name for label generation. A spreadsheet range A1:A6 could, e.g., result in "Column A".
    *
    * If a range consists of more than one column the result of label generation may be empty. Of course, it could also succeed with a string like "Columns
    * A to B".
    */
  @js.native
  sealed trait COLUMN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.LabelOrigin
  
  /**
    * This is exactly the opposite of SHORT_SIDE. I.e., if SHORT_SIDE has the same effect as ROW, LONG_SIDE will have the same effect as COLUMN and the
    * other way round.
    * @see LabelOrigin.SHORT_SIDE
    */
  @js.native
  sealed trait LONG_SIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.LabelOrigin
  
  /**
    * Uses the column name for label generation. A spreadsheet range A2:D2 could, e.g., result in "Row 2".
    *
    * If a range consists of more than one row the result of label generation may be empty. Of course, it could also succeed with a string like "Rows 1-3".
    */
  @js.native
  sealed trait ROW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.LabelOrigin
  
  /**
    * If a range spans a single row over more than one column, this parameter has the same effect as ROW. If the range spans a single column over more than
    * one row, this is the same as COLUMN.
    *
    * In case of a range spanning more than one column and row, the shorter range of both should be used (e.g. a spreadsheet range A1:B10 should treat
    * columns as short side).
    *
    * In case of a rectangular range, or a range that is composed of more than one contiguous sub-regions, the short side cannot be determined, thus {@link
    * XDataSequence.generateLabel()} will return an empty sequence.
    */
  @js.native
  sealed trait SHORT_SIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.LabelOrigin
  
  /* 2 */ val COLUMN: COLUMN with scala.Double = js.native
  /* 1 */ val LONG_SIDE: LONG_SIDE with scala.Double = js.native
  /* 3 */ val ROW: ROW with scala.Double = js.native
  /* 0 */ val SHORT_SIDE: SHORT_SIDE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.LabelOrigin with scala.Double
  ] = js.native
}

