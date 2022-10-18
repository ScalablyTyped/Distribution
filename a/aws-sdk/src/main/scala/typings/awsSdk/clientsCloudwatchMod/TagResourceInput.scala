package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    * The ARN of the CloudWatch resource that you're adding tags to. The ARN format of an alarm is arn:aws:cloudwatch:Region:account-id:alarm:alarm-name   The ARN format of a Contributor Insights rule is arn:aws:cloudwatch:Region:account-id:insight-rule:insight-rule-name   For more information about ARN format, see  Resource Types Defined by Amazon CloudWatch in the Amazon Web Services General Reference.
    */
  var ResourceARN: AmazonResourceName
  
  /**
    * The list of key-value pairs to associate with the alarm.
    */
  var Tags: TagList
}
object TagResourceInput {
  
  inline def apply(ResourceARN: AmazonResourceName, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  extension [Self <: TagResourceInput](x: Self) {
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
