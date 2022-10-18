package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFlowSourceRequest extends StObject {
  
  /**
    * The flow that you want to remove a source from.
    */
  var FlowArn: string
  
  /**
    * The ARN of the source that you want to remove.
    */
  var SourceArn: string
}
object RemoveFlowSourceRequest {
  
  inline def apply(FlowArn: string, SourceArn: string): RemoveFlowSourceRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowSourceRequest]
  }
  
  extension [Self <: RemoveFlowSourceRequest](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
  }
}
