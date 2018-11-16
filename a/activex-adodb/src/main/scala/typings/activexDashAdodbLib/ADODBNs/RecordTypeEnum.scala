package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecordTypeEnum extends js.Object

@JSGlobal("ADODB.RecordTypeEnum")
@js.native
object RecordTypeEnum extends js.Object {
  @js.native
  sealed trait adCollectionRecord
    extends activexDashAdodbLib.ADODBNs.RecordTypeEnum
  
  @js.native
  sealed trait adSimpleRecord
    extends activexDashAdodbLib.ADODBNs.RecordTypeEnum
  
  @js.native
  sealed trait adStructDoc
    extends activexDashAdodbLib.ADODBNs.RecordTypeEnum
  
  /* 1 */ val adCollectionRecord: adCollectionRecord with scala.Double = js.native
  /* 0 */ val adSimpleRecord: adSimpleRecord with scala.Double = js.native
  /* 2 */ val adStructDoc: adStructDoc with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.RecordTypeEnum with scala.Double] = js.native
}

