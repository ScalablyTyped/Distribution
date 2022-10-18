package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureGroup extends StObject {
  
  /**
    * The time a FeatureGroup was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A free form description of a FeatureGroup.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Description] = js.undefined
  
  /**
    * The name of the feature that stores the EventTime of a Record in a FeatureGroup. A EventTime is point in time when a new event occurs that corresponds to the creation or update of a Record in FeatureGroup. All Records in the FeatureGroup must have a corresponding EventTime.
    */
  var EventTimeFeatureName: js.UndefOr[FeatureName] = js.undefined
  
  /**
    * The reason that the FeatureGroup failed to be replicated in the OfflineStore. This is failure may be due to a failure to create a FeatureGroup in or delete a FeatureGroup from the OfflineStore.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * A list of Features. Each Feature must include a FeatureName and a FeatureType.  Valid FeatureTypes are Integral, Fractional and String.   FeatureNames cannot be any of the following: is_deleted, write_time, api_invocation_time. You can create up to 2,500 FeatureDefinitions per FeatureGroup.
    */
  var FeatureDefinitions: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureDefinitions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a FeatureGroup.
    */
  var FeatureGroupArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureGroupArn] = js.undefined
  
  /**
    * The name of the FeatureGroup.
    */
  var FeatureGroupName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureGroupName] = js.undefined
  
  /**
    * A FeatureGroup status.
    */
  var FeatureGroupStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureGroupStatus] = js.undefined
  
  /**
    * A timestamp indicating the last time you updated the feature group.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A value that indicates whether the feature group was updated successfully.
    */
  var LastUpdateStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LastUpdateStatus] = js.undefined
  
  var OfflineStoreConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OfflineStoreConfig] = js.undefined
  
  var OfflineStoreStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OfflineStoreStatus] = js.undefined
  
  var OnlineStoreConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OnlineStoreConfig] = js.undefined
  
  /**
    * The name of the Feature whose value uniquely identifies a Record defined in the FeatureGroup FeatureDefinitions.
    */
  var RecordIdentifierFeatureName: js.UndefOr[FeatureName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  /**
    * Tags used to define a FeatureGroup.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object FeatureGroup {
  
  inline def apply(): FeatureGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureGroup]
  }
  
  extension [Self <: FeatureGroup](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventTimeFeatureName(value: FeatureName): Self = StObject.set(x, "EventTimeFeatureName", value.asInstanceOf[js.Any])
    
    inline def setEventTimeFeatureNameUndefined: Self = StObject.set(x, "EventTimeFeatureName", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFeatureDefinitions(value: FeatureDefinitions): Self = StObject.set(x, "FeatureDefinitions", value.asInstanceOf[js.Any])
    
    inline def setFeatureDefinitionsUndefined: Self = StObject.set(x, "FeatureDefinitions", js.undefined)
    
    inline def setFeatureDefinitionsVarargs(value: FeatureDefinition*): Self = StObject.set(x, "FeatureDefinitions", js.Array(value*))
    
    inline def setFeatureGroupArn(value: FeatureGroupArn): Self = StObject.set(x, "FeatureGroupArn", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupArnUndefined: Self = StObject.set(x, "FeatureGroupArn", js.undefined)
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupNameUndefined: Self = StObject.set(x, "FeatureGroupName", js.undefined)
    
    inline def setFeatureGroupStatus(value: FeatureGroupStatus): Self = StObject.set(x, "FeatureGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupStatusUndefined: Self = StObject.set(x, "FeatureGroupStatus", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLastUpdateStatus(value: LastUpdateStatus): Self = StObject.set(x, "LastUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateStatusUndefined: Self = StObject.set(x, "LastUpdateStatus", js.undefined)
    
    inline def setOfflineStoreConfig(value: OfflineStoreConfig): Self = StObject.set(x, "OfflineStoreConfig", value.asInstanceOf[js.Any])
    
    inline def setOfflineStoreConfigUndefined: Self = StObject.set(x, "OfflineStoreConfig", js.undefined)
    
    inline def setOfflineStoreStatus(value: OfflineStoreStatus): Self = StObject.set(x, "OfflineStoreStatus", value.asInstanceOf[js.Any])
    
    inline def setOfflineStoreStatusUndefined: Self = StObject.set(x, "OfflineStoreStatus", js.undefined)
    
    inline def setOnlineStoreConfig(value: OnlineStoreConfig): Self = StObject.set(x, "OnlineStoreConfig", value.asInstanceOf[js.Any])
    
    inline def setOnlineStoreConfigUndefined: Self = StObject.set(x, "OnlineStoreConfig", js.undefined)
    
    inline def setRecordIdentifierFeatureName(value: FeatureName): Self = StObject.set(x, "RecordIdentifierFeatureName", value.asInstanceOf[js.Any])
    
    inline def setRecordIdentifierFeatureNameUndefined: Self = StObject.set(x, "RecordIdentifierFeatureName", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
