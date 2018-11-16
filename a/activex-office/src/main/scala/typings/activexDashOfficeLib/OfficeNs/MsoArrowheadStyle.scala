package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoArrowheadStyle extends js.Object

@JSGlobal("Office.MsoArrowheadStyle")
@js.native
object MsoArrowheadStyle extends js.Object {
  @js.native
  sealed trait msoArrowheadDiamond
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadStyle
  
  @js.native
  sealed trait msoArrowheadNone
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadStyle
  
  @js.native
  sealed trait msoArrowheadOpen
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadStyle
  
  @js.native
  sealed trait msoArrowheadOval
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadStyle
  
  @js.native
  sealed trait msoArrowheadStealth
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadStyle
  
  @js.native
  sealed trait msoArrowheadStyleMixed
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadStyle
  
  @js.native
  sealed trait msoArrowheadTriangle
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadStyle
  
  /* 5 */ val msoArrowheadDiamond: msoArrowheadDiamond with scala.Double = js.native
  /* 1 */ val msoArrowheadNone: msoArrowheadNone with scala.Double = js.native
  /* 3 */ val msoArrowheadOpen: msoArrowheadOpen with scala.Double = js.native
  /* 6 */ val msoArrowheadOval: msoArrowheadOval with scala.Double = js.native
  /* 4 */ val msoArrowheadStealth: msoArrowheadStealth with scala.Double = js.native
  /* -2 */ val msoArrowheadStyleMixed: msoArrowheadStyleMixed with scala.Double = js.native
  /* 2 */ val msoArrowheadTriangle: msoArrowheadTriangle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoArrowheadStyle with scala.Double] = js.native
}

