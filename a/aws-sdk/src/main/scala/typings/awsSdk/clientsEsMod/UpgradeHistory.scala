package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeHistory extends StObject {
  
  /**
    * UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
    */
  var StartTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  A list of  UpgradeStepItem  s representing information about each step performed as pard of a specific Upgrade or Upgrade Eligibility Check. 
    */
  var StepsList: js.UndefOr[UpgradeStepsList] = js.undefined
  
  /**
    * A string that describes the update briefly
    */
  var UpgradeName: js.UndefOr[typings.awsSdk.clientsEsMod.UpgradeName] = js.undefined
  
  /**
    *  The overall status of the update. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var UpgradeStatus: js.UndefOr[typings.awsSdk.clientsEsMod.UpgradeStatus] = js.undefined
}
object UpgradeHistory {
  
  inline def apply(): UpgradeHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeHistory] (val x: Self) extends AnyVal {
    
    inline def setStartTimestamp(value: js.Date): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "StartTimestamp", js.undefined)
    
    inline def setStepsList(value: UpgradeStepsList): Self = StObject.set(x, "StepsList", value.asInstanceOf[js.Any])
    
    inline def setStepsListUndefined: Self = StObject.set(x, "StepsList", js.undefined)
    
    inline def setStepsListVarargs(value: UpgradeStepItem*): Self = StObject.set(x, "StepsList", js.Array(value*))
    
    inline def setUpgradeName(value: UpgradeName): Self = StObject.set(x, "UpgradeName", value.asInstanceOf[js.Any])
    
    inline def setUpgradeNameUndefined: Self = StObject.set(x, "UpgradeName", js.undefined)
    
    inline def setUpgradeStatus(value: UpgradeStatus): Self = StObject.set(x, "UpgradeStatus", value.asInstanceOf[js.Any])
    
    inline def setUpgradeStatusUndefined: Self = StObject.set(x, "UpgradeStatus", js.undefined)
  }
}
