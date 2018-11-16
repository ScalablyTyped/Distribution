package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventReasonEnum extends js.Object

@JSGlobal("ADODB.EventReasonEnum")
@js.native
object EventReasonEnum extends js.Object {
  @js.native
  sealed trait adRsnAddNew
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnClose
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnDelete
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnFirstChange
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnMove
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnMoveFirst
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnMoveLast
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnMoveNext
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnMovePrevious
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnRequery
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnResynch
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnUndoAddNew
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnUndoDelete
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnUndoUpdate
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  @js.native
  sealed trait adRsnUpdate
    extends activexDashAdodbLib.ADODBNs.EventReasonEnum
  
  /* 1 */ val adRsnAddNew: adRsnAddNew with scala.Double = js.native
  /* 9 */ val adRsnClose: adRsnClose with scala.Double = js.native
  /* 2 */ val adRsnDelete: adRsnDelete with scala.Double = js.native
  /* 11 */ val adRsnFirstChange: adRsnFirstChange with scala.Double = js.native
  /* 10 */ val adRsnMove: adRsnMove with scala.Double = js.native
  /* 12 */ val adRsnMoveFirst: adRsnMoveFirst with scala.Double = js.native
  /* 15 */ val adRsnMoveLast: adRsnMoveLast with scala.Double = js.native
  /* 13 */ val adRsnMoveNext: adRsnMoveNext with scala.Double = js.native
  /* 14 */ val adRsnMovePrevious: adRsnMovePrevious with scala.Double = js.native
  /* 7 */ val adRsnRequery: adRsnRequery with scala.Double = js.native
  /* 8 */ val adRsnResynch: adRsnResynch with scala.Double = js.native
  /* 5 */ val adRsnUndoAddNew: adRsnUndoAddNew with scala.Double = js.native
  /* 6 */ val adRsnUndoDelete: adRsnUndoDelete with scala.Double = js.native
  /* 4 */ val adRsnUndoUpdate: adRsnUndoUpdate with scala.Double = js.native
  /* 3 */ val adRsnUpdate: adRsnUpdate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.EventReasonEnum with scala.Double] = js.native
}

