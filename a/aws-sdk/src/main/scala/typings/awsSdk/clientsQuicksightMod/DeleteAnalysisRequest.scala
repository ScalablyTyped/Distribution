package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnalysisRequest extends StObject {
  
  /**
    * The ID of the analysis that you're deleting.
    */
  var AnalysisId: RestrictiveResourceId
  
  /**
    * The ID of the Amazon Web Services account where you want to delete an analysis.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * This option defaults to the value NoForceDeleteWithoutRecovery. To immediately delete the analysis, add the ForceDeleteWithoutRecovery option. You can't restore an analysis after it's deleted. 
    */
  var ForceDeleteWithoutRecovery: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * A value that specifies the number of days that Amazon QuickSight waits before it deletes the analysis. You can't use this parameter with the ForceDeleteWithoutRecovery option in the same API call. The default value is 30.
    */
  var RecoveryWindowInDays: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RecoveryWindowInDays] = js.undefined
}
object DeleteAnalysisRequest {
  
  inline def apply(AnalysisId: RestrictiveResourceId, AwsAccountId: AwsAccountId): DeleteAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysisRequest]
  }
  
  extension [Self <: DeleteAnalysisRequest](x: Self) {
    
    inline def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteWithoutRecovery(value: scala.Boolean): Self = StObject.set(x, "ForceDeleteWithoutRecovery", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteWithoutRecoveryUndefined: Self = StObject.set(x, "ForceDeleteWithoutRecovery", js.undefined)
    
    inline def setRecoveryWindowInDays(value: RecoveryWindowInDays): Self = StObject.set(x, "RecoveryWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setRecoveryWindowInDaysUndefined: Self = StObject.set(x, "RecoveryWindowInDays", js.undefined)
  }
}
