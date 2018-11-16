package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExecuteOptionEnum extends js.Object

@JSGlobal("ADODB.ExecuteOptionEnum")
@js.native
object ExecuteOptionEnum extends js.Object {
  @js.native
  sealed trait adAsyncExecute
    extends activexDashAdodbLib.ADODBNs.ExecuteOptionEnum
  
  @js.native
  sealed trait adAsyncFetch
    extends activexDashAdodbLib.ADODBNs.ExecuteOptionEnum
  
  @js.native
  sealed trait adAsyncFetchNonBlocking
    extends activexDashAdodbLib.ADODBNs.ExecuteOptionEnum
  
  @js.native
  sealed trait adExecuteNoRecords
    extends activexDashAdodbLib.ADODBNs.ExecuteOptionEnum
  
  @js.native
  sealed trait adExecuteRecord
    extends activexDashAdodbLib.ADODBNs.ExecuteOptionEnum
  
  @js.native
  sealed trait adExecuteStream
    extends activexDashAdodbLib.ADODBNs.ExecuteOptionEnum
  
  @js.native
  sealed trait adOptionUnspecified
    extends activexDashAdodbLib.ADODBNs.ExecuteOptionEnum
  
  /* 16 */ val adAsyncExecute: adAsyncExecute with scala.Double = js.native
  /* 32 */ val adAsyncFetch: adAsyncFetch with scala.Double = js.native
  /* 64 */ val adAsyncFetchNonBlocking: adAsyncFetchNonBlocking with scala.Double = js.native
  /* 128 */ val adExecuteNoRecords: adExecuteNoRecords with scala.Double = js.native
  /* 2048 */ val adExecuteRecord: adExecuteRecord with scala.Double = js.native
  /* 1024 */ val adExecuteStream: adExecuteStream with scala.Double = js.native
  /* -1 */ val adOptionUnspecified: adOptionUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ExecuteOptionEnum with scala.Double] = js.native
}

