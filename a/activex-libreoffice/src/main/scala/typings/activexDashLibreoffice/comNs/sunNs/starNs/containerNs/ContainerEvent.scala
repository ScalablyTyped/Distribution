package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is fired when an element is inserted in a container.
  * @see XContainerListener
  */
trait ContainerEvent extends EventObject {
  /**
    * It contains the accessor to the element which is inserted or removed.
    *
    * The type and the value of the accessor depends on the service.
    */
  var Accessor: js.Any
  /** This contains the element that was inserted or removed. */
  var Element: js.Any
  /** This contains the replaced element. */
  var ReplacedElement: js.Any
}

object ContainerEvent {
  @scala.inline
  def apply(Accessor: js.Any, Element: js.Any, ReplacedElement: js.Any, Source: XInterface): ContainerEvent = {
    val __obj = js.Dynamic.literal(Accessor = Accessor, Element = Element, ReplacedElement = ReplacedElement, Source = Source)
  
    __obj.asInstanceOf[ContainerEvent]
  }
}

