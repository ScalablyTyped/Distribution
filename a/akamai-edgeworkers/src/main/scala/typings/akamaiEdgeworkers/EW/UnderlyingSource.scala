package typings.akamaiEdgeworkers.EW

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://streams.spec.whatwg.org/#underlying-source-api
  */
trait UnderlyingSource[R] extends StObject {
  
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.undefined
  
  var pull: js.UndefOr[ReadableStreamDefaultControllerCallbackEW[R]] = js.undefined
  
  var start: js.UndefOr[ReadableStreamDefaultControllerCallbackEW[R]] = js.undefined
  
  var `type`: Unit
}
object UnderlyingSource {
  
  inline def apply[R](`type`: Unit): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
  
  extension [Self <: UnderlyingSource[?], R](x: Self & UnderlyingSource[R]) {
    
    inline def setCancel(value: /* reason */ Any => Unit | PromiseLike[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setPull(value: /* controller */ ReadableStreamDefaultControllerEW[R] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setStart(value: /* controller */ ReadableStreamDefaultControllerEW[R] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
