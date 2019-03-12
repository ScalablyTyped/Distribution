package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enables a {@link SpreadsheetView} to split the view.
  * @deprecated Deprecated
  */
trait XViewSplitable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  val IsWindowSplit: scala.Boolean
  /** returns the column before which the view is split. */
  val SplitColumn: scala.Double
  /** returns the horizontal position in pixels where the view is split. */
  val SplitHorizontal: scala.Double
  /** returns the row before which the view is split. */
  val SplitRow: scala.Double
  /** returns the vertical position in pixels where the view is split. */
  val SplitVertical: scala.Double
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  def getIsWindowSplit(): scala.Boolean
  /** returns the column before which the view is split. */
  def getSplitColumn(): scala.Double
  /** returns the horizontal position in pixels where the view is split. */
  def getSplitHorizontal(): scala.Double
  /** returns the row before which the view is split. */
  def getSplitRow(): scala.Double
  /** returns the vertical position in pixels where the view is split. */
  def getSplitVertical(): scala.Double
  /**
    * splits the view at the specified position.
    *
    * To split only horizontally, specify **nPixelY** as 0. To split only vertically, specify **nPixelX** as 0.
    */
  def splitAtPosition(nPixelX: scala.Double, nPixelY: scala.Double): scala.Unit
}

object XViewSplitable {
  @scala.inline
  def apply(
    IsWindowSplit: scala.Boolean,
    SplitColumn: scala.Double,
    SplitHorizontal: scala.Double,
    SplitRow: scala.Double,
    SplitVertical: scala.Double,
    acquire: () => scala.Unit,
    getIsWindowSplit: () => scala.Boolean,
    getSplitColumn: () => scala.Double,
    getSplitHorizontal: () => scala.Double,
    getSplitRow: () => scala.Double,
    getSplitVertical: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    splitAtPosition: (scala.Double, scala.Double) => scala.Unit
  ): XViewSplitable = {
    val __obj = js.Dynamic.literal(IsWindowSplit = IsWindowSplit, SplitColumn = SplitColumn, SplitHorizontal = SplitHorizontal, SplitRow = SplitRow, SplitVertical = SplitVertical, acquire = js.Any.fromFunction0(acquire), getIsWindowSplit = js.Any.fromFunction0(getIsWindowSplit), getSplitColumn = js.Any.fromFunction0(getSplitColumn), getSplitHorizontal = js.Any.fromFunction0(getSplitHorizontal), getSplitRow = js.Any.fromFunction0(getSplitRow), getSplitVertical = js.Any.fromFunction0(getSplitVertical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), splitAtPosition = js.Any.fromFunction2(splitAtPosition))
  
    __obj.asInstanceOf[XViewSplitable]
  }
}

