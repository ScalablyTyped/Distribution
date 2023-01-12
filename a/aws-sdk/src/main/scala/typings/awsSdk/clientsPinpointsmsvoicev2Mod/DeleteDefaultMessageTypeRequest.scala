package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDefaultMessageTypeRequest extends StObject {
  
  /**
    * The name of the configuration set or the configuration set Amazon Resource Name (ARN) to delete the default message type from. The ConfigurationSetName and ConfigurationSetArn can be found using the DescribeConfigurationSets action.
    */
  var ConfigurationSetName: ConfigurationSetNameOrArn
}
object DeleteDefaultMessageTypeRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetNameOrArn): DeleteDefaultMessageTypeRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDefaultMessageTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDefaultMessageTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
