package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFeatureGroupRequest extends StObject {
  
  /**
    * A free-form description of a FeatureGroup.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Description] = js.undefined
  
  /**
    * The name of the feature that stores the EventTime of a Record in a FeatureGroup. An EventTime is a point in time when a new event occurs that corresponds to the creation or update of a Record in a FeatureGroup. All Records in the FeatureGroup must have a corresponding EventTime. An EventTime can be a String or Fractional.     Fractional: EventTime feature values must be a Unix timestamp in seconds.    String: EventTime feature values must be an ISO-8601 string in the format. The following formats are supported yyyy-MM-dd'T'HH:mm:ssZ and yyyy-MM-dd'T'HH:mm:ss.SSSZ where yyyy, MM, and dd represent the year, month, and day respectively and HH, mm, ss, and if applicable, SSS represent the hour, month, second and milliseconds respsectively. 'T' and Z are constants.  
    */
  var EventTimeFeatureName: FeatureName
  
  /**
    * A list of Feature names and types. Name and Type is compulsory per Feature.  Valid feature FeatureTypes are Integral, Fractional and String.  FeatureNames cannot be any of the following: is_deleted, write_time, api_invocation_time  You can create up to 2,500 FeatureDefinitions per FeatureGroup.
    */
  var FeatureDefinitions: typings.awsSdk.clientsSagemakerMod.FeatureDefinitions
  
  /**
    * The name of the FeatureGroup. The name must be unique within an Amazon Web Services Region in an Amazon Web Services account. The name:   Must start and end with an alphanumeric character.   Can only contain alphanumeric character and hyphens. Spaces are not allowed.   
    */
  var FeatureGroupName: typings.awsSdk.clientsSagemakerMod.FeatureGroupName
  
  /**
    * Use this to configure an OfflineFeatureStore. This parameter allows you to specify:   The Amazon Simple Storage Service (Amazon S3) location of an OfflineStore.   A configuration for an Amazon Web Services Glue or Amazon Web Services Hive data catalog.    An KMS encryption key to encrypt the Amazon S3 location used for OfflineStore. If KMS encryption key is not specified, by default we encrypt all data at rest using Amazon Web Services KMS key. By defining your bucket-level key for SSE, you can reduce Amazon Web Services KMS requests costs by up to 99 percent.   To learn more about this parameter, see OfflineStoreConfig.
    */
  var OfflineStoreConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OfflineStoreConfig] = js.undefined
  
  /**
    * You can turn the OnlineStore on or off by specifying True for the EnableOnlineStore flag in OnlineStoreConfig; the default value is False. You can also include an Amazon Web Services KMS key ID (KMSKeyId) for at-rest encryption of the OnlineStore.
    */
  var OnlineStoreConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OnlineStoreConfig] = js.undefined
  
  /**
    * The name of the Feature whose value uniquely identifies a Record defined in the FeatureStore. Only the latest record per identifier value will be stored in the OnlineStore. RecordIdentifierFeatureName must be one of feature definitions' names. You use the RecordIdentifierFeatureName to access data in a FeatureStore. This name:   Must start and end with an alphanumeric character.   Can only contains alphanumeric characters, hyphens, underscores. Spaces are not allowed.   
    */
  var RecordIdentifierFeatureName: FeatureName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the OfflineStore if an OfflineStoreConfig is provided.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  /**
    * Tags used to identify Features in each FeatureGroup.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFeatureGroupRequest {
  
  inline def apply(
    EventTimeFeatureName: FeatureName,
    FeatureDefinitions: FeatureDefinitions,
    FeatureGroupName: FeatureGroupName,
    RecordIdentifierFeatureName: FeatureName
  ): CreateFeatureGroupRequest = {
    val __obj = js.Dynamic.literal(EventTimeFeatureName = EventTimeFeatureName.asInstanceOf[js.Any], FeatureDefinitions = FeatureDefinitions.asInstanceOf[js.Any], FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], RecordIdentifierFeatureName = RecordIdentifierFeatureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFeatureGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFeatureGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventTimeFeatureName(value: FeatureName): Self = StObject.set(x, "EventTimeFeatureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureDefinitions(value: FeatureDefinitions): Self = StObject.set(x, "FeatureDefinitions", value.asInstanceOf[js.Any])
    
    inline def setFeatureDefinitionsVarargs(value: FeatureDefinition*): Self = StObject.set(x, "FeatureDefinitions", js.Array(value*))
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
    
    inline def setOfflineStoreConfig(value: OfflineStoreConfig): Self = StObject.set(x, "OfflineStoreConfig", value.asInstanceOf[js.Any])
    
    inline def setOfflineStoreConfigUndefined: Self = StObject.set(x, "OfflineStoreConfig", js.undefined)
    
    inline def setOnlineStoreConfig(value: OnlineStoreConfig): Self = StObject.set(x, "OnlineStoreConfig", value.asInstanceOf[js.Any])
    
    inline def setOnlineStoreConfigUndefined: Self = StObject.set(x, "OnlineStoreConfig", js.undefined)
    
    inline def setRecordIdentifierFeatureName(value: FeatureName): Self = StObject.set(x, "RecordIdentifierFeatureName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
