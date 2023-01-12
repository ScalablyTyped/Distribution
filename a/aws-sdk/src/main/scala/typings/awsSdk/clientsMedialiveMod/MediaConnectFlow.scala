package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConnectFlow extends StObject {
  
  /**
    * The unique ARN of the MediaConnect Flow being used as a source.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
}
object MediaConnectFlow {
  
  inline def apply(): MediaConnectFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConnectFlow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaConnectFlow] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
  }
}
