package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAccessConfiguration extends StObject {
  
  /**
    * The resource identifier of the elastic network interface that is attached to instances in your VPC. All network interfaces have the eni-xxxxxxxx resource identifier.
    */
  var EniId: js.UndefOr[String] = js.native
  
  /**
    * The private IP address of the elastic network interface that is attached to instances in your VPC.
    */
  var EniPrivateIpAddress: js.UndefOr[String] = js.native
}
object NetworkAccessConfiguration {
  
  @scala.inline
  def apply(): NetworkAccessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAccessConfiguration]
  }
  
  @scala.inline
  implicit class NetworkAccessConfigurationMutableBuilder[Self <: NetworkAccessConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEniId(value: String): Self = StObject.set(x, "EniId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEniIdUndefined: Self = StObject.set(x, "EniId", js.undefined)
    
    @scala.inline
    def setEniPrivateIpAddress(value: String): Self = StObject.set(x, "EniPrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEniPrivateIpAddressUndefined: Self = StObject.set(x, "EniPrivateIpAddress", js.undefined)
  }
}
