package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceShadowEnrichActivity extends StObject {
  
  /**
    * The name of the attribute that is added to the message.
    */
  var attribute: AttributeName
  
  /**
    * The name of the deviceShadowEnrich activity.
    */
  var name: ActivityName
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
  
  /**
    * The ARN of the role that allows access to the device's shadow.
    */
  var roleArn: RoleArn
  
  /**
    * The name of the IoT device whose shadow information is added to the message.
    */
  var thingName: AttributeName
}
object DeviceShadowEnrichActivity {
  
  inline def apply(attribute: AttributeName, name: ActivityName, roleArn: RoleArn, thingName: AttributeName): DeviceShadowEnrichActivity = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceShadowEnrichActivity]
  }
  
  extension [Self <: DeviceShadowEnrichActivity](x: Self) {
    
    inline def setAttribute(value: AttributeName): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setThingName(value: AttributeName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
