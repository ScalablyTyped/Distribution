package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleDestinationConfiguration extends StObject {
  
  /**
    * Configuration of the HTTP URL.
    */
  var httpUrlConfiguration: js.UndefOr[HttpUrlDestinationConfiguration] = js.undefined
  
  /**
    * Configuration of the virtual private cloud (VPC) connection.
    */
  var vpcConfiguration: js.UndefOr[VpcDestinationConfiguration] = js.undefined
}
object TopicRuleDestinationConfiguration {
  
  inline def apply(): TopicRuleDestinationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleDestinationConfiguration]
  }
  
  extension [Self <: TopicRuleDestinationConfiguration](x: Self) {
    
    inline def setHttpUrlConfiguration(value: HttpUrlDestinationConfiguration): Self = StObject.set(x, "httpUrlConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHttpUrlConfigurationUndefined: Self = StObject.set(x, "httpUrlConfiguration", js.undefined)
    
    inline def setVpcConfiguration(value: VpcDestinationConfiguration): Self = StObject.set(x, "vpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "vpcConfiguration", js.undefined)
  }
}
