package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCategoriesMessage extends StObject {
  
  /**
    * A list of event category maps.
    */
  var EventCategoriesMapList: js.UndefOr[typings.awsSdk.clientsDocdbMod.EventCategoriesMapList] = js.undefined
}
object EventCategoriesMessage {
  
  inline def apply(): EventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoriesMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventCategoriesMessage] (val x: Self) extends AnyVal {
    
    inline def setEventCategoriesMapList(value: EventCategoriesMapList): Self = StObject.set(x, "EventCategoriesMapList", value.asInstanceOf[js.Any])
    
    inline def setEventCategoriesMapListUndefined: Self = StObject.set(x, "EventCategoriesMapList", js.undefined)
    
    inline def setEventCategoriesMapListVarargs(value: EventCategoriesMap*): Self = StObject.set(x, "EventCategoriesMapList", js.Array(value*))
  }
}
