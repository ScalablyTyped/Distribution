package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of groups, typically used for a database definition object. */
trait XGroupsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of groups.
    * @returns the groups
    */
  val Groups: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of groups.
    * @returns the groups
    */
  def getGroups(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XGroupsSupplier {
  @scala.inline
  def apply(
    Groups: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: () => scala.Unit,
    getGroups: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XGroupsSupplier = {
    val __obj = js.Dynamic.literal(Groups = Groups, acquire = js.Any.fromFunction0(acquire), getGroups = js.Any.fromFunction0(getGroups), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XGroupsSupplier]
  }
}

