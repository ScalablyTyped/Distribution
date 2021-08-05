package typings.ava.mod

import typings.ava.anon.Complete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscribable extends StObject {
  
  def subscribe(observer: Complete): Unit
}
object Subscribable {
  
  inline def apply(subscribe: Complete => Unit): Subscribable = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscribable]
  }
  
  extension [Self <: Subscribable](x: Self) {
    
    inline def setSubscribe(value: Complete => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
