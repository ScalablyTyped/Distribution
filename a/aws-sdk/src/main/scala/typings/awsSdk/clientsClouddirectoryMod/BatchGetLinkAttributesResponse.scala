package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetLinkAttributesResponse extends StObject {
  
  /**
    * The attributes that are associated with the typed link.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
}
object BatchGetLinkAttributesResponse {
  
  inline def apply(): BatchGetLinkAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetLinkAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetLinkAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "Attributes", js.Array(value*))
  }
}
