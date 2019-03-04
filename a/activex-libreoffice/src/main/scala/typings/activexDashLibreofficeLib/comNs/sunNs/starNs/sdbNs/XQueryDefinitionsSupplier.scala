package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of database command definitions. */
trait XQueryDefinitionsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of commands.
    * @returns the query definitions
    */
  val QueryDefinitions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of commands.
    * @returns the query definitions
    */
  def getQueryDefinitions(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XQueryDefinitionsSupplier {
  @scala.inline
  def apply(
    QueryDefinitions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getQueryDefinitions: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XQueryDefinitionsSupplier = {
    val __obj = js.Dynamic.literal(QueryDefinitions = QueryDefinitions, acquire = acquire, getQueryDefinitions = getQueryDefinitions, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XQueryDefinitionsSupplier]
  }
}

