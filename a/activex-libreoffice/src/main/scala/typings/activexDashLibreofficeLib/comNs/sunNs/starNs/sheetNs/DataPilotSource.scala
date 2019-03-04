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
    val __obj = js.Dynamic.literal(ColumnFieldCount = ColumnFieldCount, ColumnGrand = ColumnGrand, DataFieldCount = DataFieldCount, Dimensions = Dimensions, PropertySetInfo = PropertySetInfo, Results = Results, RowFieldCount = RowFieldCount, RowGrand = RowGrand, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addRefreshListener = addRefreshListener, addVetoableChangeListener = addVetoableChangeListener, getDimensions = getDimensions, getFilteredResults = getFilteredResults, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getResults = getResults, queryInterface = queryInterface, refresh = refresh, release = release, removePropertyChangeListener = removePropertyChangeListener, removeRefreshListener = removeRefreshListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DataPilotSource]
  }
}

