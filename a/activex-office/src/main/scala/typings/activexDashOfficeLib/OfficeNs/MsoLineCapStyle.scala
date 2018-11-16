package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoLineCapStyle extends js.Object

@JSGlobal("Office.MsoLineCapStyle")
@js.native
object MsoLineCapStyle extends js.Object {
  @js.native
  sealed trait msoLineCapFlat
    extends activexDashOfficeLib.OfficeNs.MsoLineCapStyle
  
  @js.native
  sealed trait msoLineCapMixed
    extends activexDashOfficeLib.OfficeNs.MsoLineCapStyle
  
  @js.native
  sealed trait msoLineCapRound
    extends activexDashOfficeLib.OfficeNs.MsoLineCapStyle
  
  @js.native
  sealed trait msoLineCapSquare
    extends activexDashOfficeLib.OfficeNs.MsoLineCapStyle
  
  /* 3 */ val msoLineCapFlat: msoLineCapFlat with scala.Double = js.native
  /* -2 */ val msoLineCapMixed: msoLineCapMixed with scala.Double = js.native
  /* 2 */ val msoLineCapRound: msoLineCapRound with scala.Double = js.native
  /* 1 */ val msoLineCapSquare: msoLineCapSquare with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoLineCapStyle with scala.Double] = js.native
}

