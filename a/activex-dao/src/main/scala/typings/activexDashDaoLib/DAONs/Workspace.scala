package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Workspace")
@js.native
class Workspace protected () extends js.Object {
  @JSName("Connections")
  val Connections_Original: Connections = js.native
  var `DAO.Workspace_typekey`: Workspace = js.native
  @JSName("Databases")
  val Databases_Original: Databases = js.native
  var DefaultCursorDriver: scala.Double = js.native
  @JSName("Groups")
  val Groups_Original: Groups = js.native
  var IsolateODBCTrans: scala.Double = js.native
  var LoginTimeout: scala.Double = js.native
  var Name: java.lang.String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val Type: scala.Double = js.native
  val UserName: java.lang.String = js.native
  @JSName("Users")
  val Users_Original: Users = js.native
  val hEnv: scala.Double = js.native
  def BeginTrans(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  /** @param Options [Options=0] */
  def CommitTrans(): scala.Unit = js.native
  def CommitTrans(Options: scala.Double): scala.Unit = js.native
  def Connections(Item: java.lang.String): Connection = js.native
  def Connections(Item: scala.Double): Connection = js.native
  /**
    * @param Connect  Specify one of the following:
    * *  the locale, using one of the language constants
    * * the password, in the form `;pwd=MyNewPassword'`
    * * both the constant and a password, e.g. `dbLangGreek + ';pwd=MyNewPassword'`
    */
  def CreateDatabase(Name: java.lang.String, Connect: java.lang.String): Database = js.native
  def CreateDatabase(Name: java.lang.String, Connect: java.lang.String, Option: DatabaseTypeEnum): Database = js.native
  def CreateGroup(): Group = js.native
  def CreateGroup(Name: java.lang.String): Group = js.native
  def CreateGroup(Name: java.lang.String, PID: java.lang.String): Group = js.native
  def CreateUser(): User = js.native
  def CreateUser(Name: java.lang.String): User = js.native
  def CreateUser(Name: java.lang.String, PID: java.lang.String): User = js.native
  def CreateUser(Name: java.lang.String, PID: java.lang.String, Password: java.lang.String): User = js.native
  def Databases(Item: java.lang.String): Database = js.native
  def Databases(Item: scala.Double): Database = js.native
  def Groups(Item: java.lang.String): Group = js.native
  def Groups(Item: scala.Double): Group = js.native
  /**
    * @param Connect ODBC connection string; prepend with `ODBC;`
    */
  def OpenConnection(Name: java.lang.String): Connection = js.native
  def OpenConnection(Name: java.lang.String, Options: DriverPromptEnum): Connection = js.native
  def OpenConnection(Name: java.lang.String, Options: DriverPromptEnum, ReadOnly: scala.Boolean): Connection = js.native
  def OpenConnection(
    Name: java.lang.String,
    Options: DriverPromptEnum,
    ReadOnly: scala.Boolean,
    Connect: java.lang.String
  ): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(Name: java.lang.String, Options: activexDashDaoLib.activexDashDaoLibNumbers.`1024`): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(
    Name: java.lang.String,
    Options: activexDashDaoLib.activexDashDaoLibNumbers.`1024`,
    ReadOnly: scala.Boolean
  ): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(
    Name: java.lang.String,
    Options: activexDashDaoLib.activexDashDaoLibNumbers.`1024`,
    ReadOnly: scala.Boolean,
    Connect: java.lang.String
  ): Connection = js.native
  def OpenDatabase(Name: java.lang.String): Database = js.native
  def OpenDatabase(Name: java.lang.String, Exclusive: scala.Boolean): Database = js.native
  def OpenDatabase(Name: java.lang.String, Exclusive: scala.Boolean, ReadOnly: scala.Boolean): Database = js.native
  def OpenDatabase(
    Name: java.lang.String,
    Exclusive: scala.Boolean,
    ReadOnly: scala.Boolean,
    Connect: java.lang.String
  ): Database = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
  def Rollback(): scala.Unit = js.native
  def Users(Item: java.lang.String): User = js.native
  def Users(Item: scala.Double): User = js.native
}

