package typings.awsCrt

import typings.awsCrt.distCommonPromiseMod.PromiseCleanupFunctor
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonCancelMod {
  
  @JSImport("aws-crt/dist/common/cancel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt/dist/common/cancel", "CancelController")
  @js.native
  open class CancelController ()
    extends StObject
       with ICancelController {
    def this(options: CancelControllerOptions) = this()
    
    /**
      * Registers a callback to be notified when cancel() is invoked externally.  In general, the callback
      * will cancel an asynchronous operation by rejecting the associated promise.
      *
      * IMPORTANT: The listener is invoked synchronously if the controller has already been cancelled.
      *
      * @param listener - function to invoke on cancel; invoked synchronously if the controller has already been
      * cancelled
      *
      * @return undefined if the controller has already been cancelled, otherwise a function object whose invocation
      * will remove the listener from the controller's event emitter.
      *
      */
    /* CompleteClass */
    override def addListener(listener: CancelListener): js.UndefOr[PromiseCleanupFunctor] = js.native
    
    /**
      * API to invoke to cancel all asynchronous operations connected to this controller
      */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* private */ var cancelled: Any = js.native
    
    /* private */ var emitter: Any = js.native
    
    /**
      * Checks whether or not the controller is in the cancelled state
      */
    /* CompleteClass */
    override def hasBeenCancelled(): Boolean = js.native
  }
  
  @JSImport("aws-crt/dist/common/cancel", "EVENT_NAME")
  @js.native
  val EVENT_NAME: /* "cancelled" */ String = js.native
  
  inline def newCancellablePromiseFromNextEvent[ResultType](config: CancellableNextEventPromiseOptions[ResultType]): js.Promise[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("newCancellablePromiseFromNextEvent")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultType]]
  
  trait CancelControllerOptions extends StObject {
    
    /**
      * Event emitters have, by default, a small maximum number of listeners.  When that default is insufficient for
      * a use case, this factory option allows for customization of how the internal event emitter is created.
      */
    var emitterFactory: js.UndefOr[EventEmitterFactory] = js.undefined
  }
  object CancelControllerOptions {
    
    inline def apply(): CancelControllerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelControllerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancelControllerOptions] (val x: Self) extends AnyVal {
      
      inline def setEmitterFactory(value: () => EventEmitter): Self = StObject.set(x, "emitterFactory", js.Any.fromFunction0(value))
      
      inline def setEmitterFactoryUndefined: Self = StObject.set(x, "emitterFactory", js.undefined)
    }
  }
  
  type CancelListener = js.Function0[Unit]
  
  trait CancellableNextEventPromiseOptions[ResultType] extends StObject {
    
    /**
      * Optional cancel controller that can cancel the created promise
      */
    var cancelController: js.UndefOr[ICancelController] = js.undefined
    
    /**
      * Message to reject the promise with if cancellation is invoked
      */
    var cancelMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Event emitter to listen to for potential promise completion
      */
    var emitter: EventEmitter
    
    /**
      * Optional transformation function for the event payload
      */
    var eventDataTransformer: js.UndefOr[js.Function1[/* eventData */ Any, ResultType]] = js.undefined
    
    /**
      * Name of the event to listen on for potential promise completion
      */
    var eventName: String
  }
  object CancellableNextEventPromiseOptions {
    
    inline def apply[ResultType](emitter: EventEmitter, eventName: String): CancellableNextEventPromiseOptions[ResultType] = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancellableNextEventPromiseOptions[ResultType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancellableNextEventPromiseOptions[?], ResultType] (val x: Self & CancellableNextEventPromiseOptions[ResultType]) extends AnyVal {
      
      inline def setCancelController(value: ICancelController): Self = StObject.set(x, "cancelController", value.asInstanceOf[js.Any])
      
      inline def setCancelControllerUndefined: Self = StObject.set(x, "cancelController", js.undefined)
      
      inline def setCancelMessage(value: String): Self = StObject.set(x, "cancelMessage", value.asInstanceOf[js.Any])
      
      inline def setCancelMessageUndefined: Self = StObject.set(x, "cancelMessage", js.undefined)
      
      inline def setEmitter(value: EventEmitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setEventDataTransformer(value: /* eventData */ Any => ResultType): Self = StObject.set(x, "eventDataTransformer", js.Any.fromFunction1(value))
      
      inline def setEventDataTransformerUndefined: Self = StObject.set(x, "eventDataTransformer", js.undefined)
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
  
  type EventEmitterFactory = js.Function0[EventEmitter]
  
  trait ICancelController extends StObject {
    
    /**
      * Registers a callback to be notified when cancel() is invoked externally.  In general, the callback
      * will cancel an asynchronous operation by rejecting the associated promise.
      *
      * IMPORTANT: The listener is invoked synchronously if the controller has already been cancelled.
      *
      * @param listener - function to invoke on cancel; invoked synchronously if the controller has already been
      * cancelled
      *
      * @return undefined if the controller has already been cancelled, otherwise a function object whose invocation
      * will remove the listener from the controller's event emitter.
      *
      */
    def addListener(listener: CancelListener): js.UndefOr[PromiseCleanupFunctor]
    
    /**
      * API to invoke to cancel all asynchronous operations connected to this controller
      */
    def cancel(): Unit
    
    /**
      * Checks whether or not the controller is in the cancelled state
      */
    def hasBeenCancelled(): Boolean
  }
  object ICancelController {
    
    inline def apply(
      addListener: CancelListener => js.UndefOr[PromiseCleanupFunctor],
      cancel: () => Unit,
      hasBeenCancelled: () => Boolean
    ): ICancelController = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), cancel = js.Any.fromFunction0(cancel), hasBeenCancelled = js.Any.fromFunction0(hasBeenCancelled))
      __obj.asInstanceOf[ICancelController]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICancelController] (val x: Self) extends AnyVal {
      
      inline def setAddListener(value: CancelListener => js.UndefOr[PromiseCleanupFunctor]): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setHasBeenCancelled(value: () => Boolean): Self = StObject.set(x, "hasBeenCancelled", js.Any.fromFunction0(value))
    }
  }
}
