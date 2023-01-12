package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionArchiveTier extends StObject {
  
  /**
    * The maximum number of snapshots to retain in the archive storage tier for each volume. The count must ensure that each snapshot remains in the archive tier for at least 90 days. For example, if the schedule creates snapshots every 30 days, you must specify a count of 3 or more to ensure that each snapshot is archived for at least 90 days.
    */
  var Count: js.UndefOr[typings.awsSdk.clientsDlmMod.Count] = js.undefined
  
  /**
    * Specifies the period of time to retain snapshots in the archive tier. After this period expires, the snapshot is permanently deleted.
    */
  var Interval: js.UndefOr[typings.awsSdk.clientsDlmMod.Interval] = js.undefined
  
  /**
    * The unit of time in which to measure the Interval. For example, to retain a snapshots in the archive tier for 6 months, specify Interval=6 and IntervalUnit=MONTHS.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
}
object RetentionArchiveTier {
  
  inline def apply(): RetentionArchiveTier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionArchiveTier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetentionArchiveTier] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Count): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setIntervalUnit(value: RetentionIntervalUnitValues): Self = StObject.set(x, "IntervalUnit", value.asInstanceOf[js.Any])
    
    inline def setIntervalUnitUndefined: Self = StObject.set(x, "IntervalUnit", js.undefined)
  }
}
