package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRule extends StObject {
  
  /**
    *  The ARN of an Amazon Web Services resource that has managed Contributor Insights rules. 
    */
  var ResourceARN: AmazonResourceName
  
  /**
    *  A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can associate as many as 50 tags with a rule. Tags can help you organize and categorize your resources. You also can use them to scope user permissions by granting a user permission to access or change only the resources that have certain tag values. To associate tags with a rule, you must have the cloudwatch:TagResource permission in addition to the cloudwatch:PutInsightRule permission. If you are using this operation to update an existing Contributor Insights rule, any tags that you specify in this parameter are ignored. To change the tags of an existing rule, use TagResource. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    *  The template name for the managed Contributor Insights rule, as returned by ListManagedInsightRules. 
    */
  var TemplateName: typings.awsSdk.clientsCloudwatchMod.TemplateName
}
object ManagedRule {
  
  inline def apply(ResourceARN: AmazonResourceName, TemplateName: TemplateName): ManagedRule = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedRule] (val x: Self) extends AnyVal {
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
