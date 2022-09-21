package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Subscription")
@js.native
open class Subscription[TArgs, TKWArgs, TName] ()
  extends StObject
     with ISubscription[TArgs, TKWArgs, TName] {
  def this(topic: TName) = this()
  def this(topic: TName, handler: SubscribeHandler[TArgs, TKWArgs, String]) = this()
  def this(topic: Unit, handler: SubscribeHandler[TArgs, TKWArgs, String]) = this()
  def this(topic: TName, handler: Unit, options: ISubscribeOptions) = this()
  def this(topic: TName, handler: SubscribeHandler[TArgs, TKWArgs, String], options: ISubscribeOptions) = this()
  def this(topic: Unit, handler: Unit, options: ISubscribeOptions) = this()
  def this(topic: Unit, handler: SubscribeHandler[TArgs, TKWArgs, String], options: ISubscribeOptions) = this()
  def this(topic: TName, handler: Unit, options: Unit, session: Session) = this()
  def this(topic: TName, handler: Unit, options: ISubscribeOptions, session: Session) = this()
  def this(topic: TName, handler: SubscribeHandler[TArgs, TKWArgs, String], options: Unit, session: Session) = this()
  def this(
    topic: TName,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: ISubscribeOptions,
    session: Session
  ) = this()
  def this(topic: Unit, handler: Unit, options: Unit, session: Session) = this()
  def this(topic: Unit, handler: Unit, options: ISubscribeOptions, session: Session) = this()
  def this(topic: Unit, handler: SubscribeHandler[TArgs, TKWArgs, String], options: Unit, session: Session) = this()
  def this(
    topic: Unit,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: ISubscribeOptions,
    session: Session
  ) = this()
  def this(topic: TName, handler: Unit, options: Unit, session: Unit, id: Double) = this()
  def this(topic: TName, handler: Unit, options: Unit, session: Session, id: Double) = this()
  def this(topic: TName, handler: Unit, options: ISubscribeOptions, session: Unit, id: Double) = this()
  def this(topic: TName, handler: Unit, options: ISubscribeOptions, session: Session, id: Double) = this()
  def this(
    topic: TName,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: Unit,
    session: Unit,
    id: Double
  ) = this()
  def this(
    topic: TName,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: Unit,
    session: Session,
    id: Double
  ) = this()
  def this(
    topic: TName,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: ISubscribeOptions,
    session: Unit,
    id: Double
  ) = this()
  def this(
    topic: TName,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: ISubscribeOptions,
    session: Session,
    id: Double
  ) = this()
  def this(topic: Unit, handler: Unit, options: Unit, session: Unit, id: Double) = this()
  def this(topic: Unit, handler: Unit, options: Unit, session: Session, id: Double) = this()
  def this(topic: Unit, handler: Unit, options: ISubscribeOptions, session: Unit, id: Double) = this()
  def this(topic: Unit, handler: Unit, options: ISubscribeOptions, session: Session, id: Double) = this()
  def this(
    topic: Unit,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: Unit,
    session: Unit,
    id: Double
  ) = this()
  def this(
    topic: Unit,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: Unit,
    session: Session,
    id: Double
  ) = this()
  def this(
    topic: Unit,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: ISubscribeOptions,
    session: Unit,
    id: Double
  ) = this()
  def this(
    topic: Unit,
    handler: SubscribeHandler[TArgs, TKWArgs, String],
    options: ISubscribeOptions,
    session: Session,
    id: Double
  ) = this()
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  override def handler(): Unit = js.native
  /* CompleteClass */
  override def handler(args: TArgs): Unit = js.native
  /* CompleteClass */
  override def handler(args: TArgs, kwargs: TKWArgs): Unit = js.native
  /* CompleteClass */
  override def handler(args: TArgs, kwargs: TKWArgs, details: IEvent[String]): Unit = js.native
  /* CompleteClass */
  override def handler(args: TArgs, kwargs: Unit, details: IEvent[String]): Unit = js.native
  /* CompleteClass */
  override def handler(args: Unit, kwargs: TKWArgs): Unit = js.native
  /* CompleteClass */
  override def handler(args: Unit, kwargs: TKWArgs, details: IEvent[String]): Unit = js.native
  /* CompleteClass */
  override def handler(args: Unit, kwargs: Unit, details: IEvent[String]): Unit = js.native
  /* CompleteClass */
  @JSName("handler")
  var handler_Original: SubscribeHandler[TArgs, TKWArgs, String] = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var options: ISubscribeOptions = js.native
  
  /* CompleteClass */
  var session: Session = js.native
  
  /* CompleteClass */
  var topic: TName = js.native
  
  /* CompleteClass */
  override def unsubscribe(): Promise[Any] = js.native
}
