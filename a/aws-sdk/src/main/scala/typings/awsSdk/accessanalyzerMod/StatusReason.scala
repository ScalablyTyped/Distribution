package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusReason extends StObject {
  
  /**
    * The reason code for the current status of the analyzer.
    */
  var code: ReasonCode = js.native
}
object StatusReason {
  
  @scala.inline
  def apply(code: ReasonCode): StatusReason = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReason]
  }
  
  @scala.inline
  implicit class StatusReasonMutableBuilder[Self <: StatusReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ReasonCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
