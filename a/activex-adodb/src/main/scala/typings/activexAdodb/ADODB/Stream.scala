package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  @JSName("ADODB.Stream_typekey")
  var ADODBDotStream_typekey: Stream = js.native
  var Charset: String = js.native
  val EOS: Boolean = js.native
  var LineSeparator: LineSeparatorEnum = js.native
  var Mode: ConnectModeEnum = js.native
  var Position: Double = js.native
  val Size: Double = js.native
  val State: ObjectStateEnum = js.native
  var Type: StreamTypeEnum = js.native
  def Cancel(): Unit = js.native
  def Close(): Unit = js.native
  /** @param CharNumber [CharNumber=-1] */
  def CopyTo(DestStream: Stream): Unit = js.native
  def CopyTo(DestStream: Stream, CharNumber: Double): Unit = js.native
  def Flush(): Unit = js.native
  def LoadFromFile(FileName: String): Unit = js.native
  /**
    * @param Mode [Mode=0]
    * @param Options [Options=-1]
    * @param UserName [UserName='']
    * @param Password [Password='']
    */
  def Open(): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: js.UndefOr[scala.Nothing],
    Options: js.UndefOr[scala.Nothing],
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: js.UndefOr[scala.Nothing],
    Options: js.UndefOr[scala.Nothing],
    UserName: String
  ): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: js.UndefOr[scala.Nothing],
    Options: js.UndefOr[scala.Nothing],
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: js.UndefOr[scala.Nothing], Mode: js.UndefOr[scala.Nothing], Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: js.UndefOr[scala.Nothing],
    Options: StreamOpenOptionsEnum,
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: js.UndefOr[scala.Nothing],
    Options: StreamOpenOptionsEnum,
    UserName: String
  ): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: js.UndefOr[scala.Nothing],
    Options: StreamOpenOptionsEnum,
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: js.UndefOr[scala.Nothing], Mode: ConnectModeEnum): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: ConnectModeEnum,
    Options: js.UndefOr[scala.Nothing],
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: ConnectModeEnum,
    Options: js.UndefOr[scala.Nothing],
    UserName: String
  ): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: ConnectModeEnum,
    Options: js.UndefOr[scala.Nothing],
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: js.UndefOr[scala.Nothing], Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: String
  ): Unit = js.native
  def Open(
    Source: js.UndefOr[scala.Nothing],
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: String): Unit = js.native
  def Open(
    Source: String,
    Mode: js.UndefOr[scala.Nothing],
    Options: js.UndefOr[scala.Nothing],
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(
    Source: String,
    Mode: js.UndefOr[scala.Nothing],
    Options: js.UndefOr[scala.Nothing],
    UserName: String
  ): Unit = js.native
  def Open(
    Source: String,
    Mode: js.UndefOr[scala.Nothing],
    Options: js.UndefOr[scala.Nothing],
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: String, Mode: js.UndefOr[scala.Nothing], Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(
    Source: String,
    Mode: js.UndefOr[scala.Nothing],
    Options: StreamOpenOptionsEnum,
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(Source: String, Mode: js.UndefOr[scala.Nothing], Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(
    Source: String,
    Mode: js.UndefOr[scala.Nothing],
    Options: StreamOpenOptionsEnum,
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum): Unit = js.native
  def Open(
    Source: String,
    Mode: ConnectModeEnum,
    Options: js.UndefOr[scala.Nothing],
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum, Options: js.UndefOr[scala.Nothing], UserName: String): Unit = js.native
  def Open(
    Source: String,
    Mode: ConnectModeEnum,
    Options: js.UndefOr[scala.Nothing],
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(
    Source: String,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(
    Source: String,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: Record): Unit = js.native
  def Open(
    Source: Record,
    Mode: js.UndefOr[scala.Nothing],
    Options: js.UndefOr[scala.Nothing],
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(
    Source: Record,
    Mode: js.UndefOr[scala.Nothing],
    Options: js.UndefOr[scala.Nothing],
    UserName: String
  ): Unit = js.native
  def Open(
    Source: Record,
    Mode: js.UndefOr[scala.Nothing],
    Options: js.UndefOr[scala.Nothing],
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: Record, Mode: js.UndefOr[scala.Nothing], Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(
    Source: Record,
    Mode: js.UndefOr[scala.Nothing],
    Options: StreamOpenOptionsEnum,
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(Source: Record, Mode: js.UndefOr[scala.Nothing], Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(
    Source: Record,
    Mode: js.UndefOr[scala.Nothing],
    Options: StreamOpenOptionsEnum,
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum): Unit = js.native
  def Open(
    Source: Record,
    Mode: ConnectModeEnum,
    Options: js.UndefOr[scala.Nothing],
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum, Options: js.UndefOr[scala.Nothing], UserName: String): Unit = js.native
  def Open(
    Source: Record,
    Mode: ConnectModeEnum,
    Options: js.UndefOr[scala.Nothing],
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(
    Source: Record,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(
    Source: Record,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: String,
    Password: String
  ): Unit = js.native
  /** @param NumBytes [NumBytes=-1] */
  def Read(): js.Any = js.native
  def Read(NumBytes: Double): js.Any = js.native
  /** @param NumChars [NumChars=-1] */
  def ReadText(): String = js.native
  def ReadText(NumChars: Double): String = js.native
  /** @param Options [Options=1] */
  def SaveToFile(FileName: String): Unit = js.native
  def SaveToFile(FileName: String, Options: SaveOptionsEnum): Unit = js.native
  def SetEOS(): Unit = js.native
  def SkipLine(): Unit = js.native
  def Write(Buffer: js.Any): Unit = js.native
  /** @param Options [Options=0] */
  def WriteText(Data: String): Unit = js.native
  def WriteText(Data: String, Options: StreamWriteEnum): Unit = js.native
}

