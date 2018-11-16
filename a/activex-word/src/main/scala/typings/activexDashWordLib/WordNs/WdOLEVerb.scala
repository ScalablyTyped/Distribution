package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOLEVerb extends js.Object

@JSGlobal("Word.WdOLEVerb")
@js.native
object WdOLEVerb extends js.Object {
  @js.native
  sealed trait wdOLEVerbDiscardUndoState
    extends activexDashWordLib.WordNs.WdOLEVerb
  
  @js.native
  sealed trait wdOLEVerbHide
    extends activexDashWordLib.WordNs.WdOLEVerb
  
  @js.native
  sealed trait wdOLEVerbInPlaceActivate
    extends activexDashWordLib.WordNs.WdOLEVerb
  
  @js.native
  sealed trait wdOLEVerbOpen
    extends activexDashWordLib.WordNs.WdOLEVerb
  
  @js.native
  sealed trait wdOLEVerbPrimary
    extends activexDashWordLib.WordNs.WdOLEVerb
  
  @js.native
  sealed trait wdOLEVerbShow
    extends activexDashWordLib.WordNs.WdOLEVerb
  
  @js.native
  sealed trait wdOLEVerbUIActivate
    extends activexDashWordLib.WordNs.WdOLEVerb
  
  /* -6 */ val wdOLEVerbDiscardUndoState: wdOLEVerbDiscardUndoState with scala.Double = js.native
  /* -3 */ val wdOLEVerbHide: wdOLEVerbHide with scala.Double = js.native
  /* -5 */ val wdOLEVerbInPlaceActivate: wdOLEVerbInPlaceActivate with scala.Double = js.native
  /* -2 */ val wdOLEVerbOpen: wdOLEVerbOpen with scala.Double = js.native
  /* 0 */ val wdOLEVerbPrimary: wdOLEVerbPrimary with scala.Double = js.native
  /* -1 */ val wdOLEVerbShow: wdOLEVerbShow with scala.Double = js.native
  /* -4 */ val wdOLEVerbUIActivate: wdOLEVerbUIActivate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOLEVerb with scala.Double] = js.native
}

