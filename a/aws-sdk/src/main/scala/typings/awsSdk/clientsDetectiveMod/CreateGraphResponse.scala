package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGraphResponse extends StObject {
  
  /**
    * The ARN of the new behavior graph.
    */
  var GraphArn: js.UndefOr[typings.awsSdk.clientsDetectiveMod.GraphArn] = js.undefined
}
object CreateGraphResponse {
  
  inline def apply(): CreateGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGraphResponse] (val x: Self) extends AnyVal {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    inline def setGraphArnUndefined: Self = StObject.set(x, "GraphArn", js.undefined)
  }
}
