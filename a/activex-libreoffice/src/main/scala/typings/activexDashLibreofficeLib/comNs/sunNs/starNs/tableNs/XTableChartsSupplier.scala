package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a method to access a collection of charts in a table or spreadsheet. */
trait XTableChartsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the collection of charts.
    * @see com.sun.star.table.TableCharts
    */
  val Charts: XTableCharts
  /**
    * returns the collection of charts.
    * @see com.sun.star.table.TableCharts
    */
  def getCharts(): XTableCharts
}

object XTableChartsSupplier {
  @scala.inline
  def apply(
    Charts: XTableCharts,
    acquire: js.Function0[scala.Unit],
    getCharts: js.Function0[XTableCharts],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTableChartsSupplier = {
    val __obj = js.Dynamic.literal(Charts = Charts, acquire = acquire, getCharts = getCharts, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTableChartsSupplier]
  }
}

