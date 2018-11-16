package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoButtonStyleHidden extends js.Object

@JSGlobal("Office.MsoButtonStyleHidden")
@js.native
object MsoButtonStyleHidden extends js.Object {
  @js.native
  sealed trait msoButtonTextBelow
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyleHidden
  
  @js.native
  sealed trait msoButtonWrapText
    extends activexDashOfficeLib.OfficeNs.MsoButtonStyleHidden
  
  /* 8 */ val msoButtonTextBelow: msoButtonTextBelow with scala.Double = js.native
  /* 4 */ val msoButtonWrapText: msoButtonWrapText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoButtonStyleHidden with scala.Double] = js.native
}

