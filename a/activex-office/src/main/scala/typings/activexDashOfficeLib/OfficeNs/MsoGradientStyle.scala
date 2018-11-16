package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoGradientStyle extends js.Object

@JSGlobal("Office.MsoGradientStyle")
@js.native
object MsoGradientStyle extends js.Object {
  @js.native
  sealed trait msoGradientDiagonalDown
    extends activexDashOfficeLib.OfficeNs.MsoGradientStyle
  
  @js.native
  sealed trait msoGradientDiagonalUp
    extends activexDashOfficeLib.OfficeNs.MsoGradientStyle
  
  @js.native
  sealed trait msoGradientFromCenter
    extends activexDashOfficeLib.OfficeNs.MsoGradientStyle
  
  @js.native
  sealed trait msoGradientFromCorner
    extends activexDashOfficeLib.OfficeNs.MsoGradientStyle
  
  @js.native
  sealed trait msoGradientFromTitle
    extends activexDashOfficeLib.OfficeNs.MsoGradientStyle
  
  @js.native
  sealed trait msoGradientHorizontal
    extends activexDashOfficeLib.OfficeNs.MsoGradientStyle
  
  @js.native
  sealed trait msoGradientMixed
    extends activexDashOfficeLib.OfficeNs.MsoGradientStyle
  
  @js.native
  sealed trait msoGradientVertical
    extends activexDashOfficeLib.OfficeNs.MsoGradientStyle
  
  /* 4 */ val msoGradientDiagonalDown: msoGradientDiagonalDown with scala.Double = js.native
  /* 3 */ val msoGradientDiagonalUp: msoGradientDiagonalUp with scala.Double = js.native
  /* 7 */ val msoGradientFromCenter: msoGradientFromCenter with scala.Double = js.native
  /* 5 */ val msoGradientFromCorner: msoGradientFromCorner with scala.Double = js.native
  /* 6 */ val msoGradientFromTitle: msoGradientFromTitle with scala.Double = js.native
  /* 1 */ val msoGradientHorizontal: msoGradientHorizontal with scala.Double = js.native
  /* -2 */ val msoGradientMixed: msoGradientMixed with scala.Double = js.native
  /* 2 */ val msoGradientVertical: msoGradientVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoGradientStyle with scala.Double] = js.native
}

