package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpPlayerState extends js.Object

@JSGlobal("PowerPoint.PpPlayerState")
@js.native
object PpPlayerState extends js.Object {
  @js.native
  sealed trait ppNotReady
    extends activexDashPowerpointLib.PowerPointNs.PpPlayerState
  
  @js.native
  sealed trait ppPaused
    extends activexDashPowerpointLib.PowerPointNs.PpPlayerState
  
  @js.native
  sealed trait ppPlaying
    extends activexDashPowerpointLib.PowerPointNs.PpPlayerState
  
  @js.native
  sealed trait ppStopped
    extends activexDashPowerpointLib.PowerPointNs.PpPlayerState
  
  /* 3 */ val ppNotReady: ppNotReady with scala.Double = js.native
  /* 1 */ val ppPaused: ppPaused with scala.Double = js.native
  /* 0 */ val ppPlaying: ppPlaying with scala.Double = js.native
  /* 2 */ val ppStopped: ppStopped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpPlayerState with scala.Double] = js.native
}

