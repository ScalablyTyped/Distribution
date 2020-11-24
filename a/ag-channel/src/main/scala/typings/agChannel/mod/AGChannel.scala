package typings.agChannel.mod

import typings.agChannel.agChannelStrings.pending
import typings.agChannel.agChannelStrings.subscribed
import typings.agChannel.agChannelStrings.unsubscribed
import typings.consumableStream.mod.ConsumableStream
import typings.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AGChannel[T] extends ConsumableStream[T] {
  
  val PENDING: pending = js.native
  
  val SUBSCRIBED: subscribed = js.native
  
  val UNSUBSCRIBED: unsubscribed = js.native
  
  var client: Client = js.native
  
  def close(): Unit = js.native
  
  def closeAllListeners(): Unit = js.native
  
  def closeListener(eventName: String): Unit = js.native
  
  def closeOutput(): Unit = js.native
  
  def getAllListenersBackpressure(): Double = js.native
  
  def getBackpressure(): Double = js.native
  
  def getListenerBackpressure(eventName: String): Double = js.native
  
  def getListenerConsumerBackpressure(consumerId: Double): Double = js.native
  
  def getListenerConsumerStats(consumerId: Double): js.UndefOr[ConsumerStats] = js.native
  
  def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats] = js.native
  
  def getOutputBackpressure(): Double = js.native
  
  def getOutputConsumerBackpressure(consumerId: Double): js.Any = js.native
  
  def getOutputConsumerStats(consumerId: Double): js.UndefOr[ConsumerStats] = js.native
  
  def getOutputConsumerStatsList(): ConsumerStats = js.native
  
  def hasAnyListenerConsumer(consumerId: Double): Boolean = js.native
  
  def hasListenerConsumer(eventName: String, consumerId: Double): Boolean = js.native
  
  def hasOutputConsumer(consumerId: Double): Boolean = js.native
  
  def invokePublish(data: js.Any): js.Promise[Unit] = js.native
  
  def isSubscribed(): Boolean = js.native
  def isSubscribed(includePending: Boolean): Boolean = js.native
  
  def kill(): Unit = js.native
  
  def killAllListeners(): Unit = js.native
  
  def killListener(eventName: String): Unit = js.native
  
  def killListenerConsumer(consumerId: Double): Unit = js.native
  
  def killOutput(): Unit = js.native
  
  def killOutputConsumer(consumerId: Double): Unit = js.native
  
  def listener(eventName: String): typings.streamDemux.demuxedConsumableStreamMod.^[T] = js.native
  
  var name: String = js.native
  
  var options: js.Object = js.native
  
  var state: ChannelState = js.native
  
  def subscribe(): Unit = js.native
  def subscribe(options: js.Any): Unit = js.native
  
  def transmitPublish(data: js.Any): js.Promise[Unit] = js.native
  
  def unsubscribe(): Unit = js.native
}
