package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsSnapshotConfiguration extends StObject {
  
  /**
    * The groups that have access to the Amazon EBS volume snapshot. If the value all is specified, then the Amazon EBS volume snapshot is public.   If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the groups, then the access preview uses the existing shared groups for the snapshot.   If the access preview is for a new resource and you do not specify the groups, then the access preview considers the snapshot without any groups.   To propose deletion of existing shared groups, you can specify an empty list for groups.  
    */
  var groups: js.UndefOr[EbsGroupList] = js.undefined
  
  /**
    * The KMS key identifier for an encrypted Amazon EBS volume snapshot. The KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.   If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the kmsKeyId, or you specify an empty string, then the access preview uses the existing kmsKeyId of the snapshot.   If the access preview is for a new resource and you do not specify the kmsKeyId, the access preview considers the snapshot as unencrypted.  
    */
  var kmsKeyId: js.UndefOr[EbsSnapshotDataEncryptionKeyId] = js.undefined
  
  /**
    * The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.   If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the userIds, then the access preview uses the existing shared userIds for the snapshot.   If the access preview is for a new resource and you do not specify the userIds, then the access preview considers the snapshot without any userIds.   To propose deletion of existing shared accountIds, you can specify an empty list for userIds.  
    */
  var userIds: js.UndefOr[EbsUserIdList] = js.undefined
}
object EbsSnapshotConfiguration {
  
  inline def apply(): EbsSnapshotConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsSnapshotConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EbsSnapshotConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGroups(value: EbsGroupList): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: EbsGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setKmsKeyId(value: EbsSnapshotDataEncryptionKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setUserIds(value: EbsUserIdList): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
    
    inline def setUserIdsVarargs(value: EbsUserId*): Self = StObject.set(x, "userIds", js.Array(value*))
  }
}
