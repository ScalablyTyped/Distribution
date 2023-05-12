package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesRequest extends StObject {
  
  /**
    * The lock state of the retention rules to list. Only retention rules with the specified lock state are returned.
    */
  var LockState: js.UndefOr[typings.awsSdk.clientsRbinMod.LockState] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRbinMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRbinMod.NextToken] = js.undefined
  
  /**
    * Information about the resource tags used to identify resources that are retained by the retention rule.
    */
  var ResourceTags: js.UndefOr[typings.awsSdk.clientsRbinMod.ResourceTags] = js.undefined
  
  /**
    * The resource type retained by the retention rule. Only retention rules that retain the specified resource type are listed. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To list retention rules that retain snapshots, specify EBS_SNAPSHOT. To list retention rules that retain EBS-backed AMIs, specify EC2_IMAGE.
    */
  var ResourceType: typings.awsSdk.clientsRbinMod.ResourceType
}
object ListRulesRequest {
  
  inline def apply(ResourceType: ResourceType): ListRulesRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRulesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRulesRequest] (val x: Self) extends AnyVal {
    
    inline def setLockState(value: LockState): Self = StObject.set(x, "LockState", value.asInstanceOf[js.Any])
    
    inline def setLockStateUndefined: Self = StObject.set(x, "LockState", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceTags(value: ResourceTags): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
