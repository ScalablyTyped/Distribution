package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables a {@link SpreadsheetView} to freeze columns and rows of the view. */
trait XViewFreezable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * freezes panes with the specified number of columns and rows.
    *
    * To freeze only horizontally, specify nRows as 0. To freeze only vertically, specify nColumns as 0.
    */
  def freezeAtPosition(nColumns: scala.Double, nRows: scala.Double): scala.Unit
  /**
    * returns `TRUE` if the view has frozen panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  def hasFrozenPanes(): scala.Boolean
}

object XViewFreezable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    freezeAtPosition: js.Function2[scala.Double, scala.Double, scala.Unit],
    hasFrozenPanes: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XViewFreezable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("freezeAtPosition")(freezeAtPosition)
    __obj.updateDynamic("hasFrozenPanes")(hasFrozenPanes)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XViewFreezable]
  }
}

