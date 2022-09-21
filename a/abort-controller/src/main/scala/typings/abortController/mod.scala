package typings.abortController

import typings.eventTargetShim.mod.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The AbortController.
    * @see https://dom.spec.whatwg.org/#abortcontroller
    */
  @JSImport("abort-controller/dist/abort-controller", JSImport.Default)
  @js.native
  /**
    * Initialize this controller.
    */
  open class default () extends AbortController
  
  /**
    * The AbortController.
    * @see https://dom.spec.whatwg.org/#abortcontroller
    */
  @JSImport("abort-controller/dist/abort-controller", "AbortController")
  @js.native
  /**
    * Initialize this controller.
    */
  open class AbortController () extends StObject {
    
    /**
      * Abort and signal to any observers that the associated activity is to be aborted.
      */
    def abort(): Unit = js.native
    
    /**
      * Returns the `AbortSignal` object associated with this object.
      */
    val signal: AbortSignal = js.native
  }
  
  /**
    * The signal class.
    * @see https://dom.spec.whatwg.org/#abortsignal
    */
  @JSImport("abort-controller/dist/abort-controller", "AbortSignal")
  @js.native
  /**
    * AbortSignal cannot be constructed directly.
    */
  open class AbortSignal () extends EventTarget[Events, EventAttributes] {
    
    /**
      * Returns `true` if this `AbortSignal`"s `AbortController` has signaled to abort, and `false` otherwise.
      */
    val aborted: Boolean = js.native
  }
  
  trait EventAttributes extends StObject {
    
    var onabort: Any
  }
  object EventAttributes {
    
    inline def apply(onabort: Any): EventAttributes = {
      val __obj = js.Dynamic.literal(onabort = onabort.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventAttributes]
    }
    
    extension [Self <: EventAttributes](x: Self) {
      
      inline def setOnabort(value: Any): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
    }
  }
  
  trait Events extends StObject {
    
    var abort: Any
  }
  object Events {
    
    inline def apply(abort: Any): Events = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setAbort(value: Any): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    }
  }
}
