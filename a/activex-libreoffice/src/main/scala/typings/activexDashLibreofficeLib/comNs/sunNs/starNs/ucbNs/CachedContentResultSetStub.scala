package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used on provider side to access a {@link ContentResultSet} remote optimized. */
trait CachedContentResultSetStub
  extends ContentResultSet
     with XFetchProvider
     with XFetchProviderForContentAccess

object CachedContentResultSetStub {
  @scala.inline
  def apply(
    CursorName: java.lang.String,
    CursorTravelMode: scala.Double,
    FetchDirection: scala.Double,
    FetchSize: scala.Double,
    IsRowCountFinal: scala.Boolean,
    MetaData: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetMetaData,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ResultSetConcurrency: scala.Double,
    ResultSetType: scala.Double,
    Row: scala.Double,
    RowCount: scala.Double,
    Statement: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Warnings: js.Any,
    absolute: js.Function1[scala.Double, scala.Boolean],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    afterLast: js.Function0[scala.Unit],
    beforeFirst: js.Function0[scala.Unit],
    cancelRowUpdates: js.Function0[scala.Unit],
    clearWarnings: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    deleteRow: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    fetch: js.Function3[scala.Double, scala.Double, scala.Boolean, FetchResult],
    fetchContentIdentifierStrings: js.Function3[scala.Double, scala.Double, scala.Boolean, FetchResult],
    fetchContentIdentifiers: js.Function3[scala.Double, scala.Double, scala.Boolean, FetchResult],
    fetchContents: js.Function3[scala.Double, scala.Double, scala.Boolean, FetchResult],
    findColumn: js.Function1[java.lang.String, scala.Double],
    first: js.Function0[scala.Boolean],
    getArray: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray],
    getBinaryStream: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getBlob: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob],
    getBoolean: js.Function1[scala.Double, scala.Boolean],
    getByte: js.Function1[scala.Double, scala.Double],
    getBytes: js.Function1[scala.Double, activexDashInteropLib.SafeArray[scala.Double]],
    getCharacterStream: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getClob: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob],
    getDate: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    getDouble: js.Function1[scala.Double, scala.Double],
    getFloat: js.Function1[scala.Double, scala.Double],
    getInt: js.Function1[scala.Double, scala.Double],
    getLong: js.Function1[scala.Double, scala.Double],
    getMetaData: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetMetaData],
    getObject: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess, 
      js.Any
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getRef: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef],
    getRow: js.Function0[scala.Double],
    getShort: js.Function1[scala.Double, scala.Double],
    getStatement: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getString: js.Function1[scala.Double, java.lang.String],
    getTime: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getTimestamp: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime],
    getWarnings: js.Function0[js.Any],
    insertRow: js.Function0[scala.Unit],
    isAfterLast: js.Function0[scala.Boolean],
    isBeforeFirst: js.Function0[scala.Boolean],
    isFirst: js.Function0[scala.Boolean],
    isLast: js.Function0[scala.Boolean],
    last: js.Function0[scala.Boolean],
    moveToCurrentRow: js.Function0[scala.Unit],
    moveToInsertRow: js.Function0[scala.Unit],
    next: js.Function0[scala.Boolean],
    previous: js.Function0[scala.Boolean],
    queryContent: js.Function0[XContent],
    queryContentIdentifier: js.Function0[XContentIdentifier],
    queryContentIdentifierString: js.Function0[java.lang.String],
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
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    rowDeleted: js.Function0[scala.Boolean],
    rowInserted: js.Function0[scala.Boolean],
    rowUpdated: js.Function0[scala.Boolean],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    updateBinaryStream: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    updateBoolean: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    updateByte: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateBytes: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Unit
    ],
    updateCharacterStream: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    updateDate: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    updateDouble: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateFloat: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateInt: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateLong: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateNull: js.Function1[scala.Double, scala.Unit],
    updateNumericObject: js.Function3[scala.Double, js.Any, scala.Double, scala.Unit],
    updateObject: js.Function2[scala.Double, js.Any, scala.Unit],
    updateRow: js.Function0[scala.Unit],
    updateShort: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateString: js.Function2[scala.Double, java.lang.String, scala.Unit],
    updateTime: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    updateTimestamp: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime, 
      scala.Unit
    ],
    wasNull: js.Function0[scala.Boolean]
  ): CachedContentResultSetStub = {
    val __obj = js.Dynamic.literal(CursorName = CursorName, CursorTravelMode = CursorTravelMode, FetchDirection = FetchDirection, FetchSize = FetchSize, IsRowCountFinal = IsRowCountFinal, MetaData = MetaData, PropertySetInfo = PropertySetInfo, ResultSetConcurrency = ResultSetConcurrency, ResultSetType = ResultSetType, Row = Row, RowCount = RowCount, Statement = Statement, Warnings = Warnings, absolute = absolute, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, afterLast = afterLast, beforeFirst = beforeFirst, cancelRowUpdates = cancelRowUpdates, clearWarnings = clearWarnings, close = close, deleteRow = deleteRow, dispose = dispose, fetch = fetch, fetchContentIdentifierStrings = fetchContentIdentifierStrings, fetchContentIdentifiers = fetchContentIdentifiers, fetchContents = fetchContents, findColumn = findColumn, first = first, getArray = getArray, getBinaryStream = getBinaryStream, getBlob = getBlob, getBoolean = getBoolean, getByte = getByte, getBytes = getBytes, getCharacterStream = getCharacterStream, getClob = getClob, getDate = getDate, getDouble = getDouble, getFloat = getFloat, getInt = getInt, getLong = getLong, getMetaData = getMetaData, getObject = getObject, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getRef = getRef, getRow = getRow, getShort = getShort, getStatement = getStatement, getString = getString, getTime = getTime, getTimestamp = getTimestamp, getWarnings = getWarnings, insertRow = insertRow, isAfterLast = isAfterLast, isBeforeFirst = isBeforeFirst, isFirst = isFirst, isLast = isLast, last = last, moveToCurrentRow = moveToCurrentRow, moveToInsertRow = moveToInsertRow, next = next, previous = previous, queryContent = queryContent, queryContentIdentifier = queryContentIdentifier, queryContentIdentifierString = queryContentIdentifierString, queryInterface = queryInterface, refreshRow = refreshRow, relative = relative, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, rowDeleted = rowDeleted, rowInserted = rowInserted, rowUpdated = rowUpdated, setPropertyValue = setPropertyValue, updateBinaryStream = updateBinaryStream, updateBoolean = updateBoolean, updateByte = updateByte, updateBytes = updateBytes, updateCharacterStream = updateCharacterStream, updateDate = updateDate, updateDouble = updateDouble, updateFloat = updateFloat, updateInt = updateInt, updateLong = updateLong, updateNull = updateNull, updateNumericObject = updateNumericObject, updateObject = updateObject, updateRow = updateRow, updateShort = updateShort, updateString = updateString, updateTime = updateTime, updateTimestamp = updateTimestamp, wasNull = wasNull)
  
    __obj.asInstanceOf[CachedContentResultSetStub]
  }
}

