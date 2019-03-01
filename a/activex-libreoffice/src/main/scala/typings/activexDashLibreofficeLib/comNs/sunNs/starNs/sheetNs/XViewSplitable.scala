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
    acquire: js.Function0[scala.Unit],
    getIsWindowSplit: js.Function0[scala.Boolean],
    getSplitColumn: js.Function0[scala.Double],
    getSplitHorizontal: js.Function0[scala.Double],
    getSplitRow: js.Function0[scala.Double],
    getSplitVertical: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    splitAtPosition: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XViewSplitable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsWindowSplit")(IsWindowSplit)
    __obj.updateDynamic("SplitColumn")(SplitColumn)
    __obj.updateDynamic("SplitHorizontal")(SplitHorizontal)
    __obj.updateDynamic("SplitRow")(SplitRow)
    __obj.updateDynamic("SplitVertical")(SplitVertical)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getIsWindowSplit")(getIsWindowSplit)
    __obj.updateDynamic("getSplitColumn")(getSplitColumn)
    __obj.updateDynamic("getSplitHorizontal")(getSplitHorizontal)
    __obj.updateDynamic("getSplitRow")(getSplitRow)
    __obj.updateDynamic("getSplitVertical")(getSplitVertical)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("splitAtPosition")(splitAtPosition)
    __obj.asInstanceOf[XViewSplitable]
  }
}

