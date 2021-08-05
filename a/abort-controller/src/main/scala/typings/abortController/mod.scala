package typings.abortController

import typings.abortController.abortControllerStrings.loose
import typings.eventTargetShim.anon.AddEventListener
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
  class default () extends AbortController
  
  /**
    * The AbortController.
    * @see https://dom.spec.whatwg.org/#abortcontroller
    */
  @JSImport("abort-controller/dist/abort-controller", "AbortController")
  @js.native
  /**
    * Initialize this controller.
    */
  class AbortController () extends StObject {
    
    /**
      * Abort and signal to any observers that the associated activity is to be aborted.
      */
    def abort(): Unit = js.native
    
    /**
      * Returns the `AbortSignal` object associated with this object.
      */
    val signal: typings.abortController.anon.AbortSignal = js.native
  }
  
  /**
    * The signal class.
    * @see https://dom.spec.whatwg.org/#abortsignal
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof abort-controller.abort-controller/dist/abort-controller.EventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<abort-controller.abort-controller/dist/abort-controller.EventAttributes[P]> | null}
  - Dropped {[ P in keyof abort-controller.abort-controller/dist/abort-controller.EventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<abort-controller.abort-controller/dist/abort-controller.EventAttributes[P]> | null} */ @JSImport("abort-controller/dist/abort-controller", "AbortSignal")
  @js.native
  /**
    * AbortSignal cannot be constructed directly.
    */
  class AbortSignal ()
    extends StObject
       with AddEventListener[Events, loose] {
    
    /**
      * Returns `true` if this `AbortSignal`"s `AbortController` has signaled to abort, and `false` otherwise.
      */
    val aborted: Boolean = js.native
  }
  
  trait EventAttributes extends StObject {
    
    var onabort: js.Any
  }
  object EventAttributes {
    
    inline def apply(onabort: js.Any): EventAttributes = {
      val __obj = js.Dynamic.literal(onabort = onabort.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventAttributes]
    }
    
    extension [Self <: EventAttributes](x: Self) {
      
      inline def setOnabort(value: js.Any): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
    }
  }
  
  trait Events extends StObject {
    
    var abort: js.Any
  }
  object Events {
    
    inline def apply(abort: js.Any): Events = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setAbort(value: js.Any): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    }
  }
}
