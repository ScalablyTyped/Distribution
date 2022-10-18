package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppValidationOutputResponse extends StObject {
  
  /**
    * The validation output.
    */
  var validationOutputList: js.UndefOr[ValidationOutputList] = js.undefined
}
object GetAppValidationOutputResponse {
  
  inline def apply(): GetAppValidationOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppValidationOutputResponse]
  }
  
  extension [Self <: GetAppValidationOutputResponse](x: Self) {
    
    inline def setValidationOutputList(value: ValidationOutputList): Self = StObject.set(x, "validationOutputList", value.asInstanceOf[js.Any])
    
    inline def setValidationOutputListUndefined: Self = StObject.set(x, "validationOutputList", js.undefined)
    
    inline def setValidationOutputListVarargs(value: ValidationOutput*): Self = StObject.set(x, "validationOutputList", js.Array(value*))
  }
}
