package typings.agSimpleBroker.mod

import typings.agSimpleBroker.AnonError
import typings.agSimpleBroker.AnonId
import typings.agSimpleBroker.agSimpleBrokerStrings.error
import typings.agSimpleBroker.agSimpleBrokerStrings.publish
import typings.agSimpleBroker.agSimpleBrokerStrings.ready
import typings.agSimpleBroker.agSimpleBrokerStrings.subscribe
import typings.agSimpleBroker.agSimpleBrokerStrings.unsubscribe
import typings.asyncStreamEmitter.mod.AsyncStreamEmitter
import typings.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGSimpleBroker
  extends AsyncStreamEmitter[js.Any] {
  var isReady: Boolean = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: AnonError): Unit = js.native
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
  def isSubscribed(channelName: String): Boolean = js.native
  @JSName("listener")
  def listener_error(eventName: error): typings.consumableStream.mod.^[AnonError] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): typings.consumableStream.mod.^[PublishData] = js.native
  @JSName("listener")
  def listener_ready(eventName: ready): typings.consumableStream.mod.^[js.Object] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_unsubscribe(eventName: unsubscribe): typings.consumableStream.mod.^[UnsubscribeData] = js.native
  def setCodecEngine(codec: CodecEngine): Unit = js.native
  def subscribeClient(client: AnonId, channelName: String): js.Promise[Unit] = js.native
  def subscribeSocket(client: AnonId, channelName: String): js.Promise[Unit] = js.native
  def subscriptions(): js.Array[String] = js.native
  def transmitPublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
  def transmitPublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
  def unsubscribeClient(client: AnonId, channelName: String): js.Promise[Unit] = js.native
  def unsubscribeSocket(client: AnonId, channelName: String): js.Promise[Unit] = js.native
}

