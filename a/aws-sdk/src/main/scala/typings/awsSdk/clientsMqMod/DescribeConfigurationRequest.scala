package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string
}
object DescribeConfigurationRequest {
  
  inline def apply(ConfigurationId: string): DescribeConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRequest]
  }
  
  extension [Self <: DescribeConfigurationRequest](x: Self) {
    
    inline def setConfigurationId(value: string): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
  }
}
