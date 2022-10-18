package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Room extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the room creator.
    */
  var CreatedBy: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The room creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The room name.
    */
  var Name: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The room ID.
    */
  var RoomId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The room update timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object Room {
  
  inline def apply(): Room = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Room]
  }
  
  extension [Self <: Room](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setCreatedBy(value: NonEmptyString): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setName(value: SensitiveString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
    
    inline def setRoomIdUndefined: Self = StObject.set(x, "RoomId", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
