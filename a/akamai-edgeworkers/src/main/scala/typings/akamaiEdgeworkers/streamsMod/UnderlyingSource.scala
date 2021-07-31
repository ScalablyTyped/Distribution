package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://streams.spec.whatwg.org/#underlying-source-api
  */
trait UnderlyingSource[R] extends StObject {
  
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.undefined
  
  var pull: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.undefined
  
  var start: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.undefined
  
  var `type`: Unit
}
object UnderlyingSource {
  
  @scala.inline
  def apply[R](`type`: Unit): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
  
  @scala.inline
  implicit class UnderlyingSourceMutableBuilder[Self <: UnderlyingSource[?], R] (val x: Self & UnderlyingSource[R]) extends AnyVal {
    
    @scala.inline
    def setCancel(value: /* reason */ js.Any => Unit | js.Thenable[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setPull(value: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    @scala.inline
    def setStart(value: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
