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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGraphRequest] (val x: Self) extends AnyVal {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
