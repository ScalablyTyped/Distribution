package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTagsForResourceMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resouce to be updated. Must be the ARN of an Elastic Beanstalk resource.
    */
  var ResourceArn: typings.awsSdk.clientsElasticbeanstalkMod.ResourceArn
  
  /**
    * A list of tags to add or update. If a key of an existing tag is added, the tag's value is updated. Specify at least one of these parameters: TagsToAdd, TagsToRemove.
    */
  var TagsToAdd: js.UndefOr[TagList] = js.undefined
  
  /**
    * A list of tag keys to remove. If a tag key doesn't exist, it is silently ignored. Specify at least one of these parameters: TagsToAdd, TagsToRemove.
    */
  var TagsToRemove: js.UndefOr[TagKeyList] = js.undefined
}
object UpdateTagsForResourceMessage {
  
  inline def apply(ResourceArn: ResourceArn): UpdateTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagsForResourceMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTagsForResourceMessage] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagsToAdd(value: TagList): Self = StObject.set(x, "TagsToAdd", value.asInstanceOf[js.Any])
    
    inline def setTagsToAddUndefined: Self = StObject.set(x, "TagsToAdd", js.undefined)
    
    inline def setTagsToAddVarargs(value: Tag*): Self = StObject.set(x, "TagsToAdd", js.Array(value*))
    
    inline def setTagsToRemove(value: TagKeyList): Self = StObject.set(x, "TagsToRemove", value.asInstanceOf[js.Any])
    
    inline def setTagsToRemoveUndefined: Self = StObject.set(x, "TagsToRemove", js.undefined)
    
    inline def setTagsToRemoveVarargs(value: TagKey*): Self = StObject.set(x, "TagsToRemove", js.Array(value*))
  }
}
