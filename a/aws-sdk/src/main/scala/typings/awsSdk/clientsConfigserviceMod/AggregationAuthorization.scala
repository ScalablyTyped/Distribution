package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationAuthorization extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the aggregation object.
    */
  var AggregationAuthorizationArn: js.UndefOr[String] = js.undefined
  
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: js.UndefOr[AwsRegion] = js.undefined
  
  /**
    * The time stamp when the aggregation authorization was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
}
object AggregationAuthorization {
  
  inline def apply(): AggregationAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationAuthorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationAuthorization] (val x: Self) extends AnyVal {
    
    inline def setAggregationAuthorizationArn(value: String): Self = StObject.set(x, "AggregationAuthorizationArn", value.asInstanceOf[js.Any])
    
    inline def setAggregationAuthorizationArnUndefined: Self = StObject.set(x, "AggregationAuthorizationArn", js.undefined)
    
    inline def setAuthorizedAccountId(value: AccountId): Self = StObject.set(x, "AuthorizedAccountId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedAccountIdUndefined: Self = StObject.set(x, "AuthorizedAccountId", js.undefined)
    
    inline def setAuthorizedAwsRegion(value: AwsRegion): Self = StObject.set(x, "AuthorizedAwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedAwsRegionUndefined: Self = StObject.set(x, "AuthorizedAwsRegion", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
  }
}
