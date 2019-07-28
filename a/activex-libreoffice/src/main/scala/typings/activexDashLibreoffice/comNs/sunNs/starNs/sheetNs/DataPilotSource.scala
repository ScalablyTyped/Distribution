package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
import typings.std.SafeArray
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
     with XRefreshable
     with XPropertySet {
  /**
    * specifies the number of column fields.
    * @since OOo 3.0
    */
  var ColumnFieldCount: Double
  /** specifies if grand totals for the columns are inserted. */
  var ColumnGrand: Boolean
  /**
    * specifies the number of data fields.
    * @since OOo 3.0
    */
  var DataFieldCount: Double
  /**
    * specifies the number of row fields.
    * @since OOo 3.0
    */
  var RowFieldCount: Double
  /** specifies if grand totals for the rows are inserted. */
  var RowGrand: Boolean
}

object DataPilotSource {
  @scala.inline
  def apply(
    ColumnFieldCount: Double,
    ColumnGrand: Boolean,
    DataFieldCount: Double,
    Dimensions: XNameAccess,
    PropertySetInfo: XPropertySetInfo,
    Results: SafeArray[SafeArray[DataResult]],
    RowFieldCount: Double,
    RowGrand: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRefreshListener: XRefreshListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getDimensions: () => XNameAccess,
    getFilteredResults: SeqEquiv[DataPilotFieldFilter] => SafeArray[Double],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getResults: () => SafeArray[SafeArray[DataResult]],
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DataPilotSource = {
    val __obj = js.Dynamic.literal(ColumnFieldCount = ColumnFieldCount, ColumnGrand = ColumnGrand, DataFieldCount = DataFieldCount, Dimensions = Dimensions, PropertySetInfo = PropertySetInfo, Results = Results, RowFieldCount = RowFieldCount, RowGrand = RowGrand, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDimensions = js.Any.fromFunction0(getDimensions), getFilteredResults = js.Any.fromFunction1(getFilteredResults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DataPilotSource]
  }
}

