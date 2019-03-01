package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** receives events when the content of the related container changes. */
trait XContainerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a container has inserted an element. */
  def elementInserted(Event: ContainerEvent): scala.Unit
  /** is invoked when a container has removed an element. */
  def elementRemoved(Event: ContainerEvent): scala.Unit
  /** is invoked when a container has replaced an element. */
  def elementReplaced(Event: ContainerEvent): scala.Unit
}

object XContainerListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    elementInserted: js.Function1[ContainerEvent, scala.Unit],
    elementRemoved: js.Function1[ContainerEvent, scala.Unit],
    elementReplaced: js.Function1[ContainerEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContainerListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("elementInserted")(elementInserted)
    __obj.updateDynamic("elementRemoved")(elementRemoved)
    __obj.updateDynamic("elementReplaced")(elementReplaced)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XContainerListener]
  }
}

