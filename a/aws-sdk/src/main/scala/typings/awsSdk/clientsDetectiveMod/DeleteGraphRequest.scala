package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGraphRequest extends StObject {
  
  /**
    * The ARN of the behavior graph to disable.
    */
  var GraphArn: typings.awsSdk.clientsDetectiveMod.GraphArn
}
object DeleteGraphRequest {
  
  inline def apply(GraphArn: GraphArn): DeleteGraphRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGraphRequest]
  }
  
  extension [Self <: DeleteGraphRequest](x: Self) {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
