package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a client side {@link ResultSet} , which combines the characteristics of a {@link com.sun.star.sdbc.Statement} and a {@link
  * com.sun.star.sdbc.ResultSet} .
  *
  * It acts like a typical bean. Before you use the {@link RowSet} , you have to specify a set of properties like a DataSource and a Command and other
  * properties known of {@link Statement} . ;  Afterwards, you can populate the {@link RowSet} by its execute method to fill the set with data.
  *
  * On the one hand, a {@link RowSet} can be used as a short cut to retrieve the data of a DataSource. You don't have to establish a connection, create a
  * {@link Statement} , and then create a {@link ResultSet} . On the other hand, a row set can be used to implement capabilities for a result set, which
  * are not supported by a driver result set, like caching strategies or update capabilities.
  */
trait RowSet
  extends ResultSet
     with XRowSet
     with XParameters {
  /** is the command which should be executed. */
  var Command: java.lang.String
  /**
    * is the name of a named datasource to use.
    * @see com.sun.star.sdbc:XDataSource
    */
  var DataSourceName: java.lang.String
  /**
    * returns if escape processing is on or off. If escape scanning is on (the default), the driver will do escape substitution before sending the SQL to
    * the database. This is only evaluated, if the CommandType is COMMAND.
    */
  var EscapeProcessing: scala.Boolean
  /**
    * returns the maximum number of bytes allowed for any column value.
    *
    * This limit is the maximum number of bytes that can be returned for any column value. The limit applies only to {@link
    * com.sun.star.sdbc.DataType.BINARY} , {@link com.sun.star.sdbc.DataType.VARBINARY} , {@link com.sun.star.sdbc.DataType.LONGVARBINARY} , {@link
    * com.sun.star.sdbc.DataType.CHAR} , {@link com.sun.star.sdbc.DataType.VARCHAR} , and {@link com.sun.star.sdbc.DataType.LONGVARCHAR} columns. If the
    * limit is exceeded, the excess data is silently discarded. ;  There is no limitation, if set to zero.
    */
  var MaxFieldSize: scala.Double
  /**
    * retrieves the maximum number of rows that a {@link ResultSet} can contain. If the limit is exceeded, the excess rows are silently dropped. ;  There is
    * no limitation, if set to zero.
    */
  var MaxRows: scala.Double
  /** determines the user for whom to open the connection. */
  var Password: java.lang.String
  /**
    * retrieves the number of seconds the driver will wait for a {@link Statement} to execute. If the limit is exceeded, a {@link
    * com.sun.star.sdbc.SQLException} is thrown. There is no limitation, if set to zero.
    */
  var QueryTimeOut: scala.Double
  /**
    * indicates the transaction isolation level, which should be used for the connection.
    * @see com.sun.star.sdbc.TransactionIsolation
    */
  var TransactionIsolation: scala.Double
  /** is the type map that will be used for the custom mapping of SQL structured types and distinct types. */
  var TypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** is the connection URL. Could be used instead of the DataSourceName. */
  var URL: java.lang.String
  /** determines the user for whom to open the connection. */
  var User: java.lang.String
}

object RowSet {
  @scala.inline
  def apply(
    Command: java.lang.String,
    DataSourceName: java.lang.String,
    EscapeProcessing: scala.Boolean,
    MaxFieldSize: scala.Double,
    MaxRows: scala.Double,
    Password: java.lang.String,
    QueryTimeOut: scala.Double,
    ResultSet: ResultSet = null,
    ResultSetType: scala.Double,
    TransactionIsolation: scala.Double,
    TypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    URL: java.lang.String,
    User: java.lang.String,
    XParameters: XParameters = null,
    XRowSet: XRowSet = null
  ): RowSet = {
    val __obj = js.Dynamic.literal(Command = Command, DataSourceName = DataSourceName, EscapeProcessing = EscapeProcessing, MaxFieldSize = MaxFieldSize, MaxRows = MaxRows, Password = Password, QueryTimeOut = QueryTimeOut, ResultSetType = ResultSetType, TransactionIsolation = TransactionIsolation, TypeMap = TypeMap, URL = URL, User = User)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ResultSet)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XParameters)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XRowSet)
    __obj.asInstanceOf[RowSet]
  }
}

