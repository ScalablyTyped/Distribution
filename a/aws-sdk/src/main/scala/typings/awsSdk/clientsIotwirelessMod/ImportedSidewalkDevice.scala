package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportedSidewalkDevice extends StObject {
  
  /**
    * The time at which the status information was last updated.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The onboarding status of the Sidewalk device in the import task.
    */
  var OnboardingStatus: js.UndefOr[OnboardStatus] = js.undefined
  
  /**
    * The reason for the onboarding status information for the Sidewalk device.
    */
  var OnboardingStatusReason: js.UndefOr[OnboardStatusReason] = js.undefined
  
  /**
    * The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
    */
  var SidewalkManufacturingSn: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.SidewalkManufacturingSn] = js.undefined
}
object ImportedSidewalkDevice {
  
  inline def apply(): ImportedSidewalkDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportedSidewalkDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportedSidewalkDevice] (val x: Self) extends AnyVal {
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setOnboardingStatus(value: OnboardStatus): Self = StObject.set(x, "OnboardingStatus", value.asInstanceOf[js.Any])
    
    inline def setOnboardingStatusReason(value: OnboardStatusReason): Self = StObject.set(x, "OnboardingStatusReason", value.asInstanceOf[js.Any])
    
    inline def setOnboardingStatusReasonUndefined: Self = StObject.set(x, "OnboardingStatusReason", js.undefined)
    
    inline def setOnboardingStatusUndefined: Self = StObject.set(x, "OnboardingStatus", js.undefined)
    
    inline def setSidewalkManufacturingSn(value: SidewalkManufacturingSn): Self = StObject.set(x, "SidewalkManufacturingSn", value.asInstanceOf[js.Any])
    
    inline def setSidewalkManufacturingSnUndefined: Self = StObject.set(x, "SidewalkManufacturingSn", js.undefined)
  }
}
