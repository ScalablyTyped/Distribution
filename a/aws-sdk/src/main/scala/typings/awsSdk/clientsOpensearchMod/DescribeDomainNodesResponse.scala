package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainNodesResponse extends StObject {
  
  /**
    * Contains nodes information list DomainNodesStatusList with details about the all nodes on the requested domain.
    */
  var DomainNodesStatusList: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainNodesStatusList] = js.undefined
}
object DescribeDomainNodesResponse {
  
  inline def apply(): DescribeDomainNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainNodesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainNodesResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainNodesStatusList(value: DomainNodesStatusList): Self = StObject.set(x, "DomainNodesStatusList", value.asInstanceOf[js.Any])
    
    inline def setDomainNodesStatusListUndefined: Self = StObject.set(x, "DomainNodesStatusList", js.undefined)
    
    inline def setDomainNodesStatusListVarargs(value: DomainNodesStatus*): Self = StObject.set(x, "DomainNodesStatusList", js.Array(value*))
  }
}
