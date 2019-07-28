package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a table of results of a data pilot source.
  *
  * These results are used to fill the data area of a data pilot table.
  * @see com.sun.star.sheet.DataPilotSource
  * @see com.sun.star.sheet.XDataPilotMemberResults
  */
trait XDataPilotResults extends XInterface {
  /**
    * returns the result array.
    *
    * The outer sequence contains the value rows. The inner sequences contain the values for one row.
    */
  val Results: SafeArray[SafeArray[DataResult]]
  def getFilteredResults(aFilters: SeqEquiv[DataPilotFieldFilter]): SafeArray[Double]
  /**
    * returns the result array.
    *
    * The outer sequence contains the value rows. The inner sequences contain the values for one row.
    */
  def getResults(): SafeArray[SafeArray[DataResult]]
}

object XDataPilotResults {
  @scala.inline
  def apply(
    Results: SafeArray[SafeArray[DataResult]],
    acquire: () => Unit,
    getFilteredResults: SeqEquiv[DataPilotFieldFilter] => SafeArray[Double],
    getResults: () => SafeArray[SafeArray[DataResult]],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataPilotResults = {
    val __obj = js.Dynamic.literal(Results = Results, acquire = js.Any.fromFunction0(acquire), getFilteredResults = js.Any.fromFunction1(getFilteredResults), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataPilotResults]
  }
}

