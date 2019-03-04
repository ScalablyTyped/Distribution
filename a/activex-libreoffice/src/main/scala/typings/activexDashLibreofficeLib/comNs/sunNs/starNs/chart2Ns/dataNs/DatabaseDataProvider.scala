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
    DetailFields: activexDashInteropLib.SafeArray[java.lang.String],
    EscapeProcessing: scala.Boolean,
    Filter: java.lang.String,
    GroupBy: java.lang.String,
    HavingClause: java.lang.String,
    MasterFields: activexDashInteropLib.SafeArray[java.lang.String],
    Order: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RangeSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection,
    Row: scala.Double,
    RowLimit: scala.Double,
    Statement: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    absolute: js.Function1[scala.Double, scala.Boolean],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addRowSetListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSetListener, scala.Unit],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    afterLast: js.Function0[scala.Unit],
    beforeFirst: js.Function0[scala.Unit],
    clearParameters: js.Function0[scala.Unit],
    convertRangeFromXML: js.Function1[java.lang.String, java.lang.String],
    convertRangeToXML: js.Function1[java.lang.String, java.lang.String],
    createDataSequenceByRangeRepresentation: js.Function1[java.lang.String, XDataSequence],
    createDataSequenceByRangeRepresentationPossible: js.Function1[java.lang.String, scala.Boolean],
    createDataSequenceByValueArray: js.Function2[java.lang.String, java.lang.String, XDataSequence],
    createDataSource: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XDataSource
    ],
    createDataSourcePossible: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    createWithConnection: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection, scala.Unit],
    detectArguments: js.Function1[
      XDataSource, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    dispose: js.Function0[scala.Unit],
    execute: js.Function0[scala.Unit],
    first: js.Function0[scala.Boolean],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getRangeSelection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection],
    getRow: js.Function0[scala.Double],
    getStatement: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    isAfterLast: js.Function0[scala.Boolean],
    isBeforeFirst: js.Function0[scala.Boolean],
    isFirst: js.Function0[scala.Boolean],
    isLast: js.Function0[scala.Boolean],
    last: js.Function0[scala.Boolean],
    next: js.Function0[scala.Boolean],
    previous: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refreshRow: js.Function0[scala.Unit],
    relative: js.Function1[scala.Double, scala.Boolean],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeRowSetListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSetListener, scala.Unit],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    rowDeleted: js.Function0[scala.Boolean],
    rowInserted: js.Function0[scala.Boolean],
    rowUpdated: js.Function0[scala.Boolean],
    setArray: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray, scala.Unit],
    setBinaryStream: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    setBlob: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob, scala.Unit],
    setBoolean: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    setByte: js.Function2[scala.Double, scala.Double, scala.Unit],
    setBytes: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Unit
    ],
    setCharacterStream: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    setClob: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob, scala.Unit],
    setDate: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    setDouble: js.Function2[scala.Double, scala.Double, scala.Unit],
    setFloat: js.Function2[scala.Double, scala.Double, scala.Unit],
    setInt: js.Function2[scala.Double, scala.Double, scala.Unit],
    setLong: js.Function2[scala.Double, scala.Double, scala.Unit],
    setNull: js.Function2[scala.Double, scala.Double, scala.Unit],
    setObject: js.Function2[scala.Double, js.Any, scala.Unit],
    setObjectNull: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Unit],
    setObjectWithInfo: js.Function4[scala.Double, js.Any, scala.Double, scala.Double, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setRef: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef, scala.Unit],
    setShort: js.Function2[scala.Double, scala.Double, scala.Unit],
    setString: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setTime: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    setTimestamp: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime, 
      scala.Unit
    ]
  ): DatabaseDataProvider = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, ApplyFilter = ApplyFilter, Command = Command, CommandType = CommandType, DataSourceName = DataSourceName, DetailFields = DetailFields, EscapeProcessing = EscapeProcessing, Filter = Filter, GroupBy = GroupBy, HavingClause = HavingClause, MasterFields = MasterFields, Order = Order, PropertySetInfo = PropertySetInfo, RangeSelection = RangeSelection, Row = Row, RowLimit = RowLimit, Statement = Statement, absolute = absolute, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addRowSetListener = addRowSetListener, addVetoableChangeListener = addVetoableChangeListener, afterLast = afterLast, beforeFirst = beforeFirst, clearParameters = clearParameters, convertRangeFromXML = convertRangeFromXML, convertRangeToXML = convertRangeToXML, createDataSequenceByRangeRepresentation = createDataSequenceByRangeRepresentation, createDataSequenceByRangeRepresentationPossible = createDataSequenceByRangeRepresentationPossible, createDataSequenceByValueArray = createDataSequenceByValueArray, createDataSource = createDataSource, createDataSourcePossible = createDataSourcePossible, createWithConnection = createWithConnection, detectArguments = detectArguments, dispose = dispose, execute = execute, first = first, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getRangeSelection = getRangeSelection, getRow = getRow, getStatement = getStatement, initialize = initialize, isAfterLast = isAfterLast, isBeforeFirst = isBeforeFirst, isFirst = isFirst, isLast = isLast, last = last, next = next, previous = previous, queryInterface = queryInterface, refreshRow = refreshRow, relative = relative, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeRowSetListener = removeRowSetListener, removeVetoableChangeListener = removeVetoableChangeListener, rowDeleted = rowDeleted, rowInserted = rowInserted, rowUpdated = rowUpdated, setArray = setArray, setBinaryStream = setBinaryStream, setBlob = setBlob, setBoolean = setBoolean, setByte = setByte, setBytes = setBytes, setCharacterStream = setCharacterStream, setClob = setClob, setDate = setDate, setDouble = setDouble, setFloat = setFloat, setInt = setInt, setLong = setLong, setNull = setNull, setObject = setObject, setObjectNull = setObjectNull, setObjectWithInfo = setObjectWithInfo, setPropertyValue = setPropertyValue, setRef = setRef, setShort = setShort, setString = setString, setTime = setTime, setTimestamp = setTimestamp)
  
    __obj.asInstanceOf[DatabaseDataProvider]
  }
}

