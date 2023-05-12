package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StagingDistributionDnsNames extends StObject {
  
  /**
    * The CloudFront domain name of the staging distribution.
    */
  var Items: js.UndefOr[StagingDistributionDnsNameList] = js.undefined
  
  /**
    * The number of CloudFront domain names in your staging distribution.
    */
  var Quantity: integer
}
object StagingDistributionDnsNames {
  
  inline def apply(Quantity: integer): StagingDistributionDnsNames = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StagingDistributionDnsNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StagingDistributionDnsNames] (val x: Self) extends AnyVal {
    
    inline def setItems(value: StagingDistributionDnsNameList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
