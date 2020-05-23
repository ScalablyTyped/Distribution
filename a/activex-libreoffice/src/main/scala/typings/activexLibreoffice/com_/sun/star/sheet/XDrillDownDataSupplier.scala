package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supplies a filtered subset of the original data source based on filtering criteria.
  *
  * A service that acts as a DataPilot data source can optionally implement this interface to allow drill-down of result data. The method this interface
  * provides is used internally when calling {@link XDataPilotTable2.getDrillDownData()} or {@link XDataPilotTable2.insertDrillDownSheet()} . If the data
  * source service does not implement this interface, then the aforementioned two methods will have no effect.
  * @see com.sun.star.sheet.DataPilotSource
  * @since OOo 3.0
  */
trait XDrillDownDataSupplier extends XInterface {
  /**
    * This method returns filtered subset of the original source data based on a given set of filtering criteria.
    * @param aFilters filtering criteria
    * @returns a filtered subset of the original source data as 2-dimensional sequences of `any` . The first row must be the header row. Each `any` instance mus
    * @see com.sun.star.sheet.DataPilotFieldFilter
    * @see com.sun.star.sheet.XDataPilotTable2
    */
  def getDrillDownData(aFilters: SeqEquiv[DataPilotFieldFilter]): SafeArray[SafeArray[_]]
}

object XDrillDownDataSupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDrillDownData: SeqEquiv[DataPilotFieldFilter] => SafeArray[SafeArray[_]],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrillDownDataSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDrillDownData = js.Any.fromFunction1(getDrillDownData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrillDownDataSupplier]
  }
}

