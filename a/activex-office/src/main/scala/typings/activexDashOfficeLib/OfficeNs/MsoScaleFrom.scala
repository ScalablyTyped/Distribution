package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoScaleFrom extends js.Object

@JSGlobal("Office.MsoScaleFrom")
@js.native
object MsoScaleFrom extends js.Object {
  @js.native
  sealed trait msoScaleFromBottomRight
    extends activexDashOfficeLib.OfficeNs.MsoScaleFrom
  
  @js.native
  sealed trait msoScaleFromMiddle
    extends activexDashOfficeLib.OfficeNs.MsoScaleFrom
  
  @js.native
  sealed trait msoScaleFromTopLeft
    extends activexDashOfficeLib.OfficeNs.MsoScaleFrom
  
  /* 2 */ val msoScaleFromBottomRight: msoScaleFromBottomRight with scala.Double = js.native
  /* 1 */ val msoScaleFromMiddle: msoScaleFromMiddle with scala.Double = js.native
  /* 0 */ val msoScaleFromTopLeft: msoScaleFromTopLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoScaleFrom with scala.Double] = js.native
}

