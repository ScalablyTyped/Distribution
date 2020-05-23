package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a method to access a collection of charts in a table or spreadsheet. */
trait XTableChartsSupplier extends XInterface {
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
    acquire: () => Unit,
    getCharts: () => XTableCharts,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTableChartsSupplier = {
    val __obj = js.Dynamic.literal(Charts = Charts.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCharts = js.Any.fromFunction0(getCharts), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTableChartsSupplier]
  }
}

