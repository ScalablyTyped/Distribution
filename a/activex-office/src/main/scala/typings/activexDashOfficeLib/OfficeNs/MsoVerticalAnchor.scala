package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoVerticalAnchor extends js.Object

@JSGlobal("Office.MsoVerticalAnchor")
@js.native
object MsoVerticalAnchor extends js.Object {
  @js.native
  sealed trait msoAnchorBottom
    extends activexDashOfficeLib.OfficeNs.MsoVerticalAnchor
  
  @js.native
  sealed trait msoAnchorBottomBaseLine
    extends activexDashOfficeLib.OfficeNs.MsoVerticalAnchor
  
  @js.native
  sealed trait msoAnchorMiddle
    extends activexDashOfficeLib.OfficeNs.MsoVerticalAnchor
  
  @js.native
  sealed trait msoAnchorTop
    extends activexDashOfficeLib.OfficeNs.MsoVerticalAnchor
  
  @js.native
  sealed trait msoAnchorTopBaseline
    extends activexDashOfficeLib.OfficeNs.MsoVerticalAnchor
  
  @js.native
  sealed trait msoVerticalAnchorMixed
    extends activexDashOfficeLib.OfficeNs.MsoVerticalAnchor
  
  /* 4 */ val msoAnchorBottom: msoAnchorBottom with scala.Double = js.native
  /* 5 */ val msoAnchorBottomBaseLine: msoAnchorBottomBaseLine with scala.Double = js.native
  /* 3 */ val msoAnchorMiddle: msoAnchorMiddle with scala.Double = js.native
  /* 1 */ val msoAnchorTop: msoAnchorTop with scala.Double = js.native
  /* 2 */ val msoAnchorTopBaseline: msoAnchorTopBaseline with scala.Double = js.native
  /* -2 */ val msoVerticalAnchorMixed: msoVerticalAnchorMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoVerticalAnchor with scala.Double] = js.native
}

