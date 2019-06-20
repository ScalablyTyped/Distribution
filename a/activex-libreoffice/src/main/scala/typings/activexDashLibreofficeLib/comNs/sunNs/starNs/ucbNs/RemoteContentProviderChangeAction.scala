package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An indication used in a {@link com.sun.star.ucb.RemoteContentProviderChangeEvent} to specify whether a remote content provider has been added to or
  * removed from an {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait RemoteContentProviderChangeAction extends js.Object

object RemoteContentProviderChangeAction {
  /** The indicator that a remote content provider has been added. */
  @scala.inline
  def ADDED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** The indicator that a remote content provider has been removed. */
  @scala.inline
  def REMOVED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

