package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.DBEngine")
@js.native
class DBEngine protected () extends js.Object {
  var `DAO.DBEngine_typekey`: DBEngine = js.native
  val DefaultPassword: java.lang.String = js.native
  var DefaultType: scala.Double = js.native
  val DefaultUser: java.lang.String = js.native
  @JSName("Errors")
  val Errors_Original: Errors = js.native
  var IniPath: java.lang.String = js.native
  var LoginTimeout: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var SystemDB: java.lang.String = js.native
  val Version: java.lang.String = js.native
  @JSName("Workspaces")
  val Workspaces_Original: Workspaces = js.native
  def BeginTrans(): scala.Unit = js.native
  /** @param Option [Option=0] */
  def CommitTrans(): scala.Unit = js.native
  def CommitTrans(Option: scala.Double): scala.Unit = js.native
  /**
    * Compact a closed database
    *
    * @param DstLocale Specify one of the following:
    * *  the locale, using one of the language constants
    * * the password, in the form `;pwd=MyNewPassword'`
    * * both the constant and a password, e.g. `dbLangGreek + ';pwd=MyNewPassword'`
    *
    * @param Options `dbEncrypt` and `dbDecrypt` are deprecated, and unsupported for ACCDB
    * @param password Deprecated, and unsupported for ACCDB
    */
  def CompactDatabase(SrcName: java.lang.String, DstName: java.lang.String): scala.Unit = js.native
  def CompactDatabase(SrcName: java.lang.String, DstName: java.lang.String, DstLocale: LanguageConstants): scala.Unit = js.native
  def CompactDatabase(
    SrcName: java.lang.String,
    DstName: java.lang.String,
    DstLocale: LanguageConstants,
    Options: DatabaseTypeEnum
  ): scala.Unit = js.native
  def CompactDatabase(
    SrcName: java.lang.String,
    DstName: java.lang.String,
    DstLocale: LanguageConstants,
    Options: DatabaseTypeEnum,
    password: java.lang.String
  ): scala.Unit = js.native
  def CompactDatabase(SrcName: java.lang.String, DstName: java.lang.String, DstLocale: java.lang.String): scala.Unit = js.native
  def CompactDatabase(
    SrcName: java.lang.String,
    DstName: java.lang.String,
    DstLocale: java.lang.String,
    Options: DatabaseTypeEnum
  ): scala.Unit = js.native
  def CompactDatabase(
    SrcName: java.lang.String,
    DstName: java.lang.String,
    DstLocale: java.lang.String,
    Options: DatabaseTypeEnum,
    password: java.lang.String
  ): scala.Unit = js.native
  /**
    * @param Locale  Specify one of the following:
    * *  the locale, using one of the language constants
    * * the password, in the form `;pwd=MyNewPassword'`
    * * both the constant and a password, e.g. `dbLangGreek + ';pwd=MyNewPassword'`
    */
  def CreateDatabase(Name: java.lang.String, Locale: LanguageConstants): Database = js.native
  def CreateDatabase(Name: java.lang.String, Locale: LanguageConstants, Option: DatabaseTypeEnum): Database = js.native
  def CreateDatabase(Name: java.lang.String, Locale: java.lang.String): Database = js.native
  def CreateDatabase(Name: java.lang.String, Locale: java.lang.String, Option: DatabaseTypeEnum): Database = js.native
  def CreateWorkspace(Name: java.lang.String, UserName: java.lang.String, Password: java.lang.String): Workspace = js.native
  def CreateWorkspace(
    Name: java.lang.String,
    UserName: java.lang.String,
    Password: java.lang.String,
    UseType: WorkspaceTypeEnum
  ): Workspace = js.native
  def Errors(Item: js.Any): Error = js.native
  /** Returns various statistics from the Jet engine */
  def ISAMStats(StatNum: ISAMStatsEnum): scala.Double = js.native
  def ISAMStats(StatNum: ISAMStatsEnum, Reset: scala.Boolean): scala.Double = js.native
  def Idle(): scala.Unit = js.native
  def Idle(Action: IdleEnum): scala.Unit = js.native
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
  def RegisterDatabase(
    Dsn: java.lang.String,
    Driver: java.lang.String,
    Silent: scala.Boolean,
    Attributes: java.lang.String
  ): scala.Unit = js.native
  def RepairDatabase(Name: java.lang.String): scala.Unit = js.native
  def Rollback(): scala.Unit = js.native
  def SetOption(Option: SetOptionEnum, Value: js.Any): scala.Unit = js.native
  def Workspaces(Item: java.lang.String): Workspace = js.native
  def Workspaces(Item: scala.Double): Workspace = js.native
}

