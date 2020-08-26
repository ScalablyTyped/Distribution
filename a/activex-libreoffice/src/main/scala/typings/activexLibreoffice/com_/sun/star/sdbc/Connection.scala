package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
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
@js.native
trait Connection
  extends XConnection
     with XComponent
     with XWarningsSupplier

object Connection {
  @scala.inline
  def apply(
    AutoCommit: Boolean,
    Catalog: String,
    MetaData: XDatabaseMetaData,
    TransactionIsolation: Double,
    TypeMap: XNameAccess,
    Warnings: js.Any,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    clearWarnings: () => Unit,
    close: () => Unit,
    commit: () => Unit,
    createStatement: () => XStatement,
    dispose: () => Unit,
    getAutoCommit: () => Boolean,
    getCatalog: () => String,
    getMetaData: () => XDatabaseMetaData,
    getTransactionIsolation: () => Double,
    getTypeMap: () => XNameAccess,
    getWarnings: () => js.Any,
    isClosed: () => Boolean,
    isReadOnly: () => Boolean,
    nativeSQL: String => String,
    prepareCall: String => XPreparedStatement,
    prepareStatement: String => XPreparedStatement,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    rollback: () => Unit,
    setAutoCommit: Boolean => Unit,
    setCatalog: String => Unit,
    setReadOnly: Boolean => Unit,
    setTransactionIsolation: Double => Unit,
    setTypeMap: XNameAccess => Unit
  ): Connection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit.asInstanceOf[js.Any], Catalog = Catalog.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], TransactionIsolation = TransactionIsolation.asInstanceOf[js.Any], TypeMap = TypeMap.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), commit = js.Any.fromFunction0(commit), createStatement = js.Any.fromFunction0(createStatement), dispose = js.Any.fromFunction0(dispose), getAutoCommit = js.Any.fromFunction0(getAutoCommit), getCatalog = js.Any.fromFunction0(getCatalog), getMetaData = js.Any.fromFunction0(getMetaData), getTransactionIsolation = js.Any.fromFunction0(getTransactionIsolation), getTypeMap = js.Any.fromFunction0(getTypeMap), getWarnings = js.Any.fromFunction0(getWarnings), isClosed = js.Any.fromFunction0(isClosed), isReadOnly = js.Any.fromFunction0(isReadOnly), nativeSQL = js.Any.fromFunction1(nativeSQL), prepareCall = js.Any.fromFunction1(prepareCall), prepareStatement = js.Any.fromFunction1(prepareStatement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), rollback = js.Any.fromFunction0(rollback), setAutoCommit = js.Any.fromFunction1(setAutoCommit), setCatalog = js.Any.fromFunction1(setCatalog), setReadOnly = js.Any.fromFunction1(setReadOnly), setTransactionIsolation = js.Any.fromFunction1(setTransactionIsolation), setTypeMap = js.Any.fromFunction1(setTypeMap))
    __obj.asInstanceOf[Connection]
  }
}

