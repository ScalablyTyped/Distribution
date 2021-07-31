package typings.atom.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathWatchErrorThrownEvent extends StObject {
  
  /** The error object. */
  var error: Error
  
  /**
    *  Call this function to indicate you have handled the error.
    *  The error will not be thrown if this function is called.
    */
  def handle(): Unit
}
object PathWatchErrorThrownEvent {
  
  @scala.inline
  def apply(error: Error, handle: () => Unit): PathWatchErrorThrownEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], handle = js.Any.fromFunction0(handle))
    __obj.asInstanceOf[PathWatchErrorThrownEvent]
  }
  
  @scala.inline
  implicit class PathWatchErrorThrownEventMutableBuilder[Self <: PathWatchErrorThrownEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: () => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction0(value))
  }
}
