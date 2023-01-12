package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributePayload extends StObject {
  
  /**
    * A JSON string containing up to three key-value pair in JSON format. For example:  {\"attributes\":{\"string1\":\"string2\"}} 
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * Specifies whether the list of attributes provided in the AttributePayload is merged with the attributes stored in the registry, instead of overwriting them. To remove an attribute, call UpdateThing with an empty attribute value.  The merge attribute is only valid when calling UpdateThing or UpdateThingGroup. 
    */
  var merge: js.UndefOr[Flag] = js.undefined
}
object AttributePayload {
  
  inline def apply(): AttributePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributePayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributePayload] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setMerge(value: Flag): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
  }
}
