package typings.asyncStreamEmitter

import typings.writableConsumableStream.consumerMod.ConsumerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-stream-emitter", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with AsyncStreamEmitter[T] {
    
    /* CompleteClass */
    override def closeAllListeners(): Unit = js.native
    
    /* CompleteClass */
    override def closeListener(eventName: String): Unit = js.native
    
    /* CompleteClass */
    override def emit(eventName: String, data: T): Unit = js.native
    
    /* CompleteClass */
    override def getAllListenersBackpressure(): Double = js.native
    
    /* CompleteClass */
    override def getAllListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
    
    /* CompleteClass */
    override def getListenerBackpressure(eventName: String): Double = js.native
    
    /* CompleteClass */
    override def getListenerConsumerBackpressure(consumerId: Double): Double = js.native
    
    /* CompleteClass */
    override def getListenerConsumerStats(consumerId: Double): ConsumerStats = js.native
    
    /* CompleteClass */
    override def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats] = js.native
    
    /* CompleteClass */
    override def hasAnyListenerConsumer(consumerId: Double): Boolean = js.native
    
    /* CompleteClass */
    override def hasListenerConsumer(eventName: String, consumerId: Double): Boolean = js.native
    
    /* CompleteClass */
    override def killAllListeners(): Unit = js.native
    
    /* CompleteClass */
    override def killListener(eventName: String): Unit = js.native
    
    /* CompleteClass */
    override def killListenerConsumer(consumerId: Double): Unit = js.native
    
    /* CompleteClass */
    override def listener(eventName: String): typings.consumableStream.mod.^[T] = js.native
  }
  
  trait AsyncStreamEmitter[T] extends StObject {
    
    def closeAllListeners(): Unit
    
    def closeListener(eventName: String): Unit
    
    def emit(eventName: String, data: T): Unit
    
    def getAllListenersBackpressure(): Double
    
    def getAllListenersConsumerStatsList(): js.Array[ConsumerStats]
    
    def getListenerBackpressure(eventName: String): Double
    
    def getListenerConsumerBackpressure(consumerId: Double): Double
    
    def getListenerConsumerStats(consumerId: Double): ConsumerStats
    
    def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats]
    
    def hasAnyListenerConsumer(consumerId: Double): Boolean
    
    def hasListenerConsumer(eventName: String, consumerId: Double): Boolean
    
    def killAllListeners(): Unit
    
    def killListener(eventName: String): Unit
    
    def killListenerConsumer(consumerId: Double): Unit
    
    def listener(eventName: String): typings.consumableStream.mod.^[T]
  }
  object AsyncStreamEmitter {
    
    inline def apply[T](
      closeAllListeners: () => Unit,
      closeListener: String => Unit,
      emit: (String, T) => Unit,
      getAllListenersBackpressure: () => Double,
      getAllListenersConsumerStatsList: () => js.Array[ConsumerStats],
      getListenerBackpressure: String => Double,
      getListenerConsumerBackpressure: Double => Double,
      getListenerConsumerStats: Double => ConsumerStats,
      getListenerConsumerStatsList: String => js.Array[ConsumerStats],
      hasAnyListenerConsumer: Double => Boolean,
      hasListenerConsumer: (String, Double) => Boolean,
      killAllListeners: () => Unit,
      killListener: String => Unit,
      killListenerConsumer: Double => Unit,
      listener: String => typings.consumableStream.mod.^[T]
    ): AsyncStreamEmitter[T] = {
      val __obj = js.Dynamic.literal(closeAllListeners = js.Any.fromFunction0(closeAllListeners), closeListener = js.Any.fromFunction1(closeListener), emit = js.Any.fromFunction2(emit), getAllListenersBackpressure = js.Any.fromFunction0(getAllListenersBackpressure), getAllListenersConsumerStatsList = js.Any.fromFunction0(getAllListenersConsumerStatsList), getListenerBackpressure = js.Any.fromFunction1(getListenerBackpressure), getListenerConsumerBackpressure = js.Any.fromFunction1(getListenerConsumerBackpressure), getListenerConsumerStats = js.Any.fromFunction1(getListenerConsumerStats), getListenerConsumerStatsList = js.Any.fromFunction1(getListenerConsumerStatsList), hasAnyListenerConsumer = js.Any.fromFunction1(hasAnyListenerConsumer), hasListenerConsumer = js.Any.fromFunction2(hasListenerConsumer), killAllListeners = js.Any.fromFunction0(killAllListeners), killListener = js.Any.fromFunction1(killListener), killListenerConsumer = js.Any.fromFunction1(killListenerConsumer), listener = js.Any.fromFunction1(listener))
      __obj.asInstanceOf[AsyncStreamEmitter[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncStreamEmitter[?], T] (val x: Self & AsyncStreamEmitter[T]) extends AnyVal {
      
      inline def setCloseAllListeners(value: () => Unit): Self = StObject.set(x, "closeAllListeners", js.Any.fromFunction0(value))
      
      inline def setCloseListener(value: String => Unit): Self = StObject.set(x, "closeListener", js.Any.fromFunction1(value))
      
      inline def setEmit(value: (String, T) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setGetAllListenersBackpressure(value: () => Double): Self = StObject.set(x, "getAllListenersBackpressure", js.Any.fromFunction0(value))
      
      inline def setGetAllListenersConsumerStatsList(value: () => js.Array[ConsumerStats]): Self = StObject.set(x, "getAllListenersConsumerStatsList", js.Any.fromFunction0(value))
      
      inline def setGetListenerBackpressure(value: String => Double): Self = StObject.set(x, "getListenerBackpressure", js.Any.fromFunction1(value))
      
      inline def setGetListenerConsumerBackpressure(value: Double => Double): Self = StObject.set(x, "getListenerConsumerBackpressure", js.Any.fromFunction1(value))
      
      inline def setGetListenerConsumerStats(value: Double => ConsumerStats): Self = StObject.set(x, "getListenerConsumerStats", js.Any.fromFunction1(value))
      
      inline def setGetListenerConsumerStatsList(value: String => js.Array[ConsumerStats]): Self = StObject.set(x, "getListenerConsumerStatsList", js.Any.fromFunction1(value))
      
      inline def setHasAnyListenerConsumer(value: Double => Boolean): Self = StObject.set(x, "hasAnyListenerConsumer", js.Any.fromFunction1(value))
      
      inline def setHasListenerConsumer(value: (String, Double) => Boolean): Self = StObject.set(x, "hasListenerConsumer", js.Any.fromFunction2(value))
      
      inline def setKillAllListeners(value: () => Unit): Self = StObject.set(x, "killAllListeners", js.Any.fromFunction0(value))
      
      inline def setKillListener(value: String => Unit): Self = StObject.set(x, "killListener", js.Any.fromFunction1(value))
      
      inline def setKillListenerConsumer(value: Double => Unit): Self = StObject.set(x, "killListenerConsumer", js.Any.fromFunction1(value))
      
      inline def setListener(value: String => typings.consumableStream.mod.^[T]): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
    }
  }
}
