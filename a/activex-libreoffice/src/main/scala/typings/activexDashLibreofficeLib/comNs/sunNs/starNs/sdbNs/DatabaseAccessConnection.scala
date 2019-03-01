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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutoCommit")(AutoCommit)
    __obj.updateDynamic("Catalog")(Catalog)
    __obj.updateDynamic("Groups")(Groups)
    __obj.updateDynamic("MetaData")(MetaData)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("Queries")(Queries)
    __obj.updateDynamic("Tables")(Tables)
    __obj.updateDynamic("TransactionIsolation")(TransactionIsolation)
    __obj.updateDynamic("TypeMap")(TypeMap)
    __obj.updateDynamic("Users")(Users)
    __obj.updateDynamic("Views")(Views)
    __obj.updateDynamic("Warnings")(Warnings)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("clearWarnings")(clearWarnings)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("createQueryComposer")(createQueryComposer)
    __obj.updateDynamic("createStatement")(createStatement)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAutoCommit")(getAutoCommit)
    __obj.updateDynamic("getCatalog")(getCatalog)
    __obj.updateDynamic("getGroups")(getGroups)
    __obj.updateDynamic("getMetaData")(getMetaData)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getQueries")(getQueries)
    __obj.updateDynamic("getTables")(getTables)
    __obj.updateDynamic("getTransactionIsolation")(getTransactionIsolation)
    __obj.updateDynamic("getTypeMap")(getTypeMap)
    __obj.updateDynamic("getUsers")(getUsers)
    __obj.updateDynamic("getViews")(getViews)
    __obj.updateDynamic("getWarnings")(getWarnings)
    __obj.updateDynamic("isClosed")(isClosed)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("nativeSQL")(nativeSQL)
    __obj.updateDynamic("prepareCall")(prepareCall)
    __obj.updateDynamic("prepareStatement")(prepareStatement)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("rollback")(rollback)
    __obj.updateDynamic("setAutoCommit")(setAutoCommit)
    __obj.updateDynamic("setCatalog")(setCatalog)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setReadOnly")(setReadOnly)
    __obj.updateDynamic("setTransactionIsolation")(setTransactionIsolation)
    __obj.updateDynamic("setTypeMap")(setTypeMap)
    __obj.asInstanceOf[DatabaseAccessConnection]
  }
}

