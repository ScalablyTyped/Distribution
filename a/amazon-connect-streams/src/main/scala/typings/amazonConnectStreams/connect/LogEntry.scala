package typings.amazonConnectStreams.connect

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to add additional information to a log entry. */
trait LogEntry extends js.Object {
  /**
    * Adds an error stack trace and additional info.
    *
    * @param err The error to add.
    */
  def withException(err: Error): LogEntry
  /**
    * Adds an arbitrary object.
    *
    * @param obj The object to add.
    */
  def withObject(obj: js.Object): LogEntry
}

object LogEntry {
  @scala.inline
  def apply(withException: Error => LogEntry, withObject: js.Object => LogEntry): LogEntry = {
    val __obj = js.Dynamic.literal(withException = js.Any.fromFunction1(withException), withObject = js.Any.fromFunction1(withObject))
    __obj.asInstanceOf[LogEntry]
  }
}

