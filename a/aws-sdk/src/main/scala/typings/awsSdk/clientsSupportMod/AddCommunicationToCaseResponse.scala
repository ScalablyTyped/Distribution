package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCommunicationToCaseResponse extends StObject {
  
  /**
    * True if AddCommunicationToCase succeeds. Otherwise, returns an error.
    */
  var result: js.UndefOr[Result] = js.undefined
}
object AddCommunicationToCaseResponse {
  
  inline def apply(): AddCommunicationToCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCommunicationToCaseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCommunicationToCaseResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
