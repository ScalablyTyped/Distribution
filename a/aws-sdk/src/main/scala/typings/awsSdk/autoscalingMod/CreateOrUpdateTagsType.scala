package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOrUpdateTagsType extends StObject {
  
  /**
    * One or more tags.
    */
  var Tags: typings.awsSdk.autoscalingMod.Tags = js.native
}
object CreateOrUpdateTagsType {
  
  @scala.inline
  def apply(Tags: Tags): CreateOrUpdateTagsType = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrUpdateTagsType]
  }
  
  @scala.inline
  implicit class CreateOrUpdateTagsTypeMutableBuilder[Self <: CreateOrUpdateTagsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
