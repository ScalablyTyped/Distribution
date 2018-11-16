package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecordOpenOptionsEnum extends js.Object

@JSGlobal("ADODB.RecordOpenOptionsEnum")
@js.native
object RecordOpenOptionsEnum extends js.Object {
  @js.native
  sealed trait adDelayFetchFields
    extends activexDashAdodbLib.ADODBNs.RecordOpenOptionsEnum
  
  @js.native
  sealed trait adDelayFetchStream
    extends activexDashAdodbLib.ADODBNs.RecordOpenOptionsEnum
  
  @js.native
  sealed trait adOpenAsync
    extends activexDashAdodbLib.ADODBNs.RecordOpenOptionsEnum
  
  @js.native
  sealed trait adOpenExecuteCommand
    extends activexDashAdodbLib.ADODBNs.RecordOpenOptionsEnum
  
  @js.native
  sealed trait adOpenOutput
    extends activexDashAdodbLib.ADODBNs.RecordOpenOptionsEnum
  
  @js.native
  sealed trait adOpenRecordUnspecified
    extends activexDashAdodbLib.ADODBNs.RecordOpenOptionsEnum
  
  @js.native
  sealed trait adOpenSource
    extends activexDashAdodbLib.ADODBNs.RecordOpenOptionsEnum
  
  /* 32768 */ val adDelayFetchFields: adDelayFetchFields with scala.Double = js.native
  /* 16384 */ val adDelayFetchStream: adDelayFetchStream with scala.Double = js.native
  /* 4096 */ val adOpenAsync: adOpenAsync with scala.Double = js.native
  /* 65536 */ val adOpenExecuteCommand: adOpenExecuteCommand with scala.Double = js.native
  /* 8388608 */ val adOpenOutput: adOpenOutput with scala.Double = js.native
  /* -1 */ val adOpenRecordUnspecified: adOpenRecordUnspecified with scala.Double = js.native
  /* 8388608 */ val adOpenSource: adOpenSource with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.RecordOpenOptionsEnum with scala.Double] = js.native
}

