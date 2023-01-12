package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeStepItem extends StObject {
  
  /**
    * A list of strings containing detailed information about the errors encountered in a particular step.
    */
  var Issues: js.UndefOr[typings.awsSdk.clientsOpensearchMod.Issues] = js.undefined
  
  /**
    * The floating point value representing the progress percentage of a particular step.
    */
  var ProgressPercent: js.UndefOr[Double] = js.undefined
  
  /**
    *  One of three steps that an upgrade or upgrade eligibility check goes through:    PreUpgradeCheck   Snapshot   Upgrade  
    */
  var UpgradeStep: js.UndefOr[typings.awsSdk.clientsOpensearchMod.UpgradeStep] = js.undefined
  
  /**
    *  The current status of the upgrade. The status can take one of the following values:    In Progress   Succeeded   Succeeded with Issues   Failed  
    */
  var UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.undefined
}
object UpgradeStepItem {
  
  inline def apply(): UpgradeStepItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeStepItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeStepItem] (val x: Self) extends AnyVal {
    
    inline def setIssues(value: Issues): Self = StObject.set(x, "Issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "Issues", js.undefined)
    
    inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "Issues", js.Array(value*))
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    inline def setUpgradeStep(value: UpgradeStep): Self = StObject.set(x, "UpgradeStep", value.asInstanceOf[js.Any])
    
    inline def setUpgradeStepStatus(value: UpgradeStatus): Self = StObject.set(x, "UpgradeStepStatus", value.asInstanceOf[js.Any])
    
    inline def setUpgradeStepStatusUndefined: Self = StObject.set(x, "UpgradeStepStatus", js.undefined)
    
    inline def setUpgradeStepUndefined: Self = StObject.set(x, "UpgradeStep", js.undefined)
  }
}
