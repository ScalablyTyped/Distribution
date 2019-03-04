package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A listener interested in changes to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * gets called whenever changes to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} occur.
    * @param Event describes the change that has occurred.
    */
  def remoteContentProviderChange(Event: RemoteContentProviderChangeEvent): scala.Unit
}

object XRemoteContentProviderChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remoteContentProviderChange: js.Function1[RemoteContentProviderChangeEvent, scala.Unit]
  ): XRemoteContentProviderChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, remoteContentProviderChange = remoteContentProviderChange)
  
    __obj.asInstanceOf[XRemoteContentProviderChangeListener]
  }
}

