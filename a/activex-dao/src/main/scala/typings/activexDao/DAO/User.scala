package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  def CreateGroup(): Group = js.native
  def CreateGroup(Name: js.UndefOr[scala.Nothing], PID: String): Group = js.native
  def CreateGroup(Name: String): Group = js.native
  def CreateGroup(Name: String, PID: String): Group = js.native
  
  @JSName("DAO.User_typekey")
  var DAODotUser_typekey: User = js.native
  
  def Groups(Item: String): Group = js.native
  def Groups(Item: Double): Group = js.native
  @JSName("Groups")
  val Groups_Original: Groups = js.native
  
  var Name: String = js.native
  
  def NewPassword(bstrOld: String, bstrNew: String): Unit = js.native
  
  val PID: String = js.native
  
  val Password: String = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
}
