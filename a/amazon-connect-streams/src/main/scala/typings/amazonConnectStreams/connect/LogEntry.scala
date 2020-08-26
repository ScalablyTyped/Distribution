package typings.amazonConnectStreams.connect

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to add additional information to a log entry. */
@js.native
trait LogEntry extends js.Object {
  /**
    * Adds an error stack trace and additional info.
    *
    * @param err The error to add.
    */
  def withException(err: Error): LogEntry = js.native
  /**
    * Adds an arbitrary object.
    *
    * @param obj The object to add.
    */
  def withObject(obj: js.Object): LogEntry = js.native
}

object LogEntry {
  @scala.inline
  def apply(withException: Error => LogEntry, withObject: js.Object => LogEntry): LogEntry = {
    val __obj = js.Dynamic.literal(withException = js.Any.fromFunction1(withException), withObject = js.Any.fromFunction1(withObject))
    __obj.asInstanceOf[LogEntry]
  }
  @scala.inline
  implicit class LogEntryOps[Self <: LogEntry] (val x: Self) extends AnyVal {
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
    def setWithException(value: Error => LogEntry): Self = this.set("withException", js.Any.fromFunction1(value))
    @scala.inline
    def setWithObject(value: js.Object => LogEntry): Self = this.set("withObject", js.Any.fromFunction1(value))
  }
  
}

