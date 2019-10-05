package typings.activexDashDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Group")
@js.native
class Group protected () extends js.Object {
  var `DAO.Group_typekey`: Group = js.native
  var Name: String = js.native
  val PID: String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  @JSName("Users")
  val Users_Original: Users = js.native
  def CreateUser(): User = js.native
  def CreateUser(Name: String): User = js.native
  def CreateUser(Name: String, PID: String): User = js.native
  def CreateUser(Name: String, PID: String, Password: String): User = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  def Users(Item: String): User = js.native
  def Users(Item: Double): User = js.native
}

