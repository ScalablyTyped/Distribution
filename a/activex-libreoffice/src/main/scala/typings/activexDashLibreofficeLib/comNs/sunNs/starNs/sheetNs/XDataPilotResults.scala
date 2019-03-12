package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

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
trait XDataPilotResults
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the result array.
    *
    * The outer sequence contains the value rows. The inner sequences contain the values for one row.
    */
  val Results: stdLib.SafeArray[stdLib.SafeArray[DataResult]]
  def getFilteredResults(aFilters: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataPilotFieldFilter]): stdLib.SafeArray[scala.Double]
  /**
    * returns the result array.
    *
    * The outer sequence contains the value rows. The inner sequences contain the values for one row.
    */
  def getResults(): stdLib.SafeArray[stdLib.SafeArray[DataResult]]
}

object XDataPilotResults {
  @scala.inline
  def apply(
    Results: stdLib.SafeArray[stdLib.SafeArray[DataResult]],
    acquire: () => scala.Unit,
    getFilteredResults: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataPilotFieldFilter] => stdLib.SafeArray[scala.Double],
    getResults: () => stdLib.SafeArray[stdLib.SafeArray[DataResult]],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDataPilotResults = {
    val __obj = js.Dynamic.literal(Results = Results, acquire = js.Any.fromFunction0(acquire), getFilteredResults = js.Any.fromFunction1(getFilteredResults), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataPilotResults]
  }
}

