package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseDataProvider extends XDatabaseDataProvider {
  def createWithConnection(connection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection): scala.Unit
}

object DatabaseDataProvider {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    ApplyFilter: scala.Boolean,
    Command: java.lang.String,
    CommandType: scala.Double,
    DataSourceName: java.lang.String,
    DetailFields: stdLib.SafeArray[java.lang.String],
    EscapeProcessing: scala.Boolean,
    Filter: java.lang.String,
    GroupBy: java.lang.String,
    HavingClause: java.lang.String,
    MasterFields: stdLib.SafeArray[java.lang.String],
    Order: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RangeSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection,
    Row: scala.Double,
    RowLimit: scala.Double,
    Statement: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    absolute: scala.Double => scala.Boolean,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addRowSetListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSetListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    afterLast: () => scala.Unit,
    beforeFirst: () => scala.Unit,
    clearParameters: () => scala.Unit,
    convertRangeFromXML: java.lang.String => java.lang.String,
    convertRangeToXML: java.lang.String => java.lang.String,
    createDataSequenceByRangeRepresentation: java.lang.String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: java.lang.String => scala.Boolean,
    createDataSequenceByValueArray: (java.lang.String, java.lang.String) => XDataSequence,
    createDataSource: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => XDataSource,
    createDataSourcePossible: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Boolean,
    createWithConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection => scala.Unit,
    detectArguments: XDataSource => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    dispose: () => scala.Unit,
    execute: () => scala.Unit,
    first: () => scala.Boolean,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getRangeSelection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection,
    getRow: () => scala.Double,
    getStatement: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    isAfterLast: () => scala.Boolean,
    isBeforeFirst: () => scala.Boolean,
    isFirst: () => scala.Boolean,
    isLast: () => scala.Boolean,
    last: () => scala.Boolean,
    next: () => scala.Boolean,
    previous: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refreshRow: () => scala.Unit,
    relative: scala.Double => scala.Boolean,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeRowSetListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSetListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    rowDeleted: () => scala.Boolean,
    rowInserted: () => scala.Boolean,
    rowUpdated: () => scala.Boolean,
    setArray: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray) => scala.Unit,
    setBinaryStream: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    setBlob: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob) => scala.Unit,
    setBoolean: (scala.Double, scala.Boolean) => scala.Unit,
    setByte: (scala.Double, scala.Double) => scala.Unit,
    setBytes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => scala.Unit,
    setCharacterStream: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    setClob: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob) => scala.Unit,
    setDate: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date) => scala.Unit,
    setDouble: (scala.Double, scala.Double) => scala.Unit,
    setFloat: (scala.Double, scala.Double) => scala.Unit,
    setInt: (scala.Double, scala.Double) => scala.Unit,
    setLong: (scala.Double, scala.Double) => scala.Unit,
    setNull: (scala.Double, scala.Double) => scala.Unit,
    setObject: (scala.Double, js.Any) => scala.Unit,
    setObjectNull: (scala.Double, scala.Double, java.lang.String) => scala.Unit,
    setObjectWithInfo: (scala.Double, js.Any, scala.Double, scala.Double) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setRef: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef) => scala.Unit,
    setShort: (scala.Double, scala.Double) => scala.Unit,
    setString: (scala.Double, java.lang.String) => scala.Unit,
    setTime: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time) => scala.Unit,
    setTimestamp: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime) => scala.Unit
  ): DatabaseDataProvider = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, ApplyFilter = ApplyFilter, Command = Command, CommandType = CommandType, DataSourceName = DataSourceName, DetailFields = DetailFields, EscapeProcessing = EscapeProcessing, Filter = Filter, GroupBy = GroupBy, HavingClause = HavingClause, MasterFields = MasterFields, Order = Order, PropertySetInfo = PropertySetInfo, RangeSelection = RangeSelection, Row = Row, RowLimit = RowLimit, Statement = Statement, absolute = js.Any.fromFunction1(absolute), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRowSetListener = js.Any.fromFunction1(addRowSetListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), afterLast = js.Any.fromFunction0(afterLast), beforeFirst = js.Any.fromFunction0(beforeFirst), clearParameters = js.Any.fromFunction0(clearParameters), convertRangeFromXML = js.Any.fromFunction1(convertRangeFromXML), convertRangeToXML = js.Any.fromFunction1(convertRangeToXML), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), createWithConnection = js.Any.fromFunction1(createWithConnection), detectArguments = js.Any.fromFunction1(detectArguments), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), first = js.Any.fromFunction0(first), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRangeSelection = js.Any.fromFunction0(getRangeSelection), getRow = js.Any.fromFunction0(getRow), getStatement = js.Any.fromFunction0(getStatement), initialize = js.Any.fromFunction1(initialize), isAfterLast = js.Any.fromFunction0(isAfterLast), isBeforeFirst = js.Any.fromFunction0(isBeforeFirst), isFirst = js.Any.fromFunction0(isFirst), isLast = js.Any.fromFunction0(isLast), last = js.Any.fromFunction0(last), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = js.Any.fromFunction0(refreshRow), relative = js.Any.fromFunction1(relative), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRowSetListener = js.Any.fromFunction1(removeRowSetListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rowDeleted = js.Any.fromFunction0(rowDeleted), rowInserted = js.Any.fromFunction0(rowInserted), rowUpdated = js.Any.fromFunction0(rowUpdated), setArray = js.Any.fromFunction2(setArray), setBinaryStream = js.Any.fromFunction3(setBinaryStream), setBlob = js.Any.fromFunction2(setBlob), setBoolean = js.Any.fromFunction2(setBoolean), setByte = js.Any.fromFunction2(setByte), setBytes = js.Any.fromFunction2(setBytes), setCharacterStream = js.Any.fromFunction3(setCharacterStream), setClob = js.Any.fromFunction2(setClob), setDate = js.Any.fromFunction2(setDate), setDouble = js.Any.fromFunction2(setDouble), setFloat = js.Any.fromFunction2(setFloat), setInt = js.Any.fromFunction2(setInt), setLong = js.Any.fromFunction2(setLong), setNull = js.Any.fromFunction2(setNull), setObject = js.Any.fromFunction2(setObject), setObjectNull = js.Any.fromFunction3(setObjectNull), setObjectWithInfo = js.Any.fromFunction4(setObjectWithInfo), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setRef = js.Any.fromFunction2(setRef), setShort = js.Any.fromFunction2(setShort), setString = js.Any.fromFunction2(setString), setTime = js.Any.fromFunction2(setTime), setTimestamp = js.Any.fromFunction2(setTimestamp))
  
    __obj.asInstanceOf[DatabaseDataProvider]
  }
}

