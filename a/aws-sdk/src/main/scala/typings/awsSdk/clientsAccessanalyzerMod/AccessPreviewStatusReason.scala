package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPreviewStatusReason extends StObject {
  
  /**
    * The reason code for the current status of the access preview.
    */
  var code: AccessPreviewStatusReasonCode
}
object AccessPreviewStatusReason {
  
  inline def apply(code: AccessPreviewStatusReasonCode): AccessPreviewStatusReason = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPreviewStatusReason]
  }
  
  extension [Self <: AccessPreviewStatusReason](x: Self) {
    
    inline def setCode(value: AccessPreviewStatusReasonCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
