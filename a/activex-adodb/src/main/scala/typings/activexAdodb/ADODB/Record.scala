package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record extends js.Object {
  @JSName("ADODB.Record_typekey")
  var ADODBDotRecord_typekey: Record = js.native
  /**
    * Sets or returns a String value that contains a definition for a connection if the connection is closed, or a Variant containing the current Connection object if the connection is open. Default is a null object reference.
    */
  var ActiveConnection: String | Connection | Null = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  var Mode: ConnectModeEnum = js.native
  val ParentURL: String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordType: RecordTypeEnum = js.native
  var Source: String | Recordset | Command = js.native
  val State: ObjectStateEnum = js.native
  def Cancel(): Unit = js.native
  def Close(): Unit = js.native
  /**
    * @param Source [Source='']
    * @param Destination [Destination='']
    * @param UserName [UserName='']
    * @param Password [Password='']
    * @param Options [Options=-1]
    * @param Async [Async=false]
    */
  def CopyRecord(
    Source: js.UndefOr[String],
    Destination: js.UndefOr[String],
    UserName: js.UndefOr[String],
    Password: js.UndefOr[String],
    Options: js.UndefOr[CopyRecordOptionsEnum],
    Async: js.UndefOr[Boolean]
  ): String = js.native
  /**
    * @param Source [Source='']
    * @param Async [Async=false]
    */
  def DeleteRecord(): Unit = js.native
  def DeleteRecord(Source: js.UndefOr[scala.Nothing], Async: Boolean): Unit = js.native
  def DeleteRecord(Source: String): Unit = js.native
  def DeleteRecord(Source: String, Async: Boolean): Unit = js.native
  def Fields(Index: String): Field = js.native
  def Fields(Index: Double): Field = js.native
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
    Source: js.UndefOr[String],
    Destination: js.UndefOr[String],
    UserName: js.UndefOr[String],
    Password: js.UndefOr[String],
    Options: js.UndefOr[MoveRecordOptionsEnum],
    Async: js.UndefOr[Boolean]
  ): String = js.native
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
    Source: js.UndefOr[String | Record | Recordset | Command],
    ActiveConnection: js.UndefOr[String | Connection],
    Mode: js.UndefOr[ConnectModeEnum],
    CreateOptions: js.UndefOr[RecordCreateOptionsEnum],
    Options: js.UndefOr[RecordOpenOptionsEnum],
    UserName: js.UndefOr[String],
    Password: js.UndefOr[String]
  ): Unit = js.native
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
}

