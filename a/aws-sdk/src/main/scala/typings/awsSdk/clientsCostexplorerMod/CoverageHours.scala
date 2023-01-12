package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageHours extends StObject {
  
  /**
    * The percentage of instance hours that a reservation covered.
    */
  var CoverageHoursPercentage: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.CoverageHoursPercentage] = js.undefined
  
  /**
    * The number of instance running hours that On-Demand Instances covered.
    */
  var OnDemandHours: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.OnDemandHours] = js.undefined
  
  /**
    * The number of instance running hours that reservations covered.
    */
  var ReservedHours: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.ReservedHours] = js.undefined
  
  /**
    * The total instance usage, in hours.
    */
  var TotalRunningHours: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.TotalRunningHours] = js.undefined
}
object CoverageHours {
  
  inline def apply(): CoverageHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageHours]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageHours] (val x: Self) extends AnyVal {
    
    inline def setCoverageHoursPercentage(value: CoverageHoursPercentage): Self = StObject.set(x, "CoverageHoursPercentage", value.asInstanceOf[js.Any])
    
    inline def setCoverageHoursPercentageUndefined: Self = StObject.set(x, "CoverageHoursPercentage", js.undefined)
    
    inline def setOnDemandHours(value: OnDemandHours): Self = StObject.set(x, "OnDemandHours", value.asInstanceOf[js.Any])
    
    inline def setOnDemandHoursUndefined: Self = StObject.set(x, "OnDemandHours", js.undefined)
    
    inline def setReservedHours(value: ReservedHours): Self = StObject.set(x, "ReservedHours", value.asInstanceOf[js.Any])
    
    inline def setReservedHoursUndefined: Self = StObject.set(x, "ReservedHours", js.undefined)
    
    inline def setTotalRunningHours(value: TotalRunningHours): Self = StObject.set(x, "TotalRunningHours", value.asInstanceOf[js.Any])
    
    inline def setTotalRunningHoursUndefined: Self = StObject.set(x, "TotalRunningHours", js.undefined)
  }
}
