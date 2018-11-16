package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoOrientation extends js.Object

@JSGlobal("Office.MsoOrientation")
@js.native
object MsoOrientation extends js.Object {
  @js.native
  sealed trait msoOrientationHorizontal
    extends activexDashOfficeLib.OfficeNs.MsoOrientation
  
  @js.native
  sealed trait msoOrientationMixed
    extends activexDashOfficeLib.OfficeNs.MsoOrientation
  
  @js.native
  sealed trait msoOrientationVertical
    extends activexDashOfficeLib.OfficeNs.MsoOrientation
  
  /* 1 */ val msoOrientationHorizontal: msoOrientationHorizontal with scala.Double = js.native
  /* -2 */ val msoOrientationMixed: msoOrientationMixed with scala.Double = js.native
  /* 2 */ val msoOrientationVertical: msoOrientationVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoOrientation with scala.Double] = js.native
}

