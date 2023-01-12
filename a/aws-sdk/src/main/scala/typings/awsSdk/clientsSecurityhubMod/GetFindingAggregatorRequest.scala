package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingAggregatorRequest extends StObject {
  
  /**
    * The ARN of the finding aggregator to return details for. To obtain the ARN, use ListFindingAggregators.
    */
  var FindingAggregatorArn: NonEmptyString
}
object GetFindingAggregatorRequest {
  
  inline def apply(FindingAggregatorArn: NonEmptyString): GetFindingAggregatorRequest = {
    val __obj = js.Dynamic.literal(FindingAggregatorArn = FindingAggregatorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingAggregatorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFindingAggregatorRequest] (val x: Self) extends AnyVal {
    
    inline def setFindingAggregatorArn(value: NonEmptyString): Self = StObject.set(x, "FindingAggregatorArn", value.asInstanceOf[js.Any])
  }
}
