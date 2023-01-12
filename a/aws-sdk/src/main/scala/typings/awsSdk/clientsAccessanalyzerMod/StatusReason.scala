package typings.awsSdk.clientsAccessanalyzerMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusReason] (val x: Self) extends AnyVal {
    
    inline def setCode(value: ReasonCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
