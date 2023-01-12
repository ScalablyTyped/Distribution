package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent[TName] extends StObject {
  
  var publication: Double
  
  var publisher: js.UndefOr[Double] = js.undefined
  
  var topic: TName
}
object IEvent {
  
  inline def apply[TName](publication: Double, topic: TName): IEvent[TName] = {
    val __obj = js.Dynamic.literal(publication = publication.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent[TName]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEvent[?], TName] (val x: Self & IEvent[TName]) extends AnyVal {
    
    inline def setPublication(value: Double): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: Double): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setTopic(value: TName): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
