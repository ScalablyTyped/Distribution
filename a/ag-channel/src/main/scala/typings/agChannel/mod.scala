package typings.agChannel

import typings.agChannel.agChannelStrings.pending
import typings.agChannel.agChannelStrings.subscribed
import typings.agChannel.agChannelStrings.unsubscribed
import typings.writableConsumableStream.consumerMod.ConsumerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ag-channel", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends AGChannel[T] {
    def this(
      name: String,
      client: Client,
      eventDemux: typings.streamDemux.mod.^[T],
      dataDemux: typings.streamDemux.mod.^[T]
    ) = this()
  }
  
  @js.native
  trait AGChannel[T]
    extends typings.consumableStream.mod.^[T] {
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.agChannel.agChannelStrings.pending
    - typings.agChannel.agChannelStrings.subscribed
    - typings.agChannel.agChannelStrings.unsubscribed
  */
  trait ChannelState extends StObject
  object ChannelState {
    
    @scala.inline
    def pending: typings.agChannel.agChannelStrings.pending = "pending".asInstanceOf[typings.agChannel.agChannelStrings.pending]
    
    @scala.inline
    def subscribed: typings.agChannel.agChannelStrings.subscribed = "subscribed".asInstanceOf[typings.agChannel.agChannelStrings.subscribed]
    
    @scala.inline
    def unsubscribed: typings.agChannel.agChannelStrings.unsubscribed = "unsubscribed".asInstanceOf[typings.agChannel.agChannelStrings.unsubscribed]
  }
  
  @js.native
  trait Client extends StObject {
    
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
}
