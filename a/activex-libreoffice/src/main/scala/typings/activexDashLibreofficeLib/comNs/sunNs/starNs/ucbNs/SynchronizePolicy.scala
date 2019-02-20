package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SynchronizePolicy extends js.Object

/**
  * These are the possible values for the property "SynchronizePolicy".
  * @see XCommandProcessor
  * @see Content
  */
@JSGlobal("com.sun.star.ucb.SynchronizePolicy")
@js.native
object SynchronizePolicy extends js.Object {
  /** Client is master. */
  @js.native
  sealed trait CLIENT_IS_MASTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SynchronizePolicy
  
  /** None is master. */
  @js.native
  sealed trait NONE_IS_MASTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SynchronizePolicy
  
  /** Server is master. */
  @js.native
  sealed trait SERVER_IS_MASTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SynchronizePolicy
  
  /* 1 */ val CLIENT_IS_MASTER: CLIENT_IS_MASTER with scala.Double = js.native
  /* 2 */ val NONE_IS_MASTER: NONE_IS_MASTER with scala.Double = js.native
  /* 0 */ val SERVER_IS_MASTER: SERVER_IS_MASTER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.SynchronizePolicy with scala.Double
  ] = js.native
}

