package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSegmentType extends js.Object

@JSGlobal("Office.MsoSegmentType")
@js.native
object MsoSegmentType extends js.Object {
  @js.native
  sealed trait msoSegmentCurve
    extends activexDashOfficeLib.OfficeNs.MsoSegmentType
  
  @js.native
  sealed trait msoSegmentLine
    extends activexDashOfficeLib.OfficeNs.MsoSegmentType
  
  /* 1 */ val msoSegmentCurve: msoSegmentCurve with scala.Double = js.native
  /* 0 */ val msoSegmentLine: msoSegmentLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSegmentType with scala.Double] = js.native
}

