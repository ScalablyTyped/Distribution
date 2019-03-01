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
    acquire: js.Function0[scala.Unit],
    getGroups: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XGroupsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Groups")(Groups)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getGroups")(getGroups)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XGroupsSupplier]
  }
}

