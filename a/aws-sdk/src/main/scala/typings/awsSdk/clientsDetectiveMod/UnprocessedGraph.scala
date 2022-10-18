package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedGraph extends StObject {
  
  /**
    * The ARN of the organization behavior graph.
    */
  var GraphArn: js.UndefOr[typings.awsSdk.clientsDetectiveMod.GraphArn] = js.undefined
  
  /**
    * The reason data source package information could not be processed for a behavior graph.
    */
  var Reason: js.UndefOr[UnprocessedReason] = js.undefined
}
object UnprocessedGraph {
  
  inline def apply(): UnprocessedGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedGraph]
  }
  
  extension [Self <: UnprocessedGraph](x: Self) {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    inline def setGraphArnUndefined: Self = StObject.set(x, "GraphArn", js.undefined)
    
    inline def setReason(value: UnprocessedReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
