package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecordCreateOptionsEnum extends js.Object

@JSGlobal("ADODB.RecordCreateOptionsEnum")
@js.native
object RecordCreateOptionsEnum extends js.Object {
  @js.native
  sealed trait adCreateCollection
    extends activexDashAdodbLib.ADODBNs.RecordCreateOptionsEnum
  
  @js.native
  sealed trait adCreateNonCollection
    extends activexDashAdodbLib.ADODBNs.RecordCreateOptionsEnum
  
  @js.native
  sealed trait adCreateOverwrite
    extends activexDashAdodbLib.ADODBNs.RecordCreateOptionsEnum
  
  @js.native
  sealed trait adCreateStructDoc
    extends activexDashAdodbLib.ADODBNs.RecordCreateOptionsEnum
  
  @js.native
  sealed trait adFailIfNotExists
    extends activexDashAdodbLib.ADODBNs.RecordCreateOptionsEnum
  
  @js.native
  sealed trait adOpenIfExists
    extends activexDashAdodbLib.ADODBNs.RecordCreateOptionsEnum
  
  /* 8192 */ val adCreateCollection: adCreateCollection with scala.Double = js.native
  /* 0 */ val adCreateNonCollection: adCreateNonCollection with scala.Double = js.native
  /* 67108864 */ val adCreateOverwrite: adCreateOverwrite with scala.Double = js.native
  /* -2147483648 */ val adCreateStructDoc: adCreateStructDoc with scala.Double = js.native
  /* -1 */ val adFailIfNotExists: adFailIfNotExists with scala.Double = js.native
  /* 33554432 */ val adOpenIfExists: adOpenIfExists with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.RecordCreateOptionsEnum with scala.Double] = js.native
}

