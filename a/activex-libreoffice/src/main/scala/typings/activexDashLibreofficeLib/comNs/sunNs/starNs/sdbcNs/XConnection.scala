package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a connection (session) with a specific database. Within the context of a {@link Connection} , SQL statements are executed and results are
  * returned.
  *
  * A {@link Connection} 's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, and the
  * capabilities of this connection. This information is obtained with the com::sun::star::sdbc::XDatabaseMetaData::getMetaData() method.
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.XStatement
  * @see com.sun.star.sdbc.XDatabaseMetaData
  */
trait XConnection extends XCloseable {
  /**
    * gets the current auto-commit state.
    * @returns the current state of auto-commit mode.
    * @see setAutoCommit
    * @throws SQLException if a database access error occurs.
    */
  var AutoCommit: scala.Boolean
  /**
    * returns the {@link Connection} 's current catalog name.
    * @returns the current catalog name or an empty string.
    * @throws SQLException if a database access error occurs.
    */
  var Catalog: java.lang.String
  /**
    * gets the metadata regarding this connection's database.
    *
    * A {@link Connection} 's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, the
    * capabilities of this connection, and so on. This information is made available through a DatabaseMetaData object.
    * @returns a DatabaseMetaData object for this {@link Connection} .
    * @throws SQLException if a database access error occurs.
    */
  val MetaData: XDatabaseMetaData
  /**
    * gets this {@link Connection} 's current transaction isolation level.
    * @returns the current {@link TransactionIsolation} mode value.
    * @throws SQLException if a database access error occurs.
    */
  var TransactionIsolation: scala.Double
  /**
    * gets the type map object associated with this connection. Only drivers which implement the custom type mapping facility will return an object
    * otherwise NULL could be returned.
    *
    * Unless the application has added an entry to the type map, the map returned will be empty.
    * @returns the XNameAccess object associated with this {@link Connection} object.
    * @throws SQLException if a database access error occurs.
    */
  var TypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * makes all changes made since the previous commit/rollback permanent and releases any database locks currently held by the {@link Connection} . This
    * method should be used only when auto-commit mode has been disabled.
    * @see setAutoCommit
    * @throws SQLException if a database access error occurs.
    */
  def commit(): scala.Unit
  /**
    * creates a new {@link com.sun.star.sdbc.Statement} object for sending SQL statements to the database.
    *
    * SQL statements without parameters are normally executed using {@link Statement} objects. If the same SQL statement is executed many times, it is more
    * efficient to use a {@link com.sun.star.sdbc.PreparedStatement} .
    *
    * Result sets created using the returned {@link Statement} will have forward-only type, and read-only concurrency, by default.
    *
    * Escape processing for the SQL-Statement is enabled, by default.
    * @returns a new {@link Statement} object
    * @throws SQLException if a database access error occurs.
    */
  def createStatement(): XStatement
  /**
    * gets the current auto-commit state.
    * @returns the current state of auto-commit mode.
    * @see setAutoCommit
    * @throws SQLException if a database access error occurs.
    */
  def getAutoCommit(): scala.Boolean
  /**
    * returns the {@link Connection} 's current catalog name.
    * @returns the current catalog name or an empty string.
    * @throws SQLException if a database access error occurs.
    */
  def getCatalog(): java.lang.String
  /**
    * gets the metadata regarding this connection's database.
    *
    * A {@link Connection} 's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, the
    * capabilities of this connection, and so on. This information is made available through a DatabaseMetaData object.
    * @returns a DatabaseMetaData object for this {@link Connection} .
    * @throws SQLException if a database access error occurs.
    */
  def getMetaData(): XDatabaseMetaData
  /**
    * gets this {@link Connection} 's current transaction isolation level.
    * @returns the current {@link TransactionIsolation} mode value.
    * @throws SQLException if a database access error occurs.
    */
  def getTransactionIsolation(): scala.Double
  /**
    * gets the type map object associated with this connection. Only drivers which implement the custom type mapping facility will return an object
    * otherwise NULL could be returned.
    *
    * Unless the application has added an entry to the type map, the map returned will be empty.
    * @returns the XNameAccess object associated with this {@link Connection} object.
    * @throws SQLException if a database access error occurs.
    */
  def getTypeMap(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * tests to see if a connection is closed.
    *
    * ** Note: ** A {@link Connection} is automatically closed if no one references it anymore. Certain fatal errors also result in a closed {@link
    * Connection} .
    * @returns `TRUE` if the connection is closed; `FALSE` if it's still open.
    * @throws SQLException if a database access error occurs.
    */
  def isClosed(): scala.Boolean
  /**
    * tests to see if the connection is in read-only mode.
    * @returns `TRUE` if connection is read-only and `FALSE` otherwise.
    * @throws SQLException if a database access error occurs.
    */
  def isReadOnly(): scala.Boolean
  /**
    * converts the given SQL statement into the system's native SQL grammar. A driver may convert the JDBC SQL grammar into its system's native SQL grammar
    * prior to sending it; this method returns the native form of the statement that the driver would have sent.
    * @param sql a SQL statement that may contain one or more "?" parameter placeholders
    * @returns the native form of this statement
    * @throws SQLException if a database access error occurs.
    */
  def nativeSQL(sql: java.lang.String): java.lang.String
  /**
    * creates a {@link com.sun.star.sdbc.CallableStatement} object for calling database stored procedures.
    *
    * The {@link CallableStatement} provides methods for setting up its IN and OUT parameters, and methods for executing the call to a stored procedure.
    *
    * ** Note: ** This method is optimized for handling stored procedure call statements. Some drivers may send the call statement to the database when the
    * method `prepareCall` is done; ;  others may wait until the {@link CallableStatement} is executed. This has no direct effect on users; however, it does
    * affect which method throws certain SQLExceptions. Result sets created using the returned {@link CallableStatement} will have forward-only type and
    * read-only concurrency, by default.
    * @param sql a SQL statement that may contain one or more "?" IN parameter placeholders
    * @returns a new {@link PreparedStatement} object containing the pre-compiled statement
    * @throws SQLException if a database access error occurs.
    */
  def prepareCall(sql: java.lang.String): XPreparedStatement
  /**
    * creates a {@link com.sun.star.sdbc.PreparedStatement} object for sending parameterized SQL statements to the database.
    *
    * A SQL statement with or without IN parameters can be pre-compiled and stored in a {@link PreparedStatement} object. This object can then be used to
    * efficiently execute this statement multiple times.
    *
    * ** Note: ** This method is optimized for handling parametric SQL statements that benefit from precompilation. If the driver supports precompilation,
    * the method `prepareStatement` will send the statement to the database for precompilation. Some drivers may not support precompilation. In this case,
    * the statement may not be sent to the database until the {@link com.sun.star.sdbc.PreparedStatement} is executed. This has no direct effect on users;
    * however, it does affect which method throws certain SQLExceptions.
    *
    * Result sets created using the returned {@link PreparedStatement} will have forward-only type and read-only concurrency, by default.
    *
    * Escape processing for the SQL-Statement is enabled, by default.
    * @param sql a SQL statement that may contain one or more "?" IN parameter placeholders
    * @returns a new {@link PreparedStatement} object containing the pre-compiled statement
    * @throws SQLException if a database access error occurs.
    */
  def prepareStatement(sql: java.lang.String): XPreparedStatement
  /**
    * drops all changes made since the previous commit/rollback and releases any database locks currently held by this {@link Connection} . This method
    * should be used only when auto-commit has been disabled.
    * @see setAutoCommit
    * @throws SQLException if a database access error occurs.
    */
  def rollback(): scala.Unit
  /**
    * sets this connection's auto-commit mode.
    *
    * If a connection is in auto-commit mode, then all its SQL statements will be executed and committed as individual transactions. Otherwise, its SQL
    * statements are grouped into transactions that are terminated by a call to either the method {@link com.sun.star.sdbc.XConnection.commit()} or the
    * method {@link com.sun.star.sdbc.XConnection.rollback()} . By default, new connections are in auto-commit mode.
    *
    * The commit occurs when the statement completes or the next execute occurs, whichever comes first. In the case of statements returning a {@link
    * ResultSet} , the statement completes when the last row of the {@link ResultSet} has been retrieved or the {@link ResultSet} has been closed. In
    * advanced cases, a single statement may return multiple results as well as output parameter values. In these cases the commit occurs when all results
    * and output parameter values have been retrieved.
    * @param autoCommit `TRUE` enables auto-commit; `FALSE` disables auto-commit.
    * @throws SQLException if a database access error occurs.
    */
  def setAutoCommit(autoCommit: scala.Boolean): scala.Unit
  /**
    * sets a catalog name in order to select a subspace of this {@link Connection} 's database in which to work. If the driver does not support catalogs, it
    * will silently ignore this request.
    * @param catalog the name of the catalog.
    * @throws SQLException if a database access error occurs.
    */
  def setCatalog(catalog: java.lang.String): scala.Unit
  /**
    * puts this connection in read-only mode as a hint to enable database optimizations.
    *
    * ** Note: ** This method cannot be called while in the middle of a transaction. Calling setReadOnly with `TRUE` does not necessarily cause writes to be
    * prohibited.
    * @param readOnly `TRUE` enables read-only mode; `FALSE` disables read-only mode.
    * @throws SQLException if a database access error occurs.
    */
  def setReadOnly(readOnly: scala.Boolean): scala.Unit
  /**
    * attempts to change the transaction isolation level to the one given.
    *
    * The constants defined in {@link com.sun.star.sdbc.TransactionIsolation} are the possible transaction isolation levels.
    *
    * ** Note: ** This method cannot be called while in the middle of a transaction.
    * @param level one of the {@link TransactionIsolation} values with the exception of NONE; some databases may not support other values.
    * @see com.sun.star.sdbc.XDatabaseMetaData.supportsTransactionIsolationLevel()
    * @throws SQLException if a database access error occurs.
    */
  def setTransactionIsolation(level: scala.Double): scala.Unit
  /**
    * installs the given type map as the type map for this connection. The type map will be used for the custom mapping of SQL structured types and distinct
    * types.
    *
    * Only if the driver supports custom type mapping is the setting of a map allowed.
    * @param typeMap set the XNameAccess object associated with this {@link Connection} object.
    * @throws SQLException if a database access error occurs.
    */
  def setTypeMap(typeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess): scala.Unit
}

object XConnection {
  @scala.inline
  def apply(
    AutoCommit: scala.Boolean,
    Catalog: java.lang.String,
    MetaData: XDatabaseMetaData,
    TransactionIsolation: scala.Double,
    TypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    commit: js.Function0[scala.Unit],
    createStatement: js.Function0[XStatement],
    getAutoCommit: js.Function0[scala.Boolean],
    getCatalog: js.Function0[java.lang.String],
    getMetaData: js.Function0[XDatabaseMetaData],
    getTransactionIsolation: js.Function0[scala.Double],
    getTypeMap: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    isClosed: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    nativeSQL: js.Function1[java.lang.String, java.lang.String],
    prepareCall: js.Function1[java.lang.String, XPreparedStatement],
    prepareStatement: js.Function1[java.lang.String, XPreparedStatement],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    rollback: js.Function0[scala.Unit],
    setAutoCommit: js.Function1[scala.Boolean, scala.Unit],
    setCatalog: js.Function1[java.lang.String, scala.Unit],
    setReadOnly: js.Function1[scala.Boolean, scala.Unit],
    setTransactionIsolation: js.Function1[scala.Double, scala.Unit],
    setTypeMap: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess, scala.Unit]
  ): XConnection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit, Catalog = Catalog, MetaData = MetaData, TransactionIsolation = TransactionIsolation, TypeMap = TypeMap, acquire = acquire, close = close, commit = commit, createStatement = createStatement, getAutoCommit = getAutoCommit, getCatalog = getCatalog, getMetaData = getMetaData, getTransactionIsolation = getTransactionIsolation, getTypeMap = getTypeMap, isClosed = isClosed, isReadOnly = isReadOnly, nativeSQL = nativeSQL, prepareCall = prepareCall, prepareStatement = prepareStatement, queryInterface = queryInterface, release = release, rollback = rollback, setAutoCommit = setAutoCommit, setCatalog = setCatalog, setReadOnly = setReadOnly, setTransactionIsolation = setTransactionIsolation, setTypeMap = setTypeMap)
  
    __obj.asInstanceOf[XConnection]
  }
}

