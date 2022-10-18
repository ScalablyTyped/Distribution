package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulingPolicyDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the scheduling policy. An example is arn:aws:batch:us-east-1:123456789012:scheduling-policy/HighPriority .
    */
  var arn: String
  
  /**
    * The fair share policy for the scheduling policy.
    */
  var fairsharePolicy: js.UndefOr[FairsharePolicy] = js.undefined
  
  /**
    * The name of the scheduling policy.
    */
  var name: String
  
  /**
    * The tags that you apply to the scheduling policy to categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging Amazon Web Services resources in Amazon Web Services General Reference.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
}
object SchedulingPolicyDetail {
  
  inline def apply(arn: String, name: String): SchedulingPolicyDetail = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulingPolicyDetail]
  }
  
  extension [Self <: SchedulingPolicyDetail](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setFairsharePolicy(value: FairsharePolicy): Self = StObject.set(x, "fairsharePolicy", value.asInstanceOf[js.Any])
    
    inline def setFairsharePolicyUndefined: Self = StObject.set(x, "fairsharePolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
