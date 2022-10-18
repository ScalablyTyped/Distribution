package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureException extends StObject {
  
  /**
    * Description of the failure.
    */
  var ExceptionDescription: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ExceptionDescription] = js.undefined
  
  /**
    * Exception name.
    */
  var ExceptionName: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ExceptionName] = js.undefined
}
object FailureException {
  
  inline def apply(): FailureException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureException]
  }
  
  extension [Self <: FailureException](x: Self) {
    
    inline def setExceptionDescription(value: ExceptionDescription): Self = StObject.set(x, "ExceptionDescription", value.asInstanceOf[js.Any])
    
    inline def setExceptionDescriptionUndefined: Self = StObject.set(x, "ExceptionDescription", js.undefined)
    
    inline def setExceptionName(value: ExceptionName): Self = StObject.set(x, "ExceptionName", value.asInstanceOf[js.Any])
    
    inline def setExceptionNameUndefined: Self = StObject.set(x, "ExceptionName", js.undefined)
  }
}
