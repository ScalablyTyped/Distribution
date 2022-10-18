package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOrigins extends StObject {
  
  /**
    * A complex type that contains origins or origin groups for this distribution.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginItemList] = js.undefined
}
object AwsCloudFrontDistributionOrigins {
  
  inline def apply(): AwsCloudFrontDistributionOrigins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOrigins]
  }
  
  extension [Self <: AwsCloudFrontDistributionOrigins](x: Self) {
    
    inline def setItems(value: AwsCloudFrontDistributionOriginItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: AwsCloudFrontDistributionOriginItem*): Self = StObject.set(x, "Items", js.Array(value*))
  }
}
