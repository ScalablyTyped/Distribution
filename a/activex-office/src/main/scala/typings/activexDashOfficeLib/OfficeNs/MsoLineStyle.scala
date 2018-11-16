package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoLineStyle extends js.Object

@JSGlobal("Office.MsoLineStyle")
@js.native
object MsoLineStyle extends js.Object {
  @js.native
  sealed trait msoLineSingle
    extends activexDashOfficeLib.OfficeNs.MsoLineStyle
  
  @js.native
  sealed trait msoLineStyleMixed
    extends activexDashOfficeLib.OfficeNs.MsoLineStyle
  
  @js.native
  sealed trait msoLineThickBetweenThin
    extends activexDashOfficeLib.OfficeNs.MsoLineStyle
  
  @js.native
  sealed trait msoLineThickThin
    extends activexDashOfficeLib.OfficeNs.MsoLineStyle
  
  @js.native
  sealed trait msoLineThinThick
    extends activexDashOfficeLib.OfficeNs.MsoLineStyle
  
  @js.native
  sealed trait msoLineThinThin
    extends activexDashOfficeLib.OfficeNs.MsoLineStyle
  
  /* 1 */ val msoLineSingle: msoLineSingle with scala.Double = js.native
  /* -2 */ val msoLineStyleMixed: msoLineStyleMixed with scala.Double = js.native
  /* 5 */ val msoLineThickBetweenThin: msoLineThickBetweenThin with scala.Double = js.native
  /* 4 */ val msoLineThickThin: msoLineThickThin with scala.Double = js.native
  /* 3 */ val msoLineThinThick: msoLineThinThick with scala.Double = js.native
  /* 2 */ val msoLineThinThin: msoLineThinThin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoLineStyle with scala.Double] = js.native
}

