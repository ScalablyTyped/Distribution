package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpSlideShowState extends js.Object

@JSGlobal("PowerPoint.PpSlideShowState")
@js.native
object PpSlideShowState extends js.Object {
  @js.native
  sealed trait ppSlideShowBlackScreen
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowState
  
  @js.native
  sealed trait ppSlideShowDone
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowState
  
  @js.native
  sealed trait ppSlideShowPaused
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowState
  
  @js.native
  sealed trait ppSlideShowRunning
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowState
  
  @js.native
  sealed trait ppSlideShowWhiteScreen
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowState
  
  /* 3 */ val ppSlideShowBlackScreen: ppSlideShowBlackScreen with scala.Double = js.native
  /* 5 */ val ppSlideShowDone: ppSlideShowDone with scala.Double = js.native
  /* 2 */ val ppSlideShowPaused: ppSlideShowPaused with scala.Double = js.native
  /* 1 */ val ppSlideShowRunning: ppSlideShowRunning with scala.Double = js.native
  /* 4 */ val ppSlideShowWhiteScreen: ppSlideShowWhiteScreen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpSlideShowState with scala.Double] = js.native
}

