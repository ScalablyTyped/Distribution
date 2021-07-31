package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`1024`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workspace extends StObject {
  
  def BeginTrans(): Unit = js.native
  
  def Close(): Unit = js.native
  
  /** @param Options [Options=0] */
  def CommitTrans(): Unit = js.native
  def CommitTrans(Options: Double): Unit = js.native
  
  def Connections(Item: String): Connection = js.native
  def Connections(Item: Double): Connection = js.native
  @JSName("Connections")
  val Connections_Original: Connections = js.native
  
  /**
    * @param Connect  Specify one of the following:
    * *  the locale, using one of the language constants
    * * the password, in the form `;pwd=MyNewPassword'`
    * * both the constant and a password, e.g. `dbLangGreek + ';pwd=MyNewPassword'`
    */
  def CreateDatabase(Name: String, Connect: String): Database = js.native
  def CreateDatabase(Name: String, Connect: String, Option: DatabaseTypeEnum): Database = js.native
  
  def CreateGroup(): Group = js.native
  def CreateGroup(Name: String): Group = js.native
  def CreateGroup(Name: String, PID: String): Group = js.native
  def CreateGroup(Name: Unit, PID: String): Group = js.native
  
  def CreateUser(): User = js.native
  def CreateUser(Name: String): User = js.native
  def CreateUser(Name: String, PID: String): User = js.native
  def CreateUser(Name: String, PID: String, Password: String): User = js.native
  def CreateUser(Name: String, PID: Unit, Password: String): User = js.native
  def CreateUser(Name: Unit, PID: String): User = js.native
  def CreateUser(Name: Unit, PID: String, Password: String): User = js.native
  def CreateUser(Name: Unit, PID: Unit, Password: String): User = js.native
  
  @JSName("DAO.Workspace_typekey")
  var DAODotWorkspace_typekey: Workspace = js.native
  
  def Databases(Item: String): Database = js.native
  def Databases(Item: Double): Database = js.native
  @JSName("Databases")
  val Databases_Original: Databases = js.native
  
  var DefaultCursorDriver: Double = js.native
  
  def Groups(Item: String): Group = js.native
  def Groups(Item: Double): Group = js.native
  @JSName("Groups")
  val Groups_Original: Groups = js.native
  
  var IsolateODBCTrans: Double = js.native
  
  var LoginTimeout: Double = js.native
  
  var Name: String = js.native
  
  /**
    * @param Connect ODBC connection string; prepend with `ODBC;`
    */
  def OpenConnection(Name: String): Connection = js.native
  def OpenConnection(Name: String, Options: Unit, ReadOnly: Boolean): Connection = js.native
  def OpenConnection(Name: String, Options: Unit, ReadOnly: Boolean, Connect: String): Connection = js.native
  def OpenConnection(Name: String, Options: Unit, ReadOnly: Unit, Connect: String): Connection = js.native
  def OpenConnection(Name: String, Options: DriverPromptEnum): Connection = js.native
  def OpenConnection(Name: String, Options: DriverPromptEnum, ReadOnly: Boolean): Connection = js.native
  def OpenConnection(Name: String, Options: DriverPromptEnum, ReadOnly: Boolean, Connect: String): Connection = js.native
  def OpenConnection(Name: String, Options: DriverPromptEnum, ReadOnly: Unit, Connect: String): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(Name: String, Options: `1024`): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(Name: String, Options: `1024`, ReadOnly: Boolean): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(Name: String, Options: `1024`, ReadOnly: Boolean, Connect: String): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(Name: String, Options: `1024`, ReadOnly: Unit, Connect: String): Connection = js.native
  
  def OpenDatabase(Name: String): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Boolean): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Boolean, ReadOnly: Boolean): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Boolean, ReadOnly: Boolean, Connect: String): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Boolean, ReadOnly: Unit, Connect: String): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Unit, ReadOnly: Boolean): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Unit, ReadOnly: Boolean, Connect: String): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Unit, ReadOnly: Unit, Connect: String): Database = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  def Rollback(): Unit = js.native
  
  val Type: Double = js.native
  
  val UserName: String = js.native
  
  def Users(Item: String): User = js.native
  def Users(Item: Double): User = js.native
  @JSName("Users")
  val Users_Original: Users = js.native
  
  val hEnv: Double = js.native
}
