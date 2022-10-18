package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventSelectorsRequest extends StObject {
  
  /**
    *  Specifies the settings for advanced event selectors. You can add advanced event selectors, and conditions for your advanced event selectors, up to a maximum of 500 values for all conditions and selectors on a trail. You can use either AdvancedEventSelectors or EventSelectors, but not both. If you apply AdvancedEventSelectors to a trail, any existing EventSelectors are overwritten. For more information about advanced event selectors, see Logging data events for trails in the CloudTrail User Guide. 
    */
  var AdvancedEventSelectors: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.AdvancedEventSelectors] = js.undefined
  
  /**
    * Specifies the settings for your event selectors. You can configure up to five event selectors for a trail. You can use either EventSelectors or AdvancedEventSelectors in a PutEventSelectors request, but not both. If you apply EventSelectors to a trail, any existing AdvancedEventSelectors are overwritten.
    */
  var EventSelectors: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.EventSelectors] = js.undefined
  
  /**
    * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are not valid.   Not be in IP address format (for example, 192.168.5.4)   If you specify a trail ARN, it must be in the following format.  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailName: String
}
object PutEventSelectorsRequest {
  
  inline def apply(TrailName: String): PutEventSelectorsRequest = {
    val __obj = js.Dynamic.literal(TrailName = TrailName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventSelectorsRequest]
  }
  
  extension [Self <: PutEventSelectorsRequest](x: Self) {
    
    inline def setAdvancedEventSelectors(value: AdvancedEventSelectors): Self = StObject.set(x, "AdvancedEventSelectors", value.asInstanceOf[js.Any])
    
    inline def setAdvancedEventSelectorsUndefined: Self = StObject.set(x, "AdvancedEventSelectors", js.undefined)
    
    inline def setAdvancedEventSelectorsVarargs(value: AdvancedEventSelector*): Self = StObject.set(x, "AdvancedEventSelectors", js.Array(value*))
    
    inline def setEventSelectors(value: EventSelectors): Self = StObject.set(x, "EventSelectors", value.asInstanceOf[js.Any])
    
    inline def setEventSelectorsUndefined: Self = StObject.set(x, "EventSelectors", js.undefined)
    
    inline def setEventSelectorsVarargs(value: EventSelector*): Self = StObject.set(x, "EventSelectors", js.Array(value*))
    
    inline def setTrailName(value: String): Self = StObject.set(x, "TrailName", value.asInstanceOf[js.Any])
  }
}
