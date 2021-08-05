package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.sdbc.XArray
import typings.activexLibreoffice.com_.sun.star.sdbc.XBlob
import typings.activexLibreoffice.com_.sun.star.sdbc.XClob
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XParameters
import typings.activexLibreoffice.com_.sun.star.sdbc.XRef
import typings.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typings.activexLibreoffice.com_.sun.star.sdbc.XRowSetListener
import typings.activexLibreoffice.com_.sun.star.sheet.XRangeSelection
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies a {@link XDataProvider} for result sets.
  * @see XDataProvider
  * @see DataProvider
  */
trait XDatabaseDataProvider
  extends StObject
     with XDataProvider
     with XRangeXMLConversion
     with XInitialization
     with XComponent
     with XPropertySet
     with XParameters
     with XRowSet {
  
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: XConnection
  
  /** indicates whether the filter should be applied or not, default is `FALSE` . */
  var ApplyFilter: Boolean
  
  /**
    * is the command which should be executed, the type of command depends on the CommandType.
    *
    * In case of a {@link CommandType} of CommandType::COMMAND, means in case the {@link Command} specifies an SQL statement, the inherited {@link
    * com.sun.star.sdbc.RowSet.EscapeProcessing} becomes relevant: ;  It then can be to used to specify whether the SQL statement should be analyzed on the
    * client side before sending it to the database server. ;  The default value for {@link com.sun.star.sdbc.RowSet.EscapeProcessing} is `TRUE` . By
    * switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL, to your database.
    * @see com.sun.star.sdb.CommandType
    */
  var Command: String
  
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: Double
  
  /** is the name of the data source to use, this could be a named data source or the URL of a data access component. */
  var DataSourceName: String
  
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
  var DetailFields: SafeArray[String]
  
  /**
    * specifies if the {@link Command} should be analyzed on the client side before sending it to the database server.
    *
    * The default value of this property is `TRUE` . By switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL,
    * to your database.
    *
    * This property is usually present together with the {@link Command} and {@link CommandType} properties, and is evaluated if and only if {@link
    * CommandType} equals CommandType::COMMAND.
    */
  var EscapeProcessing: Boolean
  
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
  var Filter: String
  
  /** additional group by for the row set */
  var GroupBy: String
  
  /** additional having clause for the row set */
  var HavingClause: String
  
  /**
    * is used for subreports and contains the names of columns of the parent report.
    *
    * These columns are typically the foreign key fields of the parent report. The values of theses columns are used to identify the data for the subreport.
    * Each time the parent report changes its current row, the subreport requeries it's data based on the values of the master fields.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var MasterFields: SafeArray[String]
  
  /** is a additional sort order definition for a row set. */
  var Order: String
  
  /**
    * specifies the maximal count of rows which should be fetched.
    *
    * A value of zero implies that no limit exists.
    */
  var RowLimit: Double
}
object XDatabaseDataProvider {
  
  inline def apply(
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
    detectArguments: XDataSource => SafeArray[PropertyValue],
    dispose: () => Unit,
    execute: () => Unit,
    first: () => Boolean,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRangeSelection: () => XRangeSelection,
    getRow: () => Double,
    getStatement: () => XInterface,
    initialize: SeqEquiv[js.Any] => Unit,
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
  ): XDatabaseDataProvider = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], ApplyFilter = ApplyFilter.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], CommandType = CommandType.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], DetailFields = DetailFields.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], MasterFields = MasterFields.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RangeSelection = RangeSelection.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], RowLimit = RowLimit.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], absolute = js.Any.fromFunction1(absolute), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRowSetListener = js.Any.fromFunction1(addRowSetListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), afterLast = js.Any.fromFunction0(afterLast), beforeFirst = js.Any.fromFunction0(beforeFirst), clearParameters = js.Any.fromFunction0(clearParameters), convertRangeFromXML = js.Any.fromFunction1(convertRangeFromXML), convertRangeToXML = js.Any.fromFunction1(convertRangeToXML), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), detectArguments = js.Any.fromFunction1(detectArguments), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), first = js.Any.fromFunction0(first), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRangeSelection = js.Any.fromFunction0(getRangeSelection), getRow = js.Any.fromFunction0(getRow), getStatement = js.Any.fromFunction0(getStatement), initialize = js.Any.fromFunction1(initialize), isAfterLast = js.Any.fromFunction0(isAfterLast), isBeforeFirst = js.Any.fromFunction0(isBeforeFirst), isFirst = js.Any.fromFunction0(isFirst), isLast = js.Any.fromFunction0(isLast), last = js.Any.fromFunction0(last), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = js.Any.fromFunction0(refreshRow), relative = js.Any.fromFunction1(relative), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRowSetListener = js.Any.fromFunction1(removeRowSetListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rowDeleted = js.Any.fromFunction0(rowDeleted), rowInserted = js.Any.fromFunction0(rowInserted), rowUpdated = js.Any.fromFunction0(rowUpdated), setArray = js.Any.fromFunction2(setArray), setBinaryStream = js.Any.fromFunction3(setBinaryStream), setBlob = js.Any.fromFunction2(setBlob), setBoolean = js.Any.fromFunction2(setBoolean), setByte = js.Any.fromFunction2(setByte), setBytes = js.Any.fromFunction2(setBytes), setCharacterStream = js.Any.fromFunction3(setCharacterStream), setClob = js.Any.fromFunction2(setClob), setDate = js.Any.fromFunction2(setDate), setDouble = js.Any.fromFunction2(setDouble), setFloat = js.Any.fromFunction2(setFloat), setInt = js.Any.fromFunction2(setInt), setLong = js.Any.fromFunction2(setLong), setNull = js.Any.fromFunction2(setNull), setObject = js.Any.fromFunction2(setObject), setObjectNull = js.Any.fromFunction3(setObjectNull), setObjectWithInfo = js.Any.fromFunction4(setObjectWithInfo), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setRef = js.Any.fromFunction2(setRef), setShort = js.Any.fromFunction2(setShort), setString = js.Any.fromFunction2(setString), setTime = js.Any.fromFunction2(setTime), setTimestamp = js.Any.fromFunction2(setTimestamp))
    __obj.asInstanceOf[XDatabaseDataProvider]
  }
  
  extension [Self <: XDatabaseDataProvider](x: Self) {
    
    inline def setActiveConnection(value: XConnection): Self = StObject.set(x, "ActiveConnection", value.asInstanceOf[js.Any])
    
    inline def setApplyFilter(value: Boolean): Self = StObject.set(x, "ApplyFilter", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommandType(value: Double): Self = StObject.set(x, "CommandType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceName(value: String): Self = StObject.set(x, "DataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDetailFields(value: SafeArray[String]): Self = StObject.set(x, "DetailFields", value.asInstanceOf[js.Any])
    
    inline def setEscapeProcessing(value: Boolean): Self = StObject.set(x, "EscapeProcessing", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGroupBy(value: String): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setHavingClause(value: String): Self = StObject.set(x, "HavingClause", value.asInstanceOf[js.Any])
    
    inline def setMasterFields(value: SafeArray[String]): Self = StObject.set(x, "MasterFields", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: String): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setRowLimit(value: Double): Self = StObject.set(x, "RowLimit", value.asInstanceOf[js.Any])
  }
}
