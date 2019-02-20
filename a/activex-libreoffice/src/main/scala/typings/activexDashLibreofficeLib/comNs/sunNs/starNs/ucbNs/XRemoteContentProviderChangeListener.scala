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

