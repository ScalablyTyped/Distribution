package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRevisionRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string
  
  /**
    * The revision of the configuration.
    */
  var ConfigurationRevision: string
}
object DescribeConfigurationRevisionRequest {
  
  inline def apply(ConfigurationId: string, ConfigurationRevision: string): DescribeConfigurationRevisionRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any], ConfigurationRevision = ConfigurationRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConfigurationRevisionRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationId(value: string): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationRevision(value: string): Self = StObject.set(x, "ConfigurationRevision", value.asInstanceOf[js.Any])
  }
}
