package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUpgradeStatusResponse extends StObject {
  
  /**
    * The status of the current step that an upgrade is on.
    */
  var StepStatus: js.UndefOr[UpgradeStatus] = js.undefined
  
  /**
    * A string that describes the update.
    */
  var UpgradeName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.UpgradeName] = js.undefined
  
  /**
    * One of three steps that an upgrade or upgrade eligibility check goes through.
    */
  var UpgradeStep: js.UndefOr[typings.awsSdk.clientsOpensearchMod.UpgradeStep] = js.undefined
}
object GetUpgradeStatusResponse {
  
  inline def apply(): GetUpgradeStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpgradeStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUpgradeStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setStepStatus(value: UpgradeStatus): Self = StObject.set(x, "StepStatus", value.asInstanceOf[js.Any])
    
    inline def setStepStatusUndefined: Self = StObject.set(x, "StepStatus", js.undefined)
    
    inline def setUpgradeName(value: UpgradeName): Self = StObject.set(x, "UpgradeName", value.asInstanceOf[js.Any])
    
    inline def setUpgradeNameUndefined: Self = StObject.set(x, "UpgradeName", js.undefined)
    
    inline def setUpgradeStep(value: UpgradeStep): Self = StObject.set(x, "UpgradeStep", value.asInstanceOf[js.Any])
    
    inline def setUpgradeStepUndefined: Self = StObject.set(x, "UpgradeStep", js.undefined)
  }
}
