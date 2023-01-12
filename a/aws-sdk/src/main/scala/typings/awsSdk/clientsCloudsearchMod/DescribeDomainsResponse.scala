package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainsResponse extends StObject {
  
  var DomainStatusList: typings.awsSdk.clientsCloudsearchMod.DomainStatusList
}
object DescribeDomainsResponse {
  
  inline def apply(DomainStatusList: DomainStatusList): DescribeDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainsResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainStatusList(value: DomainStatusList): Self = StObject.set(x, "DomainStatusList", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusListVarargs(value: DomainStatus*): Self = StObject.set(x, "DomainStatusList", js.Array(value*))
  }
}
