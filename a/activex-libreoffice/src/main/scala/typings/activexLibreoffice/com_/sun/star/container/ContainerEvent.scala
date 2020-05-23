package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerEvent]
  }
}

