package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationsRequest extends StObject {
  
  /**
    * One or more configuration IDs.
    */
  var configurationIds: ConfigurationIdList
}
object DescribeConfigurationsRequest {
  
  inline def apply(configurationIds: ConfigurationIdList): DescribeConfigurationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConfigurationsRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationIds(value: ConfigurationIdList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdsVarargs(value: ConfigurationId*): Self = StObject.set(x, "configurationIds", js.Array(value*))
  }
}
