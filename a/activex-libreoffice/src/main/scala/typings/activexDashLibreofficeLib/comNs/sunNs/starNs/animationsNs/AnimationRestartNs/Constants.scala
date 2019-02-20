package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationRestartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.animations.AnimationRestart.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ALWAYS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationRestartNs.Constants
  
  @js.native
  sealed trait DEFAULT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationRestartNs.Constants
  
  @js.native
  sealed trait INHERIT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationRestartNs.Constants
  
  @js.native
  sealed trait NEVER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationRestartNs.Constants
  
  @js.native
  sealed trait WHEN_NOT_ACTIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationRestartNs.Constants
  
  /* 1 */ val ALWAYS: ALWAYS with scala.Double = js.native
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 0 */ val INHERIT: INHERIT with scala.Double = js.native
  /* 3 */ val NEVER: NEVER with scala.Double = js.native
  /* 2 */ val WHEN_NOT_ACTIVE: WHEN_NOT_ACTIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationRestartNs.Constants with scala.Double
  ] = js.native
}

