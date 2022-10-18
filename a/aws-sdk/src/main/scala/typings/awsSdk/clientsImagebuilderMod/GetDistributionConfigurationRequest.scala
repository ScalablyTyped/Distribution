package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration that you want to retrieve.
    */
  var distributionConfigurationArn: DistributionConfigurationArn
}
object GetDistributionConfigurationRequest {
  
  inline def apply(distributionConfigurationArn: DistributionConfigurationArn): GetDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(distributionConfigurationArn = distributionConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionConfigurationRequest]
  }
  
  extension [Self <: GetDistributionConfigurationRequest](x: Self) {
    
    inline def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = StObject.set(x, "distributionConfigurationArn", value.asInstanceOf[js.Any])
  }
}
