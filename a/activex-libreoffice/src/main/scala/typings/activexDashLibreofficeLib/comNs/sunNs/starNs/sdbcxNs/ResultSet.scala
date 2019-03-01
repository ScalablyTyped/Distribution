package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the SDBC {@link ResultSet} by the possibility of bookmark positioning, canceling the positioning, and updating of rows. */
trait ResultSet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCancellable
     with XRowLocate
     with XDeleteRows {
  /**
    * returns whether the result set supports updating of newly inserted rows. This may not work, as the result set may contain automatic generated data
    * which is used as key information.
    */
  var CanUpdateInsertedRows: scala.Boolean
  /** returns if the result set supports bookmark navigation. */
  var IsBookmarkable: scala.Boolean
}

object ResultSet {
  @scala.inline
  def apply(
    Bookmark: js.Any,
    CanUpdateInsertedRows: scala.Boolean,
    CursorName: java.lang.String,
    FetchDirection: scala.Double,
    FetchSize: scala.Double,
    IsBookmarkable: scala.Boolean,
    MetaData: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetMetaData,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ResultSetConcurrency: scala.Double,
    ResultSetType: scala.Double,
    Row: scala.Double,
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
    cancel: js.Function0[scala.Unit],
    cancelRowUpdates: js.Function0[scala.Unit],
    clearWarnings: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    compareBookmarks: js.Function2[js.Any, js.Any, scala.Double],
    deleteRow: js.Function0[scala.Unit],
    deleteRows: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    dispose: js.Function0[scala.Unit],
    findColumn: js.Function1[java.lang.String, scala.Double],
    first: js.Function0[scala.Boolean],
    getArray: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray],
    getBinaryStream: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getBlob: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob],
    getBookmark: js.Function0[js.Any],
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
    hasOrderedBookmarks: js.Function0[scala.Boolean],
    hashBookmark: js.Function1[js.Any, scala.Double],
    insertRow: js.Function0[scala.Unit],
    isAfterLast: js.Function0[scala.Boolean],
    isBeforeFirst: js.Function0[scala.Boolean],
    isFirst: js.Function0[scala.Boolean],
    isLast: js.Function0[scala.Boolean],
    last: js.Function0[scala.Boolean],
    moveRelativeToBookmark: js.Function2[js.Any, scala.Double, scala.Boolean],
    moveToBookmark: js.Function1[js.Any, scala.Boolean],
    moveToCurrentRow: js.Function0[scala.Unit],
    moveToInsertRow: js.Function0[scala.Unit],
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
  ): ResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bookmark")(Bookmark)
    __obj.updateDynamic("CanUpdateInsertedRows")(CanUpdateInsertedRows)
    __obj.updateDynamic("CursorName")(CursorName)
    __obj.updateDynamic("FetchDirection")(FetchDirection)
    __obj.updateDynamic("FetchSize")(FetchSize)
    __obj.updateDynamic("IsBookmarkable")(IsBookmarkable)
    __obj.updateDynamic("MetaData")(MetaData)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("ResultSetConcurrency")(ResultSetConcurrency)
    __obj.updateDynamic("ResultSetType")(ResultSetType)
    __obj.updateDynamic("Row")(Row)
    __obj.updateDynamic("Statement")(Statement)
    __obj.updateDynamic("Warnings")(Warnings)
    __obj.updateDynamic("absolute")(absolute)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("afterLast")(afterLast)
    __obj.updateDynamic("beforeFirst")(beforeFirst)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("cancelRowUpdates")(cancelRowUpdates)
    __obj.updateDynamic("clearWarnings")(clearWarnings)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("compareBookmarks")(compareBookmarks)
    __obj.updateDynamic("deleteRow")(deleteRow)
    __obj.updateDynamic("deleteRows")(deleteRows)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("findColumn")(findColumn)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("getArray")(getArray)
    __obj.updateDynamic("getBinaryStream")(getBinaryStream)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getBookmark")(getBookmark)
    __obj.updateDynamic("getBoolean")(getBoolean)
    __obj.updateDynamic("getByte")(getByte)
    __obj.updateDynamic("getBytes")(getBytes)
    __obj.updateDynamic("getCharacterStream")(getCharacterStream)
    __obj.updateDynamic("getClob")(getClob)
    __obj.updateDynamic("getDate")(getDate)
    __obj.updateDynamic("getDouble")(getDouble)
    __obj.updateDynamic("getFloat")(getFloat)
    __obj.updateDynamic("getInt")(getInt)
    __obj.updateDynamic("getLong")(getLong)
    __obj.updateDynamic("getMetaData")(getMetaData)
    __obj.updateDynamic("getObject")(getObject)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getRef")(getRef)
    __obj.updateDynamic("getRow")(getRow)
    __obj.updateDynamic("getShort")(getShort)
    __obj.updateDynamic("getStatement")(getStatement)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getTime")(getTime)
    __obj.updateDynamic("getTimestamp")(getTimestamp)
    __obj.updateDynamic("getWarnings")(getWarnings)
    __obj.updateDynamic("hasOrderedBookmarks")(hasOrderedBookmarks)
    __obj.updateDynamic("hashBookmark")(hashBookmark)
    __obj.updateDynamic("insertRow")(insertRow)
    __obj.updateDynamic("isAfterLast")(isAfterLast)
    __obj.updateDynamic("isBeforeFirst")(isBeforeFirst)
    __obj.updateDynamic("isFirst")(isFirst)
    __obj.updateDynamic("isLast")(isLast)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("moveRelativeToBookmark")(moveRelativeToBookmark)
    __obj.updateDynamic("moveToBookmark")(moveToBookmark)
    __obj.updateDynamic("moveToCurrentRow")(moveToCurrentRow)
    __obj.updateDynamic("moveToInsertRow")(moveToInsertRow)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("previous")(previous)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("refreshRow")(refreshRow)
    __obj.updateDynamic("relative")(relative)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("rowDeleted")(rowDeleted)
    __obj.updateDynamic("rowInserted")(rowInserted)
    __obj.updateDynamic("rowUpdated")(rowUpdated)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("updateBinaryStream")(updateBinaryStream)
    __obj.updateDynamic("updateBoolean")(updateBoolean)
    __obj.updateDynamic("updateByte")(updateByte)
    __obj.updateDynamic("updateBytes")(updateBytes)
    __obj.updateDynamic("updateCharacterStream")(updateCharacterStream)
    __obj.updateDynamic("updateDate")(updateDate)
    __obj.updateDynamic("updateDouble")(updateDouble)
    __obj.updateDynamic("updateFloat")(updateFloat)
    __obj.updateDynamic("updateInt")(updateInt)
    __obj.updateDynamic("updateLong")(updateLong)
    __obj.updateDynamic("updateNull")(updateNull)
    __obj.updateDynamic("updateNumericObject")(updateNumericObject)
    __obj.updateDynamic("updateObject")(updateObject)
    __obj.updateDynamic("updateRow")(updateRow)
    __obj.updateDynamic("updateShort")(updateShort)
    __obj.updateDynamic("updateString")(updateString)
    __obj.updateDynamic("updateTime")(updateTime)
    __obj.updateDynamic("updateTimestamp")(updateTimestamp)
    __obj.updateDynamic("wasNull")(wasNull)
    __obj.asInstanceOf[ResultSet]
  }
}

