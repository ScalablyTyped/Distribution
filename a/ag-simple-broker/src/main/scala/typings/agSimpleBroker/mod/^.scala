package typings.agSimpleBroker.mod

import typings.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-simple-broker", JSImport.Namespace)
@js.native
class ^ () extends AGSimpleBroker {
  /* CompleteClass */
  override def closeAllListeners(): Unit = js.native
  /* CompleteClass */
  override def closeListener(eventName: String): Unit = js.native
  /* CompleteClass */
  override def emit(eventName: String, data: js.Any): Unit = js.native
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
  override def listener(eventName: String): typings.consumableStream.mod.^[js.Any] = js.native
}

