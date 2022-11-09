package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetViewError extends StObject {
  
  /**
    * The description of the error for the specified view.
    */
  var ErrorMessage: String
  
  /**
    * The Amazon resource name (ARN) of the view for which Resource Explorer failed to retrieve details.
    */
  var ViewArn: String
}
object BatchGetViewError {
  
  inline def apply(ErrorMessage: String, ViewArn: String): BatchGetViewError = {
    val __obj = js.Dynamic.literal(ErrorMessage = ErrorMessage.asInstanceOf[js.Any], ViewArn = ViewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetViewError]
  }
  
  extension [Self <: BatchGetViewError](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setViewArn(value: String): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
  }
}
