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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveConnection")(ActiveConnection)
    __obj.updateDynamic("ApplyFilter")(ApplyFilter)
    __obj.updateDynamic("Command")(Command)
    __obj.updateDynamic("CommandType")(CommandType)
    __obj.updateDynamic("DataSourceName")(DataSourceName)
    __obj.updateDynamic("DetailFields")(DetailFields)
    __obj.updateDynamic("EscapeProcessing")(EscapeProcessing)
    __obj.updateDynamic("Filter")(Filter)
    __obj.updateDynamic("GroupBy")(GroupBy)
    __obj.updateDynamic("HavingClause")(HavingClause)
    __obj.updateDynamic("MasterFields")(MasterFields)
    __obj.updateDynamic("Order")(Order)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RangeSelection")(RangeSelection)
    __obj.updateDynamic("Row")(Row)
    __obj.updateDynamic("RowLimit")(RowLimit)
    __obj.updateDynamic("Statement")(Statement)
    __obj.updateDynamic("absolute")(absolute)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addRowSetListener")(addRowSetListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("afterLast")(afterLast)
    __obj.updateDynamic("beforeFirst")(beforeFirst)
    __obj.updateDynamic("clearParameters")(clearParameters)
    __obj.updateDynamic("convertRangeFromXML")(convertRangeFromXML)
    __obj.updateDynamic("convertRangeToXML")(convertRangeToXML)
    __obj.updateDynamic("createDataSequenceByRangeRepresentation")(createDataSequenceByRangeRepresentation)
    __obj.updateDynamic("createDataSequenceByRangeRepresentationPossible")(createDataSequenceByRangeRepresentationPossible)
    __obj.updateDynamic("createDataSequenceByValueArray")(createDataSequenceByValueArray)
    __obj.updateDynamic("createDataSource")(createDataSource)
    __obj.updateDynamic("createDataSourcePossible")(createDataSourcePossible)
    __obj.updateDynamic("createWithConnection")(createWithConnection)
    __obj.updateDynamic("detectArguments")(detectArguments)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getRangeSelection")(getRangeSelection)
    __obj.updateDynamic("getRow")(getRow)
    __obj.updateDynamic("getStatement")(getStatement)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isAfterLast")(isAfterLast)
    __obj.updateDynamic("isBeforeFirst")(isBeforeFirst)
    __obj.updateDynamic("isFirst")(isFirst)
    __obj.updateDynamic("isLast")(isLast)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("previous")(previous)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("refreshRow")(refreshRow)
    __obj.updateDynamic("relative")(relative)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeRowSetListener")(removeRowSetListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("rowDeleted")(rowDeleted)
    __obj.updateDynamic("rowInserted")(rowInserted)
    __obj.updateDynamic("rowUpdated")(rowUpdated)
    __obj.updateDynamic("setArray")(setArray)
    __obj.updateDynamic("setBinaryStream")(setBinaryStream)
    __obj.updateDynamic("setBlob")(setBlob)
    __obj.updateDynamic("setBoolean")(setBoolean)
    __obj.updateDynamic("setByte")(setByte)
    __obj.updateDynamic("setBytes")(setBytes)
    __obj.updateDynamic("setCharacterStream")(setCharacterStream)
    __obj.updateDynamic("setClob")(setClob)
    __obj.updateDynamic("setDate")(setDate)
    __obj.updateDynamic("setDouble")(setDouble)
    __obj.updateDynamic("setFloat")(setFloat)
    __obj.updateDynamic("setInt")(setInt)
    __obj.updateDynamic("setLong")(setLong)
    __obj.updateDynamic("setNull")(setNull)
    __obj.updateDynamic("setObject")(setObject)
    __obj.updateDynamic("setObjectNull")(setObjectNull)
    __obj.updateDynamic("setObjectWithInfo")(setObjectWithInfo)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setRef")(setRef)
    __obj.updateDynamic("setShort")(setShort)
    __obj.updateDynamic("setString")(setString)
    __obj.updateDynamic("setTime")(setTime)
    __obj.updateDynamic("setTimestamp")(setTimestamp)
    __obj.asInstanceOf[DatabaseDataProvider]
  }
}

