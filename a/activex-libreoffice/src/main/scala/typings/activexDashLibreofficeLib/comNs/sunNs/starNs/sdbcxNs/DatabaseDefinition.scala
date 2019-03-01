package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * could be used as an extension for performing data definition tasks on databases, and to control the access rights on database objects.
  *
  * It may be implemented by a database driver provider, to encapsulate the complexity of data definition, and to give a common way for data definition as
  * the DDL of most DBMS differs.
  *
  * At least, the access to the tables of a database should be implemented. The implementation of other known database objects like views is optional.
  *
  * To control the access rights of users, there is the possibility to implement objects like users and groups.
  */
trait DatabaseDefinition
  extends XTablesSupplier
     with XViewsSupplier
     with XUsersSupplier
     with XGroupsSupplier

object DatabaseDefinition {
  @scala.inline
  def apply(
    Groups: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Tables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Users: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Views: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getGroups: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getTables: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getUsers: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getViews: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): DatabaseDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Groups")(Groups)
    __obj.updateDynamic("Tables")(Tables)
    __obj.updateDynamic("Users")(Users)
    __obj.updateDynamic("Views")(Views)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getGroups")(getGroups)
    __obj.updateDynamic("getTables")(getTables)
    __obj.updateDynamic("getUsers")(getUsers)
    __obj.updateDynamic("getViews")(getViews)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[DatabaseDefinition]
  }
}

