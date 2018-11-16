package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextDirection extends js.Object

@JSGlobal("Office.MsoTextDirection")
@js.native
object MsoTextDirection extends js.Object {
  @js.native
  sealed trait msoTextDirectionLeftToRight
    extends activexDashOfficeLib.OfficeNs.MsoTextDirection
  
  @js.native
  sealed trait msoTextDirectionMixed
    extends activexDashOfficeLib.OfficeNs.MsoTextDirection
  
  @js.native
  sealed trait msoTextDirectionRightToLeft
    extends activexDashOfficeLib.OfficeNs.MsoTextDirection
  
  /* 1 */ val msoTextDirectionLeftToRight: msoTextDirectionLeftToRight with scala.Double = js.native
  /* -2 */ val msoTextDirectionMixed: msoTextDirectionMixed with scala.Double = js.native
  /* 2 */ val msoTextDirectionRightToLeft: msoTextDirectionRightToLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextDirection with scala.Double] = js.native
}

