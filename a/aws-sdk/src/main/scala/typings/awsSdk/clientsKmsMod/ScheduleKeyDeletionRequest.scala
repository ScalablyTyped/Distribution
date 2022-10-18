package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleKeyDeletionRequest extends StObject {
  
  /**
    * The unique identifier of the KMS key to delete. Specify the key ID or key ARN of the KMS key. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * The waiting period, specified in number of days. After the waiting period ends, KMS deletes the KMS key. If the KMS key is a multi-Region primary key with replica keys, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately. This value is optional. If you include a value, it must be between 7 and 30, inclusive. If you do not include a value, it defaults to 30.
    */
  var PendingWindowInDays: js.UndefOr[PendingWindowInDaysType] = js.undefined
}
object ScheduleKeyDeletionRequest {
  
  inline def apply(KeyId: KeyIdType): ScheduleKeyDeletionRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleKeyDeletionRequest]
  }
  
  extension [Self <: ScheduleKeyDeletionRequest](x: Self) {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setPendingWindowInDays(value: PendingWindowInDaysType): Self = StObject.set(x, "PendingWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setPendingWindowInDaysUndefined: Self = StObject.set(x, "PendingWindowInDays", js.undefined)
  }
}
