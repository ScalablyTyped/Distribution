package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LakeConfigurationRequest extends StObject {
  
  /**
    * The type of encryption key used by Amazon Security Lake to encrypt the Security Lake configuration object.
    */
  var encryptionKey: js.UndefOr[String] = js.undefined
  
  /**
    * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets that are configured for object replication can be owned by the same Amazon Web Services account or by different accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The destination buckets can be in different Amazon Web Services Regions or within the same Region as the source bucket. Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central rollup Region. 
    */
  var replicationDestinationRegions: js.UndefOr[RegionSet] = js.undefined
  
  /**
    * Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management (IAM) role you created that is managed by Security Lake, to ensure the replication setting is correct. 
    */
  var replicationRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Retention settings for the destination Amazon S3 buckets. 
    */
  var retentionSettings: js.UndefOr[RetentionSettingList] = js.undefined
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value, both of which you define.
    */
  var tagsMap: js.UndefOr[TagsMap] = js.undefined
}
object LakeConfigurationRequest {
  
  inline def apply(): LakeConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LakeConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LakeConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setReplicationDestinationRegions(value: RegionSet): Self = StObject.set(x, "replicationDestinationRegions", value.asInstanceOf[js.Any])
    
    inline def setReplicationDestinationRegionsUndefined: Self = StObject.set(x, "replicationDestinationRegions", js.undefined)
    
    inline def setReplicationDestinationRegionsVarargs(value: Region*): Self = StObject.set(x, "replicationDestinationRegions", js.Array(value*))
    
    inline def setReplicationRoleArn(value: RoleArn): Self = StObject.set(x, "replicationRoleArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationRoleArnUndefined: Self = StObject.set(x, "replicationRoleArn", js.undefined)
    
    inline def setRetentionSettings(value: RetentionSettingList): Self = StObject.set(x, "retentionSettings", value.asInstanceOf[js.Any])
    
    inline def setRetentionSettingsUndefined: Self = StObject.set(x, "retentionSettings", js.undefined)
    
    inline def setRetentionSettingsVarargs(value: RetentionSetting*): Self = StObject.set(x, "retentionSettings", js.Array(value*))
    
    inline def setTagsMap(value: TagsMap): Self = StObject.set(x, "tagsMap", value.asInstanceOf[js.Any])
    
    inline def setTagsMapUndefined: Self = StObject.set(x, "tagsMap", js.undefined)
  }
}
