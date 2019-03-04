package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a {@link XDataProvider} for result sets.
  * @see XDataProvider
  * @see DataProvider
  */
trait XDatabaseDataProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet
     with XDataProvider
     with XRangeXMLConversion
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XParameters {
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  /** indicates whether the filter should be applied or not, default is `FALSE` . */
  var ApplyFilter: scala.Boolean
  /**
    * is the command which should be executed, the type of command depends on the CommandType.
    *
    * In case of a {@link CommandType} of CommandType::COMMAND, means in case the {@link Command} specifies an SQL statement, the inherited {@link
    * com.sun.star.sdbc.RowSet.EscapeProcessing} becomes relevant: ;  It then can be to used to specify whether the SQL statement should be analyzed on the
    * client side before sending it to the database server. ;  The default value for {@link com.sun.star.sdbc.RowSet.EscapeProcessing} is `TRUE` . By
    * switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL, to your database.
    * @see com.sun.star.sdb.CommandType
    */
  var Command: java.lang.String
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: scala.Double
  /** is the name of the data source to use, this could be a named data source or the URL of a data access component. */
  var DataSourceName: java.lang.String
  /**
    * is used for subreports and contains the names of the columns of the subreport which are related to the master fields of the parent report.
    *
    * Entries in this sequence can either denote column names in the sub report, or parameter names. ;  For instance, you could base the report on the SQL
    * statement `SELECT * FROM invoices WHERE cust_ref = :cid` , and add `cid` to the DetailFields property. In this case, the parameter will be filled from
    * the corresponding master field. ;  Alternatively, you could simply base your report on the table `invoices` , and add the column name `cust_ref` to
    * the DetailFields. In this case, and implicit filter clause `WHERE cust_ref = :<new_param_name>` will be created, and the artificial parameter will be
    * filled from the corresponding master field. ;  If a string in this property denotes both a column name and a parameter name, it is undefined which way
    * it is interpreted, but implementations of the service are required to either decide for the parameter or the column, and proceed as usual.
    *
    * The columns specified herein typically represent a part of the primary key fields or their aliases of the detail report.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var DetailFields: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * specifies if the {@link Command} should be analyzed on the client side before sending it to the database server.
    *
    * The default value of this property is `TRUE` . By switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL,
    * to your database.
    *
    * This property is usually present together with the {@link Command} and {@link CommandType} properties, and is evaluated if and only if {@link
    * CommandType} equals CommandType::COMMAND.
    */
  var EscapeProcessing: scala.Boolean
  /**
    * specifies an additional filter to optionally use.
    *
    * The Filter string has to form a SQL WHERE-clause, **without** the WHERE-string itself.
    *
    * If a {@link DataSourceName} , {@link Command} and {@link CommandType} are specified, a RowSet can be created with this information. If the results
    * provided by the row set are to be additionally filtered, the Filter property can be used.
    *
    * Note that the Filter property does not make sense if a resultSet has been specified in the DataAccessDescriptor.
    * @see com.sun.star.sdb.RowSet
    * @see ResultSet
    */
  var Filter: java.lang.String
  /** additional group by for the row set */
  var GroupBy: java.lang.String
  /** additional having clause for the row set */
  var HavingClause: java.lang.String
  /**
    * is used for subreports and contains the names of columns of the parent report.
    *
    * These columns are typically the foreign key fields of the parent report. The values of theses columns are used to identify the data for the subreport.
    * Each time the parent report changes its current row, the subreport requeries it's data based on the values of the master fields.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var MasterFields: activexDashInteropLib.SafeArray[java.lang.String]
  /** is a additional sort order definition for a row set. */
  var Order: java.lang.String
  /**
    * specifies the maximal count of rows which should be fetched.
    *
    * A value of zero implies that no limit exists.
    */
  var RowLimit: scala.Double
}

object XDatabaseDataProvider {
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
  ): XDatabaseDataProvider = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, ApplyFilter = ApplyFilter, Command = Command, CommandType = CommandType, DataSourceName = DataSourceName, DetailFields = DetailFields, EscapeProcessing = EscapeProcessing, Filter = Filter, GroupBy = GroupBy, HavingClause = HavingClause, MasterFields = MasterFields, Order = Order, PropertySetInfo = PropertySetInfo, RangeSelection = RangeSelection, Row = Row, RowLimit = RowLimit, Statement = Statement, absolute = absolute, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addRowSetListener = addRowSetListener, addVetoableChangeListener = addVetoableChangeListener, afterLast = afterLast, beforeFirst = beforeFirst, clearParameters = clearParameters, convertRangeFromXML = convertRangeFromXML, convertRangeToXML = convertRangeToXML, createDataSequenceByRangeRepresentation = createDataSequenceByRangeRepresentation, createDataSequenceByRangeRepresentationPossible = createDataSequenceByRangeRepresentationPossible, createDataSequenceByValueArray = createDataSequenceByValueArray, createDataSource = createDataSource, createDataSourcePossible = createDataSourcePossible, detectArguments = detectArguments, dispose = dispose, execute = execute, first = first, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getRangeSelection = getRangeSelection, getRow = getRow, getStatement = getStatement, initialize = initialize, isAfterLast = isAfterLast, isBeforeFirst = isBeforeFirst, isFirst = isFirst, isLast = isLast, last = last, next = next, previous = previous, queryInterface = queryInterface, refreshRow = refreshRow, relative = relative, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeRowSetListener = removeRowSetListener, removeVetoableChangeListener = removeVetoableChangeListener, rowDeleted = rowDeleted, rowInserted = rowInserted, rowUpdated = rowUpdated, setArray = setArray, setBinaryStream = setBinaryStream, setBlob = setBlob, setBoolean = setBoolean, setByte = setByte, setBytes = setBytes, setCharacterStream = setCharacterStream, setClob = setClob, setDate = setDate, setDouble = setDouble, setFloat = setFloat, setInt = setInt, setLong = setLong, setNull = setNull, setObject = setObject, setObjectNull = setObjectNull, setObjectWithInfo = setObjectWithInfo, setPropertyValue = setPropertyValue, setRef = setRef, setShort = setShort, setString = setString, setTime = setTime, setTimestamp = setTimestamp)
  
    __obj.asInstanceOf[XDatabaseDataProvider]
  }
}

