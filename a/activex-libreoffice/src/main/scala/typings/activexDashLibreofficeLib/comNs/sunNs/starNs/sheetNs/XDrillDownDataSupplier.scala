package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

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
trait XDrillDownDataSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * This method returns filtered subset of the original source data based on a given set of filtering criteria.
    * @param aFilters filtering criteria
    * @returns a filtered subset of the original source data as 2-dimensional sequences of `any` . The first row must be the header row. Each `any` instance mus
    * @see com.sun.star.sheet.DataPilotFieldFilter
    * @see com.sun.star.sheet.XDataPilotTable2
    */
  def getDrillDownData(aFilters: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataPilotFieldFilter]): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
}

object XDrillDownDataSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDrillDownData: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataPilotFieldFilter], 
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDrillDownDataSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire, getDrillDownData = getDrillDownData, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDrillDownDataSupplier]
  }
}

