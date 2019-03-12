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
    Results: stdLib.SafeArray[stdLib.SafeArray[DataResult]],
    RowFieldCount: scala.Double,
    RowGrand: scala.Boolean,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getDimensions: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getFilteredResults: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataPilotFieldFilter] => stdLib.SafeArray[scala.Double],
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getResults: () => stdLib.SafeArray[stdLib.SafeArray[DataResult]],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refresh: () => scala.Unit,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): DataPilotSource = {
    val __obj = js.Dynamic.literal(ColumnFieldCount = ColumnFieldCount, ColumnGrand = ColumnGrand, DataFieldCount = DataFieldCount, Dimensions = Dimensions, PropertySetInfo = PropertySetInfo, Results = Results, RowFieldCount = RowFieldCount, RowGrand = RowGrand, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDimensions = js.Any.fromFunction0(getDimensions), getFilteredResults = js.Any.fromFunction1(getFilteredResults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DataPilotSource]
  }
}

