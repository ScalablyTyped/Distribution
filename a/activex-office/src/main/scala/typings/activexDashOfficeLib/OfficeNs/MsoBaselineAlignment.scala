package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBaselineAlignment extends js.Object

@JSGlobal("Office.MsoBaselineAlignment")
@js.native
object MsoBaselineAlignment extends js.Object {
  @js.native
  sealed trait msoBaselineAlignAuto
    extends activexDashOfficeLib.OfficeNs.MsoBaselineAlignment
  
  @js.native
  sealed trait msoBaselineAlignBaseline
    extends activexDashOfficeLib.OfficeNs.MsoBaselineAlignment
  
  @js.native
  sealed trait msoBaselineAlignCenter
    extends activexDashOfficeLib.OfficeNs.MsoBaselineAlignment
  
  @js.native
  sealed trait msoBaselineAlignFarEast50
    extends activexDashOfficeLib.OfficeNs.MsoBaselineAlignment
  
  @js.native
  sealed trait msoBaselineAlignMixed
    extends activexDashOfficeLib.OfficeNs.MsoBaselineAlignment
  
  @js.native
  sealed trait msoBaselineAlignTop
    extends activexDashOfficeLib.OfficeNs.MsoBaselineAlignment
  
  /* 5 */ val msoBaselineAlignAuto: msoBaselineAlignAuto with scala.Double = js.native
  /* 1 */ val msoBaselineAlignBaseline: msoBaselineAlignBaseline with scala.Double = js.native
  /* 3 */ val msoBaselineAlignCenter: msoBaselineAlignCenter with scala.Double = js.native
  /* 4 */ val msoBaselineAlignFarEast50: msoBaselineAlignFarEast50 with scala.Double = js.native
  /* -2 */ val msoBaselineAlignMixed: msoBaselineAlignMixed with scala.Double = js.native
  /* 2 */ val msoBaselineAlignTop: msoBaselineAlignTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBaselineAlignment with scala.Double] = js.native
}

