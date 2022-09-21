package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends StObject {
  
  /* private */ @JSName("ADODB.Stream_typekey")
  var ADODBDotStream_typekey: Stream = js.native
  
  def Cancel(): Unit = js.native
  
  var Charset: String = js.native
  
  def Close(): Unit = js.native
  
  /** @param CharNumber [CharNumber=-1] */
  def CopyTo(DestStream: Stream): Unit = js.native
  def CopyTo(DestStream: Stream, CharNumber: Double): Unit = js.native
  
  val EOS: Boolean = js.native
  
  def Flush(): Unit = js.native
  
  var LineSeparator: LineSeparatorEnum = js.native
  
  def LoadFromFile(FileName: String): Unit = js.native
  
  var Mode: ConnectModeEnum = js.native
  
  /**
    * @param Mode [Mode=0]
    * @param Options [Options=-1]
    * @param UserName [UserName='']
    * @param Password [Password='']
    */
  def Open(): Unit = js.native
  def Open(Source: String): Unit = js.native
  def Open(Source: String, Mode: Unit, Options: Unit, UserName: String): Unit = js.native
  def Open(Source: String, Mode: Unit, Options: Unit, UserName: String, Password: String): Unit = js.native
  def Open(Source: String, Mode: Unit, Options: Unit, UserName: Unit, Password: String): Unit = js.native
  def Open(Source: String, Mode: Unit, Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(Source: String, Mode: Unit, Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(Source: String, Mode: Unit, Options: StreamOpenOptionsEnum, UserName: String, Password: String): Unit = js.native
  def Open(Source: String, Mode: Unit, Options: StreamOpenOptionsEnum, UserName: Unit, Password: String): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum, Options: Unit, UserName: String): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum, Options: Unit, UserName: String, Password: String): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum, Options: Unit, UserName: Unit, Password: String): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(Source: String, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(
    Source: String,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(
    Source: String,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: Unit,
    Password: String
  ): Unit = js.native
  def Open(Source: Unit, Mode: Unit, Options: Unit, UserName: String): Unit = js.native
  def Open(Source: Unit, Mode: Unit, Options: Unit, UserName: String, Password: String): Unit = js.native
  def Open(Source: Unit, Mode: Unit, Options: Unit, UserName: Unit, Password: String): Unit = js.native
  def Open(Source: Unit, Mode: Unit, Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(Source: Unit, Mode: Unit, Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(Source: Unit, Mode: Unit, Options: StreamOpenOptionsEnum, UserName: String, Password: String): Unit = js.native
  def Open(Source: Unit, Mode: Unit, Options: StreamOpenOptionsEnum, UserName: Unit, Password: String): Unit = js.native
  def Open(Source: Unit, Mode: ConnectModeEnum): Unit = js.native
  def Open(Source: Unit, Mode: ConnectModeEnum, Options: Unit, UserName: String): Unit = js.native
  def Open(Source: Unit, Mode: ConnectModeEnum, Options: Unit, UserName: String, Password: String): Unit = js.native
  def Open(Source: Unit, Mode: ConnectModeEnum, Options: Unit, UserName: Unit, Password: String): Unit = js.native
  def Open(Source: Unit, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(Source: Unit, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(
    Source: Unit,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(
    Source: Unit,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: Unit,
    Password: String
  ): Unit = js.native
  def Open(Source: Record): Unit = js.native
  def Open(Source: Record, Mode: Unit, Options: Unit, UserName: String): Unit = js.native
  def Open(Source: Record, Mode: Unit, Options: Unit, UserName: String, Password: String): Unit = js.native
  def Open(Source: Record, Mode: Unit, Options: Unit, UserName: Unit, Password: String): Unit = js.native
  def Open(Source: Record, Mode: Unit, Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(Source: Record, Mode: Unit, Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(Source: Record, Mode: Unit, Options: StreamOpenOptionsEnum, UserName: String, Password: String): Unit = js.native
  def Open(Source: Record, Mode: Unit, Options: StreamOpenOptionsEnum, UserName: Unit, Password: String): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum, Options: Unit, UserName: String): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum, Options: Unit, UserName: String, Password: String): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum, Options: Unit, UserName: Unit, Password: String): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum): Unit = js.native
  def Open(Source: Record, Mode: ConnectModeEnum, Options: StreamOpenOptionsEnum, UserName: String): Unit = js.native
  def Open(
    Source: Record,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: String,
    Password: String
  ): Unit = js.native
  def Open(
    Source: Record,
    Mode: ConnectModeEnum,
    Options: StreamOpenOptionsEnum,
    UserName: Unit,
    Password: String
  ): Unit = js.native
  
  var Position: Double = js.native
  
  /** @param NumBytes [NumBytes=-1] */
  def Read(): Any = js.native
  def Read(NumBytes: Double): Any = js.native
  
  /** @param NumChars [NumChars=-1] */
  def ReadText(): String = js.native
  def ReadText(NumChars: Double): String = js.native
  
  /** @param Options [Options=1] */
  def SaveToFile(FileName: String): Unit = js.native
  def SaveToFile(FileName: String, Options: SaveOptionsEnum): Unit = js.native
  
  def SetEOS(): Unit = js.native
  
  val Size: Double = js.native
  
  def SkipLine(): Unit = js.native
  
  val State: ObjectStateEnum = js.native
  
  var Type: StreamTypeEnum = js.native
  
  def Write(Buffer: Any): Unit = js.native
  
  /** @param Options [Options=0] */
  def WriteText(Data: String): Unit = js.native
  def WriteText(Data: String, Options: StreamWriteEnum): Unit = js.native
}
