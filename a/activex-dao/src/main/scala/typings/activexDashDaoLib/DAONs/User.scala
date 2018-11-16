package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.User")
@js.native
class User protected () extends js.Object {
  var `DAO.User_typekey`: User = js.native
  @JSName("Groups")
  val Groups_Original: Groups = js.native
  var Name: java.lang.String = js.native
  val PID: java.lang.String = js.native
  val Password: java.lang.String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  def CreateGroup(): Group = js.native
  def CreateGroup(Name: java.lang.String): Group = js.native
  def CreateGroup(Name: java.lang.String, PID: java.lang.String): Group = js.native
  def Groups(Item: java.lang.String): Group = js.native
  def Groups(Item: scala.Double): Group = js.native
  def NewPassword(bstrOld: java.lang.String, bstrNew: java.lang.String): scala.Unit = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
}

