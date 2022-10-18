package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceIntegrationResponse extends StObject {
  
  var ServiceIntegration: js.UndefOr[ServiceIntegrationConfig] = js.undefined
}
object DescribeServiceIntegrationResponse {
  
  inline def apply(): DescribeServiceIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceIntegrationResponse]
  }
  
  extension [Self <: DescribeServiceIntegrationResponse](x: Self) {
    
    inline def setServiceIntegration(value: ServiceIntegrationConfig): Self = StObject.set(x, "ServiceIntegration", value.asInstanceOf[js.Any])
    
    inline def setServiceIntegrationUndefined: Self = StObject.set(x, "ServiceIntegration", js.undefined)
  }
}
