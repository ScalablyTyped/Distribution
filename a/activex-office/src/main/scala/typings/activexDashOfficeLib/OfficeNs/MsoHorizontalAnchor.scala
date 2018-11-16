package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoHorizontalAnchor extends js.Object

@JSGlobal("Office.MsoHorizontalAnchor")
@js.native
object MsoHorizontalAnchor extends js.Object {
  @js.native
  sealed trait msoAnchorCenter
    extends activexDashOfficeLib.OfficeNs.MsoHorizontalAnchor
  
  @js.native
  sealed trait msoAnchorNone
    extends activexDashOfficeLib.OfficeNs.MsoHorizontalAnchor
  
  @js.native
  sealed trait msoHorizontalAnchorMixed
    extends activexDashOfficeLib.OfficeNs.MsoHorizontalAnchor
  
  /* 2 */ val msoAnchorCenter: msoAnchorCenter with scala.Double = js.native
  /* 1 */ val msoAnchorNone: msoAnchorNone with scala.Double = js.native
  /* -2 */ val msoHorizontalAnchorMixed: msoHorizontalAnchorMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoHorizontalAnchor with scala.Double] = js.native
}

