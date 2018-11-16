package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlNoteColor extends js.Object

@JSGlobal("Outlook.OlNoteColor")
@js.native
object OlNoteColor extends js.Object {
  @js.native
  sealed trait olBlue
    extends activexDashOutlookLib.OutlookNs.OlNoteColor
  
  @js.native
  sealed trait olGreen
    extends activexDashOutlookLib.OutlookNs.OlNoteColor
  
  @js.native
  sealed trait olPink
    extends activexDashOutlookLib.OutlookNs.OlNoteColor
  
  @js.native
  sealed trait olWhite
    extends activexDashOutlookLib.OutlookNs.OlNoteColor
  
  @js.native
  sealed trait olYellow
    extends activexDashOutlookLib.OutlookNs.OlNoteColor
  
  /* 0 */ val olBlue: olBlue with scala.Double = js.native
  /* 1 */ val olGreen: olGreen with scala.Double = js.native
  /* 2 */ val olPink: olPink with scala.Double = js.native
  /* 4 */ val olWhite: olWhite with scala.Double = js.native
  /* 3 */ val olYellow: olYellow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlNoteColor with scala.Double] = js.native
}

