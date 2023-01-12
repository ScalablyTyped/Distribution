package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamKeyRequest extends StObject {
  
  /**
    * ARN for the stream key to be retrieved.
    */
  var arn: StreamKeyArn
}
object GetStreamKeyRequest {
  
  inline def apply(arn: StreamKeyArn): GetStreamKeyRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: StreamKeyArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
