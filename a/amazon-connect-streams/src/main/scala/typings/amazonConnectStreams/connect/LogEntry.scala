package typings.amazonConnectStreams.connect

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to add additional information to a log entry. */
@js.native
trait LogEntry extends StObject {
  
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
  implicit class LogEntryMutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithException(value: Error => LogEntry): Self = StObject.set(x, "withException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithObject(value: js.Object => LogEntry): Self = StObject.set(x, "withObject", js.Any.fromFunction1(value))
  }
}
