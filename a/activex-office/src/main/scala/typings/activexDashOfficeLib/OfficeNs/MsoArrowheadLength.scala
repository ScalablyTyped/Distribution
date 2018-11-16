package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoArrowheadLength extends js.Object

@JSGlobal("Office.MsoArrowheadLength")
@js.native
object MsoArrowheadLength extends js.Object {
  @js.native
  sealed trait msoArrowheadLengthMedium
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadLength
  
  @js.native
  sealed trait msoArrowheadLengthMixed
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadLength
  
  @js.native
  sealed trait msoArrowheadLong
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadLength
  
  @js.native
  sealed trait msoArrowheadShort
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadLength
  
  /* 2 */ val msoArrowheadLengthMedium: msoArrowheadLengthMedium with scala.Double = js.native
  /* -2 */ val msoArrowheadLengthMixed: msoArrowheadLengthMixed with scala.Double = js.native
  /* 3 */ val msoArrowheadLong: msoArrowheadLong with scala.Double = js.native
  /* 1 */ val msoArrowheadShort: msoArrowheadShort with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoArrowheadLength with scala.Double] = js.native
}

