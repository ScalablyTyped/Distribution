package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRotationOverrideRequest extends StObject {
  
  /**
    * The date and time when the override ends.
    */
  var EndTime: js.Date
  
  /**
    * A token that ensures that the operation is called only once with the specified details.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.IdempotencyToken] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation with. If you want to include any current team members in the override shift, you must include their ARNs in the new contact ID list.
    */
  var NewContactIds: RotationOverrideContactsArnList
  
  /**
    * The Amazon Resource Name (ARN) of the rotation to create an override for.
    */
  var RotationId: SsmContactsArn
  
  /**
    * The date and time when the override goes into effect.
    */
  var StartTime: js.Date
}
object CreateRotationOverrideRequest {
  
  inline def apply(
    EndTime: js.Date,
    NewContactIds: RotationOverrideContactsArnList,
    RotationId: SsmContactsArn,
    StartTime: js.Date
  ): CreateRotationOverrideRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], NewContactIds = NewContactIds.asInstanceOf[js.Any], RotationId = RotationId.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRotationOverrideRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRotationOverrideRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setNewContactIds(value: RotationOverrideContactsArnList): Self = StObject.set(x, "NewContactIds", value.asInstanceOf[js.Any])
    
    inline def setNewContactIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "NewContactIds", js.Array(value*))
    
    inline def setRotationId(value: SsmContactsArn): Self = StObject.set(x, "RotationId", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
