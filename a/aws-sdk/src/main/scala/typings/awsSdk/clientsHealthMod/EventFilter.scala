package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFilter extends StObject {
  
  /**
    * A list of Amazon Web Services Availability Zones.
    */
  var availabilityZones: js.UndefOr[typings.awsSdk.clientsHealthMod.availabilityZones] = js.undefined
  
  /**
    * A list of dates and times that the event ended.
    */
  var endTimes: js.UndefOr[dateTimeRangeList] = js.undefined
  
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.undefined
  
  /**
    * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
    */
  var entityValues: js.UndefOr[entityValueList] = js.undefined
  
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: js.UndefOr[eventArnList] = js.undefined
  
  /**
    * A list of event status codes.
    */
  var eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.undefined
  
  /**
    * A list of event type category codes. Possible values are issue, accountNotification, or scheduledChange. Currently, the investigation value isn't supported at this time.
    */
  var eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.undefined
  
  /**
    * A list of unique identifiers for event types. For example, "AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED". 
    */
  var eventTypeCodes: js.UndefOr[eventTypeList] = js.undefined
  
  /**
    * A list of dates and times that the event was last updated.
    */
  var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.undefined
  
  /**
    * A list of Amazon Web Services Regions.
    */
  var regions: js.UndefOr[regionList] = js.undefined
  
  /**
    * The Amazon Web Services services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.undefined
  
  /**
    * A list of dates and times that the event began.
    */
  var startTimes: js.UndefOr[dateTimeRangeList] = js.undefined
  
  /**
    * A map of entity tags attached to the affected entity.  Currently, the tags property isn't supported. 
    */
  var tags: js.UndefOr[tagFilter] = js.undefined
}
object EventFilter {
  
  inline def apply(): EventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFilter]
  }
  
  extension [Self <: EventFilter](x: Self) {
    
    inline def setAvailabilityZones(value: availabilityZones): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: availabilityZone*): Self = StObject.set(x, "availabilityZones", js.Array(value*))
    
    inline def setEndTimes(value: dateTimeRangeList): Self = StObject.set(x, "endTimes", value.asInstanceOf[js.Any])
    
    inline def setEndTimesUndefined: Self = StObject.set(x, "endTimes", js.undefined)
    
    inline def setEndTimesVarargs(value: DateTimeRange*): Self = StObject.set(x, "endTimes", js.Array(value*))
    
    inline def setEntityArns(value: entityArnList): Self = StObject.set(x, "entityArns", value.asInstanceOf[js.Any])
    
    inline def setEntityArnsUndefined: Self = StObject.set(x, "entityArns", js.undefined)
    
    inline def setEntityArnsVarargs(value: entityArn*): Self = StObject.set(x, "entityArns", js.Array(value*))
    
    inline def setEntityValues(value: entityValueList): Self = StObject.set(x, "entityValues", value.asInstanceOf[js.Any])
    
    inline def setEntityValuesUndefined: Self = StObject.set(x, "entityValues", js.undefined)
    
    inline def setEntityValuesVarargs(value: entityValue*): Self = StObject.set(x, "entityValues", js.Array(value*))
    
    inline def setEventArns(value: eventArnList): Self = StObject.set(x, "eventArns", value.asInstanceOf[js.Any])
    
    inline def setEventArnsUndefined: Self = StObject.set(x, "eventArns", js.undefined)
    
    inline def setEventArnsVarargs(value: eventArn*): Self = StObject.set(x, "eventArns", js.Array(value*))
    
    inline def setEventStatusCodes(value: eventStatusCodeList): Self = StObject.set(x, "eventStatusCodes", value.asInstanceOf[js.Any])
    
    inline def setEventStatusCodesUndefined: Self = StObject.set(x, "eventStatusCodes", js.undefined)
    
    inline def setEventStatusCodesVarargs(value: eventStatusCode*): Self = StObject.set(x, "eventStatusCodes", js.Array(value*))
    
    inline def setEventTypeCategories(value: eventTypeCategoryList): Self = StObject.set(x, "eventTypeCategories", value.asInstanceOf[js.Any])
    
    inline def setEventTypeCategoriesUndefined: Self = StObject.set(x, "eventTypeCategories", js.undefined)
    
    inline def setEventTypeCategoriesVarargs(value: eventTypeCategory*): Self = StObject.set(x, "eventTypeCategories", js.Array(value*))
    
    inline def setEventTypeCodes(value: eventTypeList): Self = StObject.set(x, "eventTypeCodes", value.asInstanceOf[js.Any])
    
    inline def setEventTypeCodesUndefined: Self = StObject.set(x, "eventTypeCodes", js.undefined)
    
    inline def setEventTypeCodesVarargs(value: eventType*): Self = StObject.set(x, "eventTypeCodes", js.Array(value*))
    
    inline def setLastUpdatedTimes(value: dateTimeRangeList): Self = StObject.set(x, "lastUpdatedTimes", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimesUndefined: Self = StObject.set(x, "lastUpdatedTimes", js.undefined)
    
    inline def setLastUpdatedTimesVarargs(value: DateTimeRange*): Self = StObject.set(x, "lastUpdatedTimes", js.Array(value*))
    
    inline def setRegions(value: regionList): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: region*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setServices(value: serviceList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: service*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setStartTimes(value: dateTimeRangeList): Self = StObject.set(x, "startTimes", value.asInstanceOf[js.Any])
    
    inline def setStartTimesUndefined: Self = StObject.set(x, "startTimes", js.undefined)
    
    inline def setStartTimesVarargs(value: DateTimeRange*): Self = StObject.set(x, "startTimes", js.Array(value*))
    
    inline def setTags(value: tagFilter): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: tagSet*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
