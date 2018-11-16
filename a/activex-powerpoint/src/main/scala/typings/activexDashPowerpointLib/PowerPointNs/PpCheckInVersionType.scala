package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpCheckInVersionType extends js.Object

@JSGlobal("PowerPoint.PpCheckInVersionType")
@js.native
object PpCheckInVersionType extends js.Object {
  @js.native
  sealed trait ppCheckInMajorVersion
    extends activexDashPowerpointLib.PowerPointNs.PpCheckInVersionType
  
  @js.native
  sealed trait ppCheckInMinorVersion
    extends activexDashPowerpointLib.PowerPointNs.PpCheckInVersionType
  
  @js.native
  sealed trait ppCheckInOverwriteVersion
    extends activexDashPowerpointLib.PowerPointNs.PpCheckInVersionType
  
  /* 1 */ val ppCheckInMajorVersion: ppCheckInMajorVersion with scala.Double = js.native
  /* 0 */ val ppCheckInMinorVersion: ppCheckInMinorVersion with scala.Double = js.native
  /* 2 */ val ppCheckInOverwriteVersion: ppCheckInOverwriteVersion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpCheckInVersionType with scala.Double] = js.native
}

