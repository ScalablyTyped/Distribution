package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetainRule extends StObject {
  
  /**
    * The number of snapshots to retain for each volume, up to a maximum of 1000. For example if you want to retain a maximum of three snapshots, specify 3. When the fourth snapshot is created, the oldest retained snapshot is deleted, or it is moved to the archive tier if you have specified an ArchiveRule.
    */
  var Count: js.UndefOr[StandardTierRetainRuleCount] = js.undefined
  
  /**
    * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[StandardTierRetainRuleInterval] = js.undefined
  
  /**
    * The unit of time for time-based retention. For example, to retain snapshots for 3 months, specify Interval=3 and IntervalUnit=MONTHS. Once the snapshot has been retained for 3 months, it is deleted, or it is moved to the archive tier if you have specified an ArchiveRule.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
}
object RetainRule {
  
  inline def apply(): RetainRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetainRule]
  }
  
  extension [Self <: RetainRule](x: Self) {
    
    inline def setCount(value: StandardTierRetainRuleCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setInterval(value: StandardTierRetainRuleInterval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setIntervalUnit(value: RetentionIntervalUnitValues): Self = StObject.set(x, "IntervalUnit", value.asInstanceOf[js.Any])
    
    inline def setIntervalUnitUndefined: Self = StObject.set(x, "IntervalUnit", js.undefined)
  }
}
