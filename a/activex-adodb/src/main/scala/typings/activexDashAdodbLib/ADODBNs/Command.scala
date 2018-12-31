package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADODB.Command")
@js.native
class Command protected () extends js.Object {
  var `ADODB.Command_typekey`: Command = js.native
  /**
    * Sets or returns a String value that contains a definition for a connection if the connection is closed, or a Variant containing the current Connection object if the connection is open. Default is a null object reference.
    */
  var ActiveConnection: java.lang.String | Connection | scala.Null = js.native
  var CommandStream: js.Any = js.native
  var CommandText: java.lang.String = js.native
  var CommandTimeout: scala.Double = js.native
  var CommandType: CommandTypeEnum = js.native
  var Dialect: java.lang.String = js.native
  var Name: java.lang.String = js.native
  var NamedParameters: scala.Boolean = js.native
  @JSName("Parameters")
  val Parameters_Original: Parameters = js.native
  var Prepared: scala.Boolean = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val State: ObjectStateEnum = js.native
  def Cancel(): scala.Unit = js.native
  /**
    * @param Name [Name='']
    * @param Type [Type=0]
    * @param Direction [Direction=1]
    * @param Size [Size=0]
    */
  def CreateParameter(): Parameter = js.native
  def CreateParameter(Name: java.lang.String): Parameter = js.native
  def CreateParameter(Name: java.lang.String, Type: DataTypeEnum): Parameter = js.native
  def CreateParameter(Name: java.lang.String, Type: DataTypeEnum, Direction: ParameterDirectionEnum): Parameter = js.native
  def CreateParameter(Name: java.lang.String, Type: DataTypeEnum, Direction: ParameterDirectionEnum, Size: scala.Double): Parameter = js.native
  def CreateParameter(
    Name: java.lang.String,
    Type: DataTypeEnum,
    Direction: ParameterDirectionEnum,
    Size: scala.Double,
    Value: js.Any
  ): Parameter = js.native
  /**
    * @param Options [Options=-1]
    *
    * The **RecordsAffected** parameter is meant to take a variable to be modified by reference, which is not supported by Javascript
    *
    * The return value is as follows:
    *
    * * If the **adExecuteNoRecords** option is passed in, the method will return `null`. Otherwise:
    * * If the command specifies a row-returning query, then the method will return a new read-only, forward-only **Recordset** object with the results.
    * * If the command isn't intended to return results (e.g. an `UPDATE` statement), a closed empty **Recordset** will be returned.
    */
  def Execute(): Recordset | scala.Null = js.native
  def Execute(RecordsAffected: js.UndefOr[scala.Nothing], Parameters: activexDashInteropLib.SafeArray[_]): Recordset | scala.Null = js.native
  def Execute(
    RecordsAffected: js.UndefOr[scala.Nothing],
    Parameters: activexDashInteropLib.SafeArray[_],
    Options: scala.Double
  ): Recordset | scala.Null = js.native
  def Parameters(Index: java.lang.String): Parameter = js.native
  def Parameters(Index: scala.Double): Parameter = js.native
  def Properties(Index: java.lang.String): Property = js.native
  def Properties(Index: scala.Double): Property = js.native
}

