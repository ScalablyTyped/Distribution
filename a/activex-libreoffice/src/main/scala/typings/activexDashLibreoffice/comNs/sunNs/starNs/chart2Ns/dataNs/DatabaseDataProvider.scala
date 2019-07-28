package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XArray
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XBlob
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XClob
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XRef
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XRowSetListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.XRangeSelection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Date
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseDataProvider extends XDatabaseDataProvider {
  def createWithConnection(connection: XConnection): Unit
}

object DatabaseDataProvider {
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    ApplyFilter: Boolean,
    Command: String,
    CommandType: Double,
    DataSourceName: String,
    DetailFields: SafeArray[String],
    EscapeProcessing: Boolean,
    Filter: String,
    GroupBy: String,
    HavingClause: String,
    MasterFields: SafeArray[String],
    Order: String,
    PropertySetInfo: XPropertySetInfo,
    RangeSelection: XRangeSelection,
    Row: Double,
    RowLimit: Double,
    Statement: XInterface,
    absolute: Double => Boolean,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRowSetListener: XRowSetListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    afterLast: () => Unit,
    beforeFirst: () => Unit,
    clearParameters: () => Unit,
    convertRangeFromXML: String => String,
    convertRangeToXML: String => String,
    createDataSequenceByRangeRepresentation: String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: String => Boolean,
    createDataSequenceByValueArray: (String, String) => XDataSequence,
    createDataSource: SeqEquiv[PropertyValue] => XDataSource,
    createDataSourcePossible: SeqEquiv[PropertyValue] => Boolean,
    createWithConnection: XConnection => Unit,
    detectArguments: XDataSource => SafeArray[PropertyValue],
    dispose: () => Unit,
    execute: () => Unit,
    first: () => Boolean,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRangeSelection: () => XRangeSelection,
    getRow: () => Double,
    getStatement: () => XInterface,
    initialize: SeqEquiv[_] => Unit,
    isAfterLast: () => Boolean,
    isBeforeFirst: () => Boolean,
    isFirst: () => Boolean,
    isLast: () => Boolean,
    last: () => Boolean,
    next: () => Boolean,
    previous: () => Boolean,
    queryInterface: `type` => js.Any,
    refreshRow: () => Unit,
    relative: Double => Boolean,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRowSetListener: XRowSetListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    rowDeleted: () => Boolean,
    rowInserted: () => Boolean,
    rowUpdated: () => Boolean,
    setArray: (Double, XArray) => Unit,
    setBinaryStream: (Double, XInputStream, Double) => Unit,
    setBlob: (Double, XBlob) => Unit,
    setBoolean: (Double, Boolean) => Unit,
    setByte: (Double, Double) => Unit,
    setBytes: (Double, SeqEquiv[Double]) => Unit,
    setCharacterStream: (Double, XInputStream, Double) => Unit,
    setClob: (Double, XClob) => Unit,
    setDate: (Double, Date) => Unit,
    setDouble: (Double, Double) => Unit,
    setFloat: (Double, Double) => Unit,
    setInt: (Double, Double) => Unit,
    setLong: (Double, Double) => Unit,
    setNull: (Double, Double) => Unit,
    setObject: (Double, js.Any) => Unit,
    setObjectNull: (Double, Double, String) => Unit,
    setObjectWithInfo: (Double, js.Any, Double, Double) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setRef: (Double, XRef) => Unit,
    setShort: (Double, Double) => Unit,
    setString: (Double, String) => Unit,
    setTime: (Double, Time) => Unit,
    setTimestamp: (Double, DateTime) => Unit
  ): DatabaseDataProvider = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, ApplyFilter = ApplyFilter, Command = Command, CommandType = CommandType, DataSourceName = DataSourceName, DetailFields = DetailFields, EscapeProcessing = EscapeProcessing, Filter = Filter, GroupBy = GroupBy, HavingClause = HavingClause, MasterFields = MasterFields, Order = Order, PropertySetInfo = PropertySetInfo, RangeSelection = RangeSelection, Row = Row, RowLimit = RowLimit, Statement = Statement, absolute = js.Any.fromFunction1(absolute), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRowSetListener = js.Any.fromFunction1(addRowSetListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), afterLast = js.Any.fromFunction0(afterLast), beforeFirst = js.Any.fromFunction0(beforeFirst), clearParameters = js.Any.fromFunction0(clearParameters), convertRangeFromXML = js.Any.fromFunction1(convertRangeFromXML), convertRangeToXML = js.Any.fromFunction1(convertRangeToXML), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), createWithConnection = js.Any.fromFunction1(createWithConnection), detectArguments = js.Any.fromFunction1(detectArguments), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), first = js.Any.fromFunction0(first), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRangeSelection = js.Any.fromFunction0(getRangeSelection), getRow = js.Any.fromFunction0(getRow), getStatement = js.Any.fromFunction0(getStatement), initialize = js.Any.fromFunction1(initialize), isAfterLast = js.Any.fromFunction0(isAfterLast), isBeforeFirst = js.Any.fromFunction0(isBeforeFirst), isFirst = js.Any.fromFunction0(isFirst), isLast = js.Any.fromFunction0(isLast), last = js.Any.fromFunction0(last), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = js.Any.fromFunction0(refreshRow), relative = js.Any.fromFunction1(relative), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRowSetListener = js.Any.fromFunction1(removeRowSetListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rowDeleted = js.Any.fromFunction0(rowDeleted), rowInserted = js.Any.fromFunction0(rowInserted), rowUpdated = js.Any.fromFunction0(rowUpdated), setArray = js.Any.fromFunction2(setArray), setBinaryStream = js.Any.fromFunction3(setBinaryStream), setBlob = js.Any.fromFunction2(setBlob), setBoolean = js.Any.fromFunction2(setBoolean), setByte = js.Any.fromFunction2(setByte), setBytes = js.Any.fromFunction2(setBytes), setCharacterStream = js.Any.fromFunction3(setCharacterStream), setClob = js.Any.fromFunction2(setClob), setDate = js.Any.fromFunction2(setDate), setDouble = js.Any.fromFunction2(setDouble), setFloat = js.Any.fromFunction2(setFloat), setInt = js.Any.fromFunction2(setInt), setLong = js.Any.fromFunction2(setLong), setNull = js.Any.fromFunction2(setNull), setObject = js.Any.fromFunction2(setObject), setObjectNull = js.Any.fromFunction3(setObjectNull), setObjectWithInfo = js.Any.fromFunction4(setObjectWithInfo), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setRef = js.Any.fromFunction2(setRef), setShort = js.Any.fromFunction2(setShort), setString = js.Any.fromFunction2(setString), setTime = js.Any.fromFunction2(setTime), setTimestamp = js.Any.fromFunction2(setTimestamp))
  
    __obj.asInstanceOf[DatabaseDataProvider]
  }
}

