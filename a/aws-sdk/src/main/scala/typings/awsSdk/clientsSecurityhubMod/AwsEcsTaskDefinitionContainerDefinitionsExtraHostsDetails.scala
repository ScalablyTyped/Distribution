package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails extends StObject {
  
  /**
    * The hostname to use in the /etc/hosts entry.
    */
  var Hostname: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IP address to use in the /etc/hosts entry.
    */
  var IpAddress: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails](x: Self) {
    
    inline def setHostname(value: NonEmptyString): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setIpAddress(value: NonEmptyString): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
  }
}
