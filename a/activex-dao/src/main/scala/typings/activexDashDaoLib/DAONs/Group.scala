package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Group")
@js.native
class Group protected () extends js.Object {
  var `DAO.Group_typekey`: Group = js.native
  var Name: java.lang.String = js.native
  val PID: java.lang.String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  @JSName("Users")
  val Users_Original: Users = js.native
  def CreateUser(): User = js.native
  def CreateUser(Name: java.lang.String): User = js.native
  def CreateUser(Name: java.lang.String, PID: java.lang.String): User = js.native
  def CreateUser(Name: java.lang.String, PID: java.lang.String, Password: java.lang.String): User = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
  def Users(Item: java.lang.String): User = js.native
  def Users(Item: scala.Double): User = js.native
}

