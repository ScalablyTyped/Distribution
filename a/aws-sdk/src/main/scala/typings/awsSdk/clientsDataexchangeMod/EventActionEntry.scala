package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventActionEntry extends StObject {
  
  /**
    * What occurs after a certain event.
    */
  var Action: typings.awsSdk.clientsDataexchangeMod.Action
  
  /**
    * The Amazon Resource Name (ARN) for the event action.
    */
  var Arn: typings.awsSdk.clientsDataexchangeMod.Arn
  
  /**
    * The date and time that the event action was created, in ISO 8601 format.
    */
  var CreatedAt: js.Date
  
  /**
    * What occurs to start an action.
    */
  var Event: typings.awsSdk.clientsDataexchangeMod.Event
  
  /**
    * The unique identifier for the event action.
    */
  var Id: typings.awsSdk.clientsDataexchangeMod.Id
  
  /**
    * The date and time that the event action was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.Date
}
object EventActionEntry {
  
  inline def apply(Action: Action, Arn: Arn, CreatedAt: js.Date, Event: Event, Id: Id, UpdatedAt: js.Date): EventActionEntry = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventActionEntry]
  }
  
  extension [Self <: EventActionEntry](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Event): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
