package typings.asyncStreamEmitter.mod

import typings.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncStreamEmitter[T] extends js.Object {
  
  def closeAllListeners(): Unit = js.native
  
  def closeListener(eventName: String): Unit = js.native
  
  def emit(eventName: String, data: T): Unit = js.native
  
  def getAllListenersBackpressure(): Double = js.native
  
  def getAllListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
  
  def getListenerBackpressure(eventName: String): Double = js.native
  
  def getListenerConsumerBackpressure(consumerId: Double): Double = js.native
  
  def getListenerConsumerStats(consumerId: Double): ConsumerStats = js.native
  
  def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats] = js.native
  
  def hasAnyListenerConsumer(consumerId: Double): Boolean = js.native
  
  def hasListenerConsumer(eventName: String, consumerId: Double): Boolean = js.native
  
  def killAllListeners(): Unit = js.native
  
  def killListener(eventName: String): Unit = js.native
  
  def killListenerConsumer(consumerId: Double): Unit = js.native
  
  def listener(eventName: String): typings.consumableStream.mod.^[T] = js.native
}
object AsyncStreamEmitter {
  
  @scala.inline
  def apply[T](
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
  implicit class AsyncStreamEmitterOps[Self <: AsyncStreamEmitter[_], T] (val x: Self with AsyncStreamEmitter[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloseAllListeners(value: () => Unit): Self = this.set("closeAllListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseListener(value: String => Unit): Self = this.set("closeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmit(value: (String, T) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAllListenersBackpressure(value: () => Double): Self = this.set("getAllListenersBackpressure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllListenersConsumerStatsList(value: () => js.Array[ConsumerStats]): Self = this.set("getAllListenersConsumerStatsList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListenerBackpressure(value: String => Double): Self = this.set("getListenerBackpressure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetListenerConsumerBackpressure(value: Double => Double): Self = this.set("getListenerConsumerBackpressure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetListenerConsumerStats(value: Double => ConsumerStats): Self = this.set("getListenerConsumerStats", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetListenerConsumerStatsList(value: String => js.Array[ConsumerStats]): Self = this.set("getListenerConsumerStatsList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasAnyListenerConsumer(value: Double => Boolean): Self = this.set("hasAnyListenerConsumer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasListenerConsumer(value: (String, Double) => Boolean): Self = this.set("hasListenerConsumer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKillAllListeners(value: () => Unit): Self = this.set("killAllListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKillListener(value: String => Unit): Self = this.set("killListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKillListenerConsumer(value: Double => Unit): Self = this.set("killListenerConsumer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListener(value: String => typings.consumableStream.mod.^[T]): Self = this.set("listener", js.Any.fromFunction1(value))
  }
}
