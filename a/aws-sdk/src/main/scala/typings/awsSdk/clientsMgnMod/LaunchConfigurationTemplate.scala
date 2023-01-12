package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationTemplate extends StObject {
  
  /**
    * Copy Private IP during Launch Configuration.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Copy Private IP during Launch Configuration.
    */
  var launchConfigurationTemplateID: LaunchConfigurationTemplateID
  
  /**
    * Copy Private IP during Launch Configuration.
    */
  var postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined
  
  /**
    * Copy Private IP during Launch Configuration.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object LaunchConfigurationTemplate {
  
  inline def apply(launchConfigurationTemplateID: LaunchConfigurationTemplateID): LaunchConfigurationTemplate = {
    val __obj = js.Dynamic.literal(launchConfigurationTemplateID = launchConfigurationTemplateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchConfigurationTemplate] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setLaunchConfigurationTemplateID(value: LaunchConfigurationTemplateID): Self = StObject.set(x, "launchConfigurationTemplateID", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActions(value: PostLaunchActions): Self = StObject.set(x, "postLaunchActions", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActionsUndefined: Self = StObject.set(x, "postLaunchActions", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
