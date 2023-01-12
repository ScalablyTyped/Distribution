package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginSslProtocols extends StObject {
  
  /**
    * A list that contains allowed SSL/TLS protocols for this distribution. 
    */
  var Items: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS connection with this origin. 
    */
  var Quantity: js.UndefOr[Integer] = js.undefined
}
object AwsCloudFrontDistributionOriginSslProtocols {
  
  inline def apply(): AwsCloudFrontDistributionOriginSslProtocols = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginSslProtocols]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudFrontDistributionOriginSslProtocols] (val x: Self) extends AnyVal {
    
    inline def setItems(value: NonEmptyStringList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: Integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "Quantity", js.undefined)
  }
}
