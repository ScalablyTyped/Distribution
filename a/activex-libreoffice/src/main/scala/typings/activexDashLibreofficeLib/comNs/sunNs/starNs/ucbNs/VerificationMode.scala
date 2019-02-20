package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerificationMode extends js.Object

/**
  * These are the possible values for the property "VerificationMode".
  * @see XCommandProcessor
  * @see Content
  */
@JSGlobal("com.sun.star.ucb.VerificationMode")
@js.native
object VerificationMode extends js.Object {
  /** Always. */
  @js.native
  sealed trait ALWAYS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.VerificationMode
  
  /** Never. */
  @js.native
  sealed trait NEVER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.VerificationMode
  
  /** Once. */
  @js.native
  sealed trait ONCE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.VerificationMode
  
  /* 0 */ val ALWAYS: ALWAYS with scala.Double = js.native
  /* 2 */ val NEVER: NEVER with scala.Double = js.native
  /* 1 */ val ONCE: ONCE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.VerificationMode with scala.Double
  ] = js.native
}

