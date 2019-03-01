package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of users, typically used for a database definition object. */
trait XUsersSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of users.
    * @returns the users
    */
  val Users: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of users.
    * @returns the users
    */
  def getUsers(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XUsersSupplier {
  @scala.inline
  def apply(
    Users: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getUsers: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUsersSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Users")(Users)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getUsers")(getUsers)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XUsersSupplier]
  }
}

