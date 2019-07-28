package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of groups, typically used for a database definition object. */
trait XGroupsSupplier extends XInterface {
  /**
    * returns the container of groups.
    * @returns the groups
    */
  val Groups: XNameAccess
  /**
    * returns the container of groups.
    * @returns the groups
    */
  def getGroups(): XNameAccess
}

object XGroupsSupplier {
  @scala.inline
  def apply(
    Groups: XNameAccess,
    acquire: () => Unit,
    getGroups: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGroupsSupplier = {
    val __obj = js.Dynamic.literal(Groups = Groups, acquire = js.Any.fromFunction0(acquire), getGroups = js.Any.fromFunction0(getGroups), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XGroupsSupplier]
  }
}

