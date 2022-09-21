package typings.agSimpleBroker

import typings.agChannel.mod.Client
import typings.agSimpleBroker.agSimpleBrokerStrings.error
import typings.agSimpleBroker.agSimpleBrokerStrings.publish
import typings.agSimpleBroker.agSimpleBrokerStrings.ready
import typings.agSimpleBroker.agSimpleBrokerStrings.subscribe
import typings.agSimpleBroker.agSimpleBrokerStrings.unsubscribe
import typings.agSimpleBroker.anon.Id
import typings.writableConsumableStream.consumerMod.ConsumerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ag-simple-broker", JSImport.Namespace)
  @js.native
  open class ^ () extends AGSimpleBroker
  
  @JSImport("ag-simple-broker", "SimpleExchange")
  @js.native
  open class SimpleExchange protected ()
    extends typings.asyncStreamEmitter.mod.^[Any]
       with Client {
    def this(broker: AGSimpleBroker) = this()
    
    def channel(channelName: String): typings.agChannel.mod.^[Any] = js.native
    
    def closeAllChannelListeners(): Unit = js.native
    
    def closeAllChannelOutputs(): Unit = js.native
    
    def closeAllChannels(): Unit = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def closeAllListeners(): Unit = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def closeListener(eventName: String): Unit = js.native
    
    def destroy(): Unit = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def emit(eventName: String, data: Any): Unit = js.native
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
    /* InferMemberOverrides */
    override def getAllListenersBackpressure(): Double = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def getAllListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
    
    def getBackpressure(): Double = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def getListenerBackpressure(eventName: String): Double = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def getListenerConsumerBackpressure(consumerId: Double): Double = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def getListenerConsumerStats(consumerId: Double): ConsumerStats = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats] = js.native
    
    def hasAnyChannelListenerConsumer(consumerId: Double): Boolean = js.native
    
    def hasAnyChannelOutputConsumer(consumerId: Double): Boolean = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def hasAnyListenerConsumer(consumerId: Double): Boolean = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def hasListenerConsumer(eventName: String, consumerId: Double): Boolean = js.native
    
    var id: String = js.native
    
    def killAllChannelListeners(): Unit = js.native
    
    def killAllChannelOutputs(): Unit = js.native
    
    def killAllChannels(): Unit = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def killAllListeners(): Unit = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def killListener(eventName: String): Unit = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def killListenerConsumer(consumerId: Double): Unit = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def listener(eventName: String): typings.consumableStream.mod.^[Any] = js.native
    @JSName("listener")
    def listener_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_unsubscribe(eventName: unsubscribe): typings.consumableStream.mod.^[UnsubscribeData] = js.native
    
    def subscriptions(): js.Array[String] = js.native
    def subscriptions(includePending: Boolean): js.Array[String] = js.native
    
    /* AGChannel.Client end */
    def transmit(event: String, packet: Any): Unit = js.native
  }
  
  @js.native
  trait AGSimpleBroker
    extends typings.asyncStreamEmitter.mod.^[Any] {
    
    @JSName("emit")
    def emit_error(eventName: error, data: ErrorData): Unit = js.native
    @JSName("emit")
    def emit_publish(eventName: publish, data: PublishData): Unit = js.native
    @JSName("emit")
    def emit_ready(eventName: ready, data: js.Object): Unit = js.native
    @JSName("emit")
    def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
    @JSName("emit")
    def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
    
    def exchange(): SimpleExchange = js.native
    
    def invokePublish(channelName: String, data: Any): js.Promise[Unit] = js.native
    def invokePublish(channelName: String, data: Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
    
    var isReady: Boolean = js.native
    
    def isSubscribed(channelName: String): Boolean = js.native
    
    @JSName("listener")
    def listener_error(eventName: error): typings.consumableStream.mod.^[ErrorData] = js.native
    @JSName("listener")
    def listener_publish(eventName: publish): typings.consumableStream.mod.^[PublishData] = js.native
    @JSName("listener")
    def listener_ready(eventName: ready): typings.consumableStream.mod.^[js.Object] = js.native
    @JSName("listener")
    def listener_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_unsubscribe(eventName: unsubscribe): typings.consumableStream.mod.^[UnsubscribeData] = js.native
    
    def setCodecEngine(
      codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServer.CodecEngine */ Any
    ): Unit = js.native
    
    def subscribeClient(client: Id, channelName: String): js.Promise[Unit] = js.native
    
    def subscribeSocket(client: Id, channelName: String): js.Promise[Unit] = js.native
    
    def subscriptions(): js.Array[String] = js.native
    
    def transmitPublish(channelName: String, data: Any): js.Promise[Unit] = js.native
    def transmitPublish(channelName: String, data: Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
    
    def unsubscribeClient(client: Id, channelName: String): js.Promise[Unit] = js.native
    
    def unsubscribeSocket(client: Id, channelName: String): js.Promise[Unit] = js.native
  }
  
  trait ErrorData extends StObject {
    
    var error: Any
  }
  object ErrorData {
    
    inline def apply(error: Any): ErrorData = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorData]
    }
    
    extension [Self <: ErrorData](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishData extends StObject {
    
    var channel: String
    
    var data: Any
  }
  object PublishData {
    
    inline def apply(channel: String, data: Any): PublishData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishData]
    }
    
    extension [Self <: PublishData](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscribeData extends StObject {
    
    var channel: String
  }
  object SubscribeData {
    
    inline def apply(channel: String): SubscribeData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeData]
    }
    
    extension [Self <: SubscribeData](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsubscribeData extends StObject {
    
    var channel: String
  }
  object UnsubscribeData {
    
    inline def apply(channel: String): UnsubscribeData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsubscribeData]
    }
    
    extension [Self <: UnsubscribeData](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
}
