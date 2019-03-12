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
    acquire: () => scala.Unit,
    getGroups: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getTables: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getUsers: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getViews: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): DatabaseDefinition = {
    val __obj = js.Dynamic.literal(Groups = Groups, Tables = Tables, Users = Users, Views = Views, acquire = js.Any.fromFunction0(acquire), getGroups = js.Any.fromFunction0(getGroups), getTables = js.Any.fromFunction0(getTables), getUsers = js.Any.fromFunction0(getUsers), getViews = js.Any.fromFunction0(getViews), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[DatabaseDefinition]
  }
}

