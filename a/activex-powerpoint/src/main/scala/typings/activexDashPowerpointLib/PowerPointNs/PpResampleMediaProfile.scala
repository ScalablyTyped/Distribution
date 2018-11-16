package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpResampleMediaProfile extends js.Object

@JSGlobal("PowerPoint.PpResampleMediaProfile")
@js.native
object PpResampleMediaProfile extends js.Object {
  @js.native
  sealed trait ppResampleMediaProfileCustom
    extends activexDashPowerpointLib.PowerPointNs.PpResampleMediaProfile
  
  @js.native
  sealed trait ppResampleMediaProfileSmall
    extends activexDashPowerpointLib.PowerPointNs.PpResampleMediaProfile
  
  @js.native
  sealed trait ppResampleMediaProfileSmaller
    extends activexDashPowerpointLib.PowerPointNs.PpResampleMediaProfile
  
  @js.native
  sealed trait ppResampleMediaProfileSmallest
    extends activexDashPowerpointLib.PowerPointNs.PpResampleMediaProfile
  
  /* 1 */ val ppResampleMediaProfileCustom: ppResampleMediaProfileCustom with scala.Double = js.native
  /* 2 */ val ppResampleMediaProfileSmall: ppResampleMediaProfileSmall with scala.Double = js.native
  /* 3 */ val ppResampleMediaProfileSmaller: ppResampleMediaProfileSmaller with scala.Double = js.native
  /* 4 */ val ppResampleMediaProfileSmallest: ppResampleMediaProfileSmallest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpResampleMediaProfile with scala.Double] = js.native
}

