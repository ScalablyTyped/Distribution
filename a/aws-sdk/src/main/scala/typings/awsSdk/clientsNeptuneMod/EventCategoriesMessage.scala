package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCategoriesMessage extends StObject {
  
  /**
    * A list of EventCategoriesMap data types.
    */
  var EventCategoriesMapList: js.UndefOr[typings.awsSdk.clientsNeptuneMod.EventCategoriesMapList] = js.undefined
}
object EventCategoriesMessage {
  
  inline def apply(): EventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoriesMessage]
  }
  
  extension [Self <: EventCategoriesMessage](x: Self) {
    
    inline def setEventCategoriesMapList(value: EventCategoriesMapList): Self = StObject.set(x, "EventCategoriesMapList", value.asInstanceOf[js.Any])
    
    inline def setEventCategoriesMapListUndefined: Self = StObject.set(x, "EventCategoriesMapList", js.undefined)
    
    inline def setEventCategoriesMapListVarargs(value: EventCategoriesMap*): Self = StObject.set(x, "EventCategoriesMapList", js.Array(value*))
  }
}
