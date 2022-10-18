package typings.awsCrt

import org.scalablytyped.runtime.Instantiable1
import typings.awsCrt.distNativeBindingMod.StringLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Handle extends StObject {
    
    /** @internal */
    var _handle: Any
    
    /** @internal */
    def _super(handle: Any): Unit
    
    /** @internal */
    def native_handle(): Any
  }
  object Handle {
    
    inline def apply(_handle: Any, _super: Any => Unit, native_handle: () => Any): Handle = {
      val __obj = js.Dynamic.literal(_handle = _handle.asInstanceOf[js.Any], _super = js.Any.fromFunction1(_super), native_handle = js.Any.fromFunction0(native_handle))
      __obj.asInstanceOf[Handle]
    }
    
    extension [Self <: Handle](x: Self) {
      
      inline def setNative_handle(value: () => Any): Self = StObject.set(x, "native_handle", js.Any.fromFunction0(value))
      
      inline def set_handle(value: Any): Self = StObject.set(x, "_handle", value.asInstanceOf[js.Any])
      
      inline def set_super(value: Any => Unit): Self = StObject.set(x, "_super", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, Handle]
  
  trait Payload extends StObject {
    
    var payload: StringLike
    
    var qos: Double
    
    var retain: Boolean
    
    var topic: StringLike
  }
  object Payload {
    
    inline def apply(payload: StringLike, qos: Double, retain: Boolean, topic: StringLike): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setPayload(value: StringLike): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQos(value: Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: StringLike): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
}
