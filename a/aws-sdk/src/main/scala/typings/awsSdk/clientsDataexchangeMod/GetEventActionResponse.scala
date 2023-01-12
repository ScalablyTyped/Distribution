package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventActionResponse extends StObject {
  
  /**
    * What occurs after a certain event.
    */
  var Action: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.Action] = js.undefined
  
  /**
    * The ARN for the event action.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.Arn] = js.undefined
  
  /**
    * The date and time that the event action was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * What occurs to start an action.
    */
  var Event: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.Event] = js.undefined
  
  /**
    * The unique identifier for the event action.
    */
  var Id: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.Id] = js.undefined
  
  /**
    * The date and time that the event action was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object GetEventActionResponse {
  
  inline def apply(): GetEventActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventActionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEventActionResponse] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEvent(value: Event): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "Event", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
