package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent extends StObject {
  
  var publication: Double
  
  var publisher: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object IEvent {
  
  inline def apply(publication: Double, topic: String): IEvent = {
    val __obj = js.Dynamic.literal(publication = publication.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
  
  extension [Self <: IEvent](x: Self) {
    
    inline def setPublication(value: Double): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: Double): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
