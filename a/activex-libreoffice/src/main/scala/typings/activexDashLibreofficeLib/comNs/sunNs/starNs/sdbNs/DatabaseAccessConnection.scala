package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component, which supplies and stores additional information related to a certain database connection, such as, DatabaseQueries,
  * FormDocuments, and ReportDocuments. Objects for data definition are supplied as well, for instance, Tables, Views, etc.
  *
  * Implements the service {@link com.sun.star.sdbc.Connection} . It is possible to open more than one connection at the same time, but the method {@link
  * com.sun.star.sdb.DatabaseAccessConnection.dispose()} will close only one of these connections. You have to close all connections in order to close the
  * connection to the database.
  * @deprecated Deprecated
  */
trait DatabaseAccessConnection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.Connection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.DatabaseDefinition
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with XSQLQueryComposerFactory
     with XQueriesSupplier

object DatabaseAccessConnection {
  @scala.inline
  def apply(
    AutoCommit: scala.Boolean,
    Catalog: java.lang.String,
    Groups: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    MetaData: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDatabaseMetaData,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Queries: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Tables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    TransactionIsolation: scala.Double,
    TypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Users: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Views: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Warnings: js.Any,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    clearWarnings: () => scala.Unit,
    close: () => scala.Unit,
    commit: () => scala.Unit,
    createQueryComposer: () => XSQLQueryComposer,
    createStatement: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XStatement,
    dispose: () => scala.Unit,
    getAutoCommit: () => scala.Boolean,
    getCatalog: () => java.lang.String,
    getGroups: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getMetaData: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDatabaseMetaData,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getQueries: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getTables: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getTransactionIsolation: () => scala.Double,
    getTypeMap: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getUsers: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getViews: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getWarnings: () => js.Any,
    isClosed: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    nativeSQL: java.lang.String => java.lang.String,
    prepareCall: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XPreparedStatement,
    prepareStatement: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XPreparedStatement,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    rollback: () => scala.Unit,
    setAutoCommit: scala.Boolean => scala.Unit,
    setCatalog: java.lang.String => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setReadOnly: scala.Boolean => scala.Unit,
    setTransactionIsolation: scala.Double => scala.Unit,
    setTypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess => scala.Unit
  ): DatabaseAccessConnection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit, Catalog = Catalog, Groups = Groups, MetaData = MetaData, Parent = Parent, Queries = Queries, Tables = Tables, TransactionIsolation = TransactionIsolation, TypeMap = TypeMap, Users = Users, Views = Views, Warnings = Warnings, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), commit = js.Any.fromFunction0(commit), createQueryComposer = js.Any.fromFunction0(createQueryComposer), createStatement = js.Any.fromFunction0(createStatement), dispose = js.Any.fromFunction0(dispose), getAutoCommit = js.Any.fromFunction0(getAutoCommit), getCatalog = js.Any.fromFunction0(getCatalog), getGroups = js.Any.fromFunction0(getGroups), getMetaData = js.Any.fromFunction0(getMetaData), getParent = js.Any.fromFunction0(getParent), getQueries = js.Any.fromFunction0(getQueries), getTables = js.Any.fromFunction0(getTables), getTransactionIsolation = js.Any.fromFunction0(getTransactionIsolation), getTypeMap = js.Any.fromFunction0(getTypeMap), getUsers = js.Any.fromFunction0(getUsers), getViews = js.Any.fromFunction0(getViews), getWarnings = js.Any.fromFunction0(getWarnings), isClosed = js.Any.fromFunction0(isClosed), isReadOnly = js.Any.fromFunction0(isReadOnly), nativeSQL = js.Any.fromFunction1(nativeSQL), prepareCall = js.Any.fromFunction1(prepareCall), prepareStatement = js.Any.fromFunction1(prepareStatement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), rollback = js.Any.fromFunction0(rollback), setAutoCommit = js.Any.fromFunction1(setAutoCommit), setCatalog = js.Any.fromFunction1(setCatalog), setParent = js.Any.fromFunction1(setParent), setReadOnly = js.Any.fromFunction1(setReadOnly), setTransactionIsolation = js.Any.fromFunction1(setTransactionIsolation), setTypeMap = js.Any.fromFunction1(setTypeMap))
  
    __obj.asInstanceOf[DatabaseAccessConnection]
  }
}

