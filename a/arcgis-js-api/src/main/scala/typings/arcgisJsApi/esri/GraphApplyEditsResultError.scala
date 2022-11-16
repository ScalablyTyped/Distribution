package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphApplyEditsResultError extends StObject {
  
  /**
    * Error code returned from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#error)
    */
  var errorCode: Any
  
  /**
    * Description of the error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEditsResult.html#error)
    */
  var errorMessage: String
}
object GraphApplyEditsResultError {
  
  inline def apply(errorCode: Any, errorMessage: String): GraphApplyEditsResultError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphApplyEditsResultError]
  }
  
  extension [Self <: GraphApplyEditsResultError](x: Self) {
    
    inline def setErrorCode(value: Any): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
