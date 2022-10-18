package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointServicesResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the service.
    */
  var ServiceDetails: js.UndefOr[ServiceDetailSet] = js.undefined
  
  /**
    * A list of supported services.
    */
  var ServiceNames: js.UndefOr[ValueStringList] = js.undefined
}
object DescribeVpcEndpointServicesResult {
  
  inline def apply(): DescribeVpcEndpointServicesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServicesResult]
  }
  
  extension [Self <: DescribeVpcEndpointServicesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceDetails(value: ServiceDetailSet): Self = StObject.set(x, "ServiceDetails", value.asInstanceOf[js.Any])
    
    inline def setServiceDetailsUndefined: Self = StObject.set(x, "ServiceDetails", js.undefined)
    
    inline def setServiceDetailsVarargs(value: ServiceDetail*): Self = StObject.set(x, "ServiceDetails", js.Array(value*))
    
    inline def setServiceNames(value: ValueStringList): Self = StObject.set(x, "ServiceNames", value.asInstanceOf[js.Any])
    
    inline def setServiceNamesUndefined: Self = StObject.set(x, "ServiceNames", js.undefined)
    
    inline def setServiceNamesVarargs(value: String*): Self = StObject.set(x, "ServiceNames", js.Array(value*))
  }
}
