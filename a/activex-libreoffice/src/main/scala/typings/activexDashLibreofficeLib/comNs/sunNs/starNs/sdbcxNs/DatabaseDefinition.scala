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

