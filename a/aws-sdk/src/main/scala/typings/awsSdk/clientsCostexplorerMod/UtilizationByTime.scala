package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilizationByTime extends StObject {
  
  /**
    * The groups that this utilization result uses.
    */
  var Groups: js.UndefOr[ReservationUtilizationGroups] = js.undefined
  
  /**
    * The period of time that this utilization was used for.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.undefined
  
  /**
    * The total number of reservation hours that were used.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.undefined
}
object UtilizationByTime {
  
  inline def apply(): UtilizationByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilizationByTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilizationByTime] (val x: Self) extends AnyVal {
    
    inline def setGroups(value: ReservationUtilizationGroups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: ReservationUtilizationGroup*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
    
    inline def setTotal(value: ReservationAggregates): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
