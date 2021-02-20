package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEvent extends StObject {
  
  var publication: Double = js.native
  
  var publisher: js.UndefOr[Double] = js.native
  
  var topic: String = js.native
}
object IEvent {
  
  @scala.inline
  def apply(publication: Double, topic: String): IEvent = {
    val __obj = js.Dynamic.literal(publication = publication.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
  
  @scala.inline
  implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublication(value: Double): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: Double): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
