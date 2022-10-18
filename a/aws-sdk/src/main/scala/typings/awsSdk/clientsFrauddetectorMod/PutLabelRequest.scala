package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLabelRequest extends StObject {
  
  /**
    * The label description.
    */
  var description: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.description] = js.undefined
  
  /**
    * The label name.
    */
  var name: identifier
  
  /**
    * 
    */
  var tags: js.UndefOr[tagList] = js.undefined
}
object PutLabelRequest {
  
  inline def apply(name: identifier): PutLabelRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLabelRequest]
  }
  
  extension [Self <: PutLabelRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
