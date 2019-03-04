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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    clearWarnings: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    commit: js.Function0[scala.Unit],
    createQueryComposer: js.Function0[XSQLQueryComposer],
    createStatement: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XStatement],
    dispose: js.Function0[scala.Unit],
    getAutoCommit: js.Function0[scala.Boolean],
    getCatalog: js.Function0[java.lang.String],
    getGroups: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getMetaData: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDatabaseMetaData],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getQueries: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getTables: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getTransactionIsolation: js.Function0[scala.Double],
    getTypeMap: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getUsers: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getViews: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getWarnings: js.Function0[js.Any],
    isClosed: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    nativeSQL: js.Function1[java.lang.String, java.lang.String],
    prepareCall: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XPreparedStatement
    ],
    prepareStatement: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XPreparedStatement
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    rollback: js.Function0[scala.Unit],
    setAutoCommit: js.Function1[scala.Boolean, scala.Unit],
    setCatalog: js.Function1[java.lang.String, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setReadOnly: js.Function1[scala.Boolean, scala.Unit],
    setTransactionIsolation: js.Function1[scala.Double, scala.Unit],
    setTypeMap: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess, scala.Unit]
  ): DatabaseAccessConnection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit, Catalog = Catalog, Groups = Groups, MetaData = MetaData, Parent = Parent, Queries = Queries, Tables = Tables, TransactionIsolation = TransactionIsolation, TypeMap = TypeMap, Users = Users, Views = Views, Warnings = Warnings, acquire = acquire, addEventListener = addEventListener, clearWarnings = clearWarnings, close = close, commit = commit, createQueryComposer = createQueryComposer, createStatement = createStatement, dispose = dispose, getAutoCommit = getAutoCommit, getCatalog = getCatalog, getGroups = getGroups, getMetaData = getMetaData, getParent = getParent, getQueries = getQueries, getTables = getTables, getTransactionIsolation = getTransactionIsolation, getTypeMap = getTypeMap, getUsers = getUsers, getViews = getViews, getWarnings = getWarnings, isClosed = isClosed, isReadOnly = isReadOnly, nativeSQL = nativeSQL, prepareCall = prepareCall, prepareStatement = prepareStatement, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, rollback = rollback, setAutoCommit = setAutoCommit, setCatalog = setCatalog, setParent = setParent, setReadOnly = setReadOnly, setTransactionIsolation = setTransactionIsolation, setTypeMap = setTypeMap)
  
    __obj.asInstanceOf[DatabaseAccessConnection]
  }
}

