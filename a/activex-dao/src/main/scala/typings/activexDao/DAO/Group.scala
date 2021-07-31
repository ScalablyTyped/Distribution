package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends StObject {
  
  def CreateUser(): User = js.native
  def CreateUser(Name: String): User = js.native
  def CreateUser(Name: String, PID: String): User = js.native
  def CreateUser(Name: String, PID: String, Password: String): User = js.native
  def CreateUser(Name: String, PID: Unit, Password: String): User = js.native
  def CreateUser(Name: Unit, PID: String): User = js.native
  def CreateUser(Name: Unit, PID: String, Password: String): User = js.native
  def CreateUser(Name: Unit, PID: Unit, Password: String): User = js.native
  
  @JSName("DAO.Group_typekey")
  var DAODotGroup_typekey: Group = js.native
  
  var Name: String = js.native
  
  val PID: String = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  def Users(Item: String): User = js.native
  def Users(Item: Double): User = js.native
  @JSName("Users")
  val Users_Original: Users = js.native
}
