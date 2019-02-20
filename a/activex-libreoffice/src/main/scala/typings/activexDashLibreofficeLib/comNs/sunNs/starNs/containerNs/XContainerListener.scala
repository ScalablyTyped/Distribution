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

