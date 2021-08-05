package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XDatabaseMetaData
import typings.activexLibreoffice.com_.sun.star.sdbc.XPreparedStatement
import typings.activexLibreoffice.com_.sun.star.sdbc.XStatement
import typings.activexLibreoffice.com_.sun.star.sdbcx.DatabaseDefinition
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with typings.activexLibreoffice.com_.sun.star.sdbc.Connection
     with DatabaseDefinition
     with XChild
     with XSQLQueryComposerFactory
     with XQueriesSupplier
object DatabaseAccessConnection {
  
  inline def apply(
    AutoCommit: Boolean,
    Catalog: String,
    Groups: XNameAccess,
    MetaData: XDatabaseMetaData,
    Parent: XInterface,
    Queries: XNameAccess,
    Tables: XNameAccess,
    TransactionIsolation: Double,
    TypeMap: XNameAccess,
    Users: XNameAccess,
    Views: XNameAccess,
    Warnings: js.Any,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    clearWarnings: () => Unit,
    close: () => Unit,
    commit: () => Unit,
    createQueryComposer: () => XSQLQueryComposer,
    createStatement: () => XStatement,
    dispose: () => Unit,
    getAutoCommit: () => Boolean,
    getCatalog: () => String,
    getGroups: () => XNameAccess,
    getMetaData: () => XDatabaseMetaData,
    getParent: () => XInterface,
    getQueries: () => XNameAccess,
    getTables: () => XNameAccess,
    getTransactionIsolation: () => Double,
    getTypeMap: () => XNameAccess,
    getUsers: () => XNameAccess,
    getViews: () => XNameAccess,
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
    setParent: XInterface => Unit,
    setReadOnly: Boolean => Unit,
    setTransactionIsolation: Double => Unit,
    setTypeMap: XNameAccess => Unit
  ): DatabaseAccessConnection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit.asInstanceOf[js.Any], Catalog = Catalog.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Queries = Queries.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any], TransactionIsolation = TransactionIsolation.asInstanceOf[js.Any], TypeMap = TypeMap.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any], Views = Views.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), commit = js.Any.fromFunction0(commit), createQueryComposer = js.Any.fromFunction0(createQueryComposer), createStatement = js.Any.fromFunction0(createStatement), dispose = js.Any.fromFunction0(dispose), getAutoCommit = js.Any.fromFunction0(getAutoCommit), getCatalog = js.Any.fromFunction0(getCatalog), getGroups = js.Any.fromFunction0(getGroups), getMetaData = js.Any.fromFunction0(getMetaData), getParent = js.Any.fromFunction0(getParent), getQueries = js.Any.fromFunction0(getQueries), getTables = js.Any.fromFunction0(getTables), getTransactionIsolation = js.Any.fromFunction0(getTransactionIsolation), getTypeMap = js.Any.fromFunction0(getTypeMap), getUsers = js.Any.fromFunction0(getUsers), getViews = js.Any.fromFunction0(getViews), getWarnings = js.Any.fromFunction0(getWarnings), isClosed = js.Any.fromFunction0(isClosed), isReadOnly = js.Any.fromFunction0(isReadOnly), nativeSQL = js.Any.fromFunction1(nativeSQL), prepareCall = js.Any.fromFunction1(prepareCall), prepareStatement = js.Any.fromFunction1(prepareStatement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), rollback = js.Any.fromFunction0(rollback), setAutoCommit = js.Any.fromFunction1(setAutoCommit), setCatalog = js.Any.fromFunction1(setCatalog), setParent = js.Any.fromFunction1(setParent), setReadOnly = js.Any.fromFunction1(setReadOnly), setTransactionIsolation = js.Any.fromFunction1(setTransactionIsolation), setTypeMap = js.Any.fromFunction1(setTypeMap))
    __obj.asInstanceOf[DatabaseAccessConnection]
  }
}
