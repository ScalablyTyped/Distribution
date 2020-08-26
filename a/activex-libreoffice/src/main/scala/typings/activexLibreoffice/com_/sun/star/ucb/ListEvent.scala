package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of event fired by an {@link XDynamicResultSet} */
@js.native
trait ListEvent extends EventObject {
  /**
    * If you apply the given ListActions one after the other to the old version of an result set in given order, you will get the positions in the new
    * version.
    */
  var Changes: SafeArray[ListAction] = js.native
}

object ListEvent {
  @scala.inline
  def apply(Changes: SafeArray[ListAction], Source: XInterface): ListEvent = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEvent]
  }
  @scala.inline
  implicit class ListEventOps[Self <: ListEvent] (val x: Self) extends AnyVal {
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
    def setChanges(value: SafeArray[ListAction]): Self = this.set("Changes", value.asInstanceOf[js.Any])
  }
  
}

