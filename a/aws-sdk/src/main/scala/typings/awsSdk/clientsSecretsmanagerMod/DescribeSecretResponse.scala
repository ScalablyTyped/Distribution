package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecretResponse extends StObject {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The date the secret was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date the secret is scheduled for deletion. If it is not scheduled for deletion, this field is omitted. When you delete a secret, Secrets Manager requires a recovery window of at least 7 days before deleting the secret. Some time after the deleted date, Secrets Manager deletes the secret, including all of its versions. If a secret is scheduled for deletion, then its details, including the encrypted secret value, is not accessible. To cancel a scheduled deletion and restore access to the secret, use RestoreSecret.
    */
  var DeletedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * The key ID or alias ARN of the KMS key that Secrets Manager uses to encrypt the secret value. If the secret is encrypted with the Amazon Web Services managed key aws/secretsmanager, this field is omitted. Secrets created using the console use an KMS key ID.
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined
  
  /**
    * The date that the secret was last accessed in the Region. This field is omitted if the secret has never been retrieved in the Region.
    */
  var LastAccessedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last date and time that this secret was modified in any way.
    */
  var LastChangedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last date and time that Secrets Manager rotated the secret. If the secret isn't configured for rotation, Secrets Manager returns null.
    */
  var LastRotatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * The next date and time that Secrets Manager will rotate the secret, rounded to the nearest hour. If the secret isn't configured for rotation, Secrets Manager returns null.
    */
  var NextRotationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the service that created this secret. For more information, see Secrets managed by other Amazon Web Services services.
    */
  var OwningService: js.UndefOr[OwningServiceType] = js.undefined
  
  /**
    * The Region the secret is in. If a secret is replicated to other Regions, the replicas are listed in ReplicationStatus. 
    */
  var PrimaryRegion: js.UndefOr[RegionType] = js.undefined
  
  /**
    * A list of the replicas of this secret and their status:     Failed, which indicates that the replica was not created.    InProgress, which indicates that Secrets Manager is in the process of creating the replica.    InSync, which indicates that the replica was created.  
    */
  var ReplicationStatus: js.UndefOr[ReplicationStatusListType] = js.undefined
  
  /**
    * Specifies whether automatic rotation is turned on for this secret. To turn on rotation, use RotateSecret. To turn off rotation, use CancelRotateSecret.
    */
  var RotationEnabled: js.UndefOr[RotationEnabledType] = js.undefined
  
  /**
    * The ARN of the Lambda function that Secrets Manager invokes to rotate the secret. 
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined
  
  /**
    * The rotation schedule and Lambda function for this secret. If the secret previously had rotation turned on, but it is now turned off, this field shows the previous rotation schedule and rotation function. If the secret never had rotation turned on, this field is omitted.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.undefined
  
  /**
    * The list of tags attached to the secret. To add tags to a secret, use TagResource. To remove tags, use UntagResource.
    */
  var Tags: js.UndefOr[TagListType] = js.undefined
  
  /**
    * A list of the versions of the secret that have staging labels attached. Versions that don't have staging labels are considered deprecated and Secrets Manager can delete them. Secrets Manager uses staging labels to indicate the status of a secret version during rotation. The three staging labels for rotation are:     AWSCURRENT, which indicates the current version of the secret.    AWSPENDING, which indicates the version of the secret that contains new secret information that will become the next current version when rotation finishes. During rotation, Secrets Manager creates an AWSPENDING version ID before creating the new secret version. To check if a secret version exists, call GetSecretValue.    AWSPREVIOUS, which indicates the previous current version of the secret. You can use this as the last known good version.   For more information about rotation and staging labels, see How rotation works.
    */
  var VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.undefined
}
object DescribeSecretResponse {
  
  inline def apply(): DescribeSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecretResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSecretResponse] (val x: Self) extends AnyVal {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDeletedDate(value: js.Date): Self = StObject.set(x, "DeletedDate", value.asInstanceOf[js.Any])
    
    inline def setDeletedDateUndefined: Self = StObject.set(x, "DeletedDate", js.undefined)
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyIdType): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLastAccessedDate(value: js.Date): Self = StObject.set(x, "LastAccessedDate", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedDateUndefined: Self = StObject.set(x, "LastAccessedDate", js.undefined)
    
    inline def setLastChangedDate(value: js.Date): Self = StObject.set(x, "LastChangedDate", value.asInstanceOf[js.Any])
    
    inline def setLastChangedDateUndefined: Self = StObject.set(x, "LastChangedDate", js.undefined)
    
    inline def setLastRotatedDate(value: js.Date): Self = StObject.set(x, "LastRotatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastRotatedDateUndefined: Self = StObject.set(x, "LastRotatedDate", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNextRotationDate(value: js.Date): Self = StObject.set(x, "NextRotationDate", value.asInstanceOf[js.Any])
    
    inline def setNextRotationDateUndefined: Self = StObject.set(x, "NextRotationDate", js.undefined)
    
    inline def setOwningService(value: OwningServiceType): Self = StObject.set(x, "OwningService", value.asInstanceOf[js.Any])
    
    inline def setOwningServiceUndefined: Self = StObject.set(x, "OwningService", js.undefined)
    
    inline def setPrimaryRegion(value: RegionType): Self = StObject.set(x, "PrimaryRegion", value.asInstanceOf[js.Any])
    
    inline def setPrimaryRegionUndefined: Self = StObject.set(x, "PrimaryRegion", js.undefined)
    
    inline def setReplicationStatus(value: ReplicationStatusListType): Self = StObject.set(x, "ReplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicationStatusUndefined: Self = StObject.set(x, "ReplicationStatus", js.undefined)
    
    inline def setReplicationStatusVarargs(value: ReplicationStatusType*): Self = StObject.set(x, "ReplicationStatus", js.Array(value*))
    
    inline def setRotationEnabled(value: RotationEnabledType): Self = StObject.set(x, "RotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRotationEnabledUndefined: Self = StObject.set(x, "RotationEnabled", js.undefined)
    
    inline def setRotationLambdaARN(value: RotationLambdaARNType): Self = StObject.set(x, "RotationLambdaARN", value.asInstanceOf[js.Any])
    
    inline def setRotationLambdaARNUndefined: Self = StObject.set(x, "RotationLambdaARN", js.undefined)
    
    inline def setRotationRules(value: RotationRulesType): Self = StObject.set(x, "RotationRules", value.asInstanceOf[js.Any])
    
    inline def setRotationRulesUndefined: Self = StObject.set(x, "RotationRules", js.undefined)
    
    inline def setTags(value: TagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVersionIdsToStages(value: SecretVersionsToStagesMapType): Self = StObject.set(x, "VersionIdsToStages", value.asInstanceOf[js.Any])
    
    inline def setVersionIdsToStagesUndefined: Self = StObject.set(x, "VersionIdsToStages", js.undefined)
  }
}
