package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginGroupFailoverStatusCodes extends StObject {
  
  /**
    * The list of status code values that can cause a failover to the next origin.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailoverStatusCodesItemList] = js.undefined
  
  /**
    * The number of status codes that can cause a failover.
    */
  var Quantity: js.UndefOr[Integer] = js.undefined
}
object AwsCloudFrontDistributionOriginGroupFailoverStatusCodes {
  
  inline def apply(): AwsCloudFrontDistributionOriginGroupFailoverStatusCodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroupFailoverStatusCodes]
  }
  
  extension [Self <: AwsCloudFrontDistributionOriginGroupFailoverStatusCodes](x: Self) {
    
    inline def setItems(value: AwsCloudFrontDistributionOriginGroupFailoverStatusCodesItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Integer*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: Integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "Quantity", js.undefined)
  }
}
