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
@js.native
trait ContainerEvent extends EventObject {
  /**
    * It contains the accessor to the element which is inserted or removed.
    *
    * The type and the value of the accessor depends on the service.
    */
  var Accessor: js.Any = js.native
  /** This contains the element that was inserted or removed. */
  var Element: js.Any = js.native
  /** This contains the replaced element. */
  var ReplacedElement: js.Any = js.native
}

object ContainerEvent {
  @scala.inline
  def apply(Accessor: js.Any, Element: js.Any, ReplacedElement: js.Any, Source: XInterface): ContainerEvent = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerEvent]
  }
  @scala.inline
  implicit class ContainerEventOps[Self <: ContainerEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessor(value: js.Any): Self = this.set("Accessor", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: js.Any): Self = this.set("Element", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacedElement(value: js.Any): Self = this.set("ReplacedElement", value.asInstanceOf[js.Any])
  }
  
}

