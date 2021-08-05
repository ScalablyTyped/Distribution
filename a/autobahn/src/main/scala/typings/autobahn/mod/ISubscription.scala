package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubscription extends StObject {
  
  var active: Boolean
  
  def handler(): Unit
  def handler(args: js.Any): Unit
  def handler(args: js.Any, kwargs: js.Any): Unit
  def handler(args: js.Any, kwargs: js.Any, details: IEvent): Unit
  def handler(args: js.Any, kwargs: Unit, details: IEvent): Unit
  def handler(args: js.Array[js.Any]): Unit
  def handler(args: js.Array[js.Any], kwargs: js.Any): Unit
  def handler(args: js.Array[js.Any], kwargs: js.Any, details: IEvent): Unit
  def handler(args: js.Array[js.Any], kwargs: Unit, details: IEvent): Unit
  def handler(args: Unit, kwargs: js.Any): Unit
  def handler(args: Unit, kwargs: js.Any, details: IEvent): Unit
  def handler(args: Unit, kwargs: Unit, details: IEvent): Unit
  @JSName("handler")
  var handler_Original: SubscribeHandler
  
  var id: Double
  
  var options: ISubscribeOptions
  
  var session: Session
  
  var topic: String
  
  def unsubscribe(): Promise[js.Any]
}
object ISubscription {
  
  inline def apply(
    active: Boolean,
    handler: (/* args */ js.UndefOr[js.Array[js.Any] | js.Any], /* kwargs */ js.UndefOr[js.Any], /* details */ js.UndefOr[IEvent]) => Unit,
    id: Double,
    options: ISubscribeOptions,
    session: Session,
    topic: String,
    unsubscribe: () => Promise[js.Any]
  ): ISubscription = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], handler = js.Any.fromFunction3(handler), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[ISubscription]
  }
  
  extension [Self <: ISubscription](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setHandler(
      value: (/* args */ js.UndefOr[js.Array[js.Any] | js.Any], /* kwargs */ js.UndefOr[js.Any], /* details */ js.UndefOr[IEvent]) => Unit
    ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ISubscribeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe(value: () => Promise[js.Any]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
