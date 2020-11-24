package typings.autobahn.mod

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Session")
@js.native
class Session protected () extends js.Object {
  def this(transport: ITransport, defer: DeferFactory, challenge: OnChallengeHandler) = this()
  
  def call[TResult](procedure: String): Promise[TResult] = js.native
  def call[TResult](
    procedure: String,
    args: js.UndefOr[scala.Nothing],
    kwargs: js.UndefOr[scala.Nothing],
    options: ICallOptions
  ): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.UndefOr[scala.Nothing], kwargs: js.Any): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.UndefOr[scala.Nothing], kwargs: js.Any, options: ICallOptions): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.Any): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.Any, kwargs: js.UndefOr[scala.Nothing], options: ICallOptions): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.Any, kwargs: js.Any): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.Any, kwargs: js.Any, options: ICallOptions): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.Array[_]): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.Array[_], kwargs: js.UndefOr[scala.Nothing], options: ICallOptions): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.Array[_], kwargs: js.Any): Promise[TResult] = js.native
  def call[TResult](procedure: String, args: js.Array[_], kwargs: js.Any, options: ICallOptions): Promise[TResult] = js.native
  
  var caller_disclose_me: Boolean = js.native
  
  var features: js.Any = js.native
  
  var id: Double = js.native
  
  var isOpen: Boolean = js.native
  
  def join(realm: String, authmethods: js.Array[String], authid: String): Unit = js.native
  
  def leave(reason: String, message: String): Unit = js.native
  
  def onjoin(roleFeatures: js.Any): Unit = js.native
  
  def onleave(reason: String, details: js.Any): Unit = js.native
  
  def prefix(prefix: String, uri: String): Unit = js.native
  
  def publish(topic: String): Promise[IPublication] = js.native
  def publish(
    topic: String,
    args: js.UndefOr[scala.Nothing],
    kwargs: js.UndefOr[scala.Nothing],
    options: IPublishOptions
  ): Promise[IPublication] = js.native
  def publish(topic: String, args: js.UndefOr[scala.Nothing], kwargs: js.Any): Promise[IPublication] = js.native
  def publish(topic: String, args: js.UndefOr[scala.Nothing], kwargs: js.Any, options: IPublishOptions): Promise[IPublication] = js.native
  def publish(topic: String, args: js.Array[_]): Promise[IPublication] = js.native
  def publish(topic: String, args: js.Array[_], kwargs: js.UndefOr[scala.Nothing], options: IPublishOptions): Promise[IPublication] = js.native
  def publish(topic: String, args: js.Array[_], kwargs: js.Any): Promise[IPublication] = js.native
  def publish(topic: String, args: js.Array[_], kwargs: js.Any, options: IPublishOptions): Promise[IPublication] = js.native
  
  var publisher_disclose_me: Boolean = js.native
  
  var realm: String = js.native
  
  def register(procedure: String, endpoint: RegisterEndpoint): Promise[IRegistration] = js.native
  def register(procedure: String, endpoint: RegisterEndpoint, options: IRegisterOptions): Promise[IRegistration] = js.native
  
  var registrations: js.Array[IRegistration] = js.native
  
  def resolve(curie: String): String = js.native
  
  def subscribe(topic: String, handler: SubscribeHandler): Promise[ISubscription] = js.native
  def subscribe(topic: String, handler: SubscribeHandler, options: ISubscribeOptions): Promise[ISubscription] = js.native
  
  var subscriptions: js.Array[js.Array[ISubscription]] = js.native
  
  def unregister(registration: IRegistration): Promise[_] = js.native
  
  def unsubscribe(subscription: ISubscription): Promise[_] = js.native
}
