package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAnimCommandType extends js.Object

@JSGlobal("PowerPoint.MsoAnimCommandType")
@js.native
object MsoAnimCommandType extends js.Object {
  @js.native
  sealed trait msoAnimCommandTypeCall
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimCommandType
  
  @js.native
  sealed trait msoAnimCommandTypeEvent
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimCommandType
  
  @js.native
  sealed trait msoAnimCommandTypeVerb
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimCommandType
  
  /* 1 */ val msoAnimCommandTypeCall: msoAnimCommandTypeCall with scala.Double = js.native
  /* 0 */ val msoAnimCommandTypeEvent: msoAnimCommandTypeEvent with scala.Double = js.native
  /* 2 */ val msoAnimCommandTypeVerb: msoAnimCommandTypeVerb with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoAnimCommandType with scala.Double] = js.native
}

