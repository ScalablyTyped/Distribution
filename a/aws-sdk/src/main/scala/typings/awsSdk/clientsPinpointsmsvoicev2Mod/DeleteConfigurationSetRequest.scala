package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationSetRequest extends StObject {
  
  /**
    * The name of the configuration set or the configuration set ARN that you want to delete. The ConfigurationSetName and ConfigurationSetArn can be found using the DescribeConfigurationSets action.
    */
  var ConfigurationSetName: ConfigurationSetNameOrArn
}
object DeleteConfigurationSetRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetNameOrArn): DeleteConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetRequest]
  }
  
  extension [Self <: DeleteConfigurationSetRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
