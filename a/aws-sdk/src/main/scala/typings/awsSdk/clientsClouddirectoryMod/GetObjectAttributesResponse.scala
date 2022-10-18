package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectAttributesResponse extends StObject {
  
  /**
    * The attributes that are associated with the object.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
}
object GetObjectAttributesResponse {
  
  inline def apply(): GetObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectAttributesResponse]
  }
  
  extension [Self <: GetObjectAttributesResponse](x: Self) {
    
    inline def setAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "Attributes", js.Array(value*))
  }
}
