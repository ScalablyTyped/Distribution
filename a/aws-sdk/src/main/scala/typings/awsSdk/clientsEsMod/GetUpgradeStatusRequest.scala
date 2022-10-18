package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUpgradeStatusRequest extends StObject {
  
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
}
object GetUpgradeStatusRequest {
  
  inline def apply(DomainName: DomainName): GetUpgradeStatusRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpgradeStatusRequest]
  }
  
  extension [Self <: GetUpgradeStatusRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
