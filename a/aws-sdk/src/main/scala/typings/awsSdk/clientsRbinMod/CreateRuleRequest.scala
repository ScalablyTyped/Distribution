package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleRequest extends StObject {
  
  /**
    * The retention rule description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsRbinMod.Description] = js.undefined
  
  /**
    * Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule. For tag-level retention rules, only deleted resources, of the specified resource type, that have one or more of the specified tag key and value pairs are retained. If a resource is deleted, but it does not have any of the specified tag key and value pairs, it is immediately deleted without being retained by the retention rule. You can add the same tag key and value pair to a maximum or five retention rules. To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have any resource tags specified. It retains all deleted resources of the specified resource type in the Region in which the rule is created, even if the resources are not tagged.
    */
  var ResourceTags: js.UndefOr[typings.awsSdk.clientsRbinMod.ResourceTags] = js.undefined
  
  /**
    * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and EBS-backed AMIs are supported. To retain snapshots, specify EBS_SNAPSHOT. To retain EBS-backed AMIs, specify EC2_IMAGE.
    */
  var ResourceType: typings.awsSdk.clientsRbinMod.ResourceType
  
  /**
    * Information about the retention period for which the retention rule is to retain resources.
    */
  var RetentionPeriod: typings.awsSdk.clientsRbinMod.RetentionPeriod
  
  /**
    * Information about the tags to assign to the retention rule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateRuleRequest {
  
  inline def apply(ResourceType: ResourceType, RetentionPeriod: RetentionPeriod): CreateRuleRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], RetentionPeriod = RetentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setResourceTags(value: ResourceTags): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
