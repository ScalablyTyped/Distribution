package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.tabNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link XTabPageContainer} to get notifications about changes in activation of tab pages.
  * @since OOo 3.4
  */
trait XTabPageContainerListener extends XEventListener {
  /** Invoked after a tab page was activated. */
  def tabPageActivated(tabPageActivatedEvent: TabPageActivatedEvent): Unit
}

object XTabPageContainerListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    tabPageActivated: TabPageActivatedEvent => Unit
  ): XTabPageContainerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), tabPageActivated = js.Any.fromFunction1(tabPageActivated))
  
    __obj.asInstanceOf[XTabPageContainerListener]
  }
}

