package typings.agSimpleBroker.mod

import typings.agSimpleBroker.agSimpleBrokerStrings.error
import typings.agSimpleBroker.agSimpleBrokerStrings.publish
import typings.agSimpleBroker.agSimpleBrokerStrings.ready
import typings.agSimpleBroker.agSimpleBrokerStrings.subscribe
import typings.agSimpleBroker.agSimpleBrokerStrings.unsubscribe
import typings.agSimpleBroker.anon.Error
import typings.agSimpleBroker.anon.Id
import typings.asyncStreamEmitter.mod.AsyncStreamEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AGSimpleBroker
  extends AsyncStreamEmitter[js.Any] {
  
  @JSName("emit")
  def emit_error(eventName: error, data: Error): Unit = js.native
  @JSName("emit")
  def emit_publish(eventName: publish, data: PublishData): Unit = js.native
  @JSName("emit")
  def emit_ready(eventName: ready, data: js.Object): Unit = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
  
  def exchange(): SimpleExchange = js.native
  
  def invokePublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
  def invokePublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
  
  var isReady: Boolean = js.native
  
  def isSubscribed(channelName: String): Boolean = js.native
  
  @JSName("listener")
  def listener_error(eventName: error): typings.consumableStream.mod.^[Error] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): typings.consumableStream.mod.^[PublishData] = js.native
  @JSName("listener")
  def listener_ready(eventName: ready): typings.consumableStream.mod.^[js.Object] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_unsubscribe(eventName: unsubscribe): typings.consumableStream.mod.^[UnsubscribeData] = js.native
  
  def setCodecEngine(
    codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServer.CodecEngine */ js.Any
  ): Unit = js.native
  
  def subscribeClient(client: Id, channelName: String): js.Promise[Unit] = js.native
  
  def subscribeSocket(client: Id, channelName: String): js.Promise[Unit] = js.native
  
  def subscriptions(): js.Array[String] = js.native
  
  def transmitPublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
  def transmitPublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
  
  def unsubscribeClient(client: Id, channelName: String): js.Promise[Unit] = js.native
  
  def unsubscribeSocket(client: Id, channelName: String): js.Promise[Unit] = js.native
}
