package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServicesResponse extends StObject {
  
  /**
    * A JSON-formatted list of Amazon Web Services services.
    */
  var services: js.UndefOr[ServiceList] = js.undefined
}
object DescribeServicesResponse {
  
  inline def apply(): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesResponse]
  }
  
  extension [Self <: DescribeServicesResponse](x: Self) {
    
    inline def setServices(value: ServiceList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
