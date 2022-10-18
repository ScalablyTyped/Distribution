package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetObjectAttributesResponse extends StObject {
  
  /**
    * The attribute values that are associated with an object.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
}
object BatchGetObjectAttributesResponse {
  
  inline def apply(): BatchGetObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetObjectAttributesResponse]
  }
  
  extension [Self <: BatchGetObjectAttributesResponse](x: Self) {
    
    inline def setAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "Attributes", js.Array(value*))
  }
}
