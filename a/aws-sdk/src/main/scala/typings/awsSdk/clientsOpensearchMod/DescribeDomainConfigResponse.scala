package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainConfigResponse extends StObject {
  
  /**
    * Container for the configuration of the OpenSearch Service domain.
    */
  var DomainConfig: typings.awsSdk.clientsOpensearchMod.DomainConfig
}
object DescribeDomainConfigResponse {
  
  inline def apply(DomainConfig: DomainConfig): DescribeDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainConfig(value: DomainConfig): Self = StObject.set(x, "DomainConfig", value.asInstanceOf[js.Any])
  }
}
