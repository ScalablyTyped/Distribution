package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServicesResponse extends StObject {
  
  /**
    * The format version of the response. For example, aws_v1.
    */
  var FormatVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The pagination token for the next set of retrievable results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The service metadata for the service or services in the response.
    */
  var Services: js.UndefOr[ServiceList] = js.undefined
}
object DescribeServicesResponse {
  
  inline def apply(): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeServicesResponse] (val x: Self) extends AnyVal {
    
    inline def setFormatVersion(value: String): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
    
    inline def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServices(value: ServiceList): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
    
    inline def setServicesVarargs(value: Service*): Self = StObject.set(x, "Services", js.Array(value*))
  }
}
