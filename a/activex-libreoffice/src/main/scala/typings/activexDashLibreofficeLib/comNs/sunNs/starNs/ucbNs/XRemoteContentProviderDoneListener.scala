package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notification mechanism that a {@link XRemoteContentProviderAcceptor} no longer needs a remote content provider.
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderDoneListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * A notification that all remote content providers added to the given {@link XRemoteContentProviderAcceptor} should be removed, because the acceptor no
    * longer needs them.
    * @param Acceptor If null, all remote content providers added to any acceptor shall be removed.
    */
  def doneWithRemoteContentProviders(Acceptor: XRemoteContentProviderAcceptor): scala.Unit
}

object XRemoteContentProviderDoneListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    doneWithRemoteContentProviders: js.Function1[XRemoteContentProviderAcceptor, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRemoteContentProviderDoneListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("doneWithRemoteContentProviders")(doneWithRemoteContentProviders)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XRemoteContentProviderDoneListener]
  }
}

