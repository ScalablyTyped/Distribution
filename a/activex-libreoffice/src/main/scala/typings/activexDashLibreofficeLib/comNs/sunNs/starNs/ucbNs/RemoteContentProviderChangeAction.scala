package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemoteContentProviderChangeAction extends js.Object

/**
  * An indication used in a {@link com.sun.star.ucb.RemoteContentProviderChangeEvent} to specify whether a remote content provider has been added to or
  * removed from an {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
@JSGlobal("com.sun.star.ucb.RemoteContentProviderChangeAction")
@js.native
object RemoteContentProviderChangeAction extends js.Object {
  /** The indicator that a remote content provider has been added. */
  @js.native
  sealed trait ADDED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RemoteContentProviderChangeAction
  
  /** The indicator that a remote content provider has been removed. */
  @js.native
  sealed trait REMOVED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RemoteContentProviderChangeAction
  
  /* 0 */ val ADDED: ADDED with scala.Double = js.native
  /* 1 */ val REMOVED: REMOVED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RemoteContentProviderChangeAction with scala.Double
  ] = js.native
}

