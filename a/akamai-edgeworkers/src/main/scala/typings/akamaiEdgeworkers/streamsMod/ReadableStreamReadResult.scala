package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamReadResult[T] extends StObject {
  
  val done: Boolean
  
  val value: T
}
object ReadableStreamReadResult {
  
  @scala.inline
  def apply[T](done: Boolean, value: T): ReadableStreamReadResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadResult[T]]
  }
  
  @scala.inline
  implicit class ReadableStreamReadResultMutableBuilder[Self <: ReadableStreamReadResult[?], T] (val x: Self & ReadableStreamReadResult[T]) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
