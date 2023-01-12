package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableHostedZoneDNSSECResponse extends StObject {
  
  var ChangeInfo: typings.awsSdk.clientsRoute53Mod.ChangeInfo
}
object DisableHostedZoneDNSSECResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): DisableHostedZoneDNSSECResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableHostedZoneDNSSECResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableHostedZoneDNSSECResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
