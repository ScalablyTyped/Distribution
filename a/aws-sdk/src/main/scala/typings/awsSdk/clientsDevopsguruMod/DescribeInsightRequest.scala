package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInsightRequest extends StObject {
  
  /**
    * The ID of the member account in the organization.
    */
  var AccountId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    *  The ID of the insight. 
    */
  var Id: InsightId
}
object DescribeInsightRequest {
  
  inline def apply(Id: InsightId): DescribeInsightRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInsightRequest]
  }
  
  extension [Self <: DescribeInsightRequest](x: Self) {
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setId(value: InsightId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
