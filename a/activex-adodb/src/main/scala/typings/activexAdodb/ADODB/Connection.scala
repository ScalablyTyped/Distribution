package typings.activexAdodb.ADODB

import typings.activexAdodb.activexAdodbNumbers.`-1`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  @JSName("ADODB.Connection_typekey")
  var ADODBDotConnection_typekey: Connection = js.native
  
  /** Sum of one or more of the values in the **XactAttributeEnum** enum */
  var Attributes: XactAttributeEnum = js.native
  
  def BeginTrans(): Double = js.native
  
  def Cancel(): Unit = js.native
  
  def Close(): Unit = js.native
  
  var CommandTimeout: Double = js.native
  
  def CommitTrans(): Unit = js.native
  
  var ConnectionString: String = js.native
  
  var ConnectionTimeout: Double = js.native
  
  var CursorLocation: CursorLocationEnum = js.native
  
  var DefaultDatabase: String = js.native
  
  def Errors(Index: js.Any): Error = js.native
  @JSName("Errors")
  val Errors_Original: Errors = js.native
  
  /**
    * @param Options [Options=-1]
    *
    * The **RecordsAffected** parameter is meant to take a variable to be modified by reference, which is not supported by Javascript
    *
    * The return value is as follows:
    *
    * * If the **adExecuteNoRecords** option is passed in, the method will return `null`. Otherwise:
    * * If **CommandText** specifies a row-returning query, then the method will return a new read-only, forward-only **Recordset** object with the results
    * * If **CommandText** isn't intended to return results (e.g. an `UPDATE` statement), a closed empty **Recordset** will be returned.
    */
  def Execute(CommandText: String): Recordset | Null = js.native
  def Execute(CommandText: String, RecordsAffected: js.UndefOr[scala.Nothing], Options: CommandTypeEnum): Recordset | Null = js.native
  def Execute(CommandText: String, RecordsAffected: js.UndefOr[scala.Nothing], Options: ExecuteOptionEnum): Recordset | Null = js.native
  
  var IsolationLevel: IsolationLevelEnum = js.native
  
  var Mode: ConnectModeEnum = js.native
  
  /**
    * @param ConnectionString [ConnectionString='']
    * @param UserID [UserID='']
    * @param Password [Password='']
    * @param Options [Options=-1]
    */
  def Open(): Unit = js.native
  def Open(
    ConnectionString: js.UndefOr[scala.Nothing],
    UserID: js.UndefOr[scala.Nothing],
    Password: js.UndefOr[scala.Nothing],
    Options: Double
  ): Unit = js.native
  def Open(ConnectionString: js.UndefOr[scala.Nothing], UserID: js.UndefOr[scala.Nothing], Password: String): Unit = js.native
  def Open(
    ConnectionString: js.UndefOr[scala.Nothing],
    UserID: js.UndefOr[scala.Nothing],
    Password: String,
    Options: Double
  ): Unit = js.native
  def Open(ConnectionString: js.UndefOr[scala.Nothing], UserID: String): Unit = js.native
  def Open(
    ConnectionString: js.UndefOr[scala.Nothing],
    UserID: String,
    Password: js.UndefOr[scala.Nothing],
    Options: Double
  ): Unit = js.native
  def Open(ConnectionString: js.UndefOr[scala.Nothing], UserID: String, Password: String): Unit = js.native
  def Open(ConnectionString: js.UndefOr[scala.Nothing], UserID: String, Password: String, Options: Double): Unit = js.native
  def Open(ConnectionString: String): Unit = js.native
  def Open(
    ConnectionString: String,
    UserID: js.UndefOr[scala.Nothing],
    Password: js.UndefOr[scala.Nothing],
    Options: Double
  ): Unit = js.native
  def Open(ConnectionString: String, UserID: js.UndefOr[scala.Nothing], Password: String): Unit = js.native
  def Open(ConnectionString: String, UserID: js.UndefOr[scala.Nothing], Password: String, Options: Double): Unit = js.native
  def Open(ConnectionString: String, UserID: String): Unit = js.native
  def Open(ConnectionString: String, UserID: String, Password: js.UndefOr[scala.Nothing], Options: Double): Unit = js.native
  def Open(ConnectionString: String, UserID: String, Password: String): Unit = js.native
  def Open(ConnectionString: String, UserID: String, Password: String, Options: Double): Unit = js.native
  
  /**
    * Returns a Recordset object that contains schema information
    * @param Schema Type of schema query to run
    * @param Restrictions A SafeArray of query constraints; depends on the [type of the schema query](https://msdn.microsoft.com/en-us/library/jj249359.aspx)
    */
  def OpenSchema(Schema: SchemaEnum): Recordset = js.native
  def OpenSchema(Schema: SchemaEnum, Restrictions: SafeArray[String]): Recordset = js.native
  /**
    * Returns a Recordset object that contains schema information, for a provider-specific schema query type
    * @param SchemaID The GUID for a provider-schema query not defined by the OLE DB specification.
    */
  @JSName("OpenSchema")
  def OpenSchema_1(Schema: `-1`, Restrictions: SafeArray[String], SchemaID: String): Recordset = js.native
  
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var Provider: String = js.native
  
  def RollbackTrans(): Unit = js.native
  
  val State: ObjectStateEnum = js.native
  
  val Version: String = js.native
}
