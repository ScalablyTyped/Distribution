package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the event which is notified when a change in a string entry list occurred
  * @see XListEntrySource
  * @see XListEntryListener
  */
@js.native
trait ListEntryEvent extends EventObject {
  /** denotes the number of changed entries, in case a change of an entry **range** is being notified. */
  var Count: Double = js.native
  /**
    * denotes the changed entries
    *
    * The concrete semantics of the value depends on the concrete event being notified.
    */
  var Entries: SafeArray[String] = js.native
  /**
    * denotes the position where a change occurred.
    *
    * The concrete semantics of the value depends on the concrete event being notified.
    */
  var Position: Double = js.native
}

object ListEntryEvent {
  @scala.inline
  def apply(Count: Double, Entries: SafeArray[String], Position: Double, Source: XInterface): ListEntryEvent = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntryEvent]
  }
  @scala.inline
  implicit class ListEntryEventOps[Self <: ListEntryEvent] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntries(value: SafeArray[String]): Self = this.set("Entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
  }
  
}

