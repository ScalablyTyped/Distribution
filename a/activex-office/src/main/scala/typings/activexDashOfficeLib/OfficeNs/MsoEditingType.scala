package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoEditingType extends js.Object

@JSGlobal("Office.MsoEditingType")
@js.native
object MsoEditingType extends js.Object {
  @js.native
  sealed trait msoEditingAuto
    extends activexDashOfficeLib.OfficeNs.MsoEditingType
  
  @js.native
  sealed trait msoEditingCorner
    extends activexDashOfficeLib.OfficeNs.MsoEditingType
  
  @js.native
  sealed trait msoEditingSmooth
    extends activexDashOfficeLib.OfficeNs.MsoEditingType
  
  @js.native
  sealed trait msoEditingSymmetric
    extends activexDashOfficeLib.OfficeNs.MsoEditingType
  
  /* 0 */ val msoEditingAuto: msoEditingAuto with scala.Double = js.native
  /* 1 */ val msoEditingCorner: msoEditingCorner with scala.Double = js.native
  /* 2 */ val msoEditingSmooth: msoEditingSmooth with scala.Double = js.native
  /* 3 */ val msoEditingSymmetric: msoEditingSymmetric with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoEditingType with scala.Double] = js.native
}

