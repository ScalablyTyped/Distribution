package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Session")
@js.native
class Session protected () extends js.Object {
  def this(transport: ITransport, defer: DeferFactory, challenge: OnChallengeHandler) = this()
  var caller_disclose_me: scala.Boolean = js.native
  var features: js.Any = js.native
  var id: scala.Double = js.native
  var isOpen: scala.Boolean = js.native
  var publisher_disclose_me: scala.Boolean = js.native
  var realm: java.lang.String = js.native
  var registrations: js.Array[IRegistration] = js.native
  var subscriptions: js.Array[js.Array[ISubscription]] = js.native
  def call[TResult](procedure: java.lang.String): whenLib.WhenNs.Promise[TResult] = js.native
  def call[TResult](procedure: java.lang.String, args: js.Any): whenLib.WhenNs.Promise[TResult] = js.native
  def call[TResult](procedure: java.lang.String, args: js.Any, kwargs: js.Any): whenLib.WhenNs.Promise[TResult] = js.native
  def call[TResult](procedure: java.lang.String, args: js.Any, kwargs: js.Any, options: ICallOptions): whenLib.WhenNs.Promise[TResult] = js.native
  def call[TResult](procedure: java.lang.String, args: js.Array[_]): whenLib.WhenNs.Promise[TResult] = js.native
  def call[TResult](procedure: java.lang.String, args: js.Array[_], kwargs: js.Any): whenLib.WhenNs.Promise[TResult] = js.native
  def call[TResult](procedure: java.lang.String, args: js.Array[_], kwargs: js.Any, options: ICallOptions): whenLib.WhenNs.Promise[TResult] = js.native
  def join(realm: java.lang.String, authmethods: js.Array[java.lang.String], authid: java.lang.String): scala.Unit = js.native
  def leave(reason: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def onjoin(roleFeatures: js.Any): scala.Unit = js.native
  def onleave(reason: java.lang.String, details: js.Any): scala.Unit = js.native
  def prefix(prefix: java.lang.String, uri: java.lang.String): scala.Unit = js.native
  def publish(topic: java.lang.String): whenLib.WhenNs.Promise[IPublication] = js.native
  def publish(topic: java.lang.String, args: js.Array[_]): whenLib.WhenNs.Promise[IPublication] = js.native
  def publish(topic: java.lang.String, args: js.Array[_], kwargs: js.Any): whenLib.WhenNs.Promise[IPublication] = js.native
  def publish(topic: java.lang.String, args: js.Array[_], kwargs: js.Any, options: IPublishOptions): whenLib.WhenNs.Promise[IPublication] = js.native
  def register(procedure: java.lang.String, endpoint: RegisterEndpoint): whenLib.WhenNs.Promise[IRegistration] = js.native
  def register(procedure: java.lang.String, endpoint: RegisterEndpoint, options: IRegisterOptions): whenLib.WhenNs.Promise[IRegistration] = js.native
  def resolve(curie: java.lang.String): java.lang.String = js.native
  def subscribe(topic: java.lang.String, handler: SubscribeHandler): whenLib.WhenNs.Promise[ISubscription] = js.native
  def subscribe(topic: java.lang.String, handler: SubscribeHandler, options: ISubscribeOptions): whenLib.WhenNs.Promise[ISubscription] = js.native
  def unregister(registration: IRegistration): whenLib.WhenNs.Promise[_] = js.native
  def unsubscribe(subscription: ISubscription): whenLib.WhenNs.Promise[_] = js.native
}

