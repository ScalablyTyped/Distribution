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
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    selectColumn: scala.Double => scala.Boolean,
    selectRow: scala.Double => scala.Boolean,
    unselectColumn: scala.Double => scala.Boolean,
    unselectRow: scala.Double => scala.Boolean
  ): XAccessibleTableSelection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectColumn = js.Any.fromFunction1(selectColumn), selectRow = js.Any.fromFunction1(selectRow), unselectColumn = js.Any.fromFunction1(unselectColumn), unselectRow = js.Any.fromFunction1(unselectRow))
  
    __obj.asInstanceOf[XAccessibleTableSelection]
  }
}

