package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is fired when a set of changes becomes effective on the source of the event.
  * @see XChangesSet
  * @see XChangesBatch
  * @see XChangesListener
  * @see XChangesNotifier
  * @see com.sun.star.container.ContainerEvent
  * @see ElementChange
  */
@js.native
trait ChangesEvent extends EventObject {
  /**
    * contains the accessor to the common root of the changed elements.
    *
    * Type and value of the accessor depend on the service.
    */
  var Base: js.Any = js.native
  /** contains the changes which occurred. */
  var Changes: ChangesSet = js.native
}

object ChangesEvent {
  @scala.inline
  def apply(Base: js.Any, Changes: ChangesSet, Source: XInterface): ChangesEvent = {
    val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any], Changes = Changes.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesEvent]
  }
  @scala.inline
  implicit class ChangesEventOps[Self <: ChangesEvent] (val x: Self) extends AnyVal {
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
    def setBase(value: js.Any): Self = this.set("Base", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangesVarargs(value: ElementChange*): Self = this.set("Changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: ChangesSet): Self = this.set("Changes", value.asInstanceOf[js.Any])
  }
  
}

