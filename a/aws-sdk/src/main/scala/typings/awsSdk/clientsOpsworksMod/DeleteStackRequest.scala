package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStackRequest extends StObject {
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object DeleteStackRequest {
  
  inline def apply(StackId: String): DeleteStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStackRequest]
  }
  
  extension [Self <: DeleteStackRequest](x: Self) {
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
