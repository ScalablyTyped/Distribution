package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetMembershipDatasourcesRequest extends StObject {
  
  /**
    * The ARN of the behavior graph.
    */
  var GraphArns: GraphArnList
}
object BatchGetMembershipDatasourcesRequest {
  
  inline def apply(GraphArns: GraphArnList): BatchGetMembershipDatasourcesRequest = {
    val __obj = js.Dynamic.literal(GraphArns = GraphArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetMembershipDatasourcesRequest]
  }
  
  extension [Self <: BatchGetMembershipDatasourcesRequest](x: Self) {
    
    inline def setGraphArns(value: GraphArnList): Self = StObject.set(x, "GraphArns", value.asInstanceOf[js.Any])
    
    inline def setGraphArnsVarargs(value: GraphArn*): Self = StObject.set(x, "GraphArns", js.Array(value*))
  }
}
