package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables a {@link SpreadsheetView} to freeze columns and rows of the view. */
trait XViewFreezable extends XInterface {
  /**
    * freezes panes with the specified number of columns and rows.
    *
    * To freeze only horizontally, specify nRows as 0. To freeze only vertically, specify nColumns as 0.
    */
  def freezeAtPosition(nColumns: Double, nRows: Double): Unit
  /**
    * returns `TRUE` if the view has frozen panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  def hasFrozenPanes(): Boolean
}

object XViewFreezable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    freezeAtPosition: (Double, Double) => Unit,
    hasFrozenPanes: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewFreezable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), freezeAtPosition = js.Any.fromFunction2(freezeAtPosition), hasFrozenPanes = js.Any.fromFunction0(hasFrozenPanes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XViewFreezable]
  }
}

