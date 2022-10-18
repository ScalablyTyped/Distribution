package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecyclePolicyPreviewResult extends StObject {
  
  /**
    * The type of action to be taken.
    */
  var action: js.UndefOr[LifecyclePolicyRuleAction] = js.undefined
  
  /**
    * The priority of the applied rule.
    */
  var appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority] = js.undefined
  
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository.
    */
  var imagePushedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The list of tags associated with this image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.undefined
}
object LifecyclePolicyPreviewResult {
  
  inline def apply(): LifecyclePolicyPreviewResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyPreviewResult]
  }
  
  extension [Self <: LifecyclePolicyPreviewResult](x: Self) {
    
    inline def setAction(value: LifecyclePolicyRuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAppliedRulePriority(value: LifecyclePolicyRulePriority): Self = StObject.set(x, "appliedRulePriority", value.asInstanceOf[js.Any])
    
    inline def setAppliedRulePriorityUndefined: Self = StObject.set(x, "appliedRulePriority", js.undefined)
    
    inline def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setImagePushedAt(value: js.Date): Self = StObject.set(x, "imagePushedAt", value.asInstanceOf[js.Any])
    
    inline def setImagePushedAtUndefined: Self = StObject.set(x, "imagePushedAt", js.undefined)
    
    inline def setImageTags(value: ImageTagList): Self = StObject.set(x, "imageTags", value.asInstanceOf[js.Any])
    
    inline def setImageTagsUndefined: Self = StObject.set(x, "imageTags", js.undefined)
    
    inline def setImageTagsVarargs(value: ImageTag*): Self = StObject.set(x, "imageTags", js.Array(value*))
  }
}
