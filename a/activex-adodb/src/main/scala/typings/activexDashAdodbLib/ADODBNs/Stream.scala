package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADODB.Stream")
@js.native
class Stream protected () extends js.Object {
  var `ADODB.Stream_typekey`: Stream = js.native
  var Charset: java.lang.String = js.native
  val EOS: scala.Boolean = js.native
  var LineSeparator: LineSeparatorEnum = js.native
  var Mode: ConnectModeEnum = js.native
  var Position: scala.Double = js.native
  val Size: scala.Double = js.native
  val State: ObjectStateEnum = js.native
  var Type: StreamTypeEnum = js.native
  def Cancel(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  /** @param CharNumber [CharNumber=-1] */
  def CopyTo(DestStream: Stream): scala.Unit = js.native
  /** @param CharNumber [CharNumber=-1] */
  def CopyTo(DestStream: Stream, CharNumber: scala.Double): scala.Unit = js.native
  def Flush(): scala.Unit = js.native
  def LoadFromFile(FileName: java.lang.String): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(Source: Record): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(Source: Record, Mode: ConnectModeEnum): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(Source: Record, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(Source: Record, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum, UserName: java.lang.String): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(
    Source: Record,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: java.lang.String,
    Password: java.lang.String
  ): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(Source: java.lang.String): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(Source: java.lang.String, Mode: ConnectModeEnum): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(Source: java.lang.String, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(
    Source: java.lang.String,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: java.lang.String
  ): scala.Unit = js.native
  /**
           * @param Mode [Mode=0]
           * @param Options [Options=-1]
           * @param UserName [UserName='']
           * @param Password [Password='']
           */
  def Open(
    Source: java.lang.String,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: java.lang.String,
    Password: java.lang.String
  ): scala.Unit = js.native
  /** @param NumBytes [NumBytes=-1] */
  def Read(): js.Any = js.native
  /** @param NumBytes [NumBytes=-1] */
  def Read(NumBytes: scala.Double): js.Any = js.native
  /** @param NumChars [NumChars=-1] */
  def ReadText(): java.lang.String = js.native
  /** @param NumChars [NumChars=-1] */
  def ReadText(NumChars: scala.Double): java.lang.String = js.native
  /** @param Options [Options=1] */
  def SaveToFile(FileName: java.lang.String): scala.Unit = js.native
  /** @param Options [Options=1] */
  def SaveToFile(FileName: java.lang.String, Options: SaveOptionsEnum): scala.Unit = js.native
  def SetEOS(): scala.Unit = js.native
  def SkipLine(): scala.Unit = js.native
  def Write(Buffer: js.Any): scala.Unit = js.native
  /** @param Options [Options=0] */
  def WriteText(Data: java.lang.String): scala.Unit = js.native
  /** @param Options [Options=0] */
  def WriteText(Data: java.lang.String, Options: StreamWriteEnum): scala.Unit = js.native
}

