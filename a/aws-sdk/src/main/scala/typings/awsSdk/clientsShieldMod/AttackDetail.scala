package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackDetail extends StObject {
  
  /**
    * List of counters that describe the attack for the specified time period.
    */
  var AttackCounters: js.UndefOr[SummarizedCounterList] = js.undefined
  
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[typings.awsSdk.clientsShieldMod.AttackId] = js.undefined
  
  /**
    * The array of objects that provide details of the Shield event.  For infrastructure layer events (L3 and L4 events), you can view metrics for top contributors in Amazon CloudWatch metrics. For more information, see Shield metrics and alarms in the WAF Developer Guide. 
    */
  var AttackProperties: js.UndefOr[typings.awsSdk.clientsShieldMod.AttackProperties] = js.undefined
  
  /**
    * The time the attack ended, in Unix time in seconds. 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * List of mitigation actions taken for the attack.
    */
  var Mitigations: js.UndefOr[MitigationList] = js.undefined
  
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsShieldMod.ResourceArn] = js.undefined
  
  /**
    * The time the attack started, in Unix time in seconds. 
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
    */
  var SubResources: js.UndefOr[SubResourceSummaryList] = js.undefined
}
object AttackDetail {
  
  inline def apply(): AttackDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackDetail]
  }
  
  extension [Self <: AttackDetail](x: Self) {
    
    inline def setAttackCounters(value: SummarizedCounterList): Self = StObject.set(x, "AttackCounters", value.asInstanceOf[js.Any])
    
    inline def setAttackCountersUndefined: Self = StObject.set(x, "AttackCounters", js.undefined)
    
    inline def setAttackCountersVarargs(value: SummarizedCounter*): Self = StObject.set(x, "AttackCounters", js.Array(value*))
    
    inline def setAttackId(value: AttackId): Self = StObject.set(x, "AttackId", value.asInstanceOf[js.Any])
    
    inline def setAttackIdUndefined: Self = StObject.set(x, "AttackId", js.undefined)
    
    inline def setAttackProperties(value: AttackProperties): Self = StObject.set(x, "AttackProperties", value.asInstanceOf[js.Any])
    
    inline def setAttackPropertiesUndefined: Self = StObject.set(x, "AttackProperties", js.undefined)
    
    inline def setAttackPropertiesVarargs(value: AttackProperty*): Self = StObject.set(x, "AttackProperties", js.Array(value*))
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMitigations(value: MitigationList): Self = StObject.set(x, "Mitigations", value.asInstanceOf[js.Any])
    
    inline def setMitigationsUndefined: Self = StObject.set(x, "Mitigations", js.undefined)
    
    inline def setMitigationsVarargs(value: Mitigation*): Self = StObject.set(x, "Mitigations", js.Array(value*))
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setSubResources(value: SubResourceSummaryList): Self = StObject.set(x, "SubResources", value.asInstanceOf[js.Any])
    
    inline def setSubResourcesUndefined: Self = StObject.set(x, "SubResources", js.undefined)
    
    inline def setSubResourcesVarargs(value: SubResourceSummary*): Self = StObject.set(x, "SubResources", js.Array(value*))
  }
}
