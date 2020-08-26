package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of groups, typically used for a database definition object. */
@js.native
trait XGroupsSupplier extends XInterface {
  /**
    * returns the container of groups.
    * @returns the groups
    */
  val Groups: XNameAccess = js.native
  /**
    * returns the container of groups.
    * @returns the groups
    */
  def getGroups(): XNameAccess = js.native
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
  @scala.inline
  implicit class XGroupsSupplierOps[Self <: XGroupsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroups(value: XNameAccess): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetGroups(value: () => XNameAccess): Self = this.set("getGroups", js.Any.fromFunction0(value))
  }
  
}

