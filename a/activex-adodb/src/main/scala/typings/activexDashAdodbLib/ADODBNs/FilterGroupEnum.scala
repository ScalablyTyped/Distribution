package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterGroupEnum extends js.Object

@JSGlobal("ADODB.FilterGroupEnum")
@js.native
object FilterGroupEnum extends js.Object {
  @js.native
  sealed trait adFilterAffectedRecords
    extends activexDashAdodbLib.ADODBNs.FilterGroupEnum
  
  @js.native
  sealed trait adFilterConflictingRecords
    extends activexDashAdodbLib.ADODBNs.FilterGroupEnum
  
  @js.native
  sealed trait adFilterFetchedRecords
    extends activexDashAdodbLib.ADODBNs.FilterGroupEnum
  
  @js.native
  sealed trait adFilterNone
    extends activexDashAdodbLib.ADODBNs.FilterGroupEnum
  
  @js.native
  sealed trait adFilterPendingRecords
    extends activexDashAdodbLib.ADODBNs.FilterGroupEnum
  
  @js.native
  sealed trait adFilterPredicate
    extends activexDashAdodbLib.ADODBNs.FilterGroupEnum
  
  /* 2 */ val adFilterAffectedRecords: adFilterAffectedRecords with scala.Double = js.native
  /* 5 */ val adFilterConflictingRecords: adFilterConflictingRecords with scala.Double = js.native
  /* 3 */ val adFilterFetchedRecords: adFilterFetchedRecords with scala.Double = js.native
  /* 0 */ val adFilterNone: adFilterNone with scala.Double = js.native
  /* 1 */ val adFilterPendingRecords: adFilterPendingRecords with scala.Double = js.native
  /* 4 */ val adFilterPredicate: adFilterPredicate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.FilterGroupEnum with scala.Double] = js.native
}

