package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsType extends StObject {
  
  /**
    * One or more tags.
    */
  var Tags: typings.awsSdk.autoscalingMod.Tags
}
object DeleteTagsType {
  
  @scala.inline
  def apply(Tags: Tags): DeleteTagsType = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsType]
  }
  
  @scala.inline
  implicit class DeleteTagsTypeMutableBuilder[Self <: DeleteTagsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
