package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAttributesResponse extends StObject {
  
  /**
    * A list of attribute objects that were successfully deleted from your resource.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
}
object DeleteAttributesResponse {
  
  inline def apply(): DeleteAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
  }
}
