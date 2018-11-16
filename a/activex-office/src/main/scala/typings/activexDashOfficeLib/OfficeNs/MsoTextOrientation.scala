package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextOrientation extends js.Object

@JSGlobal("Office.MsoTextOrientation")
@js.native
object MsoTextOrientation extends js.Object {
  @js.native
  sealed trait msoTextOrientationDownward
    extends activexDashOfficeLib.OfficeNs.MsoTextOrientation
  
  @js.native
  sealed trait msoTextOrientationHorizontal
    extends activexDashOfficeLib.OfficeNs.MsoTextOrientation
  
  @js.native
  sealed trait msoTextOrientationHorizontalRotatedFarEast
    extends activexDashOfficeLib.OfficeNs.MsoTextOrientation
  
  @js.native
  sealed trait msoTextOrientationMixed
    extends activexDashOfficeLib.OfficeNs.MsoTextOrientation
  
  @js.native
  sealed trait msoTextOrientationUpward
    extends activexDashOfficeLib.OfficeNs.MsoTextOrientation
  
  @js.native
  sealed trait msoTextOrientationVertical
    extends activexDashOfficeLib.OfficeNs.MsoTextOrientation
  
  @js.native
  sealed trait msoTextOrientationVerticalFarEast
    extends activexDashOfficeLib.OfficeNs.MsoTextOrientation
  
  /* 3 */ val msoTextOrientationDownward: msoTextOrientationDownward with scala.Double = js.native
  /* 1 */ val msoTextOrientationHorizontal: msoTextOrientationHorizontal with scala.Double = js.native
  /* 6 */ val msoTextOrientationHorizontalRotatedFarEast: msoTextOrientationHorizontalRotatedFarEast with scala.Double = js.native
  /* -2 */ val msoTextOrientationMixed: msoTextOrientationMixed with scala.Double = js.native
  /* 2 */ val msoTextOrientationUpward: msoTextOrientationUpward with scala.Double = js.native
  /* 5 */ val msoTextOrientationVertical: msoTextOrientationVertical with scala.Double = js.native
  /* 4 */ val msoTextOrientationVerticalFarEast: msoTextOrientationVerticalFarEast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextOrientation with scala.Double] = js.native
}

