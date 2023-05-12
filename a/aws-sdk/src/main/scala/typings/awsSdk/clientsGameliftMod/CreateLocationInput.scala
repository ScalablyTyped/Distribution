package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationInput extends StObject {
  
  /**
    * A descriptive name for the custom location.
    */
  var LocationName: CustomInputLocationStringModel
  
  /**
    * A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost allocation. For more information, see  Tagging Amazon Web Services Resources in the Amazon Web Services General Rareference.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateLocationInput {
  
  inline def apply(LocationName: CustomInputLocationStringModel): CreateLocationInput = {
    val __obj = js.Dynamic.literal(LocationName = LocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocationInput] (val x: Self) extends AnyVal {
    
    inline def setLocationName(value: CustomInputLocationStringModel): Self = StObject.set(x, "LocationName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
