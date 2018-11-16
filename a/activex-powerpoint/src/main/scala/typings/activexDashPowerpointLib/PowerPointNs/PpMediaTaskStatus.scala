package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpMediaTaskStatus extends js.Object

@JSGlobal("PowerPoint.PpMediaTaskStatus")
@js.native
object PpMediaTaskStatus extends js.Object {
  @js.native
  sealed trait ppMediaTaskStatusDone
    extends activexDashPowerpointLib.PowerPointNs.PpMediaTaskStatus
  
  @js.native
  sealed trait ppMediaTaskStatusFailed
    extends activexDashPowerpointLib.PowerPointNs.PpMediaTaskStatus
  
  @js.native
  sealed trait ppMediaTaskStatusInProgress
    extends activexDashPowerpointLib.PowerPointNs.PpMediaTaskStatus
  
  @js.native
  sealed trait ppMediaTaskStatusNone
    extends activexDashPowerpointLib.PowerPointNs.PpMediaTaskStatus
  
  @js.native
  sealed trait ppMediaTaskStatusQueued
    extends activexDashPowerpointLib.PowerPointNs.PpMediaTaskStatus
  
  /* 3 */ val ppMediaTaskStatusDone: ppMediaTaskStatusDone with scala.Double = js.native
  /* 4 */ val ppMediaTaskStatusFailed: ppMediaTaskStatusFailed with scala.Double = js.native
  /* 1 */ val ppMediaTaskStatusInProgress: ppMediaTaskStatusInProgress with scala.Double = js.native
  /* 0 */ val ppMediaTaskStatusNone: ppMediaTaskStatusNone with scala.Double = js.native
  /* 2 */ val ppMediaTaskStatusQueued: ppMediaTaskStatusQueued with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpMediaTaskStatus with scala.Double] = js.native
}

