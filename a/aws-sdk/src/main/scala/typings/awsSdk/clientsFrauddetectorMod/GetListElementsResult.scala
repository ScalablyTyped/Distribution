package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetListElementsResult extends StObject {
  
  /**
    *  The list elements. 
    */
  var elements: js.UndefOr[ElementsList] = js.undefined
  
  /**
    *  The next page token. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.nextToken] = js.undefined
}
object GetListElementsResult {
  
  inline def apply(): GetListElementsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetListElementsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetListElementsResult] (val x: Self) extends AnyVal {
    
    inline def setElements(value: ElementsList): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: Elements*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
