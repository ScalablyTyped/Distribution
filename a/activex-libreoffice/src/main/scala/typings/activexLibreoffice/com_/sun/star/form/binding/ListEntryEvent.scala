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
trait ListEntryEvent extends EventObject {
  /** denotes the number of changed entries, in case a change of an entry **range** is being notified. */
  var Count: Double
  /**
    * denotes the changed entries
    *
    * The concrete semantics of the value depends on the concrete event being notified.
    */
  var Entries: SafeArray[String]
  /**
    * denotes the position where a change occurred.
    *
    * The concrete semantics of the value depends on the concrete event being notified.
    */
  var Position: Double
}

object ListEntryEvent {
  @scala.inline
  def apply(Count: Double, Entries: SafeArray[String], Position: Double, Source: XInterface): ListEntryEvent = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntryEvent]
  }
}

