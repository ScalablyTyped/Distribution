package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreAnalysisRequest extends StObject {
  
  /**
    * The ID of the analysis that you're restoring.
    */
  var AnalysisId: ShortRestrictiveResourceId
  
  /**
    * The ID of the Amazon Web Services account that contains the analysis.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
}
object RestoreAnalysisRequest {
  
  inline def apply(AnalysisId: ShortRestrictiveResourceId, AwsAccountId: AwsAccountId): RestoreAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreAnalysisRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreAnalysisRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
