package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectAttributesResponse extends StObject {
  
  /**
    * Attributes map that is associated with the object. AttributeArn is the key, and attribute value is the value.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}
object ListObjectAttributesResponse {
  
  inline def apply(): ListObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListObjectAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
