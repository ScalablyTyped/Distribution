package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link XTabPageContainer} to get notifications about changes in activation of tab pages.
  * @since OOo 3.4
  */
trait XTabPageContainerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** Invoked after a tab page was activated. */
  def tabPageActivated(tabPageActivatedEvent: TabPageActivatedEvent): scala.Unit
}

