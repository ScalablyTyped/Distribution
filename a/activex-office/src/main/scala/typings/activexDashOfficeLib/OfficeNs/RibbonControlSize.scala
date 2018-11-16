package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RibbonControlSize extends js.Object

@JSGlobal("Office.RibbonControlSize")
@js.native
object RibbonControlSize extends js.Object {
  @js.native
  sealed trait RibbonControlSizeLarge
    extends activexDashOfficeLib.OfficeNs.RibbonControlSize
  
  @js.native
  sealed trait RibbonControlSizeRegular
    extends activexDashOfficeLib.OfficeNs.RibbonControlSize
  
  /* 1 */ val RibbonControlSizeLarge: RibbonControlSizeLarge with scala.Double = js.native
  /* 0 */ val RibbonControlSizeRegular: RibbonControlSizeRegular with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.RibbonControlSize with scala.Double] = js.native
}

