package typings.agSimpleBroker.mod

import typings.agChannel.mod.Client
import typings.agSimpleBroker.agSimpleBrokerStrings.subscribe
import typings.agSimpleBroker.agSimpleBrokerStrings.unsubscribe
import typings.asyncStreamEmitter.mod.AsyncStreamEmitter
import typings.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-simple-broker", "SimpleExchange")
@js.native
class SimpleExchange protected ()
  extends AsyncStreamEmitter[js.Any]
     with Client {
  def this(broker: AGSimpleBroker) = this()
  
  def channel(channelName: String): typings.agChannel.mod.^[_] = js.native
  
  def closeAllChannelListeners(): Unit = js.native
  
  def closeAllChannelOutputs(): Unit = js.native
  
  def closeAllChannels(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
  
  def getAllChannelListenersBackpressure(): Double = js.native
  
  def getAllChannelListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
  
  def getAllChannelOutputsBackpressure(): Double = js.native
  
  def getAllChannelOutputsConsumerStatsList(): js.Array[ConsumerStats] = js.native
  
  def getAllChannelsBackpressure(): Double = js.native
  
  def getBackpressure(): Double = js.native
  
  def hasAnyChannelListenerConsumer(consumerId: Double): Boolean = js.native
  
  def hasAnyChannelOutputConsumer(consumerId: Double): Boolean = js.native
  
  var id: String = js.native
  
  def killAllChannelListeners(): Unit = js.native
  
  def killAllChannelOutputs(): Unit = js.native
  
  def killAllChannels(): Unit = js.native
  
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_unsubscribe(eventName: unsubscribe): typings.consumableStream.mod.^[UnsubscribeData] = js.native
  
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  
  /* AGChannel.Client end */
  def transmit(event: String, packet: js.Any): Unit = js.native
}
