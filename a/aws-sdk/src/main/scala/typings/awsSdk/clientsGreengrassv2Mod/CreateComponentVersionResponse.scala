package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentVersionResponse extends StObject {
  
  /**
    * The ARN of the component version.
    */
  var arn: js.UndefOr[ComponentVersionARN] = js.undefined
  
  /**
    * The name of the component.
    */
  var componentName: ComponentNameString
  
  /**
    * The version of the component.
    */
  var componentVersion: ComponentVersionString
  
  /**
    * The time at which the component was created, expressed in ISO 8601 format.
    */
  var creationTimestamp: js.Date
  
  /**
    * The status of the component version in IoT Greengrass V2. This status is different from the status of the component on a core device.
    */
  var status: CloudComponentStatus
}
object CreateComponentVersionResponse {
  
  inline def apply(
    componentName: ComponentNameString,
    componentVersion: ComponentVersionString,
    creationTimestamp: js.Date,
    status: CloudComponentStatus
  ): CreateComponentVersionResponse = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], componentVersion = componentVersion.asInstanceOf[js.Any], creationTimestamp = creationTimestamp.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentVersionResponse]
  }
  
  extension [Self <: CreateComponentVersionResponse](x: Self) {
    
    inline def setArn(value: ComponentVersionARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComponentName(value: ComponentNameString): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentVersion(value: ComponentVersionString): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CloudComponentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
