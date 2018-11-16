package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAlignCmd extends js.Object

@JSGlobal("Office.MsoAlignCmd")
@js.native
object MsoAlignCmd extends js.Object {
  @js.native
  sealed trait msoAlignBottoms
    extends activexDashOfficeLib.OfficeNs.MsoAlignCmd
  
  @js.native
  sealed trait msoAlignCenters
    extends activexDashOfficeLib.OfficeNs.MsoAlignCmd
  
  @js.native
  sealed trait msoAlignLefts
    extends activexDashOfficeLib.OfficeNs.MsoAlignCmd
  
  @js.native
  sealed trait msoAlignMiddles
    extends activexDashOfficeLib.OfficeNs.MsoAlignCmd
  
  @js.native
  sealed trait msoAlignRights
    extends activexDashOfficeLib.OfficeNs.MsoAlignCmd
  
  @js.native
  sealed trait msoAlignTops
    extends activexDashOfficeLib.OfficeNs.MsoAlignCmd
  
  /* 5 */ val msoAlignBottoms: msoAlignBottoms with scala.Double = js.native
  /* 1 */ val msoAlignCenters: msoAlignCenters with scala.Double = js.native
  /* 0 */ val msoAlignLefts: msoAlignLefts with scala.Double = js.native
  /* 4 */ val msoAlignMiddles: msoAlignMiddles with scala.Double = js.native
  /* 2 */ val msoAlignRights: msoAlignRights with scala.Double = js.native
  /* 3 */ val msoAlignTops: msoAlignTops with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoAlignCmd with scala.Double] = js.native
}

