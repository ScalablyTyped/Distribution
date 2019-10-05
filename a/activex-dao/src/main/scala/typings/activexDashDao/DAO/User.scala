package typings.activexDashDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.User")
@js.native
class User protected () extends js.Object {
  var `DAO.User_typekey`: User = js.native
  @JSName("Groups")
  val Groups_Original: Groups = js.native
  var Name: String = js.native
  val PID: String = js.native
  val Password: String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  def CreateGroup(): Group = js.native
  def CreateGroup(Name: String): Group = js.native
  def CreateGroup(Name: String, PID: String): Group = js.native
  def Groups(Item: String): Group = js.native
  def Groups(Item: Double): Group = js.native
  def NewPassword(bstrOld: String, bstrNew: String): Unit = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
}

