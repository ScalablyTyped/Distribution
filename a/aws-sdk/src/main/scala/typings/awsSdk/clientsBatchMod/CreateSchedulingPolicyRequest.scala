package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSchedulingPolicyRequest extends StObject {
  
  /**
    * The fair share policy of the scheduling policy.
    */
  var fairsharePolicy: js.UndefOr[FairsharePolicy] = js.undefined
  
  /**
    * The name of the scheduling policy. It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
    */
  var name: String
  
  /**
    * The tags that you apply to the scheduling policy to help you categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging Amazon Web Services Resources in Amazon Web Services General Reference. These tags can be updated or removed using the TagResource and UntagResource API operations.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
}
object CreateSchedulingPolicyRequest {
  
  inline def apply(name: String): CreateSchedulingPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchedulingPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSchedulingPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setFairsharePolicy(value: FairsharePolicy): Self = StObject.set(x, "fairsharePolicy", value.asInstanceOf[js.Any])
    
    inline def setFairsharePolicyUndefined: Self = StObject.set(x, "fairsharePolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
