package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceNetworkConfigurationDetails extends StObject {
  
  /**
    * The VPC subnet and security group configuration.
    */
  var AwsVpcConfiguration: js.UndefOr[AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails] = js.undefined
}
object AwsEcsServiceNetworkConfigurationDetails {
  
  inline def apply(): AwsEcsServiceNetworkConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceNetworkConfigurationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsServiceNetworkConfigurationDetails] (val x: Self) extends AnyVal {
    
    inline def setAwsVpcConfiguration(value: AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails): Self = StObject.set(x, "AwsVpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAwsVpcConfigurationUndefined: Self = StObject.set(x, "AwsVpcConfiguration", js.undefined)
  }
}
