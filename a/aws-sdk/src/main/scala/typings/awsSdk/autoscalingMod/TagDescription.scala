package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagDescription extends StObject {
  
  /**
    * The tag key.
    */
  var Key: js.UndefOr[TagKey] = js.native
  
  /**
    * Determines whether the tag is added to new instances as they are launched in the group.
    */
  var PropagateAtLaunch: js.UndefOr[typings.awsSdk.autoscalingMod.PropagateAtLaunch] = js.native
  
  /**
    * The name of the group.
    */
  var ResourceId: js.UndefOr[XmlString] = js.native
  
  /**
    * The type of resource. The only supported value is auto-scaling-group.
    */
  var ResourceType: js.UndefOr[XmlString] = js.native
  
  /**
    * The tag value.
    */
  var Value: js.UndefOr[TagValue] = js.native
}
object TagDescription {
  
  @scala.inline
  def apply(): TagDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagDescription]
  }
  
  @scala.inline
  implicit class TagDescriptionMutableBuilder[Self <: TagDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setPropagateAtLaunch(value: PropagateAtLaunch): Self = StObject.set(x, "PropagateAtLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagateAtLaunchUndefined: Self = StObject.set(x, "PropagateAtLaunch", js.undefined)
    
    @scala.inline
    def setResourceId(value: XmlString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: XmlString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setValue(value: TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
