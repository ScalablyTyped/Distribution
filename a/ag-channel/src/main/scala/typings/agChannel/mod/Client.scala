package typings.agChannel.mod

import typings.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  def channelCloseAllListeners(channelName: String): Unit = js.native
  def channelCloseListener(channelName: String, eventName: String): Unit = js.native
  def channelCloseOutput(channelName: String): Unit = js.native
  def channelGetAllListenersBackpressure(channelName: String): Double = js.native
  def channelGetAllListenersConsumerStatsList(channelName: String): js.Array[ConsumerStats] = js.native
  def channelGetListenerBackpressure(channelName: String, eventName: String): Double = js.native
  def channelGetListenerConsumerStatsList(channelName: String, eventName: String): js.Array[ConsumerStats] = js.native
  def channelGetOutputBackpressure(channelName: String): Double = js.native
  def channelGetOutputConsumerStatsList(channelName: String): js.Array[ConsumerStats] = js.native
  def channelHasAnyListenerConsumer(channelName: String, consumerId: Double): Boolean = js.native
  def channelHasListenerConsumer(channelName: String, eventName: String, consumerId: Double): Boolean = js.native
  def channelHasOutputConsumer(channelName: String, consumerId: Double): Boolean = js.native
  def channelKillAllListeners(channelName: String): Unit = js.native
  def channelKillListener(channelName: String, eventName: String): Unit = js.native
  def channelKillOutput(channelName: String): Unit = js.native
  def closeChannel(channelName: String): Unit = js.native
  def getChannelBackpressure(channelName: String): Double = js.native
  def getChannelListenerConsumerBackpressure(consumerId: Double): Double = js.native
  def getChannelListenerConsumerStats(consumerId: Double): ConsumerStats = js.native
  def getChannelOptions(channelName: String): js.Object = js.native
  def getChannelOutputConsumerBackpressure(consumerId: Double): Double = js.native
  def getChannelOutputConsumerStats(consumerId: Double): ConsumerStats = js.native
  def getChannelState(channelName: String): ChannelState = js.native
  def invokePublish(channelName: String, data: js.Any): js.Promise[_] = js.native
  def isSubscribed(channelName: String): Boolean = js.native
  def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
  def killChannel(channelName: String): Unit = js.native
  def killChannelListenerConsumer(consumerId: Double): Unit = js.native
  def killChannelOutputConsumer(consumerId: Double): Unit = js.native
  def subscribe(channelName: String): AGChannel[_] = js.native
  def transmitPublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
  def unsubscribe(channelName: String): js.Promise[Unit] = js.native
}

