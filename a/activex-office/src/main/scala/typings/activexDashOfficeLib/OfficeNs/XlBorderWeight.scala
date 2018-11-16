package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlBorderWeight extends js.Object

@JSGlobal("Office.XlBorderWeight")
@js.native
object XlBorderWeight extends js.Object {
  @js.native
  sealed trait xlHairline
    extends activexDashOfficeLib.OfficeNs.XlBorderWeight
  
  @js.native
  sealed trait xlMedium
    extends activexDashOfficeLib.OfficeNs.XlBorderWeight
  
  @js.native
  sealed trait xlThick
    extends activexDashOfficeLib.OfficeNs.XlBorderWeight
  
  @js.native
  sealed trait xlThin
    extends activexDashOfficeLib.OfficeNs.XlBorderWeight
  
  /* 1 */ val xlHairline: xlHairline with scala.Double = js.native
  /* -4138 */ val xlMedium: xlMedium with scala.Double = js.native
  /* 4 */ val xlThick: xlThick with scala.Double = js.native
  /* 2 */ val xlThin: xlThin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlBorderWeight with scala.Double] = js.native
}

