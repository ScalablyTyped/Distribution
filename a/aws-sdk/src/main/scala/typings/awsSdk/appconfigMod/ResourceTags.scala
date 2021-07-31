package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTags extends StObject {
  
  /**
    * Metadata to assign to AppConfig resources. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ResourceTags {
  
  @scala.inline
  def apply(): ResourceTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTags]
  }
  
  @scala.inline
  implicit class ResourceTagsMutableBuilder[Self <: ResourceTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
