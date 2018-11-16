package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpSoundEffectType extends js.Object

@JSGlobal("PowerPoint.PpSoundEffectType")
@js.native
object PpSoundEffectType extends js.Object {
  @js.native
  sealed trait ppSoundEffectsMixed
    extends activexDashPowerpointLib.PowerPointNs.PpSoundEffectType
  
  @js.native
  sealed trait ppSoundFile
    extends activexDashPowerpointLib.PowerPointNs.PpSoundEffectType
  
  @js.native
  sealed trait ppSoundNone
    extends activexDashPowerpointLib.PowerPointNs.PpSoundEffectType
  
  @js.native
  sealed trait ppSoundStopPrevious
    extends activexDashPowerpointLib.PowerPointNs.PpSoundEffectType
  
  /* -2 */ val ppSoundEffectsMixed: ppSoundEffectsMixed with scala.Double = js.native
  /* 2 */ val ppSoundFile: ppSoundFile with scala.Double = js.native
  /* 0 */ val ppSoundNone: ppSoundNone with scala.Double = js.native
  /* 1 */ val ppSoundStopPrevious: ppSoundStopPrevious with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpSoundEffectType with scala.Double] = js.native
}

