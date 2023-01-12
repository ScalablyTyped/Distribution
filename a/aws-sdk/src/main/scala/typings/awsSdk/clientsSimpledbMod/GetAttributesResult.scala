package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttributesResult extends StObject {
  
  /**
    * The list of attributes returned by the operation.
    */
  var Attributes: js.UndefOr[AttributeList] = js.undefined
}
object GetAttributesResult {
  
  inline def apply(): GetAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAttributesResult] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: AttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
  }
}
