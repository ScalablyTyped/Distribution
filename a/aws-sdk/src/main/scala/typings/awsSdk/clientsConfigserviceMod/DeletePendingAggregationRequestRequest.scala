package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePendingAggregationRequestRequest extends StObject {
  
  /**
    * The 12-digit account ID of the account requesting to aggregate data.
    */
  var RequesterAccountId: AccountId
  
  /**
    * The region requesting to aggregate data.
    */
  var RequesterAwsRegion: AwsRegion
}
object DeletePendingAggregationRequestRequest {
  
  inline def apply(RequesterAccountId: AccountId, RequesterAwsRegion: AwsRegion): DeletePendingAggregationRequestRequest = {
    val __obj = js.Dynamic.literal(RequesterAccountId = RequesterAccountId.asInstanceOf[js.Any], RequesterAwsRegion = RequesterAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePendingAggregationRequestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePendingAggregationRequestRequest] (val x: Self) extends AnyVal {
    
    inline def setRequesterAccountId(value: AccountId): Self = StObject.set(x, "RequesterAccountId", value.asInstanceOf[js.Any])
    
    inline def setRequesterAwsRegion(value: AwsRegion): Self = StObject.set(x, "RequesterAwsRegion", value.asInstanceOf[js.Any])
  }
}
