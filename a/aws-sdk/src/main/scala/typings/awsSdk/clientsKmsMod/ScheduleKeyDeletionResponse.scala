package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleKeyDeletionResponse extends StObject {
  
  /**
    * The date and time after which KMS deletes the KMS key. If the KMS key is a multi-Region primary key with replica keys, this field does not appear. The deletion date for the primary key isn't known until its last replica key is deleted.
    */
  var DeletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the KMS key whose deletion is scheduled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The current status of the KMS key. For more information about how key state affects the use of a KMS key, see Key states of KMS keys in the Key Management Service Developer Guide.
    */
  var KeyState: js.UndefOr[typings.awsSdk.clientsKmsMod.KeyState] = js.undefined
  
  /**
    * The waiting period before the KMS key is deleted.  If the KMS key is a multi-Region primary key with replicas, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
    */
  var PendingWindowInDays: js.UndefOr[PendingWindowInDaysType] = js.undefined
}
object ScheduleKeyDeletionResponse {
  
  inline def apply(): ScheduleKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleKeyDeletionResponse]
  }
  
  extension [Self <: ScheduleKeyDeletionResponse](x: Self) {
    
    inline def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeyState(value: KeyState): Self = StObject.set(x, "KeyState", value.asInstanceOf[js.Any])
    
    inline def setKeyStateUndefined: Self = StObject.set(x, "KeyState", js.undefined)
    
    inline def setPendingWindowInDays(value: PendingWindowInDaysType): Self = StObject.set(x, "PendingWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setPendingWindowInDaysUndefined: Self = StObject.set(x, "PendingWindowInDays", js.undefined)
  }
}
