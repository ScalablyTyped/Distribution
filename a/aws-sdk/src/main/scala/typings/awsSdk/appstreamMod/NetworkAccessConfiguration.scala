package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAccessConfiguration extends StObject {
  
  /**
    * The resource identifier of the elastic network interface that is attached to instances in your VPC. All network interfaces have the eni-xxxxxxxx resource identifier.
    */
  var EniId: js.UndefOr[String] = js.undefined
  
  /**
    * The private IP address of the elastic network interface that is attached to instances in your VPC.
    */
  var EniPrivateIpAddress: js.UndefOr[String] = js.undefined
}
object NetworkAccessConfiguration {
  
  inline def apply(): NetworkAccessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAccessConfiguration]
  }
  
  extension [Self <: NetworkAccessConfiguration](x: Self) {
    
    inline def setEniId(value: String): Self = StObject.set(x, "EniId", value.asInstanceOf[js.Any])
    
    inline def setEniIdUndefined: Self = StObject.set(x, "EniId", js.undefined)
    
    inline def setEniPrivateIpAddress(value: String): Self = StObject.set(x, "EniPrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setEniPrivateIpAddressUndefined: Self = StObject.set(x, "EniPrivateIpAddress", js.undefined)
  }
}
