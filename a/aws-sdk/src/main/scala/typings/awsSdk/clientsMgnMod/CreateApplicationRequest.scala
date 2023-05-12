package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    * Application description.
    */
  var description: js.UndefOr[ApplicationDescription] = js.undefined
  
  /**
    * Application name.
    */
  var name: ApplicationName
  
  /**
    * Application tags.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateApplicationRequest {
  
  inline def apply(name: ApplicationName): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ApplicationDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
