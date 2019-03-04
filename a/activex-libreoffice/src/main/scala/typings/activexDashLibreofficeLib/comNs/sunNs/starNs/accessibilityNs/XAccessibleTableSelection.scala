package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleTableSelection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def selectColumn(column: scala.Double): scala.Boolean
  def selectRow(row: scala.Double): scala.Boolean
  def unselectColumn(column: scala.Double): scala.Boolean
  def unselectRow(row: scala.Double): scala.Boolean
}

object XAccessibleTableSelection {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    selectColumn: js.Function1[scala.Double, scala.Boolean],
    selectRow: js.Function1[scala.Double, scala.Boolean],
    unselectColumn: js.Function1[scala.Double, scala.Boolean],
    unselectRow: js.Function1[scala.Double, scala.Boolean]
  ): XAccessibleTableSelection = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, selectColumn = selectColumn, selectRow = selectRow, unselectColumn = unselectColumn, unselectRow = unselectRow)
  
    __obj.asInstanceOf[XAccessibleTableSelection]
  }
}

