package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeatureGroupResponse extends StObject {
  
  /**
    * A timestamp indicating when SageMaker created the FeatureGroup.
    */
  var CreationTime: js.Date
  
  /**
    * A free form description of the feature group.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Description] = js.undefined
  
  /**
    * The name of the feature that stores the EventTime of a Record in a FeatureGroup.  An EventTime is a point in time when a new event occurs that corresponds to the creation or update of a Record in a FeatureGroup. All Records in the FeatureGroup have a corresponding EventTime.
    */
  var EventTimeFeatureName: FeatureName
  
  /**
    * The reason that the FeatureGroup failed to be replicated in the OfflineStore. This is failure can occur because:   The FeatureGroup could not be created in the OfflineStore.   The FeatureGroup could not be deleted from the OfflineStore.  
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * A list of the Features in the FeatureGroup. Each feature is defined by a FeatureName and FeatureType.
    */
  var FeatureDefinitions: typings.awsSdk.clientsSagemakerMod.FeatureDefinitions
  
  /**
    * The Amazon Resource Name (ARN) of the FeatureGroup. 
    */
  var FeatureGroupArn: typings.awsSdk.clientsSagemakerMod.FeatureGroupArn
  
  /**
    * he name of the FeatureGroup.
    */
  var FeatureGroupName: typings.awsSdk.clientsSagemakerMod.FeatureGroupName
  
  /**
    * The status of the feature group.
    */
  var FeatureGroupStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureGroupStatus] = js.undefined
  
  /**
    * A timestamp indicating when the feature group was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A value indicating whether the update made to the feature group was successful.
    */
  var LastUpdateStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LastUpdateStatus] = js.undefined
  
  /**
    * A token to resume pagination of the list of Features (FeatureDefinitions).
    */
  var NextToken: typings.awsSdk.clientsSagemakerMod.NextToken
  
  /**
    * The configuration of the OfflineStore, inducing the S3 location of the OfflineStore, Amazon Web Services Glue or Amazon Web Services Hive data catalogue configurations, and the security configuration.
    */
  var OfflineStoreConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OfflineStoreConfig] = js.undefined
  
  /**
    * The status of the OfflineStore. Notifies you if replicating data into the OfflineStore has failed. Returns either: Active or Blocked 
    */
  var OfflineStoreStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OfflineStoreStatus] = js.undefined
  
  /**
    * The configuration for the OnlineStore.
    */
  var OnlineStoreConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OnlineStoreConfig] = js.undefined
  
  /**
    * The size of the OnlineStore in bytes.
    */
  var OnlineStoreTotalSizeBytes: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OnlineStoreTotalSizeBytes] = js.undefined
  
  /**
    * The name of the Feature used for RecordIdentifier, whose value uniquely identifies a record stored in the feature store.
    */
  var RecordIdentifierFeatureName: FeatureName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the OfflineStore if an OfflineStoreConfig is provided.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
}
object DescribeFeatureGroupResponse {
  
  inline def apply(
    CreationTime: js.Date,
    EventTimeFeatureName: FeatureName,
    FeatureDefinitions: FeatureDefinitions,
    FeatureGroupArn: FeatureGroupArn,
    FeatureGroupName: FeatureGroupName,
    NextToken: NextToken,
    RecordIdentifierFeatureName: FeatureName
  ): DescribeFeatureGroupResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EventTimeFeatureName = EventTimeFeatureName.asInstanceOf[js.Any], FeatureDefinitions = FeatureDefinitions.asInstanceOf[js.Any], FeatureGroupArn = FeatureGroupArn.asInstanceOf[js.Any], FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], NextToken = NextToken.asInstanceOf[js.Any], RecordIdentifierFeatureName = RecordIdentifierFeatureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFeatureGroupResponse]
  }
  
  extension [Self <: DescribeFeatureGroupResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventTimeFeatureName(value: FeatureName): Self = StObject.set(x, "EventTimeFeatureName", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFeatureDefinitions(value: FeatureDefinitions): Self = StObject.set(x, "FeatureDefinitions", value.asInstanceOf[js.Any])
    
    inline def setFeatureDefinitionsVarargs(value: FeatureDefinition*): Self = StObject.set(x, "FeatureDefinitions", js.Array(value*))
    
    inline def setFeatureGroupArn(value: FeatureGroupArn): Self = StObject.set(x, "FeatureGroupArn", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupStatus(value: FeatureGroupStatus): Self = StObject.set(x, "FeatureGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupStatusUndefined: Self = StObject.set(x, "FeatureGroupStatus", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLastUpdateStatus(value: LastUpdateStatus): Self = StObject.set(x, "LastUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateStatusUndefined: Self = StObject.set(x, "LastUpdateStatus", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setOfflineStoreConfig(value: OfflineStoreConfig): Self = StObject.set(x, "OfflineStoreConfig", value.asInstanceOf[js.Any])
    
    inline def setOfflineStoreConfigUndefined: Self = StObject.set(x, "OfflineStoreConfig", js.undefined)
    
    inline def setOfflineStoreStatus(value: OfflineStoreStatus): Self = StObject.set(x, "OfflineStoreStatus", value.asInstanceOf[js.Any])
    
    inline def setOfflineStoreStatusUndefined: Self = StObject.set(x, "OfflineStoreStatus", js.undefined)
    
    inline def setOnlineStoreConfig(value: OnlineStoreConfig): Self = StObject.set(x, "OnlineStoreConfig", value.asInstanceOf[js.Any])
    
    inline def setOnlineStoreConfigUndefined: Self = StObject.set(x, "OnlineStoreConfig", js.undefined)
    
    inline def setOnlineStoreTotalSizeBytes(value: OnlineStoreTotalSizeBytes): Self = StObject.set(x, "OnlineStoreTotalSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setOnlineStoreTotalSizeBytesUndefined: Self = StObject.set(x, "OnlineStoreTotalSizeBytes", js.undefined)
    
    inline def setRecordIdentifierFeatureName(value: FeatureName): Self = StObject.set(x, "RecordIdentifierFeatureName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
