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
  val Results: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[DataResult]]
  def getFilteredResults(aFilters: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataPilotFieldFilter]): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * returns the result array.
    *
    * The outer sequence contains the value rows. The inner sequences contain the values for one row.
    */
  def getResults(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[DataResult]]
}

