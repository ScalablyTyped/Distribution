package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentStoreMode extends js.Object

/**
  * These are the possible values for the property "DocumentStoreMode".
  * @see XCommandProcessor
  * @see Content
  */
@JSGlobal("com.sun.star.ucb.DocumentStoreMode")
@js.native
object DocumentStoreMode extends js.Object {
  /** Document contents are stored locally. */
  @js.native
  sealed trait LOCAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.DocumentStoreMode
  
  /** Document contents are not stored locally. */
  @js.native
  sealed trait REMOTE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.DocumentStoreMode
  
  /* 1 */ val LOCAL: LOCAL with scala.Double = js.native
  /* 0 */ val REMOTE: REMOTE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.DocumentStoreMode with scala.Double
  ] = js.native
}

