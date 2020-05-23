package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGroups = js.Any.fromFunction0(getGroups), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGroupsSupplier]
  }
}

