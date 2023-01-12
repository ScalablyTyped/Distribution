package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComponentResponse extends StObject {
  
  /**
    * The ARN of the component version.
    */
  var arn: js.UndefOr[ComponentVersionARN] = js.undefined
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[ComponentNameString] = js.undefined
  
  /**
    * The version of the component.
    */
  var componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
  
  /**
    * The time at which the component was created, expressed in ISO 8601 format.
    */
  var creationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the component version.
    */
  var description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The platforms that the component version supports.
    */
  var platforms: js.UndefOr[ComponentPlatformList] = js.undefined
  
  /**
    * The publisher of the component version.
    */
  var publisher: js.UndefOr[PublisherString] = js.undefined
  
  /**
    * The status of the component version in IoT Greengrass V2. This status is different from the status of the component on a core device.
    */
  var status: js.UndefOr[CloudComponentStatus] = js.undefined
  
  /**
    * A list of key-value pairs that contain metadata for the resource. For more information, see Tag your resources in the IoT Greengrass V2 Developer Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeComponentResponse {
  
  inline def apply(): DescribeComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeComponentResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ComponentVersionARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComponentName(value: ComponentNameString): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentVersion(value: ComponentVersionString): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "componentVersion", js.undefined)
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPlatforms(value: ComponentPlatformList): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: ComponentPlatform*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setPublisher(value: PublisherString): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setStatus(value: CloudComponentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
