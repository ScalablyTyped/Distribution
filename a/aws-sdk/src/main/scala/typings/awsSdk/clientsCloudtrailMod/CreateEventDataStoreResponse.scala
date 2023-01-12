package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventDataStoreResponse extends StObject {
  
  /**
    * The advanced event selectors that were used to select the events for the data store.
    */
  var AdvancedEventSelectors: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.AdvancedEventSelectors] = js.undefined
  
  /**
    * The timestamp that shows when the event data store was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the event data store.
    */
  var EventDataStoreArn: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.EventDataStoreArn] = js.undefined
  
  /**
    * Specifies the KMS key ID that encrypts the events delivered by CloudTrail. The value is a fully specified ARN to a KMS key in the following format.  arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012 
    */
  var KmsKeyId: js.UndefOr[EventDataStoreKmsKeyId] = js.undefined
  
  /**
    * Indicates whether the event data store collects events from all regions, or only from the region in which it was created.
    */
  var MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the event data store.
    */
  var Name: js.UndefOr[EventDataStoreName] = js.undefined
  
  /**
    * Indicates whether an event data store is collecting logged events for an organization in Organizations.
    */
  var OrganizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The retention period of an event data store, in days.
    */
  var RetentionPeriod: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.RetentionPeriod] = js.undefined
  
  /**
    * The status of event data store creation.
    */
  var Status: js.UndefOr[EventDataStoreStatus] = js.undefined
  
  var TagsList: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.TagsList] = js.undefined
  
  /**
    * Indicates whether termination protection is enabled for the event data store.
    */
  var TerminationProtectionEnabled: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.TerminationProtectionEnabled] = js.undefined
  
  /**
    * The timestamp that shows when an event data store was updated, if applicable. UpdatedTimestamp is always either the same or newer than the time shown in CreatedTimestamp.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object CreateEventDataStoreResponse {
  
  inline def apply(): CreateEventDataStoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventDataStoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEventDataStoreResponse] (val x: Self) extends AnyVal {
    
    inline def setAdvancedEventSelectors(value: AdvancedEventSelectors): Self = StObject.set(x, "AdvancedEventSelectors", value.asInstanceOf[js.Any])
    
    inline def setAdvancedEventSelectorsUndefined: Self = StObject.set(x, "AdvancedEventSelectors", js.undefined)
    
    inline def setAdvancedEventSelectorsVarargs(value: AdvancedEventSelector*): Self = StObject.set(x, "AdvancedEventSelectors", js.Array(value*))
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setEventDataStoreArn(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStoreArn", value.asInstanceOf[js.Any])
    
    inline def setEventDataStoreArnUndefined: Self = StObject.set(x, "EventDataStoreArn", js.undefined)
    
    inline def setKmsKeyId(value: EventDataStoreKmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMultiRegionEnabled(value: Boolean): Self = StObject.set(x, "MultiRegionEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionEnabledUndefined: Self = StObject.set(x, "MultiRegionEnabled", js.undefined)
    
    inline def setName(value: EventDataStoreName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOrganizationEnabled(value: Boolean): Self = StObject.set(x, "OrganizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOrganizationEnabledUndefined: Self = StObject.set(x, "OrganizationEnabled", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    inline def setStatus(value: EventDataStoreStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    inline def setTagsListUndefined: Self = StObject.set(x, "TagsList", js.undefined)
    
    inline def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value*))
    
    inline def setTerminationProtectionEnabled(value: TerminationProtectionEnabled): Self = StObject.set(x, "TerminationProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTerminationProtectionEnabledUndefined: Self = StObject.set(x, "TerminationProtectionEnabled", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
