package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

/**
  * These are the possible values for the property "Priority".
  * @see XCommandProcessor
  * @see Content
  */
@JSGlobal("com.sun.star.ucb.Priority")
@js.native
object Priority extends js.Object {
  /** High priority. */
  @js.native
  sealed trait HIGH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Priority
  
  /** Highest priority. */
  @js.native
  sealed trait HIGHEST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Priority
  
  /** Low priority. */
  @js.native
  sealed trait LOW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Priority
  
  /** Lowest priority. */
  @js.native
  sealed trait LOWEST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Priority
  
  /** Normal priority. */
  @js.native
  sealed trait NORMAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Priority
  
  /* 1 */ val HIGH: HIGH with scala.Double = js.native
  /* 0 */ val HIGHEST: HIGHEST with scala.Double = js.native
  /* 3 */ val LOW: LOW with scala.Double = js.native
  /* 4 */ val LOWEST: LOWEST with scala.Double = js.native
  /* 2 */ val NORMAL: NORMAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Priority with scala.Double] = js.native
}

