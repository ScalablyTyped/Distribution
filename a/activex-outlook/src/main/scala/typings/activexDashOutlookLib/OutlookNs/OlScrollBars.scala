package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlScrollBars extends js.Object

@JSGlobal("Outlook.OlScrollBars")
@js.native
object OlScrollBars extends js.Object {
  @js.native
  sealed trait olScrollBarsBoth
    extends activexDashOutlookLib.OutlookNs.OlScrollBars
  
  @js.native
  sealed trait olScrollBarsHorizontal
    extends activexDashOutlookLib.OutlookNs.OlScrollBars
  
  @js.native
  sealed trait olScrollBarsNone
    extends activexDashOutlookLib.OutlookNs.OlScrollBars
  
  @js.native
  sealed trait olScrollBarsVertical
    extends activexDashOutlookLib.OutlookNs.OlScrollBars
  
  /* 3 */ val olScrollBarsBoth: olScrollBarsBoth with scala.Double = js.native
  /* 1 */ val olScrollBarsHorizontal: olScrollBarsHorizontal with scala.Double = js.native
  /* 0 */ val olScrollBarsNone: olScrollBarsNone with scala.Double = js.native
  /* 2 */ val olScrollBarsVertical: olScrollBarsVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlScrollBars with scala.Double] = js.native
}

