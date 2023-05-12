package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetStreamKeyRequest extends StObject {
  
  /**
    * Array of ARNs, one per stream key.
    */
  var arns: StreamKeyArnList
}
object BatchGetStreamKeyRequest {
  
  inline def apply(arns: StreamKeyArnList): BatchGetStreamKeyRequest = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetStreamKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetStreamKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setArns(value: StreamKeyArnList): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
    
    inline def setArnsVarargs(value: StreamKeyArn*): Self = StObject.set(x, "arns", js.Array(value*))
  }
}
