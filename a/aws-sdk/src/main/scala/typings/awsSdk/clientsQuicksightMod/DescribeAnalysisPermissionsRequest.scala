package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnalysisPermissionsRequest extends StObject {
  
  /**
    * The ID of the analysis whose permissions you're describing. The ID is part of the analysis URL.
    */
  var AnalysisId: RestrictiveResourceId
  
  /**
    * The ID of the Amazon Web Services account that contains the analysis whose permissions you're describing. You must be using the Amazon Web Services account that the analysis is in.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
}
object DescribeAnalysisPermissionsRequest {
  
  inline def apply(AnalysisId: RestrictiveResourceId, AwsAccountId: AwsAccountId): DescribeAnalysisPermissionsRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnalysisPermissionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAnalysisPermissionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
