package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADODB.Connection")
@js.native
class Connection protected () extends js.Object {
  var `ADODB.Connection_typekey`: Connection = js.native
  /** Sum of one or more of the values in the **XactAttributeEnum** enum */
  var Attributes: XactAttributeEnum = js.native
  var CommandTimeout: scala.Double = js.native
  var ConnectionString: java.lang.String = js.native
  var ConnectionTimeout: scala.Double = js.native
  var CursorLocation: CursorLocationEnum = js.native
  var DefaultDatabase: java.lang.String = js.native
  @JSName("Errors")
  val Errors_Original: Errors = js.native
  var IsolationLevel: IsolationLevelEnum = js.native
  var Mode: ConnectModeEnum = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Provider: java.lang.String = js.native
  val State: ObjectStateEnum = js.native
  val Version: java.lang.String = js.native
  def BeginTrans(): scala.Double = js.native
  def Cancel(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def CommitTrans(): scala.Unit = js.native
  def Errors(Index: js.Any): Error = js.native
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
  def Execute(CommandText: java.lang.String): Recordset | scala.Null = js.native
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
  def Execute(
    CommandText: java.lang.String,
    RecordsAffected: js.UndefOr[scala.Nothing],
    Options: CommandTypeEnum
  ): Recordset | scala.Null = js.native
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
  def Execute(
    CommandText: java.lang.String,
    RecordsAffected: js.UndefOr[scala.Nothing],
    Options: ExecuteOptionEnum
  ): Recordset | scala.Null = js.native
  /**
           * @param ConnectionString [ConnectionString='']
           * @param UserID [UserID='']
           * @param Password [Password='']
           * @param Options [Options=-1]
           */
  def Open(): scala.Unit = js.native
  /**
           * @param ConnectionString [ConnectionString='']
           * @param UserID [UserID='']
           * @param Password [Password='']
           * @param Options [Options=-1]
           */
  def Open(ConnectionString: java.lang.String): scala.Unit = js.native
  /**
           * @param ConnectionString [ConnectionString='']
           * @param UserID [UserID='']
           * @param Password [Password='']
           * @param Options [Options=-1]
           */
  def Open(ConnectionString: java.lang.String, UserID: java.lang.String): scala.Unit = js.native
  /**
           * @param ConnectionString [ConnectionString='']
           * @param UserID [UserID='']
           * @param Password [Password='']
           * @param Options [Options=-1]
           */
  def Open(ConnectionString: java.lang.String, UserID: java.lang.String, Password: java.lang.String): scala.Unit = js.native
  /**
           * @param ConnectionString [ConnectionString='']
           * @param UserID [UserID='']
           * @param Password [Password='']
           * @param Options [Options=-1]
           */
  def Open(
    ConnectionString: java.lang.String,
    UserID: java.lang.String,
    Password: java.lang.String,
    Options: scala.Double
  ): scala.Unit = js.native
  /**
           * Returns a Recordset object that contains schema information
           * @param Schema Type of schema query to run
           * @param Restrictions A SafeArray of query constraints; depends on the [type of the schema query](https://msdn.microsoft.com/en-us/library/jj249359.aspx)
           */
  def OpenSchema(Schema: SchemaEnum): Recordset = js.native
  /**
           * Returns a Recordset object that contains schema information
           * @param Schema Type of schema query to run
           * @param Restrictions A SafeArray of query constraints; depends on the [type of the schema query](https://msdn.microsoft.com/en-us/library/jj249359.aspx)
           */
  def OpenSchema(Schema: SchemaEnum, Restrictions: activexDashInteropLib.SafeArray[java.lang.String]): Recordset = js.native
  /**
           * Returns a Recordset object that contains schema information, for a provider-specific schema query type
           * @param SchemaID The GUID for a provider-schema query not defined by the OLE DB specification.
           */
  def OpenSchema(
    Schema: SchemaEnum,
    Restrictions: activexDashInteropLib.SafeArray[java.lang.String],
    SchemaID: java.lang.String
  ): Recordset = js.native
  def Properties(Index: java.lang.String): Property = js.native
  def Properties(Index: scala.Double): Property = js.native
  def RollbackTrans(): scala.Unit = js.native
}

