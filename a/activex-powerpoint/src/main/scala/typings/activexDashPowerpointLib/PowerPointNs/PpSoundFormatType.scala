package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpSoundFormatType extends js.Object

@JSGlobal("PowerPoint.PpSoundFormatType")
@js.native
object PpSoundFormatType extends js.Object {
  @js.native
  sealed trait ppSoundFormatCDAudio
    extends activexDashPowerpointLib.PowerPointNs.PpSoundFormatType
  
  @js.native
  sealed trait ppSoundFormatMIDI
    extends activexDashPowerpointLib.PowerPointNs.PpSoundFormatType
  
  @js.native
  sealed trait ppSoundFormatMixed
    extends activexDashPowerpointLib.PowerPointNs.PpSoundFormatType
  
  @js.native
  sealed trait ppSoundFormatNone
    extends activexDashPowerpointLib.PowerPointNs.PpSoundFormatType
  
  @js.native
  sealed trait ppSoundFormatWAV
    extends activexDashPowerpointLib.PowerPointNs.PpSoundFormatType
  
  /* 3 */ val ppSoundFormatCDAudio: ppSoundFormatCDAudio with scala.Double = js.native
  /* 2 */ val ppSoundFormatMIDI: ppSoundFormatMIDI with scala.Double = js.native
  /* -2 */ val ppSoundFormatMixed: ppSoundFormatMixed with scala.Double = js.native
  /* 0 */ val ppSoundFormatNone: ppSoundFormatNone with scala.Double = js.native
  /* 1 */ val ppSoundFormatWAV: ppSoundFormatWAV with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpSoundFormatType with scala.Double] = js.native
}

