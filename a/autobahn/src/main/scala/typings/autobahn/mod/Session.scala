package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Session")
@js.native
open class Session protected () extends StObject {
  def this(transport: ITransport, defer: DeferFactory, challenge: OnChallengeHandler) = this()
  
  def call[TResult, TArgs, TKWArgs, TName](procedure: TName): Promise[TResult] = js.native
  def call[TResult, TArgs, TKWArgs, TName](procedure: TName, args: TArgs): Promise[TResult] = js.native
  def call[TResult, TArgs, TKWArgs, TName](procedure: TName, args: TArgs, kwargs: TKWArgs): Promise[TResult] = js.native
  def call[TResult, TArgs, TKWArgs, TName](procedure: TName, args: TArgs, kwargs: TKWArgs, options: ICallOptions): Promise[TResult] = js.native
  def call[TResult, TArgs, TKWArgs, TName](procedure: TName, args: TArgs, kwargs: Unit, options: ICallOptions): Promise[TResult] = js.native
  def call[TResult, TArgs, TKWArgs, TName](procedure: TName, args: Unit, kwargs: TKWArgs): Promise[TResult] = js.native
  def call[TResult, TArgs, TKWArgs, TName](procedure: TName, args: Unit, kwargs: TKWArgs, options: ICallOptions): Promise[TResult] = js.native
  def call[TResult, TArgs, TKWArgs, TName](procedure: TName, args: Unit, kwargs: Unit, options: ICallOptions): Promise[TResult] = js.native
  
  var caller_disclose_me: Boolean = js.native
  
  var features: Any = js.native
  
  var id: Double = js.native
  
  var isOpen: Boolean = js.native
  
  def join(realm: String, authmethods: js.Array[String], authid: String): Unit = js.native
  def join(realm: String, authmethods: js.Array[String], authid: String, authextra: js.Object): Unit = js.native
  
  def leave(reason: String, message: String): Unit = js.native
  
  def onjoin(roleFeatures: Any): Unit = js.native
  
  def onleave(reason: String, details: Any): Unit = js.native
  
  def prefix(prefix: String, uri: String): Unit = js.native
  
  def publish[TArgs, TKWArgs, TName](topic: TName): Promise[IPublication] = js.native
  def publish[TArgs, TKWArgs, TName](topic: TName, args: TArgs): Promise[IPublication] = js.native
  def publish[TArgs, TKWArgs, TName](topic: TName, args: TArgs, kwargs: TKWArgs): Promise[IPublication] = js.native
  def publish[TArgs, TKWArgs, TName](topic: TName, args: TArgs, kwargs: TKWArgs, options: IPublishOptions): Promise[IPublication] = js.native
  def publish[TArgs, TKWArgs, TName](topic: TName, args: TArgs, kwargs: Unit, options: IPublishOptions): Promise[IPublication] = js.native
  def publish[TArgs, TKWArgs, TName](topic: TName, args: Unit, kwargs: TKWArgs): Promise[IPublication] = js.native
  def publish[TArgs, TKWArgs, TName](topic: TName, args: Unit, kwargs: TKWArgs, options: IPublishOptions): Promise[IPublication] = js.native
  def publish[TArgs, TKWArgs, TName](topic: TName, args: Unit, kwargs: Unit, options: IPublishOptions): Promise[IPublication] = js.native
  
  var publisher_disclose_me: Boolean = js.native
  
  var realm: String = js.native
  
  def register[TResult, TArgs, TKWArgs, TName](procedure: TName, endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs]): Promise[IRegistration[TResult, TArgs, TKWArgs, TName]] = js.native
  def register[TResult, TArgs, TKWArgs, TName](procedure: TName, endpoint: RegisterEndpoint[TResult, TArgs, TKWArgs], options: IRegisterOptions): Promise[IRegistration[TResult, TArgs, TKWArgs, TName]] = js.native
  
  var registrations: js.Array[IRegistration[Any, js.Array[Any], Any, String]] = js.native
  
  def resolve(curie: String): String = js.native
  
  def subscribe[TArgs, TKWArgs, TName](topic: TName, handler: SubscribeHandler[TArgs, TKWArgs, TName]): Promise[ISubscription[TArgs, TKWArgs, TName]] = js.native
  def subscribe[TArgs, TKWArgs, TName](topic: TName, handler: SubscribeHandler[TArgs, TKWArgs, TName], options: ISubscribeOptions): Promise[ISubscription[TArgs, TKWArgs, TName]] = js.native
  
  var subscriptions: js.Array[js.Array[ISubscription[js.Array[Any], Any, String]]] = js.native
  
  def unregister[TResult, TArgs, TKWArgs, TName](registration: IRegistration[TResult, TArgs, TKWArgs, TName]): Promise[Any] = js.native
  
  def unsubscribe[TArgs, TKWArgs](subscription: ISubscription[TArgs, TKWArgs, String]): Promise[Any] = js.native
}
