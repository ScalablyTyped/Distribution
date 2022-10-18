package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2InstanceNetworkInterfacesDetails extends StObject {
  
  /**
    * The identifier of the network interface. The details are in a corresponding AwsEc2NetworkInterfacesDetails object.
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2InstanceNetworkInterfacesDetails {
  
  inline def apply(): AwsEc2InstanceNetworkInterfacesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceNetworkInterfacesDetails]
  }
  
  extension [Self <: AwsEc2InstanceNetworkInterfacesDetails](x: Self) {
    
    inline def setNetworkInterfaceId(value: NonEmptyString): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
  }
}
