package typings.asyncStreamEmitter.mod

import typings.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncStreamEmitter[T] extends js.Object {
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
}

