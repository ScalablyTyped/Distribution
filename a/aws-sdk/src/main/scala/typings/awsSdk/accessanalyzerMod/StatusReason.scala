package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusReason extends StObject {
  
  /**
    * The reason code for the current status of the analyzer.
    */
  var code: ReasonCode
}
object StatusReason {
  
  inline def apply(code: ReasonCode): StatusReason = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReason]
  }
  
  extension [Self <: StatusReason](x: Self) {
    
    inline def setCode(value: ReasonCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
