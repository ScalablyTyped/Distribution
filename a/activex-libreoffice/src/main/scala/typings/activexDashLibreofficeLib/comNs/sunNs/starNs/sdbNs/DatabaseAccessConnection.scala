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

