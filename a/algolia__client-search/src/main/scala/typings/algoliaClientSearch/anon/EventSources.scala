package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSources extends StObject {
  
  /**
    * When null, the current index / replica group will be used as the event source.
    */
  val eventSources: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object EventSources {
  
  inline def apply(): EventSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSources] (val x: Self) extends AnyVal {
    
    inline def setEventSources(value: js.Array[String]): Self = StObject.set(x, "eventSources", value.asInstanceOf[js.Any])
    
    inline def setEventSourcesNull: Self = StObject.set(x, "eventSources", null)
    
    inline def setEventSourcesUndefined: Self = StObject.set(x, "eventSources", js.undefined)
    
    inline def setEventSourcesVarargs(value: String*): Self = StObject.set(x, "eventSources", js.Array(value*))
  }
}
