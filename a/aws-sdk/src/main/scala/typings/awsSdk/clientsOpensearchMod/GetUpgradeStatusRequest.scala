package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUpgradeStatusRequest extends StObject {
  
  /**
    * The domain of the domain to get upgrade status information for.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
}
object GetUpgradeStatusRequest {
  
  inline def apply(DomainName: DomainName): GetUpgradeStatusRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpgradeStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUpgradeStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
