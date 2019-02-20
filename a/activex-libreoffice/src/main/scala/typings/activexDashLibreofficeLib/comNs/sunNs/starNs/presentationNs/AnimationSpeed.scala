package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationSpeed extends js.Object

/** specifies the speed values of animation/fade effects. */
@JSGlobal("com.sun.star.presentation.AnimationSpeed")
@js.native
object AnimationSpeed extends js.Object {
  /** set the speed from the animation/fade to fast. */
  @js.native
  sealed trait FAST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.AnimationSpeed
  
  /** set the speed from the animation/fade to medium. */
  @js.native
  sealed trait MEDIUM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.AnimationSpeed
  
  /** set the speed from the animation/fade to slow. */
  @js.native
  sealed trait SLOW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.AnimationSpeed
  
  /* 2 */ val FAST: FAST with scala.Double = js.native
  /* 1 */ val MEDIUM: MEDIUM with scala.Double = js.native
  /* 0 */ val SLOW: SLOW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.AnimationSpeed with scala.Double
  ] = js.native
}

