package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnalysisDefinitionRequest extends StObject {
  
  /**
    * The ID of the analysis that you're describing. The ID is part of the URL of the analysis.
    */
  var AnalysisId: ShortRestrictiveResourceId
  
  /**
    * The ID of the Amazon Web Services account that contains the analysis. You must be using the Amazon Web Services account that the analysis is in.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
}
object DescribeAnalysisDefinitionRequest {
  
  inline def apply(AnalysisId: ShortRestrictiveResourceId, AwsAccountId: AwsAccountId): DescribeAnalysisDefinitionRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnalysisDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAnalysisDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
