package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventDataStoreRequest extends StObject {
  
  /**
    * The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see Log events by using advanced event selectors in the CloudTrail User Guide.
    */
  var AdvancedEventSelectors: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.AdvancedEventSelectors] = js.undefined
  
  /**
    * Specifies whether the event data store includes events from all regions, or only from the region in which the event data store is created.
    */
  var MultiRegionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the event data store.
    */
  var Name: EventDataStoreName
  
  /**
    * Specifies whether an event data store collects events logged for an organization in Organizations.
    */
  var OrganizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The retention period of the event data store, in days. You can set a retention period of up to 2557 days, the equivalent of seven years.
    */
  var RetentionPeriod: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.RetentionPeriod] = js.undefined
  
  var TagsList: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.TagsList] = js.undefined
  
  /**
    * Specifies whether termination protection is enabled for the event data store. If termination protection is enabled, you cannot delete the event data store until termination protection is disabled.
    */
  var TerminationProtectionEnabled: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.TerminationProtectionEnabled] = js.undefined
}
object CreateEventDataStoreRequest {
  
  inline def apply(Name: EventDataStoreName): CreateEventDataStoreRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventDataStoreRequest]
  }
  
  extension [Self <: CreateEventDataStoreRequest](x: Self) {
    
    inline def setAdvancedEventSelectors(value: AdvancedEventSelectors): Self = StObject.set(x, "AdvancedEventSelectors", value.asInstanceOf[js.Any])
    
    inline def setAdvancedEventSelectorsUndefined: Self = StObject.set(x, "AdvancedEventSelectors", js.undefined)
    
    inline def setAdvancedEventSelectorsVarargs(value: AdvancedEventSelector*): Self = StObject.set(x, "AdvancedEventSelectors", js.Array(value*))
    
    inline def setMultiRegionEnabled(value: Boolean): Self = StObject.set(x, "MultiRegionEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionEnabledUndefined: Self = StObject.set(x, "MultiRegionEnabled", js.undefined)
    
    inline def setName(value: EventDataStoreName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOrganizationEnabled(value: Boolean): Self = StObject.set(x, "OrganizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOrganizationEnabledUndefined: Self = StObject.set(x, "OrganizationEnabled", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    inline def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    inline def setTagsListUndefined: Self = StObject.set(x, "TagsList", js.undefined)
    
    inline def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value*))
    
    inline def setTerminationProtectionEnabled(value: TerminationProtectionEnabled): Self = StObject.set(x, "TerminationProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTerminationProtectionEnabledUndefined: Self = StObject.set(x, "TerminationProtectionEnabled", js.undefined)
  }
}
