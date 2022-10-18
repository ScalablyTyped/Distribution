package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInfoMap extends StObject {
  
  /**
    * The category of an Amazon Redshift event.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  
  /**
    * The description of an Amazon Redshift event.
    */
  var EventDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of an Amazon Redshift event.
    */
  var EventId: js.UndefOr[String] = js.undefined
  
  /**
    * The severity of the event. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.undefined
}
object EventInfoMap {
  
  inline def apply(): EventInfoMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInfoMap]
  }
  
  extension [Self <: EventInfoMap](x: Self) {
    
    inline def setEventCategories(value: EventCategoriesList): Self = StObject.set(x, "EventCategories", value.asInstanceOf[js.Any])
    
    inline def setEventCategoriesUndefined: Self = StObject.set(x, "EventCategories", js.undefined)
    
    inline def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "EventCategories", js.Array(value*))
    
    inline def setEventDescription(value: String): Self = StObject.set(x, "EventDescription", value.asInstanceOf[js.Any])
    
    inline def setEventDescriptionUndefined: Self = StObject.set(x, "EventDescription", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
  }
}
