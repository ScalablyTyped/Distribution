package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreAddressToClassicResult extends StObject {
  
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  
  /**
    * The move status for the IP address.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsEc2Mod.Status] = js.undefined
}
object RestoreAddressToClassicResult {
  
  inline def apply(): RestoreAddressToClassicResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreAddressToClassicResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreAddressToClassicResult] (val x: Self) extends AnyVal {
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
