package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A listener interested in changes to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderChangeListener extends XEventListener {
  /**
    * gets called whenever changes to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} occur.
    * @param Event describes the change that has occurred.
    */
  def remoteContentProviderChange(Event: RemoteContentProviderChangeEvent): Unit
}

object XRemoteContentProviderChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remoteContentProviderChange: RemoteContentProviderChangeEvent => Unit
  ): XRemoteContentProviderChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remoteContentProviderChange = js.Any.fromFunction1(remoteContentProviderChange))
  
    __obj.asInstanceOf[XRemoteContentProviderChangeListener]
  }
}

