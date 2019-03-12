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
  * capabilities of this connection. This information is obtained with the {@link com.sun.star.sdbc.XConnection.getMetaData()} method.
  *
  * ** Note: ** By default the {@link Connection} automatically commits changes after executing each statement. If auto commit has been disabled, an
  * explicit commit must be done or database changes will not be saved.
  * @see com.sun.star.sdbc.XStatement
  * @see com.sun.star.sdbc.XResultSet
  * @see com.sun.star.sdbc.XDatabaseMetaData
  */
trait Connection
  extends XConnection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XWarningsSupplier

object Connection {
  @scala.inline
  def apply(
    AutoCommit: scala.Boolean,
    Catalog: java.lang.String,
    MetaData: XDatabaseMetaData,
    TransactionIsolation: scala.Double,
    TypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Warnings: js.Any,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    clearWarnings: () => scala.Unit,
    close: () => scala.Unit,
    commit: () => scala.Unit,
    createStatement: () => XStatement,
    dispose: () => scala.Unit,
    getAutoCommit: () => scala.Boolean,
    getCatalog: () => java.lang.String,
    getMetaData: () => XDatabaseMetaData,
    getTransactionIsolation: () => scala.Double,
    getTypeMap: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getWarnings: () => js.Any,
    isClosed: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    nativeSQL: java.lang.String => java.lang.String,
    prepareCall: java.lang.String => XPreparedStatement,
    prepareStatement: java.lang.String => XPreparedStatement,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    rollback: () => scala.Unit,
    setAutoCommit: scala.Boolean => scala.Unit,
    setCatalog: java.lang.String => scala.Unit,
    setReadOnly: scala.Boolean => scala.Unit,
    setTransactionIsolation: scala.Double => scala.Unit,
    setTypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess => scala.Unit
  ): Connection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit, Catalog = Catalog, MetaData = MetaData, TransactionIsolation = TransactionIsolation, TypeMap = TypeMap, Warnings = Warnings, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), commit = js.Any.fromFunction0(commit), createStatement = js.Any.fromFunction0(createStatement), dispose = js.Any.fromFunction0(dispose), getAutoCommit = js.Any.fromFunction0(getAutoCommit), getCatalog = js.Any.fromFunction0(getCatalog), getMetaData = js.Any.fromFunction0(getMetaData), getTransactionIsolation = js.Any.fromFunction0(getTransactionIsolation), getTypeMap = js.Any.fromFunction0(getTypeMap), getWarnings = js.Any.fromFunction0(getWarnings), isClosed = js.Any.fromFunction0(isClosed), isReadOnly = js.Any.fromFunction0(isReadOnly), nativeSQL = js.Any.fromFunction1(nativeSQL), prepareCall = js.Any.fromFunction1(prepareCall), prepareStatement = js.Any.fromFunction1(prepareStatement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), rollback = js.Any.fromFunction0(rollback), setAutoCommit = js.Any.fromFunction1(setAutoCommit), setCatalog = js.Any.fromFunction1(setCatalog), setReadOnly = js.Any.fromFunction1(setReadOnly), setTransactionIsolation = js.Any.fromFunction1(setTransactionIsolation), setTypeMap = js.Any.fromFunction1(setTypeMap))
  
    __obj.asInstanceOf[Connection]
  }
}

