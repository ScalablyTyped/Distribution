package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailStepMetadata extends StObject {
  
  /**
    * A message that you define and then is processed and rendered by the Fail step when the error occurs.
    */
  var ErrorMessage: js.UndefOr[String3072] = js.undefined
}
object FailStepMetadata {
  
  inline def apply(): FailStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailStepMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailStepMetadata] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String3072): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
