package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubscription[TArgs, TKWArgs, TName] extends StObject {
  
  var active: Boolean
  
  def handler(): Unit
  def handler(args: TArgs): Unit
  def handler(args: TArgs, kwargs: TKWArgs): Unit
  def handler(args: TArgs, kwargs: TKWArgs, details: IEvent[String]): Unit
  def handler(args: TArgs, kwargs: Unit, details: IEvent[String]): Unit
  def handler(args: Unit, kwargs: TKWArgs): Unit
  def handler(args: Unit, kwargs: TKWArgs, details: IEvent[String]): Unit
  def handler(args: Unit, kwargs: Unit, details: IEvent[String]): Unit
  @JSName("handler")
  var handler_Original: SubscribeHandler[TArgs, TKWArgs, String]
  
  var id: Double
  
  var options: ISubscribeOptions
  
  var session: Session
  
  var topic: TName
  
  def unsubscribe(): Promise[Any]
}
object ISubscription {
  
  inline def apply[TArgs, TKWArgs, TName](
    active: Boolean,
    handler: (/* args */ js.UndefOr[TArgs], /* kwargs */ js.UndefOr[TKWArgs], /* details */ js.UndefOr[IEvent[String]]) => Unit,
    id: Double,
    options: ISubscribeOptions,
    session: Session,
    topic: TName,
    unsubscribe: () => Promise[Any]
  ): ISubscription[TArgs, TKWArgs, TName] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], handler = js.Any.fromFunction3(handler), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[ISubscription[TArgs, TKWArgs, TName]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISubscription[?, ?, ?], TArgs, TKWArgs, TName] (val x: Self & (ISubscription[TArgs, TKWArgs, TName])) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setHandler(
      value: (/* args */ js.UndefOr[TArgs], /* kwargs */ js.UndefOr[TKWArgs], /* details */ js.UndefOr[IEvent[String]]) => Unit
    ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ISubscribeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TName): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe(value: () => Promise[Any]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
