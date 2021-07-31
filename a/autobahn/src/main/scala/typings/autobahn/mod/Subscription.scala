package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Subscription")
@js.native
class Subscription ()
  extends StObject
     with ISubscription {
  def this(topic: String) = this()
  def this(topic: String, handler: SubscribeHandler) = this()
  def this(topic: Unit, handler: SubscribeHandler) = this()
  def this(topic: String, handler: Unit, options: ISubscribeOptions) = this()
  def this(topic: String, handler: SubscribeHandler, options: ISubscribeOptions) = this()
  def this(topic: Unit, handler: Unit, options: ISubscribeOptions) = this()
  def this(topic: Unit, handler: SubscribeHandler, options: ISubscribeOptions) = this()
  def this(topic: String, handler: Unit, options: Unit, session: Session) = this()
  def this(topic: String, handler: Unit, options: ISubscribeOptions, session: Session) = this()
  def this(topic: String, handler: SubscribeHandler, options: Unit, session: Session) = this()
  def this(topic: String, handler: SubscribeHandler, options: ISubscribeOptions, session: Session) = this()
  def this(topic: Unit, handler: Unit, options: Unit, session: Session) = this()
  def this(topic: Unit, handler: Unit, options: ISubscribeOptions, session: Session) = this()
  def this(topic: Unit, handler: SubscribeHandler, options: Unit, session: Session) = this()
  def this(topic: Unit, handler: SubscribeHandler, options: ISubscribeOptions, session: Session) = this()
  def this(topic: String, handler: Unit, options: Unit, session: Unit, id: Double) = this()
  def this(topic: String, handler: Unit, options: Unit, session: Session, id: Double) = this()
  def this(topic: String, handler: Unit, options: ISubscribeOptions, session: Unit, id: Double) = this()
  def this(topic: String, handler: Unit, options: ISubscribeOptions, session: Session, id: Double) = this()
  def this(topic: String, handler: SubscribeHandler, options: Unit, session: Unit, id: Double) = this()
  def this(topic: String, handler: SubscribeHandler, options: Unit, session: Session, id: Double) = this()
  def this(topic: String, handler: SubscribeHandler, options: ISubscribeOptions, session: Unit, id: Double) = this()
  def this(topic: String, handler: SubscribeHandler, options: ISubscribeOptions, session: Session, id: Double) = this()
  def this(topic: Unit, handler: Unit, options: Unit, session: Unit, id: Double) = this()
  def this(topic: Unit, handler: Unit, options: Unit, session: Session, id: Double) = this()
  def this(topic: Unit, handler: Unit, options: ISubscribeOptions, session: Unit, id: Double) = this()
  def this(topic: Unit, handler: Unit, options: ISubscribeOptions, session: Session, id: Double) = this()
  def this(topic: Unit, handler: SubscribeHandler, options: Unit, session: Unit, id: Double) = this()
  def this(topic: Unit, handler: SubscribeHandler, options: Unit, session: Session, id: Double) = this()
  def this(topic: Unit, handler: SubscribeHandler, options: ISubscribeOptions, session: Unit, id: Double) = this()
  def this(topic: Unit, handler: SubscribeHandler, options: ISubscribeOptions, session: Session, id: Double) = this()
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  override def handler(): Unit = js.native
  /* CompleteClass */
  override def handler(args: js.Any): Unit = js.native
  /* CompleteClass */
  override def handler(args: js.Any, kwargs: js.Any): Unit = js.native
  /* CompleteClass */
  override def handler(args: js.Any, kwargs: js.Any, details: IEvent): Unit = js.native
  /* CompleteClass */
  override def handler(args: js.Any, kwargs: Unit, details: IEvent): Unit = js.native
  /* CompleteClass */
  override def handler(args: js.Array[js.Any]): Unit = js.native
  /* CompleteClass */
  override def handler(args: js.Array[js.Any], kwargs: js.Any): Unit = js.native
  /* CompleteClass */
  override def handler(args: js.Array[js.Any], kwargs: js.Any, details: IEvent): Unit = js.native
  /* CompleteClass */
  override def handler(args: js.Array[js.Any], kwargs: Unit, details: IEvent): Unit = js.native
  /* CompleteClass */
  override def handler(args: Unit, kwargs: js.Any): Unit = js.native
  /* CompleteClass */
  override def handler(args: Unit, kwargs: js.Any, details: IEvent): Unit = js.native
  /* CompleteClass */
  override def handler(args: Unit, kwargs: Unit, details: IEvent): Unit = js.native
  /* CompleteClass */
  @JSName("handler")
  var handler_Original: SubscribeHandler = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var options: ISubscribeOptions = js.native
  
  /* CompleteClass */
  var session: Session = js.native
  
  /* CompleteClass */
  var topic: String = js.native
  
  /* CompleteClass */
  override def unsubscribe(): Promise[js.Any] = js.native
}
