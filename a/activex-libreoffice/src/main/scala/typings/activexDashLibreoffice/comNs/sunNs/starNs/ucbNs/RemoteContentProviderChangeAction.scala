package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
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
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait RemoteContentProviderChangeAction extends js.Object

object RemoteContentProviderChangeAction {
  /** The indicator that a remote content provider has been added. */
  @scala.inline
  def ADDED: `0` = this.cast(0)
  /** The indicator that a remote content provider has been removed. */
  @scala.inline
  def REMOVED: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

