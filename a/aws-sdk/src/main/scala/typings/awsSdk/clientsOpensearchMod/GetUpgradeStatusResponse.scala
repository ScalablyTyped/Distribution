package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUpgradeStatusResponse extends StObject {
  
  /**
    *  One of four statuses an upgrade have, returned as part of the  GetUpgradeStatusResponse  object. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var StepStatus: js.UndefOr[UpgradeStatus] = js.undefined
  
  /**
    * A string that briefly describes the update.
    */
  var UpgradeName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.UpgradeName] = js.undefined
  
  /**
    *  One of three steps an upgrade or upgrade eligibility check goes through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[typings.awsSdk.clientsOpensearchMod.UpgradeStep] = js.undefined
}
object GetUpgradeStatusResponse {
  
  inline def apply(): GetUpgradeStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpgradeStatusResponse]
  }
  
  extension [Self <: GetUpgradeStatusResponse](x: Self) {
    
    inline def setStepStatus(value: UpgradeStatus): Self = StObject.set(x, "StepStatus", value.asInstanceOf[js.Any])
    
    inline def setStepStatusUndefined: Self = StObject.set(x, "StepStatus", js.undefined)
    
    inline def setUpgradeName(value: UpgradeName): Self = StObject.set(x, "UpgradeName", value.asInstanceOf[js.Any])
    
    inline def setUpgradeNameUndefined: Self = StObject.set(x, "UpgradeName", js.undefined)
    
    inline def setUpgradeStep(value: UpgradeStep): Self = StObject.set(x, "UpgradeStep", value.asInstanceOf[js.Any])
    
    inline def setUpgradeStepUndefined: Self = StObject.set(x, "UpgradeStep", js.undefined)
  }
}
