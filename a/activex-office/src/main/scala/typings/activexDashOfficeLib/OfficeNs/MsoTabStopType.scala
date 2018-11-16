package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTabStopType extends js.Object

@JSGlobal("Office.MsoTabStopType")
@js.native
object MsoTabStopType extends js.Object {
  @js.native
  sealed trait msoTabStopCenter
    extends activexDashOfficeLib.OfficeNs.MsoTabStopType
  
  @js.native
  sealed trait msoTabStopDecimal
    extends activexDashOfficeLib.OfficeNs.MsoTabStopType
  
  @js.native
  sealed trait msoTabStopLeft
    extends activexDashOfficeLib.OfficeNs.MsoTabStopType
  
  @js.native
  sealed trait msoTabStopMixed
    extends activexDashOfficeLib.OfficeNs.MsoTabStopType
  
  @js.native
  sealed trait msoTabStopRight
    extends activexDashOfficeLib.OfficeNs.MsoTabStopType
  
  /* 2 */ val msoTabStopCenter: msoTabStopCenter with scala.Double = js.native
  /* 4 */ val msoTabStopDecimal: msoTabStopDecimal with scala.Double = js.native
  /* 1 */ val msoTabStopLeft: msoTabStopLeft with scala.Double = js.native
  /* -2 */ val msoTabStopMixed: msoTabStopMixed with scala.Double = js.native
  /* 3 */ val msoTabStopRight: msoTabStopRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTabStopType with scala.Double] = js.native
}

