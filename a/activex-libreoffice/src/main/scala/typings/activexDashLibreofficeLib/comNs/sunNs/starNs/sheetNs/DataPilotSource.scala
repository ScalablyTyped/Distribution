package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a data pilot source.
  *
  * A component that implements this service can be used as data source for a data pilot table in a spreadsheet document.
  */
trait DataPilotSource
  extends XDimensionsSupplier
     with XDataPilotResults
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * specifies the number of column fields.
    * @since OOo 3.0
    */
  var ColumnFieldCount: scala.Double
  /** specifies if grand totals for the columns are inserted. */
  var ColumnGrand: scala.Boolean
  /**
    * specifies the number of data fields.
    * @since OOo 3.0
    */
  var DataFieldCount: scala.Double
  /**
    * specifies the number of row fields.
    * @since OOo 3.0
    */
  var RowFieldCount: scala.Double
  /** specifies if grand totals for the rows are inserted. */
  var RowGrand: scala.Boolean
}

object DataPilotSource {
  @scala.inline
  def apply(
    ColumnFieldCount: scala.Double,
    ColumnGrand: scala.Boolean,
    DataFieldCount: scala.Double,
    Dimensions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Results: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[DataResult]],
    RowFieldCount: scala.Double,
    RowGrand: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getDimensions: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getFilteredResults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataPilotFieldFilter], 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getResults: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[DataResult]]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DataPilotSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ColumnFieldCount")(ColumnFieldCount)
    __obj.updateDynamic("ColumnGrand")(ColumnGrand)
    __obj.updateDynamic("DataFieldCount")(DataFieldCount)
    __obj.updateDynamic("Dimensions")(Dimensions)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Results")(Results)
    __obj.updateDynamic("RowFieldCount")(RowFieldCount)
    __obj.updateDynamic("RowGrand")(RowGrand)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addRefreshListener")(addRefreshListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getDimensions")(getDimensions)
    __obj.updateDynamic("getFilteredResults")(getFilteredResults)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getResults")(getResults)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeRefreshListener")(removeRefreshListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[DataPilotSource]
  }
}

