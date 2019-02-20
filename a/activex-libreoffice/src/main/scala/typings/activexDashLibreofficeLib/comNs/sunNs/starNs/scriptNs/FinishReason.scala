package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FinishReason extends js.Object

/**
  * contains the response for a scripting engine termination.
  * @deprecated Deprecated
  */
@JSGlobal("com.sun.star.script.FinishReason")
@js.native
object FinishReason extends js.Object {
  /**
    * script in the engine was cancelled.
    *
    * script execution was cancelled.
    */
  @js.native
  sealed trait Cancel
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.FinishReason
  
  /** error occurred during script execution or compiling. */
  @js.native
  sealed trait Error
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.FinishReason
  
  /** script in the engine terminated normally. */
  @js.native
  sealed trait OK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.FinishReason
  
  /* 1 */ val Cancel: Cancel with scala.Double = js.native
  /* 2 */ val Error: Error with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.FinishReason with scala.Double
  ] = js.native
}

