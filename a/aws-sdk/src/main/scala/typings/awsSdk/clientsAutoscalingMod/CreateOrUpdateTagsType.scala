package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrUpdateTagsType extends StObject {
  
  /**
    * One or more tags.
    */
  var Tags: typings.awsSdk.clientsAutoscalingMod.Tags
}
object CreateOrUpdateTagsType {
  
  inline def apply(Tags: Tags): CreateOrUpdateTagsType = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrUpdateTagsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOrUpdateTagsType] (val x: Self) extends AnyVal {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
