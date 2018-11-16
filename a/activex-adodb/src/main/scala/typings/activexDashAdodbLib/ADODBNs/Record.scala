package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADODB.Record")
@js.native
class Record protected () extends js.Object {
  var `ADODB.Record_typekey`: Record = js.native
  /**
           * Sets or returns a String value that contains a definition for a connection if the connection is closed, or a Variant containing the current Connection object if the connection is open. Default is a null object reference.
           */
  var ActiveConnection: java.lang.String | Connection | scala.Null = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  var Mode: ConnectModeEnum = js.native
  val ParentURL: java.lang.String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordType: RecordTypeEnum = js.native
  var Source: java.lang.String | Recordset | Command = js.native
  val State: ObjectStateEnum = js.native
  def Cancel(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  /**
           * @param Source [Source='']
           * @param Destination [Destination='']
           * @param UserName [UserName='']
           * @param Password [Password='']
           * @param Options [Options=-1]
           * @param Async [Async=false]
           */
  def CopyRecord(
    Source: js.UndefOr[java.lang.String],
    Destination: js.UndefOr[java.lang.String],
    UserName: js.UndefOr[java.lang.String],
    Password: js.UndefOr[java.lang.String],
    Options: js.UndefOr[CopyRecordOptionsEnum],
    Async: js.UndefOr[scala.Boolean]
  ): java.lang.String = js.native
  /**
           * @param Source [Source='']
           * @param Async [Async=false]
           */
  def DeleteRecord(): scala.Unit = js.native
  /**
           * @param Source [Source='']
           * @param Async [Async=false]
           */
  def DeleteRecord(Source: java.lang.String): scala.Unit = js.native
  /**
           * @param Source [Source='']
           * @param Async [Async=false]
           */
  def DeleteRecord(Source: java.lang.String, Async: scala.Boolean): scala.Unit = js.native
  def Fields(Index: java.lang.String): Field = js.native
  def Fields(Index: scala.Double): Field = js.native
  def GetChildren(): Recordset = js.native
  /**
           * @param Source [Source='']
           * @param Destination [Destination='']
           * @param UserName [UserName='']
           * @param Password [Password='']
           * @param Options [Options=-1]
           * @param Async [Async=false]
           */
  def MoveRecord(
    Source: js.UndefOr[java.lang.String],
    Destination: js.UndefOr[java.lang.String],
    UserName: js.UndefOr[java.lang.String],
    Password: js.UndefOr[java.lang.String],
    Options: js.UndefOr[MoveRecordOptionsEnum],
    Async: js.UndefOr[scala.Boolean]
  ): java.lang.String = js.native
  /**
           * Source may be:
           * * A URL. If the protocol for the URL is http, then the Internet Provider will be invoked by default. If the URL points to a node that contains an executable script (such as an .ASP page), then a Record containing the source rather than the executed contents is opened by default. Use the Options argument to modify this behavior.
           * * A Record object. A Record object opened from another Record will clone the original Record object.
           * * A Command object. The opened Record object represents the single row returned by executing the Command. If the results contain more than a single row, the contents of the first row are placed in the record and an error may be added to the Errors collection.
           * * A SQL SELECT statement. The opened Record object represents the single row returned by executing the contents of the string. If the results contain more than a single row, the contents of the first row are placed in the record and an error may be added to the Errors collection.
           * * A table name.
           *
           * @param Mode [Mode=0]
           * @param CreateOptions [CreateOptions=-1]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(
    Source: js.UndefOr[Command | Record | Recordset | java.lang.String],
    ActiveConnection: js.UndefOr[Connection | java.lang.String],
    Mode: js.UndefOr[ConnectModeEnum],
    CreateOptions: js.UndefOr[RecordCreateOptionsEnum],
    Options: js.UndefOr[RecordOpenOptionsEnum],
    UserName: js.UndefOr[java.lang.String],
    Password: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  def Properties(Index: java.lang.String): Property = js.native
  def Properties(Index: scala.Double): Property = js.native
}

