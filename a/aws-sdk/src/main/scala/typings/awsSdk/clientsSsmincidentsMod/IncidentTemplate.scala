package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncidentTemplate extends StObject {
  
  /**
    * Used to stop Incident Manager from creating multiple incident records for the same incident. 
    */
  var dedupeString: js.UndefOr[DedupeString] = js.undefined
  
  /**
    * The impact of the incident on your customers and applications. 
    */
  var impact: Impact
  
  /**
    * Tags to apply to an incident when calling the StartIncident API action.
    */
  var incidentTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Amazon SNS targets that are notified when updates are made to an incident.
    */
  var notificationTargets: js.UndefOr[NotificationTargetSet] = js.undefined
  
  /**
    * The summary of the incident. The summary is a brief synopsis of what occurred, what's currently happening, and context.
    */
  var summary: js.UndefOr[IncidentSummary] = js.undefined
  
  /**
    * The title of the incident. 
    */
  var title: IncidentTitle
}
object IncidentTemplate {
  
  inline def apply(impact: Impact, title: IncidentTitle): IncidentTemplate = {
    val __obj = js.Dynamic.literal(impact = impact.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncidentTemplate]
  }
  
  extension [Self <: IncidentTemplate](x: Self) {
    
    inline def setDedupeString(value: DedupeString): Self = StObject.set(x, "dedupeString", value.asInstanceOf[js.Any])
    
    inline def setDedupeStringUndefined: Self = StObject.set(x, "dedupeString", js.undefined)
    
    inline def setImpact(value: Impact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setIncidentTags(value: TagMap): Self = StObject.set(x, "incidentTags", value.asInstanceOf[js.Any])
    
    inline def setIncidentTagsUndefined: Self = StObject.set(x, "incidentTags", js.undefined)
    
    inline def setNotificationTargets(value: NotificationTargetSet): Self = StObject.set(x, "notificationTargets", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargetsUndefined: Self = StObject.set(x, "notificationTargets", js.undefined)
    
    inline def setNotificationTargetsVarargs(value: NotificationTargetItem*): Self = StObject.set(x, "notificationTargets", js.Array(value*))
    
    inline def setSummary(value: IncidentSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTitle(value: IncidentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
