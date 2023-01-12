package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStreamKeyRequest extends StObject {
  
  /**
    * ARN of the stream key to be deleted.
    */
  var arn: StreamKeyArn
}
object DeleteStreamKeyRequest {
  
  inline def apply(arn: StreamKeyArn): DeleteStreamKeyRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStreamKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: StreamKeyArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
