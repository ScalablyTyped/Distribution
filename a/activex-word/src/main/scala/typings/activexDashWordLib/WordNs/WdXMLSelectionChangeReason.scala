package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdXMLSelectionChangeReason extends js.Object

@JSGlobal("Word.WdXMLSelectionChangeReason")
@js.native
object WdXMLSelectionChangeReason extends js.Object {
  @js.native
  sealed trait wdXMLSelectionChangeReasonDelete
    extends activexDashWordLib.WordNs.WdXMLSelectionChangeReason
  
  @js.native
  sealed trait wdXMLSelectionChangeReasonInsert
    extends activexDashWordLib.WordNs.WdXMLSelectionChangeReason
  
  @js.native
  sealed trait wdXMLSelectionChangeReasonMove
    extends activexDashWordLib.WordNs.WdXMLSelectionChangeReason
  
  /* 2 */ val wdXMLSelectionChangeReasonDelete: wdXMLSelectionChangeReasonDelete with scala.Double = js.native
  /* 1 */ val wdXMLSelectionChangeReasonInsert: wdXMLSelectionChangeReasonInsert with scala.Double = js.native
  /* 0 */ val wdXMLSelectionChangeReasonMove: wdXMLSelectionChangeReasonMove with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdXMLSelectionChangeReason with scala.Double] = js.native
}

