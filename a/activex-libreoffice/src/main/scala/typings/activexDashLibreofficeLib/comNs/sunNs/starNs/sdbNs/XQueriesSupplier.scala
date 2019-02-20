package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of database queries. */
trait XQueriesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of queries.
    *
    * The single elements of the container support the {@link Query} service.
    * @returns the queries belonging to database connection at which the {@link XQueriesSupplier} interface is exposed.
    */
  val Queries: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of queries.
    *
    * The single elements of the container support the {@link Query} service.
    * @returns the queries belonging to database connection at which the {@link XQueriesSupplier} interface is exposed.
    */
  def getQueries(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

