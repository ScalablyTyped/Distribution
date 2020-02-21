package typings.agSimpleBroker.mod

import typings.agChannel.mod.Client
import typings.agSimpleBroker.agSimpleBrokerStrings.subscribe
import typings.agSimpleBroker.agSimpleBrokerStrings.unsubscribe
import typings.asyncStreamEmitter.mod.AsyncStreamEmitter
import typings.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-simple-broker", "SimpleExchange")
@js.native
class SimpleExchange protected ()
  extends AsyncStreamEmitter[js.Any]
     with Client {
  def this(broker: AGSimpleBroker) = this()
  var id: String = js.native
  def channel(channelName: String): typings.agChannel.mod.^[_] = js.native
  def closeAllChannelListeners(): Unit = js.native
  def closeAllChannelOutputs(): Unit = js.native
  def closeAllChannels(): Unit = js.native
  /* CompleteClass */
  override def closeAllListeners(): Unit = js.native
  /* CompleteClass */
  override def closeListener(eventName: String): Unit = js.native
  def destroy(): Unit = js.native
  /* CompleteClass */
  override def emit(eventName: String, data: js.Any): Unit = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
  def getAllChannelListenersBackpressure(): Double = js.native
  def getAllChannelListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
  def getAllChannelOutputsBackpressure(): Double = js.native
  def getAllChannelOutputsConsumerStatsList(): js.Array[ConsumerStats] = js.native
  def getAllChannelsBackpressure(): Double = js.native
  /* CompleteClass */
  override def getAllListenersBackpressure(): Double = js.native
  /* CompleteClass */
  override def getAllListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
  def getBackpressure(): Double = js.native
  /* CompleteClass */
  override def getListenerBackpressure(eventName: String): Double = js.native
  /* CompleteClass */
  override def getListenerConsumerBackpressure(consumerId: Double): Double = js.native
  /* CompleteClass */
  override def getListenerConsumerStats(consumerId: Double): ConsumerStats = js.native
  /* CompleteClass */
  override def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats] = js.native
  def hasAnyChannelListenerConsumer(consumerId: Double): Boolean = js.native
  def hasAnyChannelOutputConsumer(consumerId: Double): Boolean = js.native
  /* CompleteClass */
  override def hasAnyListenerConsumer(consumerId: Double): Boolean = js.native
  /* CompleteClass */
  override def hasListenerConsumer(eventName: String, consumerId: Double): Boolean = js.native
  def killAllChannelListeners(): Unit = js.native
  def killAllChannelOutputs(): Unit = js.native
  def killAllChannels(): Unit = js.native
  /* CompleteClass */
  override def killAllListeners(): Unit = js.native
  /* CompleteClass */
  override def killListener(eventName: String): Unit = js.native
  /* CompleteClass */
  override def killListenerConsumer(consumerId: Double): Unit = js.native
  /* CompleteClass */
  override def listener(eventName: String): typings.consumableStream.mod.^[js.Any] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_unsubscribe(eventName: unsubscribe): typings.consumableStream.mod.^[UnsubscribeData] = js.native
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  /* AGChannel.Client end */
  def transmit(event: String, packet: js.Any): Unit = js.native
}

