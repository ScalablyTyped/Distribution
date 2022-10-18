package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainConfigResponse extends StObject {
  
  /**
    * The configuration information of the domain requested in the DescribeDomainConfig request. 
    */
  var DomainConfig: typings.awsSdk.clientsOpensearchMod.DomainConfig
}
object DescribeDomainConfigResponse {
  
  inline def apply(DomainConfig: DomainConfig): DescribeDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainConfigResponse]
  }
  
  extension [Self <: DescribeDomainConfigResponse](x: Self) {
    
    inline def setDomainConfig(value: DomainConfig): Self = StObject.set(x, "DomainConfig", value.asInstanceOf[js.Any])
  }
}
