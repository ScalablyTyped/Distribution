package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enables a {@link SpreadsheetView} to split the view.
  * @deprecated Deprecated
  */
trait XViewSplitable extends XInterface {
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  val IsWindowSplit: Boolean
  /** returns the column before which the view is split. */
  val SplitColumn: Double
  /** returns the horizontal position in pixels where the view is split. */
  val SplitHorizontal: Double
  /** returns the row before which the view is split. */
  val SplitRow: Double
  /** returns the vertical position in pixels where the view is split. */
  val SplitVertical: Double
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  def getIsWindowSplit(): Boolean
  /** returns the column before which the view is split. */
  def getSplitColumn(): Double
  /** returns the horizontal position in pixels where the view is split. */
  def getSplitHorizontal(): Double
  /** returns the row before which the view is split. */
  def getSplitRow(): Double
  /** returns the vertical position in pixels where the view is split. */
  def getSplitVertical(): Double
  /**
    * splits the view at the specified position.
    *
    * To split only horizontally, specify **nPixelY** as 0. To split only vertically, specify **nPixelX** as 0.
    */
  def splitAtPosition(nPixelX: Double, nPixelY: Double): Unit
}

object XViewSplitable {
  @scala.inline
  def apply(
    IsWindowSplit: Boolean,
    SplitColumn: Double,
    SplitHorizontal: Double,
    SplitRow: Double,
    SplitVertical: Double,
    acquire: () => Unit,
    getIsWindowSplit: () => Boolean,
    getSplitColumn: () => Double,
    getSplitHorizontal: () => Double,
    getSplitRow: () => Double,
    getSplitVertical: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    splitAtPosition: (Double, Double) => Unit
  ): XViewSplitable = {
    val __obj = js.Dynamic.literal(IsWindowSplit = IsWindowSplit, SplitColumn = SplitColumn, SplitHorizontal = SplitHorizontal, SplitRow = SplitRow, SplitVertical = SplitVertical, acquire = js.Any.fromFunction0(acquire), getIsWindowSplit = js.Any.fromFunction0(getIsWindowSplit), getSplitColumn = js.Any.fromFunction0(getSplitColumn), getSplitHorizontal = js.Any.fromFunction0(getSplitHorizontal), getSplitRow = js.Any.fromFunction0(getSplitRow), getSplitVertical = js.Any.fromFunction0(getSplitVertical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), splitAtPosition = js.Any.fromFunction2(splitAtPosition))
  
    __obj.asInstanceOf[XViewSplitable]
  }
}

