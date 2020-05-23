package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`1024`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBEngine extends js.Object {
  @JSName("DAO.DBEngine_typekey")
  var DAODotDBEngine_typekey: DBEngine = js.native
  val DefaultPassword: String = js.native
  var DefaultType: Double = js.native
  val DefaultUser: String = js.native
  @JSName("Errors")
  val Errors_Original: Errors = js.native
  var IniPath: String = js.native
  var LoginTimeout: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var SystemDB: String = js.native
  val Version: String = js.native
  @JSName("Workspaces")
  val Workspaces_Original: Workspaces = js.native
  def BeginTrans(): Unit = js.native
  /** @param Option [Option=0] */
  def CommitTrans(): Unit = js.native
  def CommitTrans(Option: Double): Unit = js.native
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
  def CompactDatabase(SrcName: String, DstName: String): Unit = js.native
  def CompactDatabase(SrcName: String, DstName: String, DstLocale: String): Unit = js.native
  def CompactDatabase(SrcName: String, DstName: String, DstLocale: String, Options: DatabaseTypeEnum): Unit = js.native
  def CompactDatabase(SrcName: String, DstName: String, DstLocale: String, Options: DatabaseTypeEnum, password: String): Unit = js.native
  def CompactDatabase(SrcName: String, DstName: String, DstLocale: LanguageConstants): Unit = js.native
  def CompactDatabase(SrcName: String, DstName: String, DstLocale: LanguageConstants, Options: DatabaseTypeEnum): Unit = js.native
  def CompactDatabase(
    SrcName: String,
    DstName: String,
    DstLocale: LanguageConstants,
    Options: DatabaseTypeEnum,
    password: String
  ): Unit = js.native
  def CreateDatabase(Name: String, Locale: String): Database = js.native
  def CreateDatabase(Name: String, Locale: String, Option: DatabaseTypeEnum): Database = js.native
  /**
    * @param Locale  Specify one of the following:
    * *  the locale, using one of the language constants
    * * the password, in the form `;pwd=MyNewPassword'`
    * * both the constant and a password, e.g. `dbLangGreek + ';pwd=MyNewPassword'`
    */
  def CreateDatabase(Name: String, Locale: LanguageConstants): Database = js.native
  def CreateDatabase(Name: String, Locale: LanguageConstants, Option: DatabaseTypeEnum): Database = js.native
  def CreateWorkspace(Name: String, UserName: String, Password: String): Workspace = js.native
  def CreateWorkspace(Name: String, UserName: String, Password: String, UseType: WorkspaceTypeEnum): Workspace = js.native
  def Errors(Item: js.Any): Error = js.native
  /** Returns various statistics from the Jet engine */
  def ISAMStats(StatNum: ISAMStatsEnum): Double = js.native
  def ISAMStats(StatNum: ISAMStatsEnum, Reset: Boolean): Double = js.native
  def Idle(): Unit = js.native
  def Idle(Action: IdleEnum): Unit = js.native
  /**
    * @param Connect ODBC connection string; prepend with `ODBC;`
    */
  def OpenConnection(Name: String): Connection = js.native
  def OpenConnection(Name: String, Options: DriverPromptEnum): Connection = js.native
  def OpenConnection(Name: String, Options: DriverPromptEnum, ReadOnly: Boolean): Connection = js.native
  def OpenConnection(Name: String, Options: DriverPromptEnum, ReadOnly: Boolean, Connect: String): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(Name: String, Options: `1024`): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(Name: String, Options: `1024`, ReadOnly: Boolean): Connection = js.native
  @JSName("OpenConnection")
  def OpenConnection_1024(Name: String, Options: `1024`, ReadOnly: Boolean, Connect: String): Connection = js.native
  def OpenDatabase(Name: String): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Boolean): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Boolean, ReadOnly: Boolean): Database = js.native
  def OpenDatabase(Name: String, Exclusive: Boolean, ReadOnly: Boolean, Connect: String): Database = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  def RegisterDatabase(Dsn: String, Driver: String, Silent: Boolean, Attributes: String): Unit = js.native
  def RepairDatabase(Name: String): Unit = js.native
  def Rollback(): Unit = js.native
  def SetOption(Option: SetOptionEnum, Value: js.Any): Unit = js.native
  def Workspaces(Item: String): Workspace = js.native
  def Workspaces(Item: Double): Workspace = js.native
}

