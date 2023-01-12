package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotEventsDestinationConfiguration extends StObject {
  
  /**
    * The name of the IoT Events input to which dataset contents are delivered.
    */
  var inputName: IotEventsInputName
  
  /**
    * The ARN of the role that grants IoT Analytics permission to deliver dataset contents to an IoT Events input.
    */
  var roleArn: RoleArn
}
object IotEventsDestinationConfiguration {
  
  inline def apply(inputName: IotEventsInputName, roleArn: RoleArn): IotEventsDestinationConfiguration = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotEventsDestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IotEventsDestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInputName(value: IotEventsInputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
